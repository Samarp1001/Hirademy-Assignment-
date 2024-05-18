package com.example.hiradamy.controller;


import com.example.hiradamy.entity.Assistant;
import com.example.hiradamy.service.AssistantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/assistant")
public class AssistantController {

    @Autowired
    private AssistantService assistantService;

    @PostMapping
    public ResponseEntity<Long> createAssistant(@RequestBody Assistant assistant) {
        Assistant createdAssistant = assistantService.createAssistant(assistant);
        return ResponseEntity.ok(createdAssistant.getId());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Assistant> getAssistantById(@PathVariable Long id) {
        Optional<Assistant> assistant = assistantService.getAssistantById(id);
        if (assistant.isPresent()) {
            return ResponseEntity.ok(assistant.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Assistant> updateAssistant(@PathVariable Long id, @RequestBody Assistant assistantDetails) {
        try {
            Assistant updatedAssistant = assistantService.updateAssistant(id, assistantDetails);
            return ResponseEntity.ok(updatedAssistant);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAssistant(@PathVariable Long id) {
        try {
            assistantService.deleteAssistant(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}

