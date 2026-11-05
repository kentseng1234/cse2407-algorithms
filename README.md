# CSE 2407 Algorithms

My own implementations from CSE 2407 (Data Structures and Algorithms) at Washington University in St. Louis (WashU). Each file is copied unmodified from the course studio or lab where I wrote it.

| Folder | Contents | Source assignment |
|---|---|---|
| [`searching/`](searching/README.md) | Linear search and recursive binary search on an int array | Studio 4 (M3) |
| [`linked-lists/`](linked-lists/README.md) | Singly linked list with a tail pointer for O(1) `addLast` | Studio 2 (M2) |
| [`priority-queues/`](priority-queues/README.md) | Priority queue backed by an unordered linked list | Priority queue studio |
| [`trees/`](trees/README.md) | AVL (self-balancing) binary search tree | AVL lab |

## What is and isn't here

Only code I wrote is included. Course-provided starter and harness code (the `timing` / `coursesupport` libraries, base classes, interfaces, `TreeNode`, tests, and the grading jars) is not, so **none of these files compile standalone**. Each folder's README lists what it needs from the course skeleton. I checked that every file compiles when placed back into its original course project.

Unfinished work from those assignments was left out on purpose.

## Notes

- Each file keeps its original `package` declaration (`m3`, `m2.lists`, `pq`, `avl`).
- Written in Java.
