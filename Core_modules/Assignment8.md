# Assignment 8

Pw Skills Java Core Module assignment's answers.

## Solutions


#### Q1.What is ORM in Hibernate?

ORM stands for Object-Relational Mapping. It is a programming technique used to map objects from an object-oriented programming language, such as Java, to relational database tables. ORM frameworks, like Hibernate, provide a bridge between the object-oriented and relational worlds, allowing developers to work with objects and their relationships while transparently persisting and retrieving data from a relational database.



#### Q2.What are the advantages of Hibernate over JDBC?

- Object-Relational Mapping (ORM)
- Productivity and Development Speed
- Database Independence
- Caching and Performance Optimization
- Lazy Loading
- Transaction Management


#### Q3.What are some of the important interfaces of Hibernate framework?

- SessionFactory
- Session
- Transaction
- Query
- Criteria
- CriteriaBuilder
- EntityManager
- EntityManagerFactory
- Configuration
- PersistentObject

#### Q4.What is a Session in Hibernate?

- Represents a single-threaded unit of work within Hibernate.
- Acts as a gateway for interacting with the database.
- Provides methods for CRUD operations, querying, and managing transactions.

#### Q5.What is a SessionFactory?

- Represents a thread-safe factory for creating Session instances.
- Responsible for bootstrapping and configuring Hibernate.
- Used to obtain a Session object to perform database operations.

#### Q6.What is HQL?

HQL (Hibernate Query Language) is a powerful query language provided by Hibernate, an ORM (Object-Relational Mapping) framework for Java. HQL is similar to SQL (Structured Query Language), but it operates at the object level rather than the database level. It allows developers to write database-agnostic queries and interact with objects in a more object-oriented manner.

#### Q7.What are Many to Many associations?

In the context of database design and object-relational mapping (ORM), a many-to-many association refers to a relationship between two entities where multiple instances of one entity can be associated with multiple instances of another entity. It represents a many-to-many relationship between the entities involved.

#### Q8.What is hibernate caching?

Hibernate caching refers to the mechanism used by Hibernate, an ORM (Object-Relational Mapping) framework for Java, to improve performance by reducing the number of database queries and network traffic. Caching in Hibernate involves storing frequently accessed data in memory to provide faster access and minimize the need for repeated database retrievals.


#### Q9.What is the difference between first level cache and second level cache?

|                   | First-Level Cache                   | Second-Level Cache                                    |
|-------------------|------------------------------------|------------------------------------------------------|
| Scope             | Session-specific                    | Application-wide                                     |
| Availability      | Enabled by default                  | Requires explicit configuration                       |
| Shared across     | Not shared across sessions          | Shared across sessions and transactions              |
| Storage           | Held in memory                      | Can be configured to use various cache providers      |
| Managed by        | Managed automatically by Hibernate  | Managed explicitly by developers                     |
| Entities          | Caches entities and their associations within a session | Caches entities, queries, and collection data beyond a session |
| Granularity       | Fine-grained                        | Coarser-grained                                       |
| Lifetime          | Limited to a single session         | Can persist beyond the scope of a single session      |
| Data sharing      | Not shared between different sessions | Shared between different sessions for improved performance |
| Configuration      | No explicit configuration required  | Requires configuration for cache regions and providers |
| Consistency       | Automatically maintains consistency | Developers must handle cache invalidation and synchronization |
| Performance Impact | Provides immediate benefits within a session | Provides global benefits for multiple sessions and transactions |


#### Q10.What can you tell about Hibernate Configuration File?

The Hibernate Configuration File is a crucial component in a Hibernate-based application. It provides essential configuration settings that Hibernate requires to connect to the database, define object-relational mapping (ORM) settings, and specify various other Hibernate-specific properties. The configuration file is typically written in XML format, although there are alternative formats available as well.

Key Points about the Hibernate Configuration File:

Configuration Details:

The configuration file contains information such as the database connection details, driver class, database dialect, connection pool settings, and other database-specific settings.
It specifies the mapping between Java classes (entities) and database tables, defining how the objects are stored and retrieved from the database.
Additional configuration settings can be specified to control various aspects of Hibernate's behavior, such as caching, transaction management, logging, and more.
File Name and Location:

By convention, the Hibernate configuration file is often named hibernate.cfg.xml, but you can choose a different name if desired.
The file should be placed on the classpath or in a location that can be easily accessed by the application.
The location of the configuration file needs to be specified when building the SessionFactory or EntityManagerFactory.
XML Structure:

The configuration file follows a specific XML structure defined by Hibernate, with elements and attributes that correspond to different configuration settings.
It typically includes elements such as session-factory, property, mapping, class, collection, and more, each serving a specific purpose in Hibernate's configuration.
Configuration API:

In addition to the XML configuration file, Hibernate also provides a programmatic configuration API that allows developers to configure Hibernate using Java code instead of XML.
The programmatic configuration can be useful when you need dynamic or runtime-based configuration.
Multiple Configuration Files:

It is possible to have multiple configuration files in a Hibernate application, especially when dealing with multi-tenant or multi-database scenarios.
Multiple configuration files can be used to define different persistence units or different sets of configuration settings for different parts of the application.