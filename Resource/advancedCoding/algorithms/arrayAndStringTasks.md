### String / Array tasks


1. Given a string and the task is get an object with count statistics:
 vowels, consonant, digits and special character in string.
 Special character also contains the white space.

Input1: "geeks for geeks121"

Output1:

Letters: 13

Vowels: 5

Consonant: 8

Uppercase: 0

Lowercase: 13

Digit: 3

Special Character: 2


Input2: " A1 B@ d  adc"

Output2:

Letters: 6

Vowels: 2

Consonant: 4

Uppercase: 2

Lowercase: 4

Digit: 1

Special Character: 6

```
chars looping:

for (int i = 0; i < str.length(); i++) {
   char ch = str.charAt(i);
   ...
}

- letter condition:  (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) {

- vowels condition: ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
  // To handle upper case letters
  ch = Character.toLowerCase(ch);

- digit condition:(ch >= '0' && ch <= '9')
```

Resolve is this using the Character utilities.

[Java char help](https://www.tutorialspoint.com/java/java_characters.htm)




2. Count triplets with sum smaller than a given value from an integer array. Write solution also for a list of ints.

Input:

12384593111274116

7

Output: 5


3. Get triplets where the third is the sum of the first two. Write solution also for a list of ints.

Input:

1230347819258718077

Output:

123

303

819

718

077


4. Length of the largest subarray with contiguous elements from an array of ints. Write solution also for a list of ints.


5. Smallest subarray with sum greater than a given value. Write solution also for a list of ints.


6. Find all possible palindromic partitions in a string.
