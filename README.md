# Ticket Management System

This Ticket Management System is designed to manage tickets for two applications: IRCTC and Goibibo. The system provides RESTful APIs for handling ticket-related operations, and it utilizes a Web Client for making HTTP requests. Additionally, Spring Data JPA is incorporated for data persistence.

## Features

- **IRCTC Application:**
  - [ ] Book train tickets
  - [ ] Cancel booked train tickets
  - [ ] Update train ticket details

- **Goibibo Application:**
  - [ ] Initiate REST call to book tickets via IRCTC
  - [ ] Cancel booked tickets
  - [ ] Update train ticket details

## Technologies Used

- **Spring Boot:**
  - Web framework for building robust and scalable backend applications.
  
- **Spring Data JPA:**
  - Provides a set of abstractions for working with data stores, including relational databases.

- **Web Client:**
  - Utilized for making HTTP requests to interact with the applications.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven
- Database (e.g., MySQL, PostgreSQL)

### Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/Prashanthdamara/TicketManagementSystem.git
   
2. Configure the database connection in application.properties or application.yml.

3. Run the Spring Boot application

## Inter-Application Communication:

The Goibibo Application initiates a REST call to the IRCTC Application to book train tickets.

## Contributing

Contributions are welcome! If you find any issues or want to enhance the system, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License.
