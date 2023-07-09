# Assignment 5
Pw Skills Java Core Module assignment's answers.

## Solutions

#### Q1.What is Exception in java?
Exception is an event that occurs during the execution of the program and disrupts the normal flow of the program instruction.

#### Q2.What is Exception Handling?
Exception Handling in java is one of the powerful mechanism to handle runtime error so that the normal flow of the application can be maintained.

#### Q3.what is the difference between Checked and Unchecked Exceptions and Error?
Checked exception occur at compile time whereas unchecked exception occur at runtime.
Examples of Checked Exception:No such field exception,class not found exception,no such method exception ,file not found exception.
Examples of Unchecked Exception:No such element exception,Arithmetic Exception,Null Pointer Exception,Array Index out of bound exception.

#### Q4.What are the differences between throw and throws in java?
The throw and throws is the concept of exception handling where the throw keyword throw the exception explicitly from a method or a block of code whereas the throws keyword is used in signature of method.

#### Q5.What is multithreading in java? mention its advantages.
multithreading allows many parts of a program to run simultaneously.These parts are referred to as threads,and they are lightweigth process that are available with in the process.
**Advantages:**
1. It doesn't block the user  because threads are independent and you can perform multiple operation at the same time.
2. you can perform many operations together,so it saves time.

#### Q6.Write a program to create and call a custom exception
``` java
class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        super(str);  
    }  
}  
 
public class TestCustomException1  
{  
  
    static void validate (int age) throws InvalidAgeException{    
       if(age < 18){  
  
        throw new InvalidAgeException("age is not valid to vote");    
    }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }    
  
    public static void main(String args[])  
    {  
        try  
        {  
            validate(13);  
        }  
        catch (InvalidAgeException ex)  
        {  
            System.out.println("Caught the exception");    
            System.out.println("Exception occured: " + ex);  
        }  
  
        System.out.println("rest of the code...");    
    }  
}  

```

#### Q7.How can you handle exception in java?
Java provides five keywords that are used to handle the exception.
* try:	The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.
* catch:The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.
* finally:The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.
* throw:The "throw" keyword is used to throw an exception.
* throws:The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature.

#### Q8.What is Thread in java?
A Thread is a very light-weighted process, or we can say the smallest part of the process that allows a program to operate more efficiently by running multiple tasks simultaneously.

### Q9.What are the two ways of implementing thread in java?
There are two ways to create a thread:

- By extending Thread class
- By implementing Runnable interface.
* Thread class:
Thread class provide constructors and methods to create and perform operations on a thread.Thread class extends Object class and implements Runnable interface.
* Runnable interface:
The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. Runnable interface have only one method named run().

#### Q10.what do you mean by garbage collection?
 garbage collection is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.

