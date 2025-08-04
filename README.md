# 🚀 BugAnalyticsAPI – Java Spring Boot (Day10 Project)

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-17.x-blue)](https://www.postgresql.org/)

A **Spring Boot Analytics API** that provides insightful bug-related statistics such as:
- 🟢 **Bug count by project**
- 🟢 **Bug count by status**
- 🟢 **Bug count by priority**
- 🟢 **Top 3 bug-heavy projects**

---

## 📌 **Project Structure**
```
Directory structure:
└── adrin-bershik-c-j-java-day10-proj2/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── request.http
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── example/
    │   │   │           └── day10proj2/
    │   │   │               ├── Day10proj2Application.java
    │   │   │               ├── controller/
    │   │   │               │   └── AnalyticsController.java
    │   │   │               ├── dto/
    │   │   │               │   ├── PriorityCountDTO.java
    │   │   │               │   ├── ProjectBugCountDTO.java
    │   │   │               │   └── StatusCountDTO.java
    │   │   │               ├── entity/
    │   │   │               │   ├── Bug.java
    │   │   │               │   └── Project.java
    │   │   │               ├── repository/
    │   │   │               │   └── BugRepository.java
    │   │   │               └── service/
    │   │   │                   ├── AnalyticsService.java
    │   │   │                   └── AnalyticsServiceImpl.java
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    │       └── java/
    │           └── com/
    │               └── example/
    │                   └── day10proj2/
    │                       └── Day10proj2ApplicationTests.java
    └── .mvn/
        └── wrapper/
            └── maven-wrapper.properties

```

---

## ⚙️ **Tech Stack**
- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **PostgreSQL 17.x**
- **REST Client (VS Code)** for testing APIs

---

## 🔥 **Features Implemented**
✅ RESTful endpoints for analytics  
✅ DTO projection with JPQL (`SELECT NEW`)  
✅ Aggregation using `GROUP BY` and `COUNT`  
✅ Clean layered architecture (Controller → Service → Repository → Entity)  

---

## 🗄️ **Database Configuration**
The database settings are in `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/day10proj2
spring.datasource.username=postgres
spring.datasource.password=Adrin@123
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
