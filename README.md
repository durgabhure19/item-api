# Item API – Spring Boot REST Application

This is a simple RESTful API built using **Spring Boot** that allows users to manage items with in-memory data storage.

## 🚀 Features

* Add a new item
* Get item by ID
* Get all items
* Input validation using Jakarta Validation
* Global exception handling
* Clean layered architecture

## 🛠 Tech Stack

* Java 17
* Spring Boot
* Maven
* REST APIs

## ▶️ How to Run

1. Clone the repository
2. Open in Eclipse / IntelliJ
3. Run `ItemApiApplication.java`
4. Server starts on:

```
http://localhost:8081
```

## 📌 API Endpoints

### ✅ Add Item

POST `/items`

Example JSON:

```
{
"name": "iPhone 15",
"description": "Apple mobile",
"price": 80000
}
```

---

### ✅ Get Item By ID

GET `/items/{id}`

---

### ✅ Get All Items

GET `/items`

---

## 📷 Sample Response

```
{
"id": 1,
"name": "iPhone 15",
"description": "Apple mobile",
"price": 80000
}
```

---

## 👩‍💻 Author

**Durga Suresh Bhure**
Java Developer
