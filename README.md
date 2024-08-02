# Automated-Testing-for-SauceDemo

## Project Overview

This project is an automated testing suite for the SauceDemo website using Selenium, Java, and Cucumber. The suite covers a login process, adding a product to the cart, and completing a checkout process.

## Features

- **Login**: Tests successful login with valid credentials.
- **Checkout**: Automates the process of adding a product to the cart, proceeding to checkout, and verifying the order completion message.

## Technologies Used

- **Java**: Programming language used for test automation.
- **Selenium**: Web automation tool used for interacting with the SauceDemo website.
- **Cucumber**: Framework for Behavior-Driven Development (BDD) used to define and execute test scenarios.
- **JUnit**: Testing framework used in conjunction with Cucumber for running the tests.
- **WebDriverManager**: Dependency for managing browser drivers.

## Project Setup

### Prerequisites

- **Java**: Ensure you have JDK 11 or higher installed.
- **Maven**: Make sure Maven is installed to manage project dependencies.
- **IDE**: Any Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse).

### Configuration

Update the `BaseTest` class with the appropriate WebDriver setup if needed.

### Directory Structure

- `src/main/java/Pages/`: Contains page object classes for interacting with web elements.
- `src/test/java/Steps/`: Contains step definitions for Cucumber scenarios.
- `src/test/resources/`: Contains feature files and configuration files.
- `pom.xml`: Maven configuration file for managing dependencies and plugins.

## Known Issues

- Ensure that the correct versions of the browser and WebDriver are used for compatibility.
- Any changes in the SauceDemo website’s UI may require updates in the locators used in the Page Object classes.

# ![1111](https://github.com/user-attachments/assets/a453ada2-1cff-4e30-9738-8a6a33594d59)



https://github.com/user-attachments/assets/cc26e46b-32bd-46a7-872b-c4afbc568d7f



