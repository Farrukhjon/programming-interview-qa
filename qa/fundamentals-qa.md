Programming Fundamentals Questions & Answers
---
Q: Convert binary number `1111 0101` to `decimal` representation

A:

```
Binary = SUM all of digit*2^position
1111 0101 -> (1*2^7+1*2^6+1*2^5+1*2^4)+(0*2^3+1*2^2+0*2^1+1*2^0)=(128+64+32+16)+(0+4+0+1) = 245        
```

Q: Convert decimal number `128` to `binary` representation
A:

```
|Number | operation | base 2 | result | reminder |
|-------|-----------|--------|--------|----------|
|128    |  %        | 2      |     64 | 0        |
|64     |  %        | 2      |     32 | 0        |
|32     |  %        | 2      |     16 | 0        |
|16     |  %        | 2      |     8  | 0        |
|8      |  %        | 2      |     4  | 0        |
|4      |  %        | 2      |     2  | 0        |
|2      |  %        | 2      |     1  | 1        |

```