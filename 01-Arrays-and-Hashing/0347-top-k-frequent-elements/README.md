# 0347. Top K Frequent Elements

- **Difficulty:** Medium
- **Category:** Arrays & Hashing
- **Link:** [LeetCode 0347](https://leetcode.com/problems/top-k-frequent-elements/)

## Problem Summary
Given an integer array `nums` and an integer `k`, return the `k` most frequent elements. You may return the answer in **any order**.

---

## Approaches & Evolution

### V1 — HashMap + Min-Heap (`SolutionV1.java`)
- **Idea:** Count the frequency of each element using a `HashMap`. Maintain a `PriorityQueue` (Min-Heap) of size `k` ordered by frequency in ascending order. Whenever the heap size exceeds `k`, remove the element with the lowest frequency (`poll()`).
- **Complexity:**
  - **Time:** $O(N \log k)$ — Iterating through $N$ elements and performing heap operations of size at most $k$.
  - **Space:** $O(N + k)$ — Storing frequencies in the `HashMap` and up to $k$ elements in the `PriorityQueue`.
- **LeetCode Performance:** `16 ms` (Beats **47.38%**) | Memory: `47.32 MB` (Beats **48.02%**)

### V2 — HashMap + Bucket Sort (`SolutionV2.java`) — Optimal
- **Idea:** Since the maximum possible frequency of any element is $N$ (`nums.length`), create an array of buckets `List<Integer>[] buckets` of size $N + 1$ where the index represents the frequency. Group elements into their corresponding frequency bucket, then iterate backward from the highest frequency index to collect the top `k` elements.
- **Complexity:**
  - **Time:** $O(N)$ — Linear time complexity (meets the problem's follow-up constraint).
  - **Space:** $O(N)$ — Storing elements in the `HashMap` and frequency buckets.
- **LeetCode Performance:** `11 ms` (Beats **96.34%**) | Memory: `46.93 MB` (Beats **86.93%**)

---

## Comparison

| Version | Approach | Time Complexity | Space Complexity | Runtime | Memory |
| :--- | :--- | :---: | :---: | :---: | :---: |
| **V1** | HashMap + Min-Heap | $O(N \log k)$ | $O(N + k)$ | 16 ms (47.38%) | 47.32 MB |
| **V2** | HashMap + Bucket Sort | $O(N)$ | $O(N)$ | 11 ms (96.34%) | 46.93 MB |