# Lab 2

## Objective

1. Complete a programming project using Java. You may choose to complete **Wordle or Game of Life** based on the briefs below.
2. Use IntelliJ to upload your project to GitHub

## Option 2: Conway's Game of Life

### Objective

1. Research and implement Conway's Game of Life, a well known zero-player game in computer science
2. Use the Model-View-Controller software development pattern and the `Swing` library to visualize your game
3. Use industry tools like IDEs and Git to develop your code

### Getting Started

1. Create a GitHub account using your personal mail address and connect it to IntelliJ under the VCS menu. 
2. Connect your GitHub account to the GitHub Classroom via the Git & GitHub assignment in Google Classroom.
3. Pull the GitHub Repository from GitHub Classroom for the starter code.
4. Upload your assignment to GitHub when you are done and mark 'As Complete' on Google Classroom.
6. Implement the `oneGeneration()` method in the `LifeModel.java` file as described below. 

### Conway's Game of Life

This is not really a game.  It is an implementation of a cellular automata that John H. Conway chose to call the “Game of Life.” The computer simulation is of the life and death events of a population of bacterial organisms.  This program will determine the life, death, and survival of bacteria from one generation to the next, assuming the starting grid of bacteria is considered generation zero.  Sometimes the outcome is that all organisms die.  Other times they end up in a static or oscillating world.  Other times, they form organisms that generate new life forms that glide across the screen. 
#### Links to Research

- [http://www.math.com/students/wonders/life/life.html](http://www.math.com/students/wonders/life/life.html)
- [https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life)
- Try out this cool simulation: [https://bitstorm.org/gameoflife/](https://bitstorm.org/gameoflife/)

### Game Specifications

The sizeof the grid is set to a square 60 x 60.  Different sized grids produce different results.

### Model-View-Controller Framework

This application uses the Model-View-Controller(MVC) design framework. You don't have to worry too much about it, since the `LifeView.java` and `LifeController.java` classes are already written for you. If you want some more information on MVC, here are some links to check out.
- https://www.geeksforgeeks.org/mvc-framework-introduction/#
- https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller

### Starter Code

1. You are provided with a data file that describes an initial population of the life grid, `life100.txt`.  Use these file to test your program and make sure it is working correctly.  Data files for 4 other really interesting patterns are contained in the program folder, also run your program using them as input.  (`blinker_lif.dat`,` glgun13_lif. dat`, `penta_lif. dat`, `tumbler_lif. dat`)
	1. The first line of the file will contain the number (N) of bacteria locations in the file.
	2. What follows are N **pairs of data**, one pair of numbers per line. 
	3. The first value of each line indicates the row location while the second value on the line indicates the column location. 
	4. The data file values are given as:  0 <= Row < 60 and 0 <= Col < 60.
3. This project follows the **Model-View-Controller model**.  You are provided with the Controller (main program), `Life.java` and the View, `LifeView.java`.  You are also provided with a skeleton Model component, `LifeModel.java`.  Each cell is an object, defined by the `LifeCell` class. The starter code will provide a GUI for your to interact with; your coding will be done in the model component.
4. Your task is to implement the `oneGeneration()` method.

### oneGeneration()

Your `oneGeneration()` method must implement the rules of Conway's Game of Life as described below. **Complete the "helper methods" given to keep your code simple and organized.** The method `oneGeneration()` will be called automatically over and over once the Run button has been clicked to advance from generation to generation. It can also be paused, resumed, or stepped under user's control.

![GameOfLifePicture1 (1)](https://github.com/user-attachments/assets/8fe5784c-5f6c-4652-b79f-e515bed5f936)
![GameOfLifePicture1 (2)](https://github.com/user-attachments/assets/6f22559f-d5d1-4d8d-97b5-d86ba8bae01e)
![GameOfLifePicture1 (3)](https://github.com/user-attachments/assets/8761b38f-db46-4312-ad2a-ffc60131dced)

### Testing

A sample run output for **generation 5** is given below.  Note, these are the correct answers if you use the provided data file `life100.txt`.  If you let life run for a long time, it will oscillate between the last 3 patterns.  There are actually 6 patterns as the line of three keeps switching.

### Deliverables

- Your Java project with a completed `LifeModel.java` file.
- If you use outside resources, cite them in your code. Add a comment explaining how you used the resource and a link. Consult the [MIT Code Citation Guidelines](https://integrity.mit.edu/handbook/writing-code) for examples.

  
### Sources

This starter code was created by Kimberly Jans. Original solution with graphics based on work by Roger Frank from Ponderosa High School in Parker, CO


### Rubric

*Course Content*

- 6 points - All required items are present. 
- 5 points - Task was completed, but supplementary materials are weak or missing.
	- Code was uncommented. 
	- Solution is correct but is significantly difficult to read, highly inefficient, very clumsy, very difficult to extend etc. From the original Jargon File, we would refer to solutions like this as *kluge*.
	- Project succeeded on most test cases, but failed in some edge cases.
	- Reflection questions related to content were incorrect.
- 4 points - Task was attempted, but is missing major components. 
	- Coding prompt was only partially completed.
	- Project does not perform solution as described and failed multiple test cases.
	- Some deliverables are missing.
- 3 points - Did not attempt or student should reattempt. 
	- Inappropriate use of AI tools.
