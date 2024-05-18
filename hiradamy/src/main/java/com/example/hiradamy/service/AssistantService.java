package com.example.hiradamy.service;



import com.example.hiradamy.entity.Assistant;
import com.example.hiradamy.repository.AssistantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssistantService {

    @Autowired
    private AssistantRepository assistantRepository;

    public Assistant createAssistant(Assistant assistant) {
        return assistantRepository.save(assistant);
    }

    public Optional<Assistant> getAssistantById(Long id) {
        return assistantRepository.findById(id);
    }

    public Assistant updateAssistant(Long id, Assistant assistantDetails) {
        Optional<Assistant> optionalAssistant = assistantRepository.findById(id);
        if (optionalAssistant.isPresent()) {
            Assistant assistant = optionalAssistant.get();
            assistant.setName(assistantDetails.getName());
            assistant.setMobile(assistantDetails.getMobile());
            assistant.setEmail(assistantDetails.getEmail());
            assistant.setSalary(assistantDetails.getSalary());
            assistant.setCity(assistantDetails.getCity());
            assistant.setCountry(assistantDetails.getCountry());
            assistant.setDepartment(assistantDetails.getDepartment());
            assistant.setRole(assistantDetails.getRole());
            return assistantRepository.save(assistant);
        } else {
            throw new RuntimeException("Assistant not found with id " + id);
        }
    }

    public void deleteAssistant(Long id) {
        assistantRepository.deleteById(id);
    }
}

