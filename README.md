

# javaWebApp

A Spring Boot web application built with MVC architecture.  
It demonstrates how to create REST APIs with Controller, Service, and Model layers.  
The project is structured for scalability and clean code, making it suitable for learning and extending into enterprise-grade applications.

---

# Features
- Spring Boot application with embedded Tomcat server
- RESTful API endpoints
- MVC layered architecture (`Controller`, `Service`, `Model`)
- Product management with mock data
- Configurable via `application.properties`

---

# Tech Stack
- **Java 17+**  
- **Spring Boot 3.x**  
- **Maven** (build tool)  
- **REST API** architecture  

---

# Project Structure
javaWebApp
┣ src/main/java/com/springweb/javaWebApp
┃ ┣ controller/ # REST Controllers
┃ ┣ model/ # Data Models
┃ ┣ service/ # Service Layer
┃ ┗ JavaWebAppApplication.java # Main class
┣ src/main/resources/
┃ ┗ application.properties # Configuration
┣ pom.xml # Maven build file


## ▶️ Running the Application
1. Clone the repository:
   $bash
   > git clone https://github.com/your-username/javaWebApp.git
   > cd javaWebApp

2. Build the project with Maven:
   > mvn clean install

3. Run the application
   > mvn spring-boot:run


By default, the app runs at:
http://localhost:9090 
