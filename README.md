# 🌟 ELITE DATA STRUCTURES & ALGORITHMS (DSA) TRACKER

### 🎯 CORE OBJECTIVES & LEARNING METHODOLOGY

The foundational purpose of this repository is to demonstrate an advanced mastery over performance optimization metrics. By explicitly segregating every single problem into structural sub-approaches, this project tracks:

* **Time Complexity Reductions:** Transitioning from exponential $\mathcal{O}(2^N)$ or quadratic $\mathcal{O}(N^2)$ tracking down to linear $\mathcal{O}(N)$ or logarithmic $\mathcal{O}(\log N)$ execution speeds.
* **Space Complexity Management:** Minimizing system memory footprints by choosing between auxiliary memory allocations ($\mathcal{O}(N)$ space via Hash tables/Heaps) and structural optimization ($\mathcal{O}(1)$ in-place algorithms like Two-Pointers).

---

## 📊 ALGORITHMIC COMPLEXITY MAPPING

Here is a technical overview of the core optimization patterns implemented across the project modules:

| DSA Category | Brute Force Baseline | Optimal / Optimized Variant | Key Data Structure / Algorithm Used |
| :--- | :--- | :--- | :--- |
| **Array & Strings** | $\mathcal{O}(N^2)$ Nested Loops | $\mathcal{O}(N)$ Single-Pass | Two-Pointers, Frequency Arrays |
| **Linked Lists** | $\mathcal{O}(N^2)$ Pointer re-checks | $\mathcal{O}(N)$ Linear Time | Floyd's Tortoise & Hare (Cycle Tracking) |
| **Hash Tables** | $\mathcal{O}(N^2)$ Iterative Searches | $\mathcal{O}(N)$ Constant Lookup | `HashMap` / `HashSet` Complement Tracking |
| **Two Pointers** | $\mathcal{O}(N^2)$ Coordinate Mapping | $\mathcal{O}(N)$ Convergence | In-place Symmetric Swapping |
| **Heaps** | $\mathcal{O}(N \log N)$ Global Sorting | $\mathcal{O}(N \log K)$ Stream Track | Priority Queues (`Min-Heap` / `Max-Heap`) |
| **Binary Trees** | $\mathcal{O}(N^2)$ Unbalanced Re-traversal | $\mathcal{O}(N)$ Bottom-Up DFS | Inorder/Preorder Traversals, Trie Nodes |

---

## 📁 PROFESSIONAL REPOSITORY STRUCTURE

```text
src/
├── arrayStrings/
│   ├── Closest_ToZero/
│   │   ├── Brute/               # Intuitive baseline checks
│   │   └── Optimal/             # Precision bound tracking
│   ├── isSequence/
│   │   └── Optimal/             # Linear two-pointer tracking
│   ├── LongestCommonPrefix/
│   │   ├── Brute/
│   │   └── Optimal/             # Horizontal/Vertical scanning
│   └── Stocks_Buy/
│       ├── Brute/
│       └── Optimal/             # One-pass Kadane's logic
│
├── LinkedList/
│   ├── ListCycle/
│   │   ├── Brute/
│   │   └── Optimized/           # Cycle detection via node referencing
│   ├── MergeSorted/
│   │   ├── Brute/
│   │   └── Optimal/             # In-place pointer modifications
│   └── RemoveDuplicate/
│       ├── Brute/
│       └── Optimized/           # Fast link adjustments
│
├── HashTable/
│   ├── Anagrams/
│   │   ├── Brute/
│   │   └── Optimized/           # Character frequency mapping
│   ├── ContainsDuplicate/
│   │   ├── Brute/
│   │   └── Optimal/             # O(1) Search sets
│   ├── Max_Baloons/
│   │   ├── Brute/
│   │   └── Optimized/           # Text frequency grouping
│   └── TwoSum/
│       ├── Brute/
│       └── Optimal/             # Target complement matching
│
├── TwoPointers/
│   ├── Container/
│   │   ├── Brute/
│   │   └── Optimized/           # Area maximization using boundaries
│   ├── Palindrome/
│   │   ├── Brute/
│   │   └── Optimized/           # Character matching from edges inward
│   └── ReverseString/
│       ├── Brute/
│       └── Optimized/           # Memory conservative string swapping
│
├── Heaps/
│   ├── FrequentElements/
│   │   ├── Brute/
│   │   └── Optimized/           # Top-K frequency mapping via Min-Heap
│   ├── KthLargestElement/
│   │   ├── Brute/
│   │   └── Optimal/             # Memory bounded Priority Queue
│   └── LostStone/
│       ├── Brute/
│       └── Optimal/             # Dynamic heaviest weight simulation
│
└── BinaryTrees/
    ├── InvertTree/
    │   ├── Brute/               # Classic mirror swapping
    │   └── Optimized/           # Iterative/Recursive structural shifts
    ├── MaxDepth_Brute/
    │   ├── Brute/               # Stack height counting
    │   └── Optimized/           # Tail-recursive optimized depth lookup
    ├── KthSmallest_BST/
    │   ├── Brute/               # Array copy and sort tracking
    │   └── Optimal/             # Inorder early-termination pattern
    ├── Diameter_Tree/
    │   ├── Brute/               # Node-by-node height calculations
    │   └── Optimal/             # Consolidated depth-diameter recursion
    ├── Validate_BST/
    │   ├── Brute/               # Global sorting checks
    │   └── Optimal/             # Range boundary tracking (O(N))
    ├── Implement_Trie/
    │   ├── Brute/               # String lookup baseline matrix
    │   └── Optimal/             # Efficient character indexing array nodes
    └── MinAbsoluteDiff_BST/
        ├── Brute/               # Exhaustive comparison array
        └── Optimal/             # Consecutive node monitoring via Inorder

