# Sorting

## Complexity comparison
| Sorting Algorithm | Time Complexity | Space Complexity |
| --- | --- | --- |
| Quick Sort | Ω(N log N), Θ(N log N), O(N^2) | O(log N) |

## Quick sort
- Who?: British computer scientist Tony Hoare
- When?: 1959
- What?: an sorting, divide-and-conquer algorithm. Time complexity in worse case is O(N^2) (happen when pivot is the smallest or largest element), in average case is Θ(N log N), in best case is Ω(N log N). Space complexity: O(log N)
- How?:
    + S1: Does partition have at least 2 elements => if no return
    + S2: Select pivot
    + S3: Divide array into 2 partition: smaller & larger than pivot
    + S4: Repeat with the sub partition