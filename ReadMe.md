# Software Design Patterns 

### What are design patterns ?
- We are solving the same kinds of problems again and again when building different kinds of software.
- People saw some patterns and ways of solving problems.
- There were 4 people who got together ( gang of 4 ) and they started documenting solutions for these kind of problems.
- So, other people does't want to reinvent the wheel again and again to solve these problems.
- We are gonna learn about Object Oriented Design Patterns here. ( Gang Of 4 design patterns are Object Oriented Design Patterns )

### Advantages of using Design Patterns
- No need to re-invent the wheel to solve problems.
- It will increase the quality of work ( Because these patterns are already proven by other developers ).
- Helps to reduce the number of bugs.
- Helps to come up with a good code structure ( Good class hierarchy ).
- Extensibility of the code will be increased. ( Easy to add / plugin new requirements to the system without breaking other systems )
- There are industry specific we use in companies. So using Design pattens will help us to communicate with other developers easily.
  - "I used observer pattern to build this code."

### Mistakes made when using Design Patterns
- Using the wrong design pattern
- Using a design pattern where it is inapplicable
  - When you are building a simple solution, which you are not maintain for a long time. (One time thing) For those type of scenarios we don't need design patterns.

### How to avoid these mistakes ?
- Have a proper understanding before using them and it's use cases
- Having peer reviews (It is recommended in the industry get your code reviewed by a colleagues / seniors of a team members when you write a code )

### Some of Object Oriented Design patterns 
- Singleton Design Pattern
- Factory Design Pattern
- Decorator Design Pattern
- Observer Design Pattern
- Adaptor Design Pattern

---

# Singleton Design Pattern
- Normally, You can create as much objects as you want from a class.
```
Student s1 =  new Student();
Student s2 =  new Student();
Student s3 =  new Student();
```
- But, there are certain scenarios of the industry we need to restrict this object creation of a class.
- Sometimes, there are classes only want to create one object out of it.
- To apply this restriction we can apply this singleton design pattern.
> If you want to restrict the object creation of a class and make sure one class can be instantiated only once for the lifetime of the application, we can use singleton Design Pattern.
- When we use singleton Design Pattern even though we create multiple instances of a class, they all points to a single instance.
```
SingletonClass s1 = new SingletonClass();
SingletonClass s2 = new SingletonClass();
SingletonClass s3 = new SingletonClass();
```
### Use cases of singleton Design Pattern
- Windows Clipboard
  - When we Copy the selected value will go to the keyboard. Then you can paste that value anywhere. When we copy again the value will get override.
  ```
    Clipboard c1 = new Clipboard();
    Clipboard c2 = new Clipboard();
  ```
- Repository
  - There can only be one repository objects per one object. So we need to use singleton pattern here.
  ```
    Repository r1 = new Repository();
    Repository r2 = new Repository();
  ```
### Steps to make a class Singleton
1. Make the constructor private.
2. Write the getInstance() method to return only one instance of the class.
3. We need to make sure the getInstance() method wont get triggered by 2 threads at the same time. So we need to use sync keyword and volatile keywords to do so. 
- Click [here](https://medium.com/swlh/java-singleton-pattern-and-synchronization-32665cbf6ad7#:~:text=Double%20check%20singleton%20pattern&text=However%20this%20implementation%20is%20buggy,read%20the%20correct%20instance%20value) for more details on this.

---
# Factory Design Pattern
- This design pattern is all about dynamic object creation.
- We create objects dynamically based on a parameter.
- We have to have a interface and a Family of classes extended from that interface.
```
public interface Operation ()  {}
public class AddOperation implements Operation () {}
public class SubOperation implements Operation () {}
public class MulOperation implements Operation () {}
public class DivOperation implements Operation () {}
```
- Then we can use dependency inversion principle to create the Factory design pattern.
- Here we decide from which specific class that the object will get instantiated in the run-time.
- Note that the parameter will be given at the run-time. 
  - Either via Command Line Arguments or Reading from console. 
- Here also we have the method name as getInstance().
- 
