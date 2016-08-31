Java Collections Framework Questions & Answers
---

### Core Interfaces
**Q: What are core interfaces in Java Collection Framework?**

Here is core interfaces for JCF:
 - Collection
   - List
   - Set
     - SortedSet
   - Queue
   - Deque
 - Map
   - SortedMap

### General-purpose Implementations of JCF
 
|  Interfaces | Hash table | Resizable array | Tree    | Linked list | Hash table + Linked list |
|-------------|------------|-----------------|---------|-------------|--------------------------|
| Set         |  HashSet   |                 | TreeSet |             | LinkedHashSet            |
| List        |            | ArrayList       |         |             |                          |
| Queue       |            |                 |         | LinkedList  |                          |
| Deque       |            | ArrayDeque      |         | LinkedList  |                          |
| Map         |  HashMap   |                 | TreeMap |             | LinkedHashMap            |
   
###Comparable & Comparator
**Q: What is the different between `Comparable` and `Comparator` interfaces and what to use which?**

   - `Comparable` have to be implemented by a class and the class compare `itself` instance with `other` object.
   - `Comparator` implementation enables to compare `two different objects`
   - `Comparator` is used when we cannot modify exposed class, for example String to change its natural ordering to use in sorting by its `length`.
   In this case we should create a comparator for string length comparing and apply to the Collections.sort method.

### Aggregate Operations & Pipe and Filter pattern 

**Q: How to filter a collection?**

The best way to filter a collection use `stream` and `lambdas` from java 8:
```
List<Person> passedStudents = students.stream()
                                              .filter(p -> p.getMark() > 50)
                                              .collect(Collectors.toList());
```

**Q: What is the difference between HashMap and Hashtable?**

Both are implemented based on hash function and hashing table. But there are some difference:
 - HashMap
   - methods are not synchronized
   - allows null as key and value
 - Hashtable
   - methods are synchronized
   - does't allow null key
Instead Hashtable use `ConcurrentHashMap` from java.util.concurrent

**Q: What is the difference between `HashMap` and `IdentityHashMap`**

**A:** Both are Map implementation. But IdentityHashMap implemented using `reference equality`.
 - In HashMap its two elements are equal if their keys are equal by `key1.equal(key2)` 
 - IdentityHashMap implemented so that it tests equality of two its items via using `key1==key2` rather then `key1.equals(k2)` then in HashMap.

**Q: hashCode() and equals() methods relationship**

**A:** If two objects are equal, that is `obj1.equals(obj2)` is `true` then, `obj1.hashCode()` and `obj2.hashCode()` must return same integer.

### Map

**Q: What is difference between `HashMap`, `TreeMap` and `LinkedHashMap`?**

| Impl.\Prop.   | Order        | get/put/remove/containsKey | Interfaces                 | Null keys/values      | Based on              |
|---------------|--------------|----------------------------|----------------------------|-----------------------|-----------------------|
| HashMap       | no guarantee |     O(1)                   | Map                        | allowed               | array (buckets)       |
| TreeMap       | natural      |     O(log(n))              | Map/NavigableMap/SortedMap | only values           | Red-Black Tree        |
| LinkedHashMap | no guarantee |     O(1)                   | Map                        | allowed               | double linked buckets |

### Sets

**Q: What is the difference between HashSet and TreeSet?**

 - HashSet
   - permits null element
   - implemented using a hash table (actually HashMap instance) and thus, its elements are not ordered
   - the `add()`, `remove()`, and `contains()` methods have O(1) time complexity
  
 - TreeSet
   - is implemented using a tree structure
   - elements are sorted
   - the `add()`, `remove()`, and `contains()` methods have O(logN) time complexity.

### TreeMap

**Q: Explain behavior of the `put(key, value)` method of the TreeMap?**

**A:**


### Iteration, Iterator & Iterable

**Q: What is fail-fast and fail-safe Iterators and ConcurrentModificationException?**
**A:**
When iterating over a collection the `structural modification` is broken the `ConcurrentModificationException` is thrown.
`Structural modifications` are those that change the size of the collection, or otherwise perturb it in such a fashion that
iterations in progress may yield incorrect results.

**Q: What is difference between Iterator and ListIterator?**

**A:**
 - Iterator
  - used iterate over List and Set collections
  - provides only forward traversal
 - ListIterator has additional features:
   - extends Iterator
   - used on List implemented collections only
   - provides ability backward traversal over elements
   - modify the list during iteration

**Q: What is difference between Iterator and Enumeration?**

**A:**

###Java CF time complexity table

**List based collections:**

|  List\Operations      | get() | add() | contains() | next() | remove() | Iterator.remove()| 
|-----------------------|-------|-------|------------|--------|----------|------------------|
|  ArrayList            | O(1)  |  O(1) |   O(n)     |  O(1)  |   O(n)   |      O(n)        |
|  LinkedList           | O(1)  |  O(1) |   O(n)     |  O(1)  |   O(n)   |      O(n)        |
|  CopyOnWriteArrayList | O(1)  |  O(1) |   O(n)     |  O(1)  |   O(n)   |      O(n)        |

**Map based collections:**

|  Map\Operations  | get()     | put()      | containsKey() | next()     | 
|------------------|-----------|------------|---------------|------------|
|  HashMap         | O(1)      |  O(1)      |   O(1)        |  O(h/n)    |
|  LinkedHashMap   | O(1)      |  O(1)      |   O(1)        |  O(1)      |
|  IdentityHashMap | O(1)      |  O(1)      |   O(1)        |  O(h/n)    |
|  TreeMap         | O(log(n)) |  O(log(n)) |  O(log(n))    |  O(log(n)) |                         |

**Set based collections:**

|  Set\Operations  | add()     | contains() | next()     |
|------------------|-----------|------------|------------|
|  HashSet         | O(1)      |  O(1)      |   O(h/n)   |
|  LinkedHashSet   | O(1)      |  O(1)      |   O(1)     |
|  TreeSet         | O(log(n)) |  O(log(n)) |  O(log(n)) |

_Note: `h` is the table capacity_

### Algorithms in JCF implemented in Collections class
The following algorithms are most widely used:
 - Sorting
 - Shuffling
 - Data route manipulation
 - Searching
 - Composition
 
 **Sorting:**
  -`Collections.sort()` method