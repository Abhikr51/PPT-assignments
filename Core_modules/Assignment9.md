# Assignment 9

Pw Skills Java Core Module assignment's answers.

## Solutions


#### Q1.What is Spring Framework?

The Spring Framework is an open-source, lightweight, and comprehensive Java framework that provides infrastructure support for developing robust and scalable enterprise applications. It offers a wide range of features and functionality that simplifies the development process and promotes modular, loosely coupled, and testable code.


#### Q2.What are the features of Spring Framework?

1. Inversion of Control (IoC) / Dependency Injection (DI)
2. Aspect-Oriented Programming (AOP)
3. Transaction Management
4. MVC Web Framework
5. Integration with Other Technologies
6. Testing Support
7. Data Access and ORM
8. Security
9. Messaging
10. Caching
11. RESTful Web Services
12. Batch Processing
13. Task Scheduling
14. Internationalization (i18n) Support
15. Validation
16. Configuration Management
17. Error Handling and Logging
18. Annotation Support
19. Lightweight and Modular Architecture
20. Seamless Integration with Java EE and Third-Party Libraries

#### Q3.What is a Spring configuration file?

In the context of the Spring Framework, a Spring configuration file is an XML or Java-based file that contains the necessary configuration settings and definitions for Spring applications. It specifies how the various components of a Spring application should be wired together and provides instructions for the Spring container to create and manage the application's beans.

#### Q4.What do you mean by IoC Container?

In Java, an IoC (Inversion of Control) container is a framework or library that implements the IoC principle to manage the creation, configuration, and lifecycle of objects (dependencies) in a Java application. It facilitates the decoupling of components and promotes modularity, extensibility, and testability of the codebase.

1. Inversion of Control (IoC)
2. Dependency Injection (DI)
3. Java IoC Containers
4. Configuration and Metadata
5. Object Lifecycle Management
6. Dependency Resolution and Wiring


#### Q5.What do you understand by Dependency Injection?

Dependency Injection (DI) in Java is a design pattern and a technique used to achieve loose coupling between classes and promote modularity and testability. It allows objects to be created with their dependencies provided from external sources, rather than having the objects create or find their dependencies themselves.

#### Q6.Explain the difference between constructor and setter injection?

|                        | Constructor Injection                     | Setter Injection                           |
|------------------------|-------------------------------------------|--------------------------------------------|
| Timing                 | Dependencies provided at object creation   | Dependencies provided after object creation |
| Immutability           | Promotes immutability                     | Allows for mutable dependencies             |
| Completeness           | Ensures all required dependencies provided | Allows optional dependencies                |
| Contract               | Strict contract enforcement                | Flexible, less strict contract enforcement  |


#### Q7.What are Spring Beans?

In the context of the Spring Framework, a Spring Bean is an object that is managed by the Spring IoC (Inversion of Control) container. It is an instance of a class that is created, wired, and managed by the container to fulfill various dependencies and provide specific functionalities within a Spring application.

#### Q8.What are the bean scopes available in Spring?

In the Spring Framework, several bean scopes are available to control the lifecycle and visibility of Spring beans. Each scope defines how many instances of a bean are created and when they are created. Here are the commonly used bean scopes in Spring:

1. Singleton
2. Prototype
3. Request
4. Session
5. Global Session
6. Application
7. WebSocket


#### Q9.What is Autowiring and name the different modes of it?
Autowiring is a feature of the Spring Framework that automatically resolves and injects dependencies into Spring beans. It eliminates the need for explicit bean wiring or manual dependency injection by allowing the container to automatically wire the beans together based on their types.

- No Autowiring (`autowire="no"`)
- By Name (`autowire="byName"`)
- By Type (`autowire="byType"`)
- Constructor Autowiring (`autowire="constructor"`)
- Autodetection (`autowire="autodetect"`)
- Annotation-based Autowiring

#### Q10.Explain Bean life cycle in Spring Bean Factory Container.

In the Spring Framework, the lifecycle of a bean managed by the BeanFactory container consists of several distinct phases. Understanding the bean lifecycle is crucial for performing custom initialization and destruction tasks and for gaining insights into how the container manages beans. Here's an overview of the bean lifecycle in the Spring BeanFactory container:

1. Instantiation
2. Population of Bean Properties
3. BeanPostProcessor Execution
4. Initialization
5. Custom Initialization
6. Bean Usage
7. Destruction
8. Custom Destruction


