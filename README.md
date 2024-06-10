# Ping - Simple Social Media Website

## Overview
Ping is a simple social media website built with Spring Boot. The project is developed in phases, starting with basic user management and progressing to more sophisticated features such as posting content and interacting with other users.

## Table of Contents
- [Overview](#overview)
- [Phase 1: Basic User Management](#phase-1-basic-user-management)
  - [Setup Spring Boot Project](#setup-spring-boot-project)
  - [Create User Entity and Repository](#create-user-entity-and-repository)
  - [User Registration Endpoint](#user-registration-endpoint)
  - [User Authentication](#user-authentication)
- [Phase 2: User Profile Management](#phase-2-user-profile-management)
  - [Extend User Entity](#extend-user-entity)
  - [User Profile Endpoints](#user-profile-endpoints)
- [Phase 3: Posting Content](#phase-3-posting-content)
  - [Create Post Entity and Repository](#create-post-entity-and-repository)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)

## Overview
Ping is a simple social media website built with Spring Boot. The project is developed in phases, starting with basic user management and progressing to more sophisticated features such as posting content and interacting with other users.

## Phase 1: Basic User Management
### Setup Spring Boot Project
- Initialized with Spring Initializr.
- Dependencies: Spring Web, Spring Data JPA, H2 Database, Spring Security.

### Create User Entity and Repository
- **UserEntity:** Fields: `id`, `username`, `password`, `email`.
- **UserRepository:** Extends `JpaRepository<UserEntity, Long>`.

### User Registration Endpoint
- **UserController:** `POST /register` endpoint.
- **UserService:** Handles user registration and password hashing.

### User Authentication
- Configured Spring Security for basic authentication.
- **POST /login:** Authenticates users.

## Phase 2: User Profile Management
### Extend User Entity
- Added fields: `firstName`, `lastName`, `bio`, `profilePicture`.

### User Profile Endpoints
- **GET /users/{id}:** Retrieve user profiles.
- **PUT /users/{id}:** Update user profiles.
- Implemented necessary services and controllers.

## Phase 3: Posting Content
### Create Post Entity and Repository
- **PostEntity:** Fields: `id`, `content`, `timestamp`, `user`.
- **PostRepository:** Extends `JpaRepository<PostEntity, Long>`.

## Technologies Used
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database**
- **Spring Security**

## Getting Started
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/ping.git
   cd ping

2. **Run the Application:**
   ```bash
   ./mvnw spring-boot:run
   
3. **Access the Application:**
   - **Register a new user via POST /register.**
   - **Authenticate via POST /login.**

## License
This project is licensed under the MIT License.
