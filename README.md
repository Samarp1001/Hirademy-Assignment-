# Assistant Management API

## Overview
This project is a backend application for managing assistants, implemented using Spring Boot and MySql. It provides CRUD (Create, Read, Update, Delete) operations through RESTful APIs for managing assistant records.

## Features
- **CRUD Operations for Assistants**: Create, retrieve, update, and delete assistant records.
- **Database**: MySql
- **API Documentation**: Endpoints are documented and can be tested using Postman.

## Technology Stack
- **Programming Language**: Java
- **Framework**: Spring Boot
- **Database**: MySql

## API Endpoints
- `POST /assistant`: Creates a new assistant record and returns the ID of the assistant.
- `GET /assistant/{assistant_id}`: Retrieves the details of the assistant with the specified ID.
- `PUT /assistant/{assistant_id}`: Updates the details of the assistant with the specified ID.
- `DELETE /assistant/{assistant_id}`: Deletes the record of the assistant with the specified ID.

## Database Model
The Assistant model includes the following fields:
- `id`: Integer, Primary Key
- `name`: String
- `mobile`: String
- `email`: String
- `salary`: Float
- `city`: String
- `country`: String
- `department`: String
- `role`: String

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven
- MySql
### Installation
1. **Clone the Repository**
2. **Build the Project**
3. **Run the Application**

## Demo Recording
A demo video showcasing the functionality of the application is available. The video demonstrates how to interact with the API endpoints using Postman and shows the data in the database during API calls.

The application will be available at `http://127.0.0.1:8080`.

https://drive.google.com/file/d/1Y2MlsE5kYgAlUfb2MXEA0CwZWgwlX2bl/view?usp=sharing

