# 🛍️ AAYORA the Fashion – Spring Boot E-commerce Backend

This is the backend component of **AAYORA the Fashion**, a simple e-commerce application built using **Spring Boot**, **MySQL**, and **REST APIs**.

## 📦 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- RESTful APIs
- Postman / cURL (for testing)

---

## 🚀 How the Backend Works

### Architecture Overview

The backend follows a standard **MVC (Model-View-Controller)** architecture:

- **Model**: Represents the database entities (e.g., `Item.java`)
- **Repository**: Interface extending JPA repository for database operations (e.g., `ItemRepository.java`)
- **Service**: Contains business logic and calls repository methods (e.g., `ItemService.java`)
- **Controller**: Exposes REST endpoints to interact with the system (e.g., `ItemController.java`)

---

## 🛠️ MySQL Database Setup

Before running the application, make sure you have MySQL installed and a database created.

### ✅ Steps:

1. **Start MySQL server**
2. **Create a database** (e.g., `aayora_db`):
   ```sql
   CREATE DATABASE aayora_db;


## Configure application.properties (in src/main/resources/) like this:
###Properties      

         spring.datasource.url=jdbc:mysql://localhost:3306/aayora_db
         spring.datasource.username=your_mysql_username
         spring.datasource.password=your_mysql_password
         spring.jpa.hibernate.ddl-auto=update
         spring.jpa.show-sql=true
         spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

##🧪 Testing "AAYORA the Fashion" Spring Boot REST APIs
There are several ways to test your ItemController APIs. Below are the most common methods:
###✅ 1. Using Postman (Recommended for manual testing)
####🧰 Steps to Test with Postman:

    Install Postman: https://www.postman.com/downloads/

    Start your Spring Boot application

    Use the following requests:

🔍 GET All Items:

    GET http://localhost:8080/api/items

🔍 GET Single Item:

    GET http://localhost:8080/api/items/1
    
➕ POST Create Item

    POST http://localhost:8080/api/items
    Content-Type: application/json
    
  Request Body:
    
    { 
    "name": "Invisible Cloak",
    "description": "Makes you disappear!",
    "imageUrl": "https://example.com/cloak.jpg",
    "price": 999.99,
    "stock": 5
    }

   🔄 PUT Update Item

    POST http://localhost:8080/api/items/1
    Content-Type: application/json
    
  Request Body:
    
    { 
    "name": "Improved Invisible Cloak",
    "description": "Now with 20% more invisibility!",
    "imageUrl": "[https://example.com/cloak.jpg](https://example.com/cloak2.jpg)",
    "price": 11999.99,
    "stock": 100
    }

 ❌ DELETE Item

    POST http://localhost:8080/api/items/1

##🧑‍💻 2. Using cURL (Command Line)

You can test the endpoints directly from your terminal:
🔍 GET All Items

    curl http://localhost:8080/api/items

🔍 GET Single Items

    curl http://localhost:8080/api/items/7

➕ POST Create Item

    curl -X POST -H "Content-Type: application/json" \
    -d '{"name":"Invisible Cloak","description":"Makes you disappear!","imageUrl":"https://example.com/cloak.jpg","price":999.99,"stock":5}' \
    http://localhost:8080/api/items

🔄 PUT Update Item

    curl -X PUT -H "Content-Type: application/json" \
    -d '{"name":"Improved Invisible Cloak","description":"Now with 20% more invisibility!","imageUrl":"https://example.com/cloak2.jpg","price":1199.99,"stock":3}' \
    http://localhost:8080/api/items/1

❌ DELETE Item

    curl -X DELETE http://localhost:8080/api/items/1

##🗂️ Folder Structure
src/
├── main/
│   ├── java/
│   │   └── com.example.aayora/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       ├── service/
│   │       └── AayoraApplication.java
│   └── resources/
│       ├── application.properties
│       └── static/
└── test/

## 👩‍💻 Author

Developed by **Hitesh Sharma** as part of the final project for the Spring Boot course.

Project: **AAYORA the Fashion** – An e-commerce backend system showcasing RESTful API development with Spring Boot and MySQL.

