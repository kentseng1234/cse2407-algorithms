# Priority queues

Written for CSE 2407 (Data Structures and Algorithms) at WashU, priority queue studio.

## `UnorderedList.java`

A min priority queue stored as an unsorted `java.util.LinkedList`. Insertion is cheap and all the work happens at extraction: `extractMin` scans for the smallest element and removes it.

| Operation | Time as written | Notes |
|---|---|---|
| `insert` | O(1) | `addLast` on the list |
| `extractMin` | O(n²) | see below |
| `isEmpty` | O(1) | tracks a `size` counter |

The textbook cost of an unordered-list `extractMin` is O(n). My version loops over indices and calls `list.get(i)`, and `LinkedList.get(i)` is itself O(i), so the scan as written is O(n²). Iterating with an iterator would bring it to O(n).

`extractMin` also does not handle an empty queue; callers must check `isEmpty()` first.

## Building

This class depends on course code that is not included here, so it does not compile standalone:

- `pq.PriorityQueue` (course-provided interface with `isEmpty`, `insert`, `extractMin`)

It compiles when dropped into the original `studios/pq/` directory of the course project.
