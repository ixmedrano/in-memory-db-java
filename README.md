# In-Memory Database (Java)

This Java program was built with the assistance of ChatGPT. I have never worked with Java before but i am familiar with OOP principles thanks to my experience using C# and Python. This application demonstrates a simple in-memory database using a HashMap data structure. It provides basic CRUD (Create, Read, Update, and Delete) functionality and allows users to interact with the database using terminal commands.

## Overview

The program consists of a single class, `InMemoryDatabase`, with the following methods:

- `create(int id, String value)`: Creates a new record in the database with the given `id` and `value`. If a record with the same `id` already exists, it displays an error message.
- `read(int id)`: Retrieves the value associated with the given `id`. If the record does not exist, it returns `null`.
- `update(int id, String newValue)`: Updates the value associated with the given `id`. If the record does not exist, it displays an error message.
- `delete(int id)`: Deletes the record with the given `id`. If the record does not exist, it displays an error message.

The `main` method provides an interactive command-line interface for users to interact with the in-memory database. It accepts the following commands:

- CREATE: Creates a new record with the specified `id` and `value`.
- READ: Retrieves the value associated with the specified `id`.
- UPDATE: Updates the value associated with the specified `id`.
- DELETE: Deletes the record with the specified `id`.
- EXIT: Exits the program.

## Prerequisites

To run this program, you need to have Java Development Kit (JDK) 11 or later installed on your machine.

## How to Run

1. Save the `InMemoryDatabase.java` file to your local machine.

2. Open a terminal and navigate to the directory where you saved the `InMemoryDatabase.java` file.

3. Compile the Java code using the following command: javac InMemoryDatabase.java

This will create a file called `InMemoryDatabase.class`, which is the compiled bytecode of your Java code.

4. Run the compiled code using the following command: java InMemoryDatabase


You should see a prompt to enter commands to interact with the in-memory database.

## Usage

To interact with the in-memory database, enter one of the following commands:

- CREATE: Enter `CREATE` followed by the ID and value separated by a space. For example: CREATE 1 Alice
- READ: Enter `READ` followed by the ID. For example: READ 1
- UPDATE: Enter `UPDATE` followed by the ID and new value separated by a space. For example: UPDATE 1 Alice-Smith
- DELETE: Enter `DELETE` followed by the ID. For example: DELETE 1

- EXIT: Enter `EXIT` to exit the program.