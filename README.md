# BirthdayPartyRefactory
Refactoring exercise

## Instructions
The purpose of this exercise is to improve the code so it is easier to work with. 
There are a few problems in there, find and fix what you can. Don't add any additional
functionality (unless you consider tests additional functionality), we're just checking to see how you can improve existing code.
 
## Getting Started

Running the application: `gradle build test run`

All output is written to the console.

### Problems I found in the code

* Spelling mistake and inconsistent case of frosting flavor's value.
* `orderCake` method had incorrect placement of flavor and frosting flavor.
* Balloon quantity number was a string instead of int.
* The static methods in `App` are very hard to test.

### Fixes I applied

* Created `enums` and classes for different properties of Cake and Balloon to avoid spelling and case mistakes. Classes aslo make it extendable. It also restricts the user from providing unsupported values.
* Refactored code into small testable classes.
* Changed the balloon quantity number to `int`   
