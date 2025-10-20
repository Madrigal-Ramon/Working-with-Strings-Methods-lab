# Working-with-Strings-Methods-lab

Task 1: Working with String Methods

The program starts with a string: " Welcome to the Java String Lab! "

then the program would then demonstrate the following uses of string methods. length(): Counts all characters including spaces charAt(7): Returns the character at position 7 substring(): Finds "Java" by locating its start index and taking 4 characters toUpperCase()/toLowerCase(): Creates new strings with all characters converted indexOf(): Finds the first position where "Java" appears contains(): Checks if "Lab" exists anywhere in the string replace(): Creates a new string with "Java" replaced by "Java Programming" split(): Divides the string into an array wherever spaces occur trim(): Removes leading and trailing whitespace equals(): Compares strings exactly equalsIgnoreCase(): Compares strings without case sensitivity

Task 2: Loop Challenges

For Loop - Count Vowels

Creates a string containing all vowels (both cases) Loops through each character in the original string Checks if the character exists in the vowels string Counts matches While Loop - Palindrome Check

Takes the word "racecar" Uses two pointers (left and right) that move towards each other Compares characters at both pointers If any pair doesn't match, sets isPalindrome to false If all match, remains true (correctly identifies "racecar" as palindrome) Do-While Loop - Input Validation

Creates a Scanner to read user input Keeps prompting the user until they enter a sentence containing "Java" Case-sensitive check (must contain exact word "Java") Exits loop and prints "Thank you!" when condition met

Task 3: StringBuilder Operations

append(): Adds " - Learning Java" to the end Becomes "StringBuilder Lab - Learning Java" insert(): Adds " is fun" after "Lab" Becomes "StringBuilder Lab is fun - Learning Java" delete(): Removes "Learning" Becomes "StringBuilder Lab is fun - Java" reverse(): Reverses the entire string Becomes "avaJ - nuf si baL redliBgnirtS"

Task 4: StringBuffer Operations

This is similar to Task 3's operations, but it uses StringBuffer instead of StringBuilder. Starts with "Multithreading Lab" and goes through the append, insert, delete, and reverse operations.