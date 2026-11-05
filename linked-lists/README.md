# Linked lists

Written for CSE 2407 (Data Structures and Algorithms) at WashU, Studio 2.

## `LinkedListWithTail.java`

A singly linked list that keeps a `tail` reference alongside `head`. The studio supplied the list without a tail pointer, where `addLast` walks the whole list to find the end. My change adds the `tail` field, sets it when the first node is added, and updates it on every `addLast`.

| Operation | Time |
|---|---|
| `addLast` | O(1) (O(n) without the tail pointer) |
| `getItemAt(n)` | O(n) |
| `getSize` | O(n) |
| Extra space | O(1) |

`getSize` still walks the list, as in the starter code. I did not add a size counter, so it is not O(1).

As in the studio, the code calls `ticker.tick()` to count steps, which the timing studio uses to compare `addLast` with and without a tail pointer.

## Building

This class depends on course code that is not included here, so it does not compile standalone:

- `timing.Ticker` (the `timing` library)
- `m2.lists.List` and `m2.lists.ListNode` (course-provided interface and node class)

It compiles when dropped into the original `studios/m2/lists/` directory of the course project.
