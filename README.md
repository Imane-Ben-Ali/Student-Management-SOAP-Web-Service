# 🎓 Student SOAP Web Service

A SOAP web service for student management built with **Spring Boot** and **Spring-WS**, using a contract-first approach.

## ✨ Features
- Add a student
- Get a student by ID
- Get all students
- Auto-generated WSDL at `/ws/students.wsdl`

## 🛠️ Tech Stack
- Java 17
- Spring Boot 3.5
- Spring-WS
- JAXB (XSD → Java code generation)
- Maven

## 🚀 Run the project
```bash
mvn clean install
mvn spring-boot:run
```

## 📡 WSDL
```
http://localhost:8080/ws/students.wsdl
```

## 📬 Test with SoapUI or Postman
Send a POST request to `http://localhost:8080/ws` with a SOAP envelope.
