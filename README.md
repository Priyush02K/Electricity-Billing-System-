# Electricity Billing System

## Description
The **Electricity Billing System** is a software designed to simplify the process of managing and generating electricity bills. It allows the user to input customer details, track their electricity consumption, and automatically calculate and generate bills based on the inputted data. This system is beneficial for electricity boards and companies to manage a large number of customer details efficiently and accurately.

## Working Flow
1. **Customer Registration**: The user adds customer details (name, address, meter number).
2. **Consumption Entry**: The electricity consumption (in units) is entered.
3. **Bill Calculation**: The system calculates the bill based on predefined rates.
4. **Bill Generation**: A detailed bill is generated and displayed with customer details and consumption cost.
5. **Bill History**: The system maintains a history of bills for future reference.

## Technology Used
- **Java**: The core language used for development.
- **Swing (Java)**: Used for building the graphical user interface (GUI).
- **MySQL**: Manages the database and stores customer and billing information.

## Features
- **Customer Management**: Add, update, or delete customer details.
- **Bill Generation**: Automatic bill generation based on electricity consumption.
- **Historical Data**: The system maintains and provides access to previous billing data.
- **User-Friendly Interface**: Easy navigation and usage via a GUI built using Java Swing.

## Clone Repository Steps
To run the Electricity Billing System on your local machine, follow the steps below:

1. Open your terminal and clone the repository:
   ```bash
   git clone https://github.com/Priyush02K/Electricity-Billing-System-.git

2. Navigate to the project directory:
```bash
Copy code
cd Electricity-Billing-System-
```
3. Open the project in your preferred Java IDE (such as IntelliJ IDEA or Eclipse).
4. Set up the MySQL database:
    -Import the provided SQL script to create the necessary database and tables.
    -Update the database connection details in the Java code.
    -Run the project from your IDE.

## Usage
1. Login to the system using the credentials.
2. Add Customer: Input customer details like name, address, and meter number.
3. Enter Units Consumed: Input the number of units consumed for the customer.
4. Generate Bill: The system calculates and displays the bill.
5. View Bill History: Check the history of previous bills for any customer.

