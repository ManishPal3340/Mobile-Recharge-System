# Mobile-Recharge-System
Mobile Recharge System is a console-based Java application developed using Java, JDBC, and MySQL. It allows users to register mobile numbers, perform recharges, update balance, and store recharge history in a database. This project demonstrates JDBC connectivity, CRUD operations, and menu-driven programming.


# 📱 Mobile Recharge System (Java JDBC + MySQL)

## 📌 Project Overview
The **Mobile Recharge System** is a console-based Java application developed using **Java, JDBC, and MySQL**.  
This system allows users to register their mobile number, recharge balance, and store recharge details in a MySQL database.

The project is designed for **students and freshers** to learn JDBC concepts and real-world database interaction.

---

## 🛠 Technologies Used
- Java (Core Java)
- JDBC (Java Database Connectivity)
- MySQL Database
- MySQL Connector/J
- Eclipse / IntelliJ IDEA

---

## ✨ Features
- Register new mobile user
- Recharge mobile balance
- Update user balance automatically
- Store recharge history
- Menu-driven console interface
- Uses PreparedStatement for secure queries
- MySQL database integration

---

## 📂 Project Structure


MobileRechargeSystem
│
├── DBConnection.java
├── UserService.java
├── RechargeService.java
└── MainApp.java


---

## 🗄 Database Structure

### Database Name

recharge_db


### Tables

#### users
| Column | Type |
|------|------|
| user_id | INT (PK, AUTO_INCREMENT) |
| mobile_no | VARCHAR (UNIQUE) |
| name | VARCHAR |
| balance | DOUBLE |

#### recharges
| Column | Type |
|------|------|
| recharge_id | INT (PK, AUTO_INCREMENT) |
| user_id | INT (FK) |
| amount | DOUBLE |
| recharge_date | TIMESTAMP |

---

## ⚙ How to Run the Project

1. Install **Java JDK**
2. Install **MySQL Server**
3. Create database and tables using SQL script
4. Add **MySQL Connector/J** to the project
5. Update database username and password in `DBConnection.java`
6. Run `MainApp.java`

---

## 🎯 Learning Outcomes
- JDBC connection handling
- CRUD operations with MySQL
- Foreign key relationships
- PreparedStatement usage
- Console-based menu-driven programming
- Exception handling

---

## 🚀 Future Enhancements
- Check balance option
- View recharge history
- Recharge plans & validity
- User login authentication
- Admin panel
- GUI using JavaFX or Swing

---

## 👨‍💻 Author
**Manish Pal**  
Java Developer | Fresher  

---

## ⭐ Support
If you like this project, please give it a ⭐ on GitHub.
