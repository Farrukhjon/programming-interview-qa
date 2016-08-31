Java Virtual Machine Questions & Answers
---

### Garbage Collection

**Q: How is memory allocated?**

**A:** The `new` keyword creates an object and allocates memory to the JVM `heap`.
`Heap` is main `memory pool`, accessible to the whole of application.
 If there is not enough memory available in the pool, JVM attempts to release some memory from the heap using
 `garbage collection`. `OutOfMemoryError` is thrown if JVM cannot obtain enough memory and `JVM exists`.
 
**Q: What is the difference between `heap` and `stack`?**

**A:** JVM memory split in two major parts, `the heap` and `the stack`.
 `The Heap` is main `memory pool`, accessible to the whole of application and all objects allocated to the heap.
 `The Stack` is the memory in which stored any `primitive` values, `references to objects` and `methods`.
  All method call, block of code, loops and functions call are stored in the stack. If there is no enough space in the stack
  and method call is recursively fill up the stack `StackOverflowError` is thrown.

**Q: How can you define `the size of the heap` for the JVM?**

A: Using command line argument `-Xmx<size><prefix>` for `maximum size` and `-Xms<size><prefix>` for initial size.
Where <size> is integer value and <prefix>  one of `K, M and G` for kilo, mega and gigo-bytes.

**Q: Is is possible to have `memory leaks` in Java?**

A: Yes,

**Q: Can you explicitly tell JVM `to perform grabage collection`?** 

**A:** Yes, using `System.gc()` or `Runtime.gc()` but in not guarantee than GC will be performed and also it's not recomended
way to do GC, because `memory leaks` has chance be occurred.

**Q: What does `the finalize` method do?**

**A:** When the JVM decides to GC the object it calls finalize methods of the object is there is no `references` to the object.


### Execution

**Q: When a Java `program exit`?**

**A:** 
Java program `terminates` or `exists` only in two cases:
 - All the `not daemon thread` terminate their execution
 - If some thread invokes `Runtime.exit()` or `System.exit()`
 
**Q: What is a `String Pool?`**

**A:**
  In Java a `String Pool` is a special `storage area` in `Java Heap`. When a string is created and if the string already exists 
  in the pool, the `reference of the existsing string will be returnd`. instead of creating a new object and returning its reference.


