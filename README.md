# student-management-system# Student Record Management System
A CLI-based CRUD application built in Java for managing student records.
## Features- **Add** a new student (ID, Name, Marks)- **View** all students in a formatted table- **Update** a student's name or marks by ID- **Delete** a student by ID
## How to Run
```bash
# Compile all files
javac *.java
# Run the program
java Main
```
## Project Structure
```
├── Student.java        # Student model with encapsulation (getters/setters)
├── StudentManager.java # CRUD logic using ArrayList
├── Main.java           # Entry point with menu loop
└── README.md
```
## Key Concepts Used- **Encapsulation** – private fields with public getters/setters in `Student.java`- **ArrayList** – dynamic storage for student objects- **Loops** – `while` loop for the menu, `for-each` for displaying records- **Classes & Objects** – `Student` and `StudentManager` classes