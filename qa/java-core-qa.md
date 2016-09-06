Java Language Fundamental Questions & Answers
---

### Java

**Q: What is the `Java programming language`? **

The Java Programming Language is
 - a general-purpose
 - concurrent
 - class-based
 - object-oriented
 - production (not a research), avoided new and untested features
 - strongly and statically typed
 - high-level
language

**Q: What are the `compile-time error` and the `run-time error`?**
 - Compile-Time Error is occur on `translating` written code to the byte-code, at comilation time
 - Run-Time Error is occur on `loading and linking` of the classes to execute a program

**Q: What kind of 'character set` is used for writing java code text?**

The `Unicode` character set is used for writing a java code text.

**Q: How many `Literals` exist in Java?**

A literal is the source code representation of a primitive value, the String type (value) and null
 - Integer literal
   - Decimal integer literal
   - Hexadecimal integer literal (0x[0..F])
   - Octal integer literal
   - Binary integer literal (0b[0,1])
 - Floating point literal
 - Boolean literal
 - Character literal
 - String literal
 - Null literal

**Q: How many kid of types exist in Java?**

The Java has two category of types:
 - Primitive types
   - boolean type
   - numeric types 
     - integral types
       - byte (values size is 8-bit, [-128..127])
       - short (values size is 16-bit, [-32768..32767])
       - int (values size is 32-bit, [-2147483648..2147483647])
       - long (values size is 64-bit, 2^64-1, signed)
       - char (values size is 16-bit unsigned, [0..65535])
    - floating-point types
       -float
       -double
 - Reference types (the `values` of this kind of types `are objects`)
   - class type
   - interface type
   - array type

**Q: Methods parameters, `call-by-value` and `call-by-reference`?**

 - cal-by-value means that a method just get a copy of a value a passed argument
 - call-by-reference means that a method get address location of a passed argument, thus a method can modify a values
 The Java `always` (for `both`, `primitive` and `object` parameters) uses call-by-values (copies of original parameter values) for method parameters

### Object

**Q: What is an object?**

An object is instance of a class or an array

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
