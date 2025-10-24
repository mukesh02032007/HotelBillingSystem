🏨 Hotel Billing and Checkout System
📘 Overview
The Hotel Billing and Checkout System is a Java-based Object-Oriented Programming (OOP) project designed to automate hotel room billing and service management.
It calculates room charges (based on room type and duration), adds selected service costs (food, laundry, WiFi), and generates a final, detailed bill for the customer. This project serves as a practical demonstration of core OOP concepts—Abstraction, Encapsulation, Inheritance, and Polymorphism—implemented via a simple console interface.
🎯 Features
Room Selection: Select from three predefined room types: Standard, Deluxe, and Suite.
Optional Services: Choose additional services like Food, Laundry, and WiFi.
Automatic Calculation: Seamless calculation of total room charges and service costs.
Detailed Billing: Displays a comprehensive summary of the final bill.
Clean Design: Utilizes modular classes for a clean and scalable OOP structure.
🧩 Project Structure
HotelBillingSystem/
│
├── src/
│   ├── Miniproject/
│   │   ├── model/
│   │   │    └── Room.java              # Abstract base class for rooms
│   │   ├── service/
│   │   │    └── Services.java          # Handles optional service selection and cost
│   │   ├── customer/
│   │   │    └── Customer.java          # Customer and stay details
│   │   └── main/
│   │        └── HotelBillingSystem.java  # Main execution class
│
└── README.md


⚙️ Technologies Used
Category
Technology / Concept
Details
Language
Java
The core programming language.
Concepts
OOP
Abstraction, Encapsulation, Inheritance, Polymorphism.
Tools
Command Prompt / IDE
Execution environment (Eclipse).

🚀 How to Run the Program
Using Command Prompt / Terminal
Navigate to the root directory of the project (HotelBillingSystem/).
Compile the source files using the following command:
javac -d build -sourcepath src src/Miniproject/main/HotelBillingSystem.java


Run the application:
java -cp build Miniproject.main.HotelBillingSystem


Using an IDE (Eclipse / IntelliJ / VS Code)
Create a new Java project.
Copy the contents of the src folder into your project's source directory.
Set the main class for execution as Miniproject.main.HotelBillingSystem.
Run the project directly from the IDE.
🧪 Sample Output
Enter Customer Name: Mukesh
Enter phone number: 9876543210
Enter Days of Stay: 3
Choose Room Type: 1.Standard 2.Deluxe 3.Suite
2
Need Food service? (true/false): true
Need Laundry service? (true/false): false
Need WiFi service? (true/false): true
------ Hotel Bill ------
Customer: Mukesh
Phone: 9876543210
Room Type: Deluxe
Days Stayed: 3
Room Charges: 6000.00
Service Charges: 700.00
Total Bill: 6700.00
------------------------


🧠 Core OOP Concepts
Concept
Implementation
Abstraction
Implemented using the abstract class Room to define a common blueprint for all room types.
Inheritance
Specific room classes (StandardRoom, DeluxeRoom, SuiteRoom) extend the abstract Room class.
Encapsulation
Achieved by declaring fields as private (e.g., in Customer and Services classes) and providing public getter/setter methods.
Polymorphism
Used through method overriding (e.g., in subclasses of Room to implement different pricing logic) and method overloading.
Composition
The main application uses Customer objects which, in turn, utilize Room and Services objects.

👨‍💻 Author
Attribute
Detail
Name
Mukesh 
Department
Artificial Intelligence and Data Science (AIDS)
Project Title
Hotel Billing and Checkout System
Year
2025

