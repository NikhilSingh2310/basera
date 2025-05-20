# 🏨 Basera - Smart Hotel Booking System

**Basera** is a full-featured, modern, and scalable hotel management and booking system aimed at simplifying the entire hotel reservation process. From room discovery and availability checks to secure payments and email notifications, Basera automates the hotel booking experience end-to-end. Built with **Spring Boot**, it supports role-based access (Admin & Customer), **Stripe** payment integration, and real-time email communication — making it a robust, production-ready backend solution.

---

## ✅ Features

- 🔐 **User Authentication** (JWT-based login/register)
- 🛏️ **Room Management** (create, update, delete, search, availability check)
- 📆 **Booking System** (check-in/check-out, booking status, cancellations)
- 💳 **Stripe Payment Integration** (real-time payment processing)
- 📧 **Email Notifications** (booking confirmation, payment success/failure)
- 🧾 **Role-Based Access** (Admin & Customer functionalities)

---

## 📦 Project Structure

```
com.basera.baserabackend
├── config          # Configuration (ModelMapper)
├── controllers     # REST endpoints (Auth, Room, Booking, Payment)
├── dtos            # Request/Response DTOs
├── entities        # JPA Entities (User, Room, Booking, etc.)
├── enums           # Role and Status Enums
├── exceptions      # Custom exceptions and global handler
├── payments        # Stripe payment integration
├── repositories    # JPA Repositories
├── security        # JWT Filters, UserDetailsService, Config
├── services        # Business logic
└── BaseraApplication.java
```

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Security (JWT)
- Spring Data JPA + MySQL
- Stripe API for Payments
- JavaMailSender for Notifications
- Lombok + ModelMapper

---

## 🚀 Getting Started

### 🔧 Prerequisites

- Java 17+
- Maven
- MySQL

### ⚙️ Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/NikhilSingh2310/basera.git
   cd basera
   ```

2. Create a MySQL database:
   ```sql
   CREATE DATABASE hotel;
   ```

3. Update credentials in `application.properties`:
   ```properties
   spring.datasource.username=your_mysql_user
   spring.datasource.password=your_mysql_password

   spring.mail.username=your_email
   spring.mail.password=your_app_password
   stripe.api.secret.key=sk_test_...
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

---

## 🌐 Sample API Endpoints

- `POST /api/auth/register`
- `POST /api/auth/login`
- `GET /api/rooms/all`
- `POST /api/bookings`
- `POST /api/payments/create-payment-intent`
- `PUT /api/bookings/update`

---

## 🌱 Future Scope

### 🖥️ Frontend Integration

A complete frontend is under development using **React.js**, with the following features:

- Responsive UI/UX for browsing and booking rooms
- Admin dashboard for managing rooms, bookings, and users
- Customer dashboard to track booking history and upcoming stays
- Secure login and registration forms with JWT auth
- Integrated Stripe UI for payment

### 🚀 Upcoming Backend Features

- 🧼 Booking Cancellation with Refund Handling  
- 🧠 AI-based Room Suggestion System (based on usage patterns and availability)  
- 📊 Reporting Module for Admin (Daily/Monthly Booking & Revenue Stats)  
- 🏘️ Multi-Hotel Support for chain-based operations  
- 🏷️ Discount & Coupon Code System  
- 🔔 SMS Notifications Integration  

---

## 👨‍💻 Author

**Nikhil Singh**  
GitHub: [@NikhilSingh2310](https://github.com/nikhilsingh2005)

---

## 📝 License

This project is intended for educational and learning purposes. Contributions and feature requests are welcome!