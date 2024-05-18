# Hirademy-Assignment-
# Overview
This project is a backend application for managing assistants, implemented using Spring Boot and SQLite. It provides CRUD (Create, Read, Update, Delete) operations through RESTful APIs for managing assistant records.

Features
CRUD Operations for Assistants: Create, retrieve, update, and delete assistant records.
Database: Utilizes SQLite for its lightweight nature and ease of use.
API Documentation: Endpoints are documented and can be tested using Postman.
Technology Stack
Programming Language: Java
Framework: Spring Boot
Database: SQLite
API Endpoints
POST /assistant: Creates a new assistant record and returns the ID of the assistant.
GET /assistant/{assistant_id}: Retrieves the details of the assistant with the specified ID.
PUT /assistant/{assistant_id}: Updates the details of the assistant with the specified ID.
DELETE /assistant/{assistant_id}: Deletes the record of the assistant with the specified ID.
Database Model
The Assistant model includes the following fields:

id: Integer, Primary Key
name: String
mobile: String
email: String
salary: Float
city: String
country: String
department: String
role: String
