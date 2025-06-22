# Java Algorithms Repository

A collection of classic algorithm implementations in Java, starting with a fully-tested **Binary Search**. Ideal for learning, reference, or integration into larger Java projects.

---

## 🧠 Table of Contents

1. [Overview](#overview)  
2. [Binary Search](#binary-search)  
    - [Problem Statement](#problem-statement)  
    - [Solution Approach](#solution-approach)  
    - [Usage](#usage)  
3. [Prerequisites](#prerequisites)  
4. [Getting Started](#getting-started)  
5. [Testing](#testing)  
6. [Contributing](#contributing)  
7. [License](#license)  

---

## Overview

This repository contains implementations of foundational algorithms written in **Java**. The goal is to provide:

- 📝 Clear, well-documented code  
- 🔍 Reliable test cases  
- 📚 Educational references  

Current implementations:
- **Binary Search**

Future additions:
- Sorting algorithms (Merge, Quick, Heap)
- Data structures (Linked List, Tree)
- More algorithmic solutions

---

## Binary Search

### Problem Statement
Given a **sorted** integer array and a target value, determine the index of the target in the array, or return `-1` if not present.

### Solution Approach
We use a classic divide-and-conquer strategy:

1. Set two pointers, `left` at start and `right` at end.  
2. Compute `mid = (left + right) / 2`.  
3. Compare `nums[mid]` to `target`:  
   - If equal, return `mid`.  
   - If less, search the right half.  
   - If greater, search the left half.  
4. Continue until pointers cross.

Time Complexity: O(log n)  
Space Complexity: O(1)

### Usage

Example:
```java
int[] nums = {1, 3, 5, 7, 9};
int target = 5;
int index = BinarySearch.search(nums, target);
// index == 2
