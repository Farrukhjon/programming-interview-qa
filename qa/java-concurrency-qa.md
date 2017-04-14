Java Concurrency Questions & Answers
---

###Thread and Runnable

**Q: How can we get `current theard`?**
We can get current thread by calling static method of the `java.lang.Thread.currentThread()`

**Q: What is the difference between Thread.start() and Thread.run() method?**
 - Directly calling some `thread.run()` `does't create a new thread`
 - A new Thread will be create by calling some thread.start() method
 - Some thread.start() actually calls run() method
 - Twice calling of thread.start() will thrown IllegalThreadStateException

**Q: How many `properties` a thread have?**
Each thread in Java has the following properties:
 - an identifier long type (unique within JVM)
 - a name
 - a priority
 - a state (type of java.lang.Thread.State)
 - a thread group

**Q: What `states` a thread may have and their meaning?**

A thread may have the following `states`
 - NEW: a thread is created but `not yet started` in this state
 - RUNNABLE: a thread is `executing` in  JVM in this state
 - BLOCKED: a thread is `blocked for waiting a monitor lock`
 - WAITING: a thread is `waiting indefinitely another thread` to perform a particular action
 - TIMED_WAITING: a thread is `waiting some curtian time another thread` to perform a particular action
 - TERMINATED: a thread is `exited`
 
**Q: What is `volatile` variable?**

The second alternative approach to provide threads to the shared resource with `consistent` and `reliable` updated data
 is to use `volatile` modifier.
  - Solve the `Visibility problem` (not Atomicity)
  - Makes sure that other thread can see a change made by another thread
  - Declaring a variable as volatile means that modifying its value `immediately affects the actual memory storage for the variable`
  - Write/Read operation is synchronized `but non-atomic operations` is not synchronized.
  - `Compile-Time Error` occurs when a `volatile` variable is declared also as `final`

 
**Q: How `volatile` variable works?**


**Q: What is the difference between `volatile` and `synchronized` keyword?**

**Q: What is an `atomic operation`?**

 - An `atomic operation` is an operation which is performed as a `single unit of work`
 - An `atomic` action `cannot stop` in the middle. It either happens completely, or it does't happen at all.
 - Basic operation of `Reading and Writing` a variable (expect long and double, they need to be volatile to be atomic) are `atomic`

**Q: What is the difference between `Runnable` and `Callable` interfaces?**

Both Runnable and Callable represent task execution API in a thread.
 Runnable:
  - Runnable's run() method is void so that just execute its body without retuning execution result
  - Does't throw any exception
 Callable:
  - Callable's call() method return a Future type result of the execution
  - Throws checked exception, if it cannot compute a result
 
**Q: What is happened if we start a thread twice?**
`IllegalThreadStateException` will be thrown

**Q: What is `Happens-before Order`?**
Let `A` and `B` represent `operations` performed by a multithreaded process.
If A happens-before B, then the memory effects of A effectively become visible to the thread performing B before B is performed.

### Intrinsic (implicit, internal) Locks & Synchronization

**Q: What is the difference between `synchronized method and synchronized block`?**

 - Block synchronization is more fundamental and these two code are equal:
 ```
    void f() {
       synchronized(this) {/* safe code */}
    }
    
    and
    
    synchronized void f() {/* safe code */}
    
 ```
  - Methods in interfaces can not be declared as synchronized
  - Synchronized methods not automatically inherited by subclasses methods
  - Constructors can not by synchronized (but synchronized block is allowed inside constructor)

**Q: When to use `wait()`, `notify()` and `notifyAll()` methods?**
 - They are defined in the Object class
 - In `Producer-Consumer` threads interactions
 - Used inside `while` loop, instead `if` condition
 - Must be called from `synchronized` context
 - A thread must hold the `lock` on `the object it's going to call` wait() and notify() method
 - If a thread call `without holding the lock` then they will throw `IllegalMonitorStateException`
 - wait() methods `change state` of the colling thread to `WAITING` and `releases a lock`
 - Common pattern to call wait() from while loop.
 ```
 synchronized (theSharedObject) { 
     while (condition) {
        theSharedObject.wait();
     } 
    // do something
 }
 
 Read more: http://www.java67.com/2016/04/10-points-about-wait-notify-and-notifyAll-in-java-multithreading.html#ixzz4Ha96CcjV
 ```

**Q: What is difference between `Object.wait()` and `Thread.sleep()` methods?**
 - Class belongs methods: the `wait()` method is an instance method, when `sleep()` is static and belongs to the `current executing thread`
 - Context: the `wait()` method can be called only from `synchronuzed` context, the `sleep()` can be called from any context
 - Locking: the `wait()` method `release the lock on an object` and gives others chance to execute, the `sleep()` 
           `does not release the lock of an object` for specified time or until interrupt
 - Wake up condition: a waiting thread can be awake by `notify()` or `notifyAll()` method. A sleeping can be awaken by 
       interrupt or time expires.
       
 |                   |       sleep             |      wait         |
 |-------------------|-------------------------|-------------------|
 | Class belongs     | java.lang.Thread        |	java.lang.Object |
 | Context	         | Called from any context | Only synchronized context |
 | Locking	         | Does not release the lock for specified time  or until interrupt | Releases the lock |
 | Wake up Condition | When time expires or due to interruption | Awake by call to notify() or notifyAll() method |
 | Execution	     | Will pause the current running thread not the object on which it is called | continues till a specific condition holds true |  

### Reentrant (explicit) Locks & Synchronization

**Q: `Intrinsic lock` vs `Reentrant lock` and when to choose which?**

`ReentrantLock` is an advanced tool for situations where `intrinsic locking` is not practical.
 Use it if you need its advanced features:
  - timed
  - polled
  - interruptible lock acquisition: fair queueing, or non-block-structured locking.
 Otherwise, prefer `synchronized`.


**Q: What is main advantage of using `Lock` object (explicit lock) over synchronized keyword (intrinsic) lock?**

 The main advantage of using Lock object over intrinsic lock is `ability to back out of an attempt to acquire a lock`.
 For example, Lock.tryLock() method backs out if the lock is not available immediately or before a timeout expires.
 It can be achieved by returned boolean value which can be used as condition for a calling thread.


### Atomic (non-blocking, block-free synchronization) Operations and `Compare and Swap (CAS)`

**Q: What are `atcomic, non-blocking operations`?**
Atomic, non-blocking synchronization operations implemented in low-level machine instruction called `CAS - compare-and-swap`

**Q: What is `Compare-and-swap (CAS)?`**

### Wait/Notify mechanism with `Condition` object

**Q: What is a `Shutdown Hook`?**
 The shutdown hook is a thread, which is invoked implicitly when before a JVM shuts down.
 Some clean up action is an example of usage.

### Concurrent Access Problems

Q: What are common known concurrent access problems?

 - Data Races (race conditions, race hazard)
 - Deadlocks
 - Livelocks
 - Starvation
 