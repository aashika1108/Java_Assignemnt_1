# DataStructures-Assignment1-Amisha
Name: Amisha Nakrani
Student ID: C0903272

Overview

This project contains solutions to five coding challenges, each designed to demonstrate the practical application of various fundamental data structures. The challenges involve arrays, linked lists, stacks, queues, and binary trees, implemented in Java with concise and efficient code.


#Challenges and Approach

1. The Array Artifact

Description: A class ArtifactVault to manage artifacts using an array.

Approach:
Used an array to store artifacts with methods for adding, removing, and searching.
Implemented both linear and binary search for finding artifacts.
Assumed the array remains sorted for binary search.

Design Decision: Sorting the array dynamically before performing binary search ensures correctness.

2. The Linked List Labyrinth

Description: A class LabyrinthPath to represent a singly linked list.

Approach:
Added nodes to the end of the list for a complete path.
Used a two-pointer technique to detect loops.
Included a method to print all locations.

Design Decision: Focused on maintaining simplicity in the linked list implementation.

3. The Stack of Ancient Texts
   
Description: A ScrollStack class using a stack to manage ancient scrolls.

Approach:
Leveraged Java’s Stack class to simplify stack operations.
Provided methods to push, pop, peek, and check for specific scrolls.

Design Decision: Utilized the built-in Stack class for reliable and tested functionality.

4. The Queue of Explorers
   
Description: A circular queue to manage explorers waiting in line.

Approach:
Used a fixed-size array to implement the circular queue.
Provided methods for enqueue, dequeue, and displaying the queue’s state.
Handled edge cases such as full and empty queues.

Design Decision: Chose a circular array for efficiency and reduced memory overhead.

5. The Binary Tree of Clues
   
Description: A ClueTree class to store and traverse clues using a binary tree.

Approach:
Implemented recursive methods for insertion, traversal, searching, and counting.
Included in-order, pre-order, and post-order traversal options.
Used comparisons to place clues in the correct position in the binary tree.

Design Decision: Ensured that the tree remains a binary search tree to optimize searching.
