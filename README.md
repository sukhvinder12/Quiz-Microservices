# Microservices API Gateway with Load Balancing

This project demonstrates the setup of a Spring Cloud Gateway acting as an API Gateway, routing requests to multiple microservices with load balancing. The microservices are registered in a service registry using Eureka for service discovery.


## Prerequisites

* Before running the project, make sure you have the following prerequisites installed:
  - Java Development Kit (JDK)-17
  - Maven
  - Postman
  - MySQL
  - IDE
* Ensure your microservices are running and accessible.
* Monitor the Eureka server dashboard for service registration and discovery.

## Testing

Test the API Gateway by sending requests to the configured paths for your microservices.

-Quiz Service: http://localhost:8083/quiz
-Question Service: http://localhost:8083/question



