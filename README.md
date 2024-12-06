# User-Data-Microservice

Spring Boot User API Consumer
This project is a Spring Boot application that demonstrates how to consume a third-party REST API (https://jsonplaceholder.typicode.com/users) using Feign. 
It provides endpoints to retrieve user details with selected fields (name, username, email, lat, and lng) and supports fetching all users or a specific user by ID.

Endpoints
1. Fetch All Users
URL: /api/users/details
Method: GET

Response:

json
Copy code
[
  {
    "name": "Leanne Graham",
    "username": "Bret",
    "email": "Sincere@april.biz",
    "lat": "-37.3159",
    "lng": "81.1496"
  },
  {
    "name": "Ervin Howell",
    "username": "Antonette",
    "email": "Shanna@melissa.tv",
    "lat": "-43.9509",
    "lng": "-34.4618"
  }
]
2. Fetch User by ID
URL: /api/users/details/{id}
Method: GET

Example Request: /api/users/details/1

Response:

json
Copy code
{
  "name": "Leanne Graham",
  "username": "Bret",
  "email": "Sincere@april.biz",
  "lat": "-37.3159",
  "lng": "81.1496"
}
Error Response: If the user ID does not exist.

json
Copy code
{
  "timestamp": "2024-12-06T12:00:00.000+00:00",
  "status": 500,
  "error": "Internal Server Error",
  "message": "User not found with ID: 999",
  "path": "/api/users/details/999"
}
