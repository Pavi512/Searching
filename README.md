# Searching Algorithms in Java

A Java console-based application that demonstrates the implementation of Linear Search and Binary Search through real-world problem-solving scenarios. The project focuses on strengthening algorithmic thinking by solving searching problems using arrays, strings, files, and matrices.


## About the Project

Searching is one of the fundamental operations in computer science. This project demonstrates various applications of Linear Search and Binary Search by implementing different search-based problems.

Each program is developed independently, allowing learners to understand the logic, working principle, and time complexity of each searching technique while improving Java programming skills.


## Project Highlights

- Implementation of Linear Search
- Implementation of Binary Search
- Searching elements in arrays
- Searching words in files
- Searching strings in sentences
- Binary Search on rotated arrays
- Peak element detection
- Matrix searching
- First and last occurrence search
- Challenge problem using both searching algorithms


## Features

### Linear Search

- Find the first negative element in an array
- Search for a word in a list of sentences
- Search for a word from a text file
- Find the first missing positive integer

### Binary Search

- Search an element in a sorted array
- Find the rotation point in a rotated sorted array
- Find the peak element
- Search an element in a sorted matrix
- Find the first and last occurrence of an element
- Search for a word from a sorted text file
- Search the index of a target element


## Problems Implemented

| Program | Description | Algorithm |
|---------|-------------|-----------|
| LinearSearch1 | Find the first negative element in an array | Linear Search |
| LinearSearch2 | Search for a specific word in a list of sentences | Linear Search |
| LinearSearchFile | Search for a word from a text file | Linear Search |
| BinarySearch1 | Find the rotation point in a rotated sorted array | Binary Search |
| BinarySearch2 | Find the peak element in an array | Binary Search |
| BinarySearch3 | Search an element in a sorted array | Binary Search |
| BinarySearch4 | Find the first and last occurrence of an element | Binary Search |
| BinarySearchFile | Search for a word from a sorted text file | Binary Search |
| ChallengeProblem | Find the first missing positive number and search the target element | Linear Search & Binary Search |


## Technologies Used

- Java
- Object-Oriented Programming
- Arrays
- File Handling
- String Handling
- Searching Algorithms
- Sorting Techniques
- Eclipse IDE
- Git
- GitHub


## Concepts Covered

### Searching Algorithms

- Linear Search
- Binary Search

### Java Concepts

- Arrays
- Methods
- Loops
- Conditional Statements
- File Handling
- String Operations
- Sorting
- Time Complexity Analysis


## Project Structure

```text
Searching/
│
├── src/
│   └── com/
│       └── bridgelabz/
│           └── searching/
│               ├── BinarySearch1.java
│               ├── BinarySearch2.java
│               ├── BinarySearch3.java
│               ├── BinarySearch4.java
│               ├── BinarySearchFile.java
│               ├── ChallengeProblem.java
│               ├── LinearSearch1.java
│               ├── LinearSearch2.java
│               └── LinearSearchFile.java
│
├── README.md
└── .gitignore
```

## How to Run

### Clone the Repository

```bash
git clone https://github.com/Pavi512/Searching.git
```

### Navigate to the Project

```bash
cd Searching
```

### Compile

```bash
javac src/com/bridgelabz/searching/*.java
```

### Run

```bash
java com.bridgelabz.searching.ClassName
```

### Example

```bash
java com.bridgelabz.searching.BinarySearch1
```

## Best Practices

### Linear Search

- Use when the data is unsorted or small in size.
- Return immediately once the element is found.
- Avoid Linear Search for very large datasets when performance is important.

### Binary Search

- Ensure the data is sorted before performing Binary Search.
- Prefer iterative implementation for better performance.
- Calculate the middle index using:

```java
int mid = left + (right - left) / 2;
```

to avoid integer overflow.

