# 🧩 Spring_Boot_Microservice_App

**Spring_Boot_Microservice_App** is a distributed, scalable, and modular application built using the **Spring Boot microservices architecture**. It consists of independent services that communicate via REST and/or messaging, making the system easy to develop, scale, and maintain.

---

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Cloud (Eureka, Gateway, Config Server)**
- **Spring Security + JWT**
- **Spring Data JPA / R2DBC**
- **MySQL / PostgreSQL**
- **RabbitMQ / Kafka** (for async communication)
- **Docker + Docker Compose**
- **OpenFeign** – Inter-service communication
- **Resilience4j** – Circuit breaking
- **Swagger / SpringDoc** – API Documentation

---

## 🧱 Microservices Overview

| Service         | Description                                      |
|-----------------|--------------------------------------------------|
| **API Gateway** | Routes external requests to internal services    |
| **Config Server** | Centralized configuration management            |
| **Discovery Server (Eureka)** | Service registry and discovery           |
| **Auth Service** | Handles user authentication and JWT issuance    |
| **User Service** | Manages user profiles and roles                 |
| **Product/School/Order Service** | Example business domain services       |
| **Notification Service** | Sends emails, SMS, etc. (optional)       |

---

## 🔁 Communication Patterns

- RESTful APIs via **Spring Cloud Gateway**  
- Async messaging via **Kafka / RabbitMQ**  
- Secure with **JWT tokens** and role-based access control  
- Inter-service calls via **OpenFeign**

---

## ⚙️ How to Run

### 🧾 Prerequisites

- Java 17+
- Docker
- Maven

### 🚀 Run All Services

```bash
# Clone the repo
git clone https://github.com/yourusername/Spring_Boot_Microservice_App.git
cd Spring_Boot_Microservice_App

# Start services using Docker Compose
docker-compose up --build
