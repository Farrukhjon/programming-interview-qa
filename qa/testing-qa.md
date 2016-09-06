Unit Testing and Test Driven Development Questions & Answers
---

### Test Driven Development (TDD) and Behavior Driven Development (BDD)

**Q: What benefits the tests give to us in general?**

Testing - is a `design` tool and `quality` tool at the same time
 - Help us to catch mistakes
 - Shape our design to actual use
 - Help us to meet right behavior and requirements to the application 

**Q: What is the `Test Smells`?**

 - Code Smells
   - Obscure Test/Long Test/Complex Test/Verbose Test - It's difficult to understand the test at the glance.
   - Conditional Test Logic - A test contains a code that may or may not be executed
   - Hard-to-Test Code
   - Test Code Duplication
   - Test Logic in Production
 - Behavior Smells
 - Project Smells

**Q: Test as Documentation?**

**Q: Test as Execution of a Specification?**

### Unit Testing

**Q: What is the `Testing Doubles` objects?**

Testing Doubles objects help you `isolate the code under test` from `its collaborators` so that you can test all facets of its behavior.

Q: What are the most common `Testable Issues` in Unit Testing?
 - Cat't instantiate a class
 - Can't invoke a `private` method
 - Can't observe the outcome right result
 - Can't substitute a collaborator
 - Can't override a method

### Component Testing

### Integration Testing