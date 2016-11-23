# UomCsGradeCalculator
Grade calculator application, originally designed for University of Manchester Computer Science students, but should work with any grade system that has years, modules, and coursework.

# Requirements
* Java 8
* Maven
 - Alternatively you could put download Gson and put it on your classpath manually, but that's le bit grim

# Usage
Run the Main class with an absolute file path to the JSON file describing your grades

## Setting up the JSON file
* cs-grades.json gives an example layout for a student in 3rd year. If you copy this to my-grades.json, the file will be ignored by Git and you can modify it to your heart's content
* The grades are fractions of 1 (i.e. a percentage score)
* The weights, however, are not. For example, first, second, and third years have weights of 0.0, 1.0, and 2.0 respectively. When calculating the grade for all years the code does ((1st year grade * 0.0) + (2nd year grade * 1.0) + (3rd year grade * 2.0)) / 3.0

# Pull requests
I welcome any pull requests for bug fixes or improvements. This is still a work in progress. See desired features below for what I want to add

# Desired features
* Give a target grade to the program and it works out what grade you should be hitting on all your pieces of coursework
* Export Arcade data to JSON
 - I don't plan on doing this and have no idea if it's possible. However, it would be really useful if it was. If you are a brave soul interested in Arcade, submit a pull request if you have a crack at it
