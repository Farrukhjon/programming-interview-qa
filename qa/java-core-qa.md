Java Language Fundamental Questions & Answers
---

### Object
**Q: Enumerate major methods of the Object class**

**A:** The Object is superclass fro all classes, including arrays and they implement its methods.
  Here are major methods of the Object class:
 - Object
   - hashCode()
   - equals()
   - clone()
   - toString()
   - notify()
   - notifyAll()
   - wait()
   - finalize()
   If in subclasses you did not override `equals()` methods than an object of subclass equality will checked in `reference identity`.
   In other word Object.equals() is checking by `==`

###Class Loading
**Q:** Explain class **`loading`** and class **`initializing`**

**A:** 
 - In Java ClassLoader responsible for `loading` a class(s) to the JVM recursively.
 - Class `initialization` in JVM is instantiating `static fields`, `final filds`, `constructors`.
 First JVM will `initializate` superclasses.

###String
**Q:** Why `String` is `immutable` in java?

**A:** In order to meet memory space, performance and other requirements String is implemented as immutable.
 There is `Spring pool` in `Method Area` of JVM. Instead of creating new String object if there is a String object with same value
 JVM returns its reference to the string in the pool.
 In other word, if String is not immutable, changing the string with one reference will lead 
 to the wrong value for the other reference.
 Also, being immutable enables take advantage from string `hash code`. The same string returns same hash code
 so that it can be `cached` and there no needs for frequently calculating the string hash code.
 Summary: String immutable because:
  - `String pool` architecture
  - memory efficiency usage by `caching` its hash code
  - `security` for preventing in critical values (url, file path and so on)

**Q:** What is the different between `Overriding` and `Overloading`?
