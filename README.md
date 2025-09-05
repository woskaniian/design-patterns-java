A Java implementation of classic design patterns, organized by creational, structural, and behavioral categories.

## Features

- **Creational Patterns**: Singleton (lazy & eager), Prototype, Factory Method, Abstract Factory, Builder
- **Structural Patterns**: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy
- **Behavioral Patterns**: Strategy, Observer, Command, Chain of Responsibility, Template Method, State, Iterator, Mediator, Memento, Interpreter, Visitor (to be implemented or described)

## Project Structure and File Descriptions

- **src/Main.java**  
  The main entry point. Contains test methods for each design pattern category and demonstrates their usage and output.

- **src/creational/**  
  Contains all creational pattern implementations:
  - **singleton/**: Implements both lazy and eager singleton patterns.
  - **prototype/**: Implements the prototype pattern with cloning and performance comparison.
  - **factoryMethod/**: Implements the factory method pattern for product creation.
  - **abstractFactory/**: Implements the abstract factory pattern for creating families of related documents (e.g., Letter, Report, Resume) with different styles (Fancy, Modern, OldStyle).
    - **factories/**: Contains concrete factory classes for each document style.
    - **products/**: Contains document product classes (Letter, Report, Resume, etc.).
    - **DocumentFactoryProvider.java**: Provides the correct factory based on style.
  - **builder/**: Implements the builder pattern for constructing complex products.

- **src/structural/**  
  Contains all structural pattern implementations:
  - **adapter/**: Implements the adapter pattern.
  - **bridge/**: Implements the bridge pattern.
  - **composite/**: Implements the composite pattern.
  - **decorator/**: Implements the decorator pattern.
  - **facade/**: Implements the facade pattern.
  - **flyweight/**: Implements the flyweight pattern.
  - **proxy/**: Implements the proxy pattern.

- **src/behavioral/**  
  Contains all behavioral pattern implementations (or stubs for future implementation):

  - **Strategy**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
  - **Observer**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
  - **Command**: Encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
  - **Chain of Responsibility**: Lets more than one object handle a request by passing the request along a chain of handlers until one of them handles it.
  - **Template Method**: Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses.
  - **State**: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
  - **Iterator**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
  - **Mediator**: Defines an object that encapsulates how a set of objects interact, promoting loose coupling by keeping objects from referring to each other explicitly.
  - **Memento**: Without violating encapsulation, captures and externalizes an object's internal state so that the object can be restored to this state later.
  - **Interpreter**: Given a language, defines a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
  - **Visitor**: Represents an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

- **.gitignore**  
  Standard gitignore file for Java projects and IDE files.

## Usage

1. Clone the repository.
2. Open in your favorite Java IDE.
3. Run `Main.java` to see pattern demonstrations and output.

## Example Output

The output will show the instantiation and usage of each pattern, with details printed to the console for each test method in `Main.java`.


