<h1 align="center">｡ﾟ☁︎｡⋆Literarium —— <em>Where Books Come Alive</em>.｡ ﾟ☾ ﾟ｡</h1>

### <div align="center"><img src="/Assets/Logo3.png" alt="Logo3" width="500"/></div>

This is the repository for Clarissa Audrey Fabiola's Object-Oriented Programming final project.

### ✎𓂃Introduction

Literarium is a Java Swing-based desktop application designed to simulate a digital bookstore. It provides a user-friendly graphical interface and supports two roles: Admin and Customer. The Admin role enables book inventory and customer inventory management, while the Customer role allows users to browse books, add them to their bill, and print it.

[![Video](https://img.shields.io/badge/Demonstration-Watch-red?logo=youtube)](https://www.youtube.com/watch?v=fxTRZ1hzUxs)
[![Report](https://img.shields.io/badge/Report-Read-blue?logo=microsoft-word)](https://drive.google.com/file/d/1M5dWc9fhw6lXXaqzSKVF-VIOzphg0aef/view?usp=sharing)
[![UML Diagram](https://img.shields.io/badge/UML%20Diagram-View-orange?logo=diagramsdotnet)](https://lucid.app/lucidchart/a091bd42-6552-483c-af3a-cf22ceadb0b5/edit?viewport_loc=50%2C1686%2C3456%2C1665%2CHWEp-vi-RSFO&invitationId=inv_9727fe98-da10-472b-ad23-1ef532bcae0c)

### 📁 File Directories

- 'Start.java': The start class serves as the entry point of the application and initializes the necessary components for the bookstore management system.
- 'Login.java': The login class handles the user authentication process, allowing authorized users to access the system.
- 'BookStore.java': The BookStore.java interface declares methods for retrieving and setting information used in the bookstore.
- 'BookManagement.java': The BookManagement class implements the BookStore interface and serves as a component responsible for managing books within the system.
- 'CustomerManagement.java': The CustomerManagement class implements the BookStore interface and serves as a component responsible for managing customers within the system.
- 'Store.java': The Store class handles the overall functionality of the bookstore for customers.
- 'Admin.java': The Admin class provides administrative functionalities for the bookstore management system, such as customer and book inventory.
- 'customer.txt': This file contains information about customers in a bookstore. It stores data such as customer IDs, names, passwords, and gender.
- 'book.txt': This file contains information about books in the bookstore. It stores data such as book IDs, titles, quantities, prices, and authors.
- 'Books' folder: This folder contains book cover images in JPG format and their corresponding synopsis in TXT files.

### 📚 Dependencies

- javax.swing: A library for creating graphical user interfaces (GUIs) in Java. It is used in the project for displaying message dialogs, manipulating table models, and creating graphical components for the user interface.
- java.awt: A library for creating GUI components and handling basic graphics operations in Java. It is used in the project for working with fonts, measuring font metrics, and managing images.
- java.io: A library for performing input and output operations in Java. It is used in the project for reading and writing files.
- java.nio.file: A library for performing file-related operations in Java. It is used in the project for copying files with the option to replace existing files.

### 👯 Clone Locally

```
$ git clone https://github.com/audreyfabiola/Literarium
```

### 🖋️ UML Class Diagram of the Program

![UMLClassDiagram](/Assets/UMLClassDiagram.png)

### 📷 Screenshots of the Program

Login Page

![loginScreenshot](/Assets/loginScreenshot.png)

Admin Page (Book and Customer Management)

![bookManagementScreenshot](/Assets/bookManagementScreenshot.png)

![customerManagementScreenshot](/Assets/customerManagementScreenshot.png)

Customer Page (Store)

![bookStoreScreenshot](/Assets/bookStoreScreenshot.png)
