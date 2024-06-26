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
  - "I used observer.observerDemo pattern to build this code."

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
public interface Operation {}
public class AddOperation implements Operation {}
public class SubOperation implements Operation {}
public class MulOperation implements Operation {}
public class DivOperation implements Operation {}
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
   - So, having to create single class for each combination is we will end up with a lot of classes.
    ```
   public class Cicle {}
   public class RedBorderCircle extends Circle {}
   public class TransparentCircle extends Circle {}
   public class RedCircle extends Circle {}
   public class DottedBorderCircle extends Circle {}
    ```
2. 
   - Assume that we are creating a software for a pizza company.
   - We have thousands of combinations of pizzas here like pan pizza, thin crust pizza, pan pizza with extra cheese etc. 
   - If we write a class for each and every combination, we will end up with having to write lots of classes.
   - But it's not necessary because they are all in the same category (pizza). 

> If we create classes for categories like circle , triangle , pizza and initialize basic objects from them.
> 
> Then, what if there is a way to add these combinations / variations by adding thing like borders, colors, flavours, toppings to this basic objects dynamically at run time, the code will be much cleaner and maintainable. 

### How to implement decorator ?
- We can have a decorator class like ShapeDecorator() that will shape objects at runtime.
- We implement the ShapeDecorator class by its category class as well. (Shape())
- And then we can create different decorator classes by extending the ShapeDecorator class like BorderDecorator, ColorDecorator etc. 

```
public interface Shape () {}

public class Cicle implements shape {}
public class Triangle implements shape {}

public class ShapeDecorator implements shape {}

public class BorderDecorator extends ShapeDecorator {}
public class ColorDecorator extends ShapeDecorator {}
```

---
# Observer Design Pattern
- Mostly used in situations we use Publisher Subscriber mode.
- We do some work based on Events happen.
- Usually We have a certain class called Subject class that initiates events. (Subject is the class that do the co-ordination)
> Publishers are usually called as Subject.
- Other classes will do their work answering to the event.
- Subject calls subscribers and let them know about new events. 
> Subscribers are usually called as Observers.
- When there is an event happen in Subject All the Observers will be notified. (MouseClick) Then Observers will execute whatever the relevant action we programmed it to do so.
- There are different types of Subscribers.
- We can classify these types of observers on how they perform when they receive an event.
- Subject should have list of observers. We can implement that using a dynamic array.
- The array size should be dynamic because you should be able to subscribe and unsubscribe at the runtime. So items will be inserted and removes from the array at runtime.
- The observers should be able to add them into the list by subscribing and remove themselves from the list by unsubscribing.

### Real World Example
- If we are developing a software for a newspaper agency, the newspaper agency is the Subject / Publisher.
- People who read the newspapers are the Observers.
- There are different types of observers here.
  - Some Subscribers / Observers, only reads the front page.
  - Some Subscribers / Observers, they will read the entire newspaper.
  - Some Subscribers / Observers, they won't read the newspaper at all.
  - etc. 
- The newspaper agency has a list of subscribers. Based on that they will know for which addresses the newspapers need to send to.
