
# Assingment 2

Pw Skills Java Core Module assingment's answers.

## Solutions

#### Q1. What are the Conditional Operators in Java?
- Equality Operator (==): Checks if two values are equal.
- Inequality Operator (!=): Checks if two values are not equal.
- Greater Than Operator (>): Checks if one value is greater than another.
- Less Than Operator (<): Checks if one value is less than another.
- Greater Than or Equal To Operator (>=): Checks if one value is greater than or equal to another.
- Less Than or Equal To Operator (<=): Checks if one value is less than or equal to another.
#### Q2. What are the types of operators based on the number of operands?
- Uniary
- Binary


#### Q3.What is the use of Switch case in Java programming?
Switch case used to handle multiple conditional statements at a time.This makes the code easy to write and read.

**Example :** 
```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```
#### Q4.What are the conditional Statements and use of conditional statements in Java?
- If statement
- else If statement
- else statement
- switch statement
- conditional statement with ternary Operator.
#### Q5.What is the syntax of if else statement?
```java
if(expression){
    //true statement
}else{
    //false statement
}
```

#### Q6.How do you compare two strings in Java?
The equals() method compare two strings ,and returns true if the strings are equal,and false if not.

**Example:**
```java
String s1="pwskills";
String s2="pwskills";
String s3="Physics";
         
System.out.println(s1.equals(S2);//true
System.out.println(s1.equals(S3);//false
```
#### Q7.What is Mutable String in Java Explain with an example
ANS:  Mutable  Strings are those strings whose content  can be changed without creating a new object.StringBuffer and StringBuilder are mutable version of Strings in java. 

**Example 1:**
```java
StringBuffer s1=new StringBuffer("Welcome");    
System.out.println("Orginal String ="+ s1); //Welcome
//USing append method
s1.append("to PWSkills")
System.out.println("Modified String after append is ="+ s1); //Welcome to PWSkills
```
#### Q8.Write a program to sort a String Alphabetically
```java
import java.util.Arrays;

public class Main
{
    public static String sortString(String s){
        int n = s.length();
        if(n == 1) return s;
        s = s.toLowerCase();
        char arr[] = s.toCharArray();
        for(int pass = 0 ; pass< n ; pass++){
            for(int j = 0; j < n - pass -1 ;j++ ){
                if((int) arr[j] > (int) arr[j + 1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        String res = new String(arr);
        return res.trim();   
    }
	public static void main(String[] args) {
    	String s = "PW Skills";
    	String sorted = sortString(s);
    	System.out.println(sorted);
	}
}
```
#### Q9.Write a program to check if the letter 'e' is present in the word **'Umbrella'.**
**Program**
```java
public class CheckOccuranceOfE {

    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String s = "Umbrella";
        System.out.println(check(s));

    }
}
```

#### Q10.Where exactly is the string constant pool located in the **memory?**
The string constant pool is an area in heap memory where java stores literal string values which is createdwithout using new keyword.

