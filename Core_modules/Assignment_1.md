
# Assignment 1

Pw Skills Java Core Module assignment's answers.

## Solutions

#### Q1.What is the difference between Compiler and Interpreter

- **Compiler** : It is a software which takes sourcecode(HLL) as the input and generates MLL code as the ouput To convert the HLL code to MLL code compiler will scan the HLL code only once.
- **Interpreter** : =>It is a software which takes sourcecode(HLL) as the input and generates MLL code as the ouput To convert the HLL code to MLL code interpreter will scan the HLL code mulitple times(depends on the instrcutions).
#### Q2.What is the difference between JDK, JRE, and JVM?

- **JDK** :: JRE + JVM
- **JRE** :: Java RunTimeEnvironment, It provides suitable environment to run our java program.
- **JVM** :: Java Virtual Machine, It is responsible to run our java programs on the basis of MultiThreading.

#### Q3.How many types of memory areas are allocated by JVM?

- Dynamic 
- Static

#### Q4.What is JIT compiler?
JIT (Just in time Compiler) is compiles the bytecode to machine level code so that the system can exicute the program. 
#### Q5.What are the various access specifiers in Java?
- Public
- Private
- Default
- Protected
#### Q6.What is a compiler in Java?
A compiler in Java is a computer program that is used for compiling Java programs. It is platform-independent. It converts (translates) source code (.java file) into bytecode (.class file).
In other words, the compiler (javac.exe) generates bytecode during the compilation process.
A bytecode is a binary code that is understood and interpreted by Java Virtual Machine (JVM) on the underlying operating system. It is not similar to machine code.
#### Q7.Explain the types of variables in Java?
- Local 
- Instance
- Static
#### Q8.What are the Datatypes in Java?
- byte
- short 
- int
- long
- double 
- float
- char
- boolean

#### Q9.What are the identifiers in java?
Identifer is a name in java program .Identifer can be classname,methodname,variablename,labelname.

#### Q10.Explain the architecture of JVM 
*JVM has several areas given below that are involved to execute a java program.*

* Classloader
    * Bootstrap ClassLoader
    * Extension ClassLoader
    * System/Application ClassLoader
* Class(Method) Area
* Heap
* Stack
