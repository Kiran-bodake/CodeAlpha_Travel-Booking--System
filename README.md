# Travel Booking System 

## Overview
The **Travel Booking System** is a backend application built using **Spring Boot** and **MySQL** to manage travel service bookings, including **flights, hotels, and transportation**. This REST API allows users to search, book, update, and cancel reservations while maintaining secure authentication and authorization mechanisms.

## Features
- **User Authentication & Authorization**
- **Flight Booking Management** (CRUD operations, seat availability, pricing)
- **Hotel Booking Management** (CRUD operations, room availability, pricing)
- **Transportation Booking Management** (CRUD operations, pricing, availability)
- **Booking Management** (Create, update, cancel bookings)

## Technology Stack
- **Backend:** Java (Spring Boot, Spring Security, Hibernate, JPA)
- **Database:** MySQL
- **Build Tool:** Maven
- **Server:** Tomcat

## Installation & Setup

### Prerequisites
Ensure you have the following installed:
- Java 17+
- MySQL Server
- Maven
- Postman (for testing APIs)

## API Endpoints

### **User APIs**
- `POST /api/users/register` → Register a new user
- `POST /api/users/login` → Authenticate user
- `GET /api/users/all` → Fetch all users (Admin only)

### **Flight APIs**
- `POST /api/flights` → Add a flight (Admin only)
- `GET /api/flights/all` → Retrieve all flights
- `PUT /api/flights/{id}` → Update a flight (Admin only)
- `DELETE /api/flights/{id}` → Delete a flight (Admin only)

### **Hotel APIs**
- `POST /api/hotels` → Add a hotel (Admin only)
- `GET /api/hotels/all` → Retrieve all hotels
- `PUT /api/hotels/{id}` → Update a hotel (Admin only)
- `DELETE /api/hotels/{id}` → Delete a hotel (Admin only)

### **Transportation APIs**
- `POST /api/transportations` → Add transport service (Admin only)
- `GET /api/transportations/all` → Retrieve all transportation services
- `PUT /api/transportations/{id}` → Update transportation (Admin only)
- `DELETE /api/transportations/{id}` → Delete transportation (Admin only)

### **Booking APIs**
- `POST /api/bookings` → Create a booking
- `GET /api/bookings/all` → Retrieve all bookings (Admin only)
- `PUT /api/bookings/{id}` → Update booking
- `DELETE /api/bookings/{id}` → Cancel a booking

## Security & Authentication
- Uses **SPRING SECURITY** for authentication.
- Role-based access control (`USER`, `ADMIN`).
- Secure password storage using **BCrypt hashing**.

## Future Enhancements
✔ **Payment Integration (Razorpay, Stripe, PayPal)**
✔ **Email/SMS Notifications for Booking Confirmations**
✔ **AI-Based Recommendations for Travel Plans**

## License
This project is licensed under the MIT License.

## Contact
For any queries, contact **your-email@example.com**

