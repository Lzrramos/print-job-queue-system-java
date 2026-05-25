# Print Job Queue System (Java)
## Overview

This project is a console-based print job queue management system built in Java. It allows users to manage a queue of print jobs using a menu-driven interface. The system demonstrates object-oriented programming principles such as encapsulation, data validation, and collection handling using ArrayList.

Users can add, search, remove, and list print jobs, simulating how a real-world print queue system processes tasks in order.

---

## Features
- Add print jobs to the queue
- Remove print jobs by job ID
- Search for print jobs by ID
- List all print jobs in the system
- Prevent duplicate job IDs
- Validate print job data before adding
- Display detailed print job information
- Menu-driven console interface
- Input validation for numeric fields

---

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- ArrayList data structure
- Encapsulation
- Scanner for user input
- Project Structure

---

## Project Structure
src/
├── PrinterApp.java
├── PrintQueue.java
├── PrintJob.java

## Concepts Demonstrated
- Encapsulation of print job data
- Object modeling using classes
- ArrayList-based dynamic data storage
- Searching and removing elements from a collection
- Menu-driven application design
- Input validation and error handling
- Separation of logic across multiple classes

---

## How It Works
1. The program starts and initializes an empty print queue
2. The user is presented with a menu of options
3. The user can:
   - Add a new print job with ID, pages, and owner
   - Search for a print job by ID
   - Remove a print job from the queue
   - Display all print jobs in the system
4. The program continues running until the user selects exit (99)
5. All operations are handled in real time through the queue system

---

## Example Menu

Menu:

1. Add a print job
2. Find a print job
3. Remove a print job
4. List all print jobs
5. Quit (99)

---

## What I Learned
- How to design a queue-based system using Java
- How to use ArrayList for dynamic data storage
- How to structure a multi-class application
- How to validate user input and object data
- How to separate logic between model, data structure, and UI classes

---

## Future Improvements
- Add priority-based print jobs
- Implement automatic FIFO processing simulation
- Add estimated print time per job
- Add file saving/loading for persistent queue storage
- Expand into a multi-printer system simulation

---

## Author

Lazaro Ramos
