Java Concurrent Collections Framework
---

The Concurrent collections are implemented on `bocking and non-blocking` thread-safe operations.
 - **Blocking collections:** This kind of collection includes `operations` to `add` and `remove`
   data. If the operation can't be made immediately, because the collection is `full` or
   `empty`, the `thread` that makes the call `will be blocked` until the operation can be made.
 - **Non-blocking collections:** This kind of collection also includes `operations` to `add` and
   `remove` data. If the operation can't be made immediately, the operation `returns a
   null` value or `throws an exception`, but the `thread` that makes the call `won't be blocked`.

**List concurrent implementation:**
| List                 | Synchronization mechanism | Based on |
|----------------------|---------------------------|----------|
| CopyOnWriteArrayList | ReentrantLock, blocking   | array    |
 
**Set concurrent implementations:**
| Set                   | Synchronization mechanism     | Based on              |
|-----------------------|-------------------------------|-----------------------|
| CopyOnWriteArraySet   | ReentrantLock, blocking       | CopyOnWriteArrayList  |
| ConcurrentSkipListSet | AtomicReference, non-blocking | ConcurrentSkipListMap |
 
**Map concurrent implementations:**
| ConcurrentMap/
| ConcurrentNavigableMap | Synchronization mechanism     | Based on |
|------------------------|-------------------------------|----------|
| ConcurrentHashMap      | AtomicReference, non-blocking |          |
| ConcurrentSkipListMap  | AtomicReference, non-blocking |          |

**Queue & Deque implementations:**
 - ConcurrentLinkedQueue 
 - ConcurrentLinkedDeque 
 - BlockingQueue (interface)
   - ArrayBlockingQueue
   - LinkedBlockingQueue
   - PriorityBlockingQueue
   - BlockingDeque (interface)
     - LinkedBlockingDeque

**Q: How a HashMap can be `synchronized`?**

There are two option to synchronise a HashMap object
 - Using Collections.SynchronizedMap()
 - Use ConcurrentHashMap implementation