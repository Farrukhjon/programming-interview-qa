Java Exceptions handling Questions & Answers
---

**Q: Root or base class for all Java exception classes?**

The Throwable is root or base class for all type of Exceptions and Errors in Java.

**Q: What is difference between NoClassDefFoundError and ClassNotFoundException?**

Both are caused when missing classes in CLASSPATH.
  NoClassDefFoundError:
   - Is type of Error and unchecked by nature (does't require try-catch or finally block)
  ClassNotFoundException is thrown when the followings methods are invoked:
   - The `Class.forName()` method
   - The `ClassLoader.findSystemClass()` method
   - The `ClassLoader.loadClass()` method
   - Is type of checked exception (requires try-catch or finally block)

**Q: What is the difference between `ArrayIndexOutOfBoundsException` and `StringIndexOutOfBoundsException`?**
Both ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException:
 - Are child of IndexOutOfBoundsException exception
 - Cause of both is accessing to the illegal index of the array.
 - The index is illegal if it is `negative`, `greater then` or `equal` to the size of the array

**Q: Explain When and Why occurs `ConcurrentModificationException`?**

When:
 - When structure of a Collection is modifying during iteration
 - An implementation of the Iterator and ListIterator keep track over transient `modCount` variable
 - If modCount does not match to the variable `expectedModCount` then ConcurrentModificationException is thrown
Why
 - Violating the rule of `not modofying a Collection during iteration` 