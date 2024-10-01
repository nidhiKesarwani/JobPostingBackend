# Job Posting Project

## Overview

This project is a job posting application developed using Spring Boot, Spring Security, and MongoDB. It allows users to manage job postings and provides authentication features.

## Features

- User authentication and authorization
- Job posting management
- View job postings
- Basic home and login pages

## Technologies Used

- Spring Boot
- Spring Security
- MongoDB
- JSP for views
- Maven for dependency management

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java 11 or later
- Maven installed
- MongoDB server running

## Getting Started

To get a local copy up and running, follow these steps:

1. **Clone the repository**:

   ```bash
   git clone <repository-url>
   cd jobpostingproject
2. **Update application properties:**
    Modify the src/main/resources/application.properties file to configure your MongoDB connection:
    spring.data.mongodb.uri=mongodb://localhost:27017/yourdbname
3. **Build the project:**
   Use Maven to build the project:
   mvn clean install
4. **Run the application:**
   mvn spring-boot:run
5. **Access the application:**
   http://localhost:8080/


