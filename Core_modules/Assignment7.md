# Assignment 7

Pw Skills Java Core Module assignment's answers.

## Solutions


#### Q1.What is the use of JDBC in java?

JDBC (Java Database Connectivity) is a Java API that allows Java programs to interact with databases. It provides a set of classes and interfaces that enable developers to connect to a database, execute SQL queries, retrieve and manipulate data, and manage database transactions. JDBC acts as a bridge between the Java programming language and various database management systems, allowing seamless integration and efficient data access.


#### Q2.What are the steps involved in JDBC?
JDBC (Java Database Connectivity) is a Java API that provides a standard way to interact with relational databases. It allows Java programs to connect to and manipulate databases using SQL queries. The steps involved in JDBC as follows:

- Import the packages 
- Register the drivers 
-  Establish a connection
- Create a statement
- Execute the query
- Retrieve results
- Close the connections



#### Q3.What are the types of statement in JDBC in java?
The statement interface is used to create SQL basic statements in Java it provides methods to execute queries with the database. There are different types of statements that are used in JDBC as follows:
- Create Statement
- Prepared Statement
- Callable Statement

#### Q4.What is Servlet in Java?
Servlet technology is used to create a web application (resides at server side and generates a dynamic web page).
Servlet technology is robust and scalable because of java language. Before Servlet, CGI (Common Gateway Interface) scripting language was common as a server-side programming language.

#### Q5.Explain the life Cycle of servlet?
The web container maintains the life cycle of a servlet instance. Let's see the life cycle of the servlet:
- *Servlet class is loaded* : The classloader is responsible to load the servlet class. The servlet class is loaded when the first request for the servlet is received by the web container.

- *Servlet instance is created* : The web container creates the instance of a servlet after loading the servlet class. The servlet instance is created only once in the servlet life cycle.

- *init method is invoked* : The web container calls the init method only once after creating the servlet instance. The init method is used to initialize the servlet. It is the life cycle method of the javax.servlet.Servlet interface. Syntax of the init method is given below:
public void init(ServletConfig config) throws ServletException  

- *service method is invoked* :The web container calls the service method each time when request for the servlet is received. If servlet is not initialized, it follows the first three steps as described above then calls the service method. If servlet is initialized, it calls the service method. Notice that servlet is initialized only once. The syntax of the service method of the Servlet interface is given below:
public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 

- *destroy method is invoked* : The web container calls the destroy method before removing the servlet instance from the service. It gives the servlet an opportunity to clean up any resource for example memory, thread etc. The syntax of the destroy method of the Servlet interface is given below:
public void destroy()  

#### Q6.Explain the difference between the RequestDispatcher.forward() and            HttpServletResponse.sendRedirect() methods?
The forward () method of the RequestDispatcher works on the server-side, while the SendRedirect() method works on the client-side. Request dispatcher works on the request object, while SendRedirect() works on the response object.

#### Q7.What is the purpose of the doGet() and doPost() methods in a servlet?
- Purpose of doGet() method:The doGet() method is used to handle HTTP GET requests. When a client sends a GET request to a servlet, the servlet container calls the doGet() method of that servlet. This method is responsible for processing the request and generating an appropriate response. The doGet() method is commonly used for retrieving data from the server without modifying it.

- Purpose of doPost() method:The doPost() method is used to handle HTTP POST requests. When a client sends a POST request to a servlet, the servlet container calls the doPost() method of that servlet. This method is responsible for processing the request and generating an appropriate response. The doPost() method is commonly used for submitting data to the server for processing or modification.

#### Q8.Explain the JSP Model-View-Controller (MVC) architecture.
The JSP Model-View-Controller (MVC) architecture is a design pattern commonly used in web application development. It provides a structured approach to separating the concerns of an application into three distinct components: the model, the view, and the controller. This architectural pattern promotes modularity, reusability, and maintainability of code.

- *Model* : The model represents the data and business logic of the application. It encapsulates the application's state and provides methods to manipulate and access this data. In a JSP MVC architecture, the model is responsible for retrieving and updating data from various sources such as databases or external APIs. It ensures data integrity and consistency throughout the application.

- *View* : The view is responsible for presenting the data to the user in a user-friendly format. In the context of JSP, the view is typically represented by HTML templates that define the structure and layout of the user interface. The view receives data from the model and dynamically generates HTML content to be rendered in the user's browser. It focuses on displaying information and handling user interactions but does not contain any business logic.

- *Controller*: The controller acts as an intermediary between the model and the view. It receives user requests, processes them, and determines which actions to perform based on these requests. In a JSP MVC architecture, the controller is responsible for handling HTTP requests, extracting relevant data from these requests, invoking appropriate methods in the model to update or retrieve data, and selecting the appropriate view to render based on the outcome of these operations.


#### Q9.What are some of the advantages of Servlets?
Servlets offer several advantages in web development:

- *Platform Independence*: Servlets are written in Java, which is a platform-independent language. This means that servlets can run on any operating system or hardware platform that supports the Java Virtual Machine (JVM). 

- *Efficiency*: Servlets are efficient in terms of memory usage and performance. Unlike traditional CGI scripts, servlets are loaded into memory once and remain in memory to handle subsequent requests. 

- *Robustness*: Servlets provide a robust framework for developing web applications. They have built-in support for handling HTTP requests and responses, session management, cookie handling, and URL mapping. 

- *Extensibility*: Servlets can be easily extended through the use of Java libraries and frameworks. Developers can leverage the vast ecosystem of Java libraries to add additional functionality to their servlet-based applications. 

- *Security*: Servlets provide a secure environment for web application development. They support various security mechanisms such as SSL/TLS encryption, authentication, and authorization. Servlet containers also offer features like request filtering, input validation, and protection against common web vulnerabilities like cross-site scripting (XSS) and SQL injection.

#### Q10.What are the limitations of JSP?
- *Complexity* : JSP can become complex and difficult to maintain as the application grows in size and complexity. 

- *Performance* : JSP pages are compiled into servlets before they can be executed by the web server. 

- *Limited Separation of Concerns* : JSP promotes a mixed approach where Java code and HTML markup are intermingled within the same file.

- *Limited Reusability* : JSP pages are typically tightly coupled with specific servlets or controllers, making it challenging to reuse them across different parts of an application or in different projects. 

- *Lack of Flexibility*: JSP is primarily focused on generating HTML output, which limits its flexibility when dealing with other types of content or response formats. 

