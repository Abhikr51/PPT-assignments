# Assignment 4

Pw Skills Java Core Module assignment's answers.

## Solutions

#### Q1.Write a program to show Interface Example in java?

```java
interface Printable {
    void print();
}

class InterfaceEx implements Printable {
    public void print() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        InterfaceEx obj = new InterfaceEx();
        obj.print();
    }
}

```

#### Q2.Write a program with 2 concrete method and 2 abstract method in java?

``` java

abstract class Printable {

    // abstract method
    abstract void print();

    abstract int sum(int a, int b);

    // concrete method
    void show() {
        System.out.println("Concrete Method one");
    }

    int subtract(int a, int b) {
        return (a - b);
    }
}

// subclass of abstract class
class SubClass extends Printable {

    // implementing the abstarct method
    void print() {
        System.out.println("Hello World");
    }

    int sum(int a, int b) {
        return (a + b);
    }

}

// Main class
public class AbstractClass {
    public static void main(String[] args) {
        // Creating an object of the subclass

        SubClass obj = new SubClass();

        // calling the abstract method

        obj.print();
        System.out.println(obj.sum(10, 20));

        // calling the concrete method

        obj.show();
        System.out.println(obj.subtract(10, 5));
    }
}

```

#### Q3.Write a program to show the use of functional interface in java?

```java 
 class FunctionalInterface{

    public static void main(String args[])
    {
        new Thread(new Runnable() {
             public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
    }
 }

```
#### Q4.What is an iinterface in java?
An interface is a collection of abstract method.A class implements an interface there by inheriting the abstract method of the interface.

**Example :**

```java
interface Printable {
    void run();
}

class Test implements Printable {
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String args[]) {
        Test obj = new Test();
        obj.run();
    }
}

```
#### Q5.What is the use of interface in java?

interfaces are used in java to achieve  abstraction.By using the implements keyword,a java class can implement an interface.In general terms,an interface can be defined as a container that stores the signature of the methods to be implementedin the code segment.It improves the levels of Abstraction.
#### Q6.What is the lambda expression of java8?

The lambda exression is a shorthand syntax or we can say  that is a short block of code that takes the parameters inside it and returns the result.The lambda expression can also be said that they are concise ways to write a function.
#### Q7.can you pass lambda expression to a method? when?

A lambda expression passed in a method that has an argument of type of functional interface.If we need to pass a lambda expression as an argument of type of functional interface.If we need to pass a lambda expression as an argument,the type of parameter receiving the lambda expression argument must be of a functional interface type.
#### Q8.What is the functional interface in java8?

A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
#### Q9.What is the benefit of lambda expression in java8?

Lambdas allow you to write concise code. It encourages the use of functional programming. It simplifies variable scope and encourages code reusability. Lambdas allow you to use parallel processing.
#### Q10.Is it mandatory for a lambda expression to have parameters?

 The lambda expression should have the same number of parameters and the same return type as that method.
