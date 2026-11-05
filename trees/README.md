# Trees

Written for CSE 2407 (Data Structures and Algorithms) at WashU, AVL lab.

## `AVLTree.java`

A generic AVL tree: a binary search tree that keeps itself height-balanced. Every node stores its height, and the balance factor (left height minus right height) of each node stays in {-1, 0, 1}.

My part of the lab:

- `insertHelper` / `removeHelper`: after the recursive call, recompute the node's height and rebalance on the way back up.
- `updateHeight`, `getBalance`, `rebalance`: restore balance with a single or double rotation (left-left, left-right, right-right, right-left cases).
- `rightRotate` / `leftRotate`: the two rotations, each followed by height updates.

Removal of a node with two children replaces its value with its in-order successor, then removes the successor from the right subtree.

| Operation | Time |
|---|---|
| `exists` | O(log n) |
| `insert` | O(log n) |
| `remove` | O(log n) |
| `min` / `max` | O(log n) |
| rotation | O(1) |
| `enumerate` (in-order list, validation only) | O(n log n) as written |
| Extra space | O(log n) recursion stack |

Balance keeps the height at O(log n) (at most about 1.44 log₂ n), which is what bounds each operation. `enumerate` is O(n log n) because each level copies its sub-lists with `addAll`.

The `FIXME` comments above `insertHelper` and `removeHelper` are the course's original markers; the code beneath them is implemented.

I checked it by inserting 1000 sequential integers (tree height 9, not 999) and removing every other one, which left the expected 500 values.

## Building

This class depends on course code that is not included here, so it does not compile standalone:

- `avl.TreeNode` (course-provided node class with `value`, `height`, `left`, `right`, `setLeft`, `setRight`)

It compiles when dropped into the original `labs/avl/` directory of the course project. The course's `validate/` and `test/` classes are used to check it there.
