
## Solutions

#### Q1.Write a simple Banking System program by using OOPs concept where you can get account Holder name balance etc?
```java
import java.util.Random;

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Mr. X", 1000.0);
        // Get account holder name and balance
        String accountHolderName = account.getAccountHolderName();
        double balance = account.getBalance();
        long acc_num = account.getAccountNumber();
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + acc_num);
        System.out.println("Balance: " + balance);
        // Deposit and withdraw funds
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Currebnt Bal. " + account.getBalance());
    }
}

class BankAccount {
    private String accountHolderName;
    private long accountNumber;
    private double balance;

    BankAccount(String name, double initialBalance) {
        this.accountHolderName = name;
        this.balance = initialBalance;
        Random random = new Random();
        long number = random.nextLong();
        number = Math.abs(number);// Make the number positive if it is negative
        number = number % 10000000000L;// Truncate the number to 10 digits if it is longer
        this.accountNumber = number;

    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

```
#### Q2. Write a Program where you inherit method from parent class and show method Overridden Concept?
```java
class Vehicle {
    public void start() {
        System.out.println("Starting the vehicle...");
    }

    public void stop() {
        System.out.println("Stopping the vehicle...");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Starting the car...");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();  
        vehicle.stop();   

        Car car = new Car();
        car.start();     
        car.stop();       
    }
}

```
#### Q3.Write a program to show run time polymorphism in java?
```java
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.makeSound();  // Output: Cat is meowing
        animal2.makeSound();  // Output: Dog is barking
    }
}
```

#### Q4.Write a program to show Compile time polymorphism in java?
```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(5, 10);
        int sum2 = calculator.add(2, 4, 6);
        double sum3 = calculator.add(3.5, 2.7);

        System.out.println("Sum 1: " + sum1);   // Output: Sum 1: 15
        System.out.println("Sum 2: " + sum2);   // Output: Sum 2: 12
        System.out.println("Sum 3: " + sum3);   // Output: Sum 3: 6.2
    }
}

```
#### Q5. Achieve loose coupling in java by using OOPs  concept?
```java
// Interface defining the contract for a Printer
interface Printer {
    void print(String document);
}

// Concrete implementation of a Printer using a Laser printer
class LaserPrinter implements Printer {
    public void print(String document) {
        System.out.println("Printing document '" + document + "' using a laser printer.");
    }
}

// Concrete implementation of a Printer using an Inkjet printer
class InkjetPrinter implements Printer {
    public void print(String document) {
        System.out.println("Printing document '" + document + "' using an inkjet printer.");
    }
}

// Class that uses a Printer to print a document
class DocumentProcessor {
    private Printer printer;

    public DocumentProcessor(Printer printer) {
        this.printer = printer;
    }

    public void processDocument(String document) {
        System.out.println("Processing document: " + document);
        printer.print(document);
    }
}

// Main class to demonstrate loose coupling
public class Main {
    public static void main(String[] args) {
        Printer laserPrinter = new LaserPrinter();
        Printer inkjetPrinter = new InkjetPrinter();
        DocumentProcessor processor1 = new DocumentProcessor(laserPrinter);
        processor1.processDocument("Document 1");
        DocumentProcessor processor2 = new DocumentProcessor(inkjetPrinter);
        processor2.processDocument("Document 2");
    }
}

```
#### Q6. What is the benefit of encapsulation in java?
- Encapsulation in Java is a powerful mechanism for storing the data members and data methods of a class together. It is done in the form of a secure field accessible by only the members of the same class.

- Encapsulation in Java is the process by which data (variables) and the code that acts upon them (methods are integrated as a single unit. By encapsulating a class's variables, other classes cannot access them, and only the methods of the class can access them.
#### Q7.Is Java a t 100% Object-oriented Programming language? If no why ?
Java is often considered a predominantly object-oriented programming (OOP) language, but it is not 100% pure object-oriented. While Java supports and encourages the use of OOP principles and concepts, it does have certain features that are not purely object-oriented. Here are a few reasons why Java is not considered a 100% pure OOP language:
- **Primitive Data Types**: Java includes primitive data types such as int, boolean, double, etc., which are not objects. 
- **Static Members**: Java supports the concept of static members (variables and methods) that belong to a class rather than individual objects.
#### Q8.What are the advantages of abstraction in java?

- Increasing Understandability of the Code
- Improves Flexibility
- Promotes Code Reusability
- Improves Modular Design


#### Q9.What is an abstraction explained with an Example?
Abratraction is the process of hiding the implementation details and showing only the functionality details to the user.
***For Example***
**Message sending**: You just type the message and send the message you don't know the internal process of message delivery.
#### Q10.What is the final class in Java?
The final class is a class that is declared with the final keyword. That can restrict class inheritance by making use of the final class. Final classes cannot be extended or inherited. If we try to inherit a final class, then the compiler throws an error during compilation.
