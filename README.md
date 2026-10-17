# RTU Advanced Java Lab Submission

A collection of Java lab projects and one complete Java enterprise project, organized for college evaluation.

## Repository Contents

### 1. Experiment-01-MVC
A Java application organized using the Model-View-Controller (MVC) pattern.

**Source files:** `Cmodels.java`, `Cviews.java`, `Ccontroller.java`, `Main.java`

**Concepts:** MVC architecture, Java classes, separation of responsibilities.

### 2. Experiment-02-JDBC
A Java application demonstrating database connectivity using JDBC.

**Source file:** `src/App.java`

**Technologies:** Java, JDBC, MySQL.

**Requirement:** A configured MySQL database and the MySQL Connector/J driver are needed to run the application.

### 3. Experiment-03-RMI
A remote calculator application using Java Remote Method Invocation.

**Source files:** `calculator.java`, `calculator_implementation.java`, `server.java`, `client.java`

**Concepts:** Remote interfaces, remote objects, RMI server, RMI client.

### 4. Experiment-04-Client-Server
A Java client-server application using network communication.

**Source files:** `client.java`, `server.java`

**Concepts:** Client-server architecture, sockets, network communication.

### 5. Experiment-05-Student-Registration
A Java-based student registration application.

**Source file:** `Gaurav.java`

**Dependency:** MySQL Connector/J is included in the `lib` directory.

**Concepts:** Java GUI, event handling, database connectivity.

### 6. Experiment-06-Servlet-Login
A Java web application built with Maven and Jakarta Servlet components.

**Build file:** `pom.xml`

**Includes:** Login, logout, home servlet, authentication filter and application listener.

**Technologies:** Java, Maven, Jakarta Servlet, web application components.

### 7. Project-ShopSphere
A Java enterprise e-commerce web application.

**Main files and directories:**
- `pom.xml` — Maven build configuration
- `web/` — Web application source code and resources
- `database/` — Database script
- `extras/` — Supporting Java demonstrations
- `README.md` — Project-specific documentation

**Technologies:** Java, Servlets, JSP, Maven and MySQL.

Refer to `Project-ShopSphere/README.md` for project-specific setup instructions.

## Software Requirements

- Java Development Kit (JDK)
- Maven for Maven-based projects
- MySQL Server for database-backed applications
- A compatible Java web container for servlet applications
- A Java IDE or text editor, such as Visual Studio Code

## Important Notes

1. Configure database connections and required schemas before running database-backed applications.
2. Use your local database credentials; do not publish real passwords or other secrets.
3. Maven-based projects should be built from the directory containing their `pom.xml`.
4. Follow the setup instructions provided with each project.
5. These folders represent the lab work currently available in this submission. The official college practical list can be used for any final numbering adjustments.

## Purpose

This repository organizes the Java lab projects completed so far and the ShopSphere project in one place for review and academic evaluation.
