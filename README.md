# Maven Boilerplate

[![en](https://img.shields.io/badge/lang-en-blue.svg)](README.md)
[![fr](https://img.shields.io/badge/lang-fr-blue.svg)](README.fr.md)

## Introduction

This Maven project is a ready-to-use template for developing Java applications. It allows you to easily create projects with a multi-module architecture. You will find all the necessary tools to manage dependencies with Maven, test your code with JUnit, measure code coverage with JaCoCo, and analyze quality with SonarQube. A demonstration console application is also included to help you get started.

## Features

- **Java 21**: Uses the latest LTS version of Java with all its modern features
- **Multi-module**: Modular architecture to organize code into multiple interconnected projects
- **Unit Testing**: Comprehensive testing framework with JUnit Jupiter and AssertJ for expressive assertions
- **Code Coverage**: Automatic coverage measurement with JaCoCo and detailed report generation
- **Sonar**: SonarQube integration for continuous code quality analysis

## Key Versions

- **Java**: 21
- **Maven**: 3
- **JUnit Jupiter**: 6

## Project Structure

```text
.
├── LICENSE
├── maven-cli/                 # Demonstration console application
│   ├── pom.xml
│   └── src/
├── maven-common/              # Shared code and common utilities
│   ├── pom.xml
│   └── src/
├── maven-dependencies/        # Centralized dependency version definitions
│   └── pom.xml
├── maven-flatten-parent/      # Parent configuration for POM flattening
│   └── pom.xml
├── maven-parent/              # Common parent configuration for all modules
│   └── pom.xml
├── maven-tests/               # Integration tests and global coverage reports
│   └── pom.xml
├── pom.xml                    # Main POM for the multi-module project
└── README.md                  # Project documentation
```

## Prerequisites

Before using this Maven boilerplate, ensure you have the following tools installed:

- **Java**: JDK 21 or higher
- **Maven**: Version 3.6 or higher for dependency management
- **Git**: For version control

## Usage

### Installation

1. Clone this repository to your local machine:
   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```bash
   cd maven-boilerplate
   ```

3. Install dependencies:
   ```bash
   mvn clean install
   ```

### Running the Project

Use the following Maven commands to manage your Maven project:

| Command                                          | Description                                                           |
|---------------------------------------------------|-----------------------------------------------------------------------|
| `mvn clean`                                       | Cleans generated build files                                          |
| `mvn compile`                                     | Compiles all Maven modules                                            |
| `mvn test`                                        | Runs all tests with JUnit Jupiter                                     |
| `mvn exec:java -pl maven-cli`                     | Starts the Java console application                                   |
| `mvn jacoco:report`                               | Generates code coverage reports                                       |
| `mvn verify`                                      | Generates the aggregated JaCoCo report in maven-tests                 |
| `mvn sonar:sonar`                                 | Runs SonarQube analysis (requires configuration)                      |
| `mvn versions:display-dependency-updates`         | Displays available updates for project dependencies                   |
