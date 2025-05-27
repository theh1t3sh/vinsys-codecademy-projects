Student Management API - Spring Boot Project

API Testing Dashboard
Spring Boot
MySQL

A modern RESTful API for managing student records, developed as part of Vinsys IT Services training under the guidance of Trainer Gunjan Shrivastava.
✨ Project Highlights

    Full CRUD Operations implemented with Spring Boot

    MySQL Database integration for persistent storage

    Comprehensive API Testing using Postman

    RESTful endpoints following best practices

🚀 API Endpoints
Method	Endpoint	Description
POST	/students/add	Add a new student record
GET	/students/all	Retrieve all student records
PUT	/students/update/{id}	Update an existing student
DELETE	/students/delete/{id}	Remove a student record
🔍 Testing Proof of Concept
📌 Student Creation
http

POST /students/add
{
  "name": "Arjun Overthinker",
  "email": "arjun@sochomat.com",
  "course": "Advanced Anxiety Engineering"
}

Response:
json

{
  "id": 1,
  "name": "Arjun Overthinker",
  "email": "arjun@sochomat.com",
  "course": "Advanced Anxiety Engineering"
}

🔄 Record Update
http

PUT /students/update/1
{
  "name": "Lucky Lastbench",
  "email": "lucky@passhokarrahunga.com",
  "course": "Backbench Survival Skills"
}

Response: 200 OK
🗑️ Record Deletion
http

DELETE /students/delete/4

Response: Student deleted successfully
📊 Database Verification
sql

mysql> SELECT * FROM studentsdata;
+----+----------------------------------+---------------------------+------------------+
| id | course                           | email                     | name             |
+----+----------------------------------+---------------------------+------------------+
| 1  | Disappointment Handling Pro      | rahul@expectnothing.com   | Rahul Realist    |
| 2  | Hope Deletion Techniques         | nikki@sabbekarhai.com     | Nikki Nihilist   |
| 3  | Relationship Sabotage 101        | tony@redflagmail.com      | Tony Toxique     |
+----+----------------------------------+---------------------------+------------------+

🛠️ Technical Stack

    Backend: Spring Boot 2.7.0

    Database: MySQL 8.0

    Build Tool: Maven

    API Testing: Postman

    IDE: IntelliJ IDEA

🙏 Acknowledgments
    Trainee: Hitesh Sharma
