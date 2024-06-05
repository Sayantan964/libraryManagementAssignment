Library-API Project 📚
This project is a simple Spring Boot application that provides a RESTful API for managing books. It allows users to perform CRUD (Create, Read, Update, Delete) operations on books using the API. It adding new books, updating existing ones, searching for books, and deleting books.


Project Structure 📂
The project consists of several components, each serving a specific purpose:

Controller: Defines the RESTful endpoints for handling book-related requests. It interacts with the Service to perform various operations.

Service: Contains the business logic for book-related operations. It interacts with the DAO to access the database.

Repository: Provides access to the database using Spring Data JPA. It extends the JpaRepository interface to enable CRUD operations.

Entities/Model: Represents the entity (model) for a book. It is annotated with @Entity to indicate it's a JPA entity and corresponds to a database table.

How to Run the Project 💨
Ensure you have Java installed on your system.
Clone or download the project from the repository.
Import the project into your preferred IDE (e.g., Eclipse, IntelliJ).
Set up the H2 database and update the database configurations in the application.properties file (not provided in the code).
Build and run the project using the IDE or by running mvn spring-boot:run command from the project root directory.

Technologies Used 🌐
Java
Spring Boot
Spring Data JPA
Hibernate
RESTful API
H2
PostMan (API Collection Documentation on Postman for testing API)
Maven
