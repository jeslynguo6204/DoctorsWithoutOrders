# Doctors without Orders

Jeslyn Guo
April 3, 2022

## Introduction
This project utilizes recursion to tackle a real world challenge of scheduling patients with doctors in hospitals. Recursion is used to easily explore every outcome of this pairing to identify what the correct solution is, should it exist. We use recursion because of the ability to easily backtrack steps within the code, essentially testing all the "dead ends" in the problem to ultimately determine the correct solution. In the code, the main function calls itself recursively until the base case is hit to determine if all patients can be seen by a given set of doctors. This would be very hard to do iteratively due to the fact that the correct combination is unknown and must be discovered through continually calling the function.


## Adaptability
This could be used to create a schedule for a teacher and their classes in a school. For example, if a teacher can only work a certain number of blocks/hours and there are classes that take a certain amount of time/blocks, we can use this algorithm to develop a schedule. Just like how the patients cannot be seen by more than one doctor, each class or section can only be taught by one teacher. If the amount of time that each class requires is greater than the amount of time a teacher can teach, then the teacher simply cannot teach the class, just like our doctors and patients.
