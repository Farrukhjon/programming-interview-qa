Fundamental Data Structures and Algorithms Questions & Answers
---

### Algorithm's basic approaches
**Q: What is the `Divide and Conquer` approach in foundation of common algorithms?**

**A:** 

A Divide and Conquer strategy is an approach which solves a `n size` problem by dividing it to independent `sub-problems`
each of sub-problems are about half size of the original problem.

**Q: Write `algorithm for swapping values` of two variable `without` using extra variable**

**A:**
 1. Using XOR bitwise operator
  ```
  void swap(int x, int y) {
    x = x ^ y;
    y = x ^ y;
    x = x ^ y;
  }
  ```
  
  2. Using sum operation manipulation
  ```
  void swap(int x, int y) {
      x = x + y;
      y = x - y;
      x = x - y;
    }
  ```


### Arrays & Strings

**Q: What is the difference between usage `unordered array` and `ordered array`?**

A: In `search/insert` operations their difference make big sense. Because, search operation has constant O(1) time complexity
   in ordered array, but has liner O(n) time complexity in `insert` operation, because elements must be moved to be ordered.
   On contrary, On insert operation unordered array has constant O(1) time complexity but in searching has liner O(n) time complexity.

|array    |search|insert|
|---------|------|------|
|unordered|O(n)  |O(1)  |
|ordered  |O(1)  |O(n)  |


**Q: Given a string `str` implement function that returns its `reverse` representation.**

**A:** 
1. Implementation with extra space:

```
    String reverseIteratively(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            strBuilder.append(chars[i]);
        }
        return strBuilder.toString();
    }

```

2. Implementation without extra space and recursively:

```
    String reverseRecursively(String str) {
        if (str.length() < 2)
            return str;
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
```

###Binary Tree, Binary Search Tree, Balanced Binary Search Tree

**Q: What is a `bianry tree`**
**A:** `A binary tree ` is either empty or consists of an element, called the `root` element, and two distinct 
binary trees, called the `left subtree` and `right subtree` of this binary tree.


**Q: What is `Binary Search Tree` (BST)?**

A: BST is a `binary tree` data structure where each node has a `comparable key` and associated `value` and
 satisfies restriction that the key in any `node` is larger the keys in all nodes in that node's
 left subtree and smaller that keys in all nodes in that node's right subtree.
 In other words, all left subtree have smaller keys than keys from right subtree.
 This kind of arranging item keys ultimately gives us `ordered keys`

**Q: What is `best`, `average` and `worst` cases from `search/insert` operations perspective?**

A: Best case BST is `ideally balanced tree` and worst case is a tree which is created keys of organized by natural ordering.
Because number of comparision depends from `1 + depth` of nodes. 

**Q: What is `Balanced Binary Search Tree`?**

A: BBS does not guarantee `logarithmic search` time complexity. But `Balanced BST` does just as for `binary search`.
 - Balanced BST implementations
   - `2-3 tree`
   - `Read-Black tree`