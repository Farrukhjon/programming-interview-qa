Object-Oriented Programming Questions & Answers
---
### Main principles of OOP

**1. Encapsulation**
  
  Encapsulation provides an object the ability to `hide` its `internal state` and `behavior`.
   - Internal state an object is protected by `hidding its attributes/properties`
   - The behavior is protected by `access modifires` like `private, protected and public`
   - Provides `public interface` with `private implementation`

**2. Polymorphism**
  
  Polymorphism of the objects is the ability for the same `action/message` with different behavior, with object specific implementation of some behavior.
  There are two types of polymorphism:
   - Static polymorphism (early binding, on compile time)
    - Provided by method overloading for specific behavior by extra method parameters
   - Dynamic polymorphism (late binding, on run-time)
    - Provided by method overridden in the subclasses. 
  
**3. Inheritance**
  
   - Inheritance provides ability to extend state, behavior child objects from their parent.
   - Provides reusable of parent code without modifying parent code

**4. Abstraction**
  
  Abstraction can be achieved by `abstract classes and interfaces`.
    - Abstraction provides general contract for the object behavior

###SOLID - class/object design principles
 - Single Responsibility
 - Open for extension Close for modification
 - Liskov Substitution
 - Dependency Inversion
