<h1 align="center"> Maze Solver </h1>
<h3 align="center"> CPS 112 - Project Assignment 5 </h3>

# 📚 Contents
1. [About The Project](#-about-the-project)
2. [Features](#-features)
3. [Project Files Description](#open_file_folder-project-files-description)
4. [Example Usage](#-example-usage)
5. [Getting Started](#desktop_computer-getting-started)

# 🔎 About The Project
This project implements a maze-solver that uses different agenda-based approaches to explore possible paths from the start to the goal location. The system implements both Breadth-First Search (BFS) and Depth-First Search (DFS) algorithms.

<div align="center">
  <img width="300" alt="maze-solver-stack3" src="https://github.com/user-attachments/assets/240f4050-5b16-4899-b837-5f435135430e">
  <img width="300" alt="maze-solver-queue3" src="https://github.com/user-attachments/assets/ea520497-405c-4785-bf4b-9fa109b33a41">
</div>
<p align="center">
  Depth-First Search&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Breadth-First Search
</p>

# 🌟 Features
- Implements both BFS and DFS algorithms.
- Visual representation of the maze and paths.
- Supports different maze configurations from text files.

# :open_file_folder: Project Files Description
* __MazeSolver.java__ - Implements a maze-solving algorithm using an agenda-based approach, returning the solution path.  
* __Maze.java__ - Defines the maze structure, including start/goal locations and walls, with methods to retrieve and manipulate maze data.  
* __MazeGridLocation.java__ - Represents a single grid location in the maze, and manages its row, column, and background color.  
* __QueueAgenda.java__ - Implements an agenda using a queue (FIFO) to manage maze locations  
* __StackAdenda.java__ - Implements an agenda using a stack (LIFO) to manage maze locations

# 📖 Example Usage
Given a maze file `mazefile4.txt`, the program will find a path using either BFS or DFS:

- Sample Maze File mazefile4.txt:
```
11 16
#o##############
#....#....#....#
#.##.#.##...##.#
#.#..#..##..#..#
#.##.##..##.##.#
#..#..#...#..#.#
##.#.##.#.#.##.#
#....#..#..#...#
#.#.##...###.###
#......#..#....#
##############*#
```
- Sample Terminal Input:
```
java MazeGUI mazefile4.txt s
```
- Sample Maze Output:
```
The solution is: [(0, 1), (1, 1), (1, 2), (1, 3), (1, 4), (2, 4), (3, 4), (4, 4), (5, 4), (6, 4), (7, 4), (7, 3), (7, 2), (7, 1), (8, 1), (9, 1), (9, 2), (9, 3), (9, 4), (9, 5), (9, 6), (8, 6), (8, 7), (7, 7), (6, 7), (5, 7), (5, 8), (4, 8), (4, 7), (3, 7), (3, 6), (2, 6), (1, 6), (1, 7), (1, 8), (1, 9), (2, 9), (2, 10), (2, 11), (1, 11), (1, 12), (1, 13), (1, 14), (2, 14), (3, 14), (4, 14), (5, 14), (6, 14), (7, 14), (7, 13), (7, 12), (8, 12), (9, 12), (9, 13), (9, 14), (10, 14)]
```
<img width="500" alt="maze-solver-stack3" src="https://github.com/user-attachments/assets/a1ff6760-4dd3-49fd-bb43-0693b14171bc">

# :desktop_computer: Get Started
Compile:
```
javac*.java
```
Run using __Depth-First Search__:
```
java MazeGUI mazefile1.txt s
```
Run using __Breadth-First Search__:
```
java MazeGUI mazefile1.txt q
```
