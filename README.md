# PlanApp – Spring Boot REST API

## Overview
PlanApp is a Spring Boot REST API that manages customer plan details stored in a MySQL database. It provides endpoints to retrieve all available plans or fetch a specific plan using its ID.

## Technologies Used
- Java 21
- Spring Boot 4.1.1
- Spring Web MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok
- Postman

## Features
- Retrieve all plans.
- Retrieve a plan by its ID.
- Store and access plan details using MySQL.
- Use Spring Data JPA for database operations.
- Follow a layered architecture with Controller, Service, Repository, and Entity components.

## Project Structure
```text
PlanApp/
├── src/main/java/com/example/plan/
│   ├── api/
│   │   └── PlanRestController.java
│   ├── entity/
│   │   └── PlanEntity.java
│   ├── repository/
│   │   └── PlanRepository.java
│   ├── service/
│   │   └── PlanService.java
│   └── PlanAppApplication.java
├── src/main/resources/
│   └── application.yaml
└── pom.xml
```

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/plans` | Retrieve all plans |
| GET | `/plans/{id}` | Retrieve a plan by ID |

### Example Requests

Get all plans:
```http
GET http://localhost:8081/plans
```

Get a plan by ID:
```http
GET http://localhost:8081/plans/101
```

The plan ID must match a record in the database.

## Database Configuration
The application uses MySQL with the `plan_schema` database and the `PLAN_DETAILS` table.

Configure your database connection in `src/main/resources/application.yaml` before running the application. Keep your database credentials private.

## How to Run

1. Install Java 21 and MySQL.
2. Create the `plan_schema` database.
3. Configure the database credentials in `application.yaml`.
4. Open the project in your IDE or terminal.
5. Run the application using Maven:

```bash
mvn spring-boot:run
```

Alternatively, use the Maven wrapper:

```bash
mvnw.cmd spring-boot:run
```

The application runs on port **8081**.

## Architecture
- **Controller:** Handles HTTP requests and returns API responses.
- **Service:** Contains the plan retrieval logic.
- **Repository:** Uses Spring Data JPA to access MySQL.
- **Entity:** Maps the `PlanEntity` class to the `PLAN_DETAILS` table.

## Author
Shayan Arshi
