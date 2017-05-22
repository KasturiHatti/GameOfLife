Game of Life (in Java) is an Conway's Game of Life implementation in Java with console input and output. 
It generates randomized board, and iterates over generated board to move to next generation.

## Usage

`$ java -jar GameOfLife-1.0.0-SNAPSHOT.jar`

## Example

--------Welcome To GAME OF LIFE---------

Please enter number of rows of the array
3
Please enter number of columns of the array
3
Please enter number of Iterations
2
Setting up initial life board

alive dead  dead  
dead  dead  dead  
dead  alive dead  

Initial setup is completed

Printing cells after iteration  1

dead  dead  dead  
dead  dead  dead  
dead  dead  dead  


Printing cells after iteration  2

dead  dead  dead  
dead  dead  dead  
dead  dead  dead  

## Requirements

* java 7
* junit 4
* maven

## Running the Tests
To run unit tests, just execute `maven test`
