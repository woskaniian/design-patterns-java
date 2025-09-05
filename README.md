# Java Design Patterns

A collection of **classic design pattern implementations in Java**, organized by **creational**, **structural**, and **behavioral** categories.  
This project serves as a reference and learning resource, with clean, well-structured examples and demonstrations.  

---

## ✨ Features

- **Creational Patterns**  
  Singleton (lazy & eager), Prototype, Factory Method, Abstract Factory, Builder  
- **Structural Patterns**  
  Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy  
- **Behavioral Patterns**  
  Strategy, Observer, Command, Chain of Responsibility, Template Method, State, Iterator, Mediator, Memento, Interpreter, Visitor  

---

## 📂 Project Structure
src/
├── Main.java                 # Entry point with demonstrations
├── creational/               # Creational pattern implementations
│    ├── singleton/           # Lazy and eager singleton
│    ├── prototype/           # Cloning & performance comparison
│    ├── factoryMethod/       # Product creation with factory method
│    ├── abstractFactory/     # Document families with different styles
│    │     ├── factories/     # Concrete factories per style
│    │     ├── products/      # Product classes (Letter, Report, Resume)
│    │     └── DocumentFactoryProvider.java
│    └── builder/             # Constructing complex products
│
├── structural/               # Structural pattern implementations
│    ├── adapter/
│    ├── bridge/
│    ├── composite/
│    ├── decorator/
│    ├── facade/
│    ├── flyweight/
│    └── proxy/
│
├── behavioral/               # Behavioral pattern implementations
│    ├── strategy/
│    ├── observer/
│    ├── command/
│    ├── chainOfResponsibility/
│    ├── templateMethod/
│    ├── state/
│    ├── iterator/
│    ├── mediator/
│    ├── memento/
│    ├── interpreter/
│    └── visitor/
│
└─- **.gitignore** → Standard ignore file for Java and IDE artifacts.  

## 🧩 Pattern Descriptions

### Creational Patterns
- **Singleton** → Ensures a class has only one instance and provides a global access point.  
- **Prototype** → Creates new objects by cloning existing ones instead of instantiating from scratch.  
- **Factory Method** → Defines an interface for creating an object but lets subclasses decide which class to instantiate.  
- **Abstract Factory** → Provides an interface for creating families of related objects without specifying their concrete classes.  
- **Builder** → Separates the construction of a complex object from its representation, allowing different configurations.  

### Structural Patterns
- **Adapter** → Converts the interface of a class into another interface clients expect, enabling incompatible interfaces to work together.  
- **Bridge** → Decouples abstraction from implementation, allowing the two to vary independently.  
- **Composite** → Composes objects into tree structures to represent part-whole hierarchies; clients treat individual objects and compositions uniformly.  
- **Decorator** → Dynamically adds responsibilities to objects without modifying their code.  
- **Facade** → Provides a unified interface to a set of interfaces, making a subsystem easier to use.  
- **Flyweight** → Reduces memory usage by sharing common state between multiple objects instead of storing it repeatedly.  
- **Proxy** → Provides a surrogate or placeholder for another object to control access, add security, or manage resources.  

### Behavioral Patterns
- **Strategy** → Defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime.  
- **Observer** → Establishes a one-to-many dependency so when one object changes state, all its dependents are notified.  
- **Command** → Encapsulates a request as an object, allowing parameterization, queuing, logging, and undoable operations.  
- **Chain of Responsibility** → Passes requests along a chain of handlers until one processes it, promoting loose coupling.  
- **Template Method** → Defines the skeleton of an algorithm, deferring some steps to subclasses.  
- **State** → Allows an object to change its behavior when its internal state changes.  
- **Iterator** → Provides a way to sequentially access elements of a collection without exposing its internal structure.  
- **Mediator** → Encapsulates interactions between objects, reducing direct dependencies and promoting loose coupling.  
- **Memento** → Captures an object’s internal state without violating encapsulation so it can be restored later.  
- **Interpreter** → Defines a grammar for a language and provides an interpreter to evaluate its sentences.  
- **Visitor** → Separates operations from the object structure, allowing new operations to be added without modifying existing classes.  

## 🚀 Usage

1. Clone the repository:  
   ```bash
   git clone https://github.com/<your-username>/<repo-name>.git
   cd <repo-name>