# IntArrayList vs IntVector

Both classes dynamically resize their internal arrays when they are full, but they use different ways to change their size.

---

## Resizing Strategy

### IntArrayList
- By default, size is 10. When an array is full → increases size by 50%
- Example: 10 → 15

### IntVector
- By default, size is 20. When vector is full → doubles its size
- Example: 20 → 40

---

## When is IntArrayList More Efficient?

As `IntArrayList` grows by 50% each time it becomes full:
- This makes it more memory-efficient because it wastes less unused space.
- It is better when memory usage is a concern.
- It is suitable when the list grows gradually and does not require large expansions.

Example scenario:
If you are adding elements slowly and do not expect a very large number of insertions, `IntArrayList` avoids allocating too much extra memory.

---

## When is IntVector More Efficient?

As `IntVector` doubles its capacity when it becomes full, this makes it more efficient in terms of performance when:
- A large number of elements are added.
- The list grows rapidly.
- Minimizing the number of resizing operations is important.

Example scenario:
If you expect to insert thousands of elements, doubling the array size reduces the total number of costly resize operations.

---