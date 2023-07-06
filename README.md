# ChatApplication

Chat Application Developed Using Java RMI

<img src="https://github.com/BK-KAVIYA/RMIChatApplication/blob/main/UI/screanshot.jpg">

## Table of Contents

- [Project Description](#project-description)
- [Technology Used](#technology-used)
- [Notes](#notes)
- [Getting Started](#getting-started)
- [Contribution](#contribution)
- [License](#license)

## Project Description

This is a chat application developed using Java RMI. It provides a platform for users to communicate with each other in real-time. The application utilizes various technologies such as Java RMI, Hibernate CRUD, and the Observer design pattern. It allows users to send messages, view chat logs, and subscribe to chat updates.

## Technology Used

- Java RMI: Java Remote Method Invocation (RMI) is a Java API that enables communication between remote Java objects. It is used in this application to facilitate communication between the client and server components.

- Hibernate CRUD: Hibernate is an object-relational mapping (ORM) tool for Java that provides a framework for mapping an object-oriented domain model to a relational database. In this chat application, Hibernate is used for performing CRUD (Create, Read, Update, Delete) operations on the database.

- Observer Design Pattern: The Observer design pattern is used to establish a one-to-many dependency between objects, so that when one object changes its state, all dependent objects are notified and updated automatically. This pattern is employed in the chat application to notify subscribers about new chat messages.

## Notes

- The database is stored in the 'database' folder. You can find the necessary database files and configurations in this directory.

- The chat logs are stored in the 'chat_log' folder. This folder contains records of all chat conversations that have taken place.

- The subscribers logs are stored in the 'subscribers_log' folder. This folder keeps track of the subscribers' activities and interactions with the chat application.

Please refer to the respective folders for more information and specific details about each aspect of the application.

## Getting Started

To run this chat application locally, follow these steps:

1. Clone the repository to your local machine.

```shell
git clone https://github.com/BK-KAVIYA/RMIChatApplication
```

## Contribution

Contributions to this project are welcome. If you encounter any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request. Follow these guidelines when contributing to the project:

- Fork the repository and create a new branch for your contribution.
- Ensure that your code adheres to the project's coding conventions and style.
- Provide clear and detailed documentation for your changes.
- Write unit tests to maintain code quality and prevent regressions.
- Open a pull request, describing the changes you've made and explaining why they should be merged.

## License

This project is licensed under the [MIT License](https://github.com/BK-KAVIYA). You are free to use, modify, and distribute it in accordance with the terms of the license.

