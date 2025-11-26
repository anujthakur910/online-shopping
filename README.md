# Online Shopping Application

A simple Online Shopping web application built using **Java**, **Spring Boot**, **Spring MVC**, **JPA/Hibernate**, and **MySQL**.  
It provides features for managing products, users, and orders with clean APIs.

---

## 🚀 Features

### 👤 User Features
- User Registration & Login  
- View all products  
- Add products to cart  
- Place an order  
- View order history  

### 🛍️ Admin Features
- Add new products  
- Update product details  
- Delete products  
- View all orders  

---

## 🧱 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **MySQL**
- **Hibernate**
- **Lombok**

---

## 📦 Project Modules

- **Product Module**
  - Add, update, delete, list products

- **User Module**
  - Register, login

- **Cart Module**
  - Add/remove items in cart

- **Order Module**
  - Place order  
  - View order history

---

## 🗂️ API Endpoints (Sample)

### Product APIs
| Method | Endpoint          | Description          |
|--------|--------------------|----------------------|
| GET    | /products         | Get all products     |
| POST   | /products         | Add new product      |
| PUT    | /products/{id}    | Update product       |
| DELETE | /products/{id}    | Delete product       |

### User APIs
| Method | Endpoint          | Description          |
|--------|--------------------|----------------------|
| POST   | /users/register   | Register user        |
| POST   | /users/login      | Login user           |

### Order APIs
| Method | Endpoint          | Description          |
|--------|--------------------|----------------------|
| POST   | /orders           | Place an order       |
| GET    | /orders/user/{id} | Get user's orders    |

---

## 🛢️ Database Tables

- `users`
- `products`
