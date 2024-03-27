# Software Design Patterns 

### What is design patterns ?
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

## Singleton Design Pattern
- Normally, You can create as much objects as you want from a class.
```
Student s1 =  new Student();
Student s2 =  new Student();
Student s3 =  new Student();
// s1 != s2 != s3
// s1, s2, s3 are different objects
```
- But, there are certain scenarios of the industry we need to restrict this object creation of a class.
- Sometimes, there are classes only want to create one object out of it.
- To apply this restriction we can apply this singleton design pattern.
> If you want to restrict the object creation of a class and make sure one class can be instantiated only once for the lifetime of the application, we can use Singleton Design Pattern.
- When we use Singleton Design Pattern even though we create multiple instances of a class, they all points to a single instance.
```
SingletonClass s1 = new SingletonClass();
SingletonClass s2 = new SingletonClass();
SingletonClass s3 = new SingletonClass();
// s1 = s2 = s3
// All refers to the same object
```
### Use cases of Singleton Design Pattern
- Windows Clipboard
  - When we Copy the selected value will go to the keyboard. Then you can paste that value anywhere. When we copy again the value will get override.
    ```
    Clipboard c1 = new Clipboard();
    Clipboard c2 = new Clipboard();
    // c1 = c2
    // Both c1 and c2 refers to the same clipbard object
    ```
- Repository
  - There can only be one repository objects per one object. So we need to use singleton pattern here.
    ```
    Repository r1 = new Repository();
    Repository r2 = new Repository();
    // r1 = r2
    // Both r1 and r2 refers to the same repository object
    ```
---
## Factory Design Pattern
