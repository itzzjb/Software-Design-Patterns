# Software Design Patterns 

### What are design patterns ?
- We are solving the same kinds of problems again and again when building different kinds of software.
- People saw some patterns and ways of solving problems.
- There were 4 people who got together ( gang of 4 ) and they started documenting solutions for these kind of problems.
- So, other people doesn't want to reinvent the wheel again and again to solve these problems.
- We are going to learn about Object-Oriented Design Patterns here. ( Gang Of 4 design patterns are Object-Oriented Design Patterns )

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
- Have a proper understanding before using them, and it's use cases
- Having peer reviews (It is recommended in the industry get your code reviewed by a colleagues / seniors of a team members when you write a code )

### Some of Object-Oriented Design patterns 
- Singleton Design Pattern
- Factory Design Pattern
- Decorator Design Pattern
- Observer Design Pattern
- Adaptor Design Pattern

---

# Singleton Design Pattern
- Normally, You can create as many objects as you want from a class.
```
Student s1 =  new Student();
Student s2 =  new Student();
Student s3 =  new Student();
```
- But, there are certain scenarios of the industry we need to restrict this object creation of a class.
- Sometimes, there are classes only want to create one object out of it.
- To apply this restriction we can apply this singleton design pattern.
> If you want to restrict the object creation of a class and make sure one class can be instantiated only once for the lifetime of the application, we can use singleton Design Pattern.
- When we use singleton Design Pattern even though we create multiple instances of a class, they all point to a single instance.
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
3. We need to make sure the getInstance() method won't get triggered by 2 threads at the same time. So we need to use sync keyword and volatile keywords to do so. 
- Click [here](https://medium.com/swlh/java-singleton-pattern-and-synchronization-32665cbf6ad7#:~:text=Double%20check%20singleton%20pattern&text=However%20this%20implementation%20is%20buggy,read%20the%20correct%20instance%20value) for more details on this.

---
# Factory Design Pattern
> This design pattern is all about dynamic object creation. We create objects dynamically based on a parameter in the run-time.
- We have to have an interface and a Family of classes extended from that interface.
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

---

# Adaptor Design Pattern

### Real World Examples
- There are many types of plugs we use in day today life. 
- Inorder to connect the plug with the electricity we need a socket, that is as same as the type of the plug.
- Otherwise, we couldn't plug it in to the socket.
- In that kind of situations, we use Adaptors convert a one plug into another type of plug.
- This is a one real life use of Adaptor patter. (One in the middle who converts one into another.)
- Another example is cable adaptors. ( Usb type C -> HDMI Convertor )

### Adaptor Pattern use cases in the Software world
1. Mostly, we use adaptor pattern when we have to use an incompatible code.
   - Let's say we are building a project that we have built into a certain extent, and we have to implement a new feature / requirement. 
   - But for that requirement someone else already wrote a code, and you found in the internet.
   - But when we are going to use that in our project, that might not be compatible with our existing structure.
   - Inorder to get that code into our project, we might need to create an Adaptor to make those 2 compatible.
   - So , this adaptor pattern comes in handy, when we're trying to implement libraries written by others to out project.
2. Also, when we try to connect into external systems via APIs we use Adaptors.
3. When we try to connect to a database we use database adaptors.

> Adaptor is an any class that can do some kind of conversion.

---
# Decorator Design Pattern

- Mainly used for decorate objects.
- Decoration something means you add some layers on top of something.
> When we have an object created, we can add new behaviour / stuff , so it will be a richer object.

### Popular Examples For Decorator Pattern
1.
   - Assume there is a GUI tool that can create different types of shapes like circle, square , rectangle etc. 
   - User can click on a shape it will be added to the GUI. (Like in Paint , Whiteboard Applications)
   - When we write this using OOP we need to have separate classes for each of those shapes / categories.
   - But we might need to have variations/combination of these shapes / categories like red boarder circle, red square, transparent triangle, dotted border rectangle  etc.
   - There are like thousands of combinations we can have like above.
   - So, having to create single class for each combination is we will end up with lot of classes.
    ```
   cicle()
   red border circle()
   transparent circle()
   red circle()
   dotted border circle()
    ```
2. 
   - Assume that we are creating a software for a pizza company.
   - We have thousands of combinations of pizzas here like pan pizza, thin crust pizza, pan pizza with extra cheese etc. 
   - If we write a class for each and every combination, we will end up with having to write lots of classes.
   - But it's not necessary because they are all in the same category (pizza). 

> If we create classes for categories like circle , triangle , pizza and initialize basic objects from them.
> 
> Then, what if there is a way to add this combinations / variations by adding thing like borders, colors, flavours, toppings to this basic objects dynamically at run time, the code will be much cleaner and maintainable. 

### How to implement decorator ?
- We can have a decorator class like ShapeDecorator() that will shape objects at runtime.
- We implement the ShapeDecorator class by its category class as well. (Shape())
- And then we can create different decorator classes by extending the ShapeDecorator class like BorderDecorator, ColorDecorator etc. 

```
interface Shape ()

class Cicle implements shape ()
class Triangle implements shape()

class ShapeDecorator implements shape()

class BorderDecorator extends ShapeDecorator()
class ColorDecorator extends ShapeDecorator()
```

---
