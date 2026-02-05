**Spring Boot Microservices with Spring Cloud (Eureka)**

This project is a sample microservices architecture implemented using Spring Boot and Spring Cloud.
It demonstrates how multiple independent services can register, discover, and communicate with each other using Eureka Discovery Server.

**Project Overview**

The system consists of three independent Spring Boot applications:

Discovery Server – Service registry using Netflix Eureka

User Service – Manages user-related operations

Task Service – Manages task-related operations

Each service runs on a different port and is independently deployable.
```
Architecture Diagram
                 +--------------------+
                 |  Discovery Server  |
                 |     (Eureka)       |
                 |      :8761         |
                 +---------+----------+
                           |
           ---------------------------------------
           |                                     |
+----------------------+           +----------------------+
|    User Service      |           |    Task Service      |
|     :8081            |           |     :8082            |
|  USER-SERVICE        |           |  TASK-SERVICE        |
+----------------------+           +----------------------+
```
```
Technologies Used

Java 17
Spring Boot 3.x
Spring Cloud 2023.x
Netflix Eureka (Service Discovery)
Spring Data JPA
H2 Database (In-memory)
Maven
REST APIs
```

```
Project Structure
microservices-project
│
├── discovery-server
│   └── Eureka Discovery Server
│
├── user-service
│   └── User Management Microservice
│
└── task-service
    └── Task Management Microservice
```
```
Each service has its own:

pom.xml
application.properties
Controllers, Services, Repositories, Entities
```
```
Ports Configuration
Service	Port
Discovery Server	8761
User Service	8081
Task Service	8082
```
