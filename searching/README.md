# Searching

Written for CSE 2407 (Data Structures and Algorithms) at WashU, Studio 4.

| File | Algorithm |
|---|---|
| `SearchArrayLinear.java` | Linear search |
| `SearchArrayBinary.java` | Recursive binary search |

Both search an `int[]` for a query and return its index, or -1 if absent. The code calls `ticker.tick()` to count steps for the course's timing studio, which plots the cost against input size.

## Linear search

Scan the array from index 0, comparing each element to the query, and stop at the first match.

| Case | Time |
|---|---|
| Best (match at index 0) | O(1) |
| Worst / average | O(n) |
| Extra space | O(1) |

## Binary search

The array is sorted (`Arrays.sort`) when the object is constructed or reset. That sort costs O(n log n) once, and is not part of the per-query cost. Each query then compares against the middle element and recurses on the half that could contain the query.

| Case | Time |
|---|---|
| Per query | O(log n) |
| Extra space | O(log n) recursion stack |

The tick counts from running both in the timing studio show linear search growing proportionally to n while binary search grows logarithmically.

## Building

These classes depend on course code that is not included here, so they do not compile standalone:

- `SearchArrayBase` (course-provided base class)
- the `timing.*` libraries (`ExecuteAlgorithm`, `QuietAlgorithm`, `Ticker`, `GenSizes`, `IntArrayGenerator`)

Both files compile when dropped into the original `studios/m3/` directory of the course project.
