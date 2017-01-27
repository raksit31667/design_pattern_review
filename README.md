# Design Pattern Review (Java)

## Contents

1. [Abstract Factory](#abstract_factory)
2. [Builder](#builder)
3. [Facade](#facade)
4. [Factory](#factory)
5. [Observer](#observer)
6. [Singleton](#singleton)
7. [State](#state)
8. [Strategy](#strategy)
9. [Template](#template)

## Abstract Factory
  
Abstract factory pattern is a creational pattern providing a **FactoryProducer** which is responsible for creating individual factories without specifying their concrete classes.
  
  
## Builder
  
Builder pattern is a creational pattern using a step-by-step approach to create a complex object. In this case, the **Builder** is an inner class specifying the attributes as same as the object. 
  
  
## Facade
  
Facade pattern is a structural pattern involving a single class which provides simplified methods to hide complexities.
For example, **ShapeMaker** provides drawing methods for each **Shape** so that clients can access the system.
## Factory

Factory pattern is a creational pattern providing one of the best ways to create an object.
  
  
![factory_uml](http://imgur.com/V2i7Vi8.png "Factory UML")
## Observer
  
  
## Singleton
  
Singleton pattern is a creational pattern making sure that only single object gets created. If that object has never been created before, then create it.
  
![singleton_uml](http://imgur.com/U9XBNzD.png "Singleton UML")
## State
## Strategy
## Template
