# 90-Day Java + Selenium Automation Coding Practice Plan

This plan is designed for a Java Selenium automation test engineer preparing for interviews and hands-on coding rounds. Each day includes 5 coding questions with short answer patterns. The emphasis is on coding, not theory.

## Daily Structure
- Solve 5 questions daily
- Write Java code in a main method
- Test with at least 3 inputs
- Mention time complexity mentally
- Focus on interview-style logic and Selenium-relevant Java practice

---

## Week 1 - Java Basics and Strings

### Day 1
1. Reverse a string using a loop.
   Answer:
   ```java
   String s = "Java";
   char[] ch = s.toCharArray();
   for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
       char temp = ch[i];
       ch[i] = ch[j];
       ch[j] = temp;
   }
   System.out.println(new String(ch));
   ```

2. Reverse a string using StringBuilder.
   Answer:
   ```java
   String s = "Selenium";
   System.out.println(new StringBuilder(s).reverse().toString());
   ```

3. Reverse each word in a sentence.
   Answer:
   ```java
   String s = "I am learning Java";
   String[] words = s.split(" ");
   StringBuilder sb = new StringBuilder();
   for (int i = words.length - 1; i >= 0; i--) {
       sb.append(words[i]).append(" ");
   }
   System.out.println(sb.toString().trim());
   ```

4. Check if a string is a palindrome.
   Answer:
   ```java
   String s = "level";
   String r = new StringBuilder(s).reverse().toString();
   System.out.println(s.equals(r));
   ```

5. Count vowels in a string.
   Answer:
   ```java
   String s = "automation";
   int count = 0;
   for (char c : s.toLowerCase().toCharArray()) {
       if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
   }
   System.out.println(count);
   ```

### Day 2
1. Reverse only characters while preserving spaces.
2. Remove spaces from a string.
3. Find first non-repeating character.
4. Count each character frequency in a string.
5. Check if a string contains only digits.

Sample answers:
```java
String s = "a b c";
char[] ch = s.toCharArray();
int i = 0, j = ch.length - 1;
while (i < j) {
    if (ch[i] == ' ') i++;
    else if (ch[j] == ' ') j--;
    else {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        i++; j--;
    }
}
System.out.println(new String(ch));
```

### Day 3
1. Find largest number in an array.
2. Find smallest number in an array.
3. Find second largest number.
4. Find missing number in an array.
5. Find pair of numbers adding to a target.

Sample answer:
```java
int[] arr = {2, 7, 11, 15};
int target = 9;
for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
            System.out.println(arr[i] + "," + arr[j]);
        }
    }
}
```

### Day 4
1. Remove duplicate elements from an array.
2. Move all zeros to the end.
3. Reverse an array.
4. Rotate array by one position.
5. Find frequency of each element.

### Day 5
1. Find common elements in two arrays. Done
2. Find duplicates in an array. 
3. Find unique elements from an array.
4. Sort an array using bubble sort.
5. Sort an array using selection sort.

### Day 6
1. Check if an array is sorted.
2. Find second smallest number.
3. Find sum of all array elements.
4. Find average of array elements.
5. Find product of all array elements.

### Day 7
1. Create a class with constructor and method.
2. Use method overloading.
3. Use inheritance.
4. Use encapsulation.
5. Use polymorphism.

---

## Week 2 - Arrays and Collection Basics

### Day 8
1. Use ArrayList.
2. Use LinkedList.
3. Use HashSet.
4. Use TreeSet.
5. Use HashMap.

### Day 9
1. Find first repeated element in a list.
2. Count words in a sentence.
3. Sort list of integers ascending.
4. Sort list of strings alphabetically.
5. Remove duplicates from a list.

### Day 10
1. Find an element using linear search.
2. Find an element using binary search.
3. Find the maximum difference between array elements.
4. Count even and odd numbers.
5. Find missing number in a sequence.

### Day 11
1. Check if a number is prime.
2. Find prime numbers up to N.
3. Find sum of digits of a number.
4. Reverse a number.
5. Check Armstrong number.

### Day 12
1. Factorial using recursion.
2. Fibonacci using recursion.
3. Reverse a string using recursion.
4. Check palindrome using recursion.
5. Sum of digits using recursion.

### Day 13
1. Check if two strings are anagrams.
2. Find longest substring without repeating chars.
3. Find common prefix among strings.
4. Find first repeated word in a sentence.
5. Detect if a string has only unique characters.

### Day 14
1. Remove special characters from a string.
2. Replace multiple spaces with one space.
3. Validate email format.
4. Validate mobile number.
5. Validate password pattern.

---

## Week 3 - Collections, Maps, and OOP

### Day 15
1. Print frequency using HashMap.
2. Use LinkedHashMap to preserve insertion order.
3. Use TreeMap to sort keys.
4. Count frequency of each word in a sentence.
5. Find top repeated word in a sentence.

### Day 16
1. Difference between ArrayList and LinkedList.
2. Difference between HashSet and TreeSet.
3. Difference between HashMap and Hashtable.
4. Use Queue and poll.
5. Use Stack and pop.

### Day 17
1. Use Deque.
2. Implement LIFO with stack.
3. Implement FIFO with queue.
4. Use Collections.reverse.
5. Swap two numbers without a third variable.

### Day 18
1. Use static variables.
2. Use final keyword.
3. Use this keyword.
4. Use super keyword.
5. Create singleton class.

### Day 19
1. ArithmeticException example.
2. ArrayIndexOutOfBoundsException example.
3. NullPointerException example.
4. Custom exception example.
5. Throw custom exception from a method.

### Day 20
1. Use lambda expression.
2. Filter even numbers using stream.
3. Map list to squares.
4. Sum numbers using streams.
5. Count elements using streams.

### Day 21
1. Find max in a list using stream.
2. Find min in a list using stream.
3. Sort a list using stream.
4. Remove duplicates using stream distinct.
5. Convert list of strings to uppercase using stream.

---

## Week 4 - Java 8, Generics, and Java Core Interview Prep

### Day 22
1. Create a generic class.
2. Create a generic method.
3. Use wildcard generics.
4. Sort a generic list.
5. Create a Pair class using generics.

### Day 23
1. Difference between abstract class and interface.
2. Create interface with method.
3. Implement interface in class.
4. Create abstract class example.
5. Use default method in interface.

### Day 24
1. Create enum.
2. Use switch with enum.
3. Autoboxing example.
4. Unboxing example.
5. Parse string to integer.

### Day 25
1. Create Date object and format it.
2. Add days to date.
3. Compare two dates.
4. Find date difference in days.
5. Use LocalDateTime.

### Day 26
1. Read content from a file.
2. Write content to a file.
3. Check if file exists.
4. Count lines in a file.
5. Read properties file.

### Day 27
1. Find longest common prefix.
2. Find maximum sum subarray.
3. Find all pairs with target sum.
4. Find majority element in an array.
5. Sort list of custom objects.

### Day 28
1. Check if array contains duplicates.
2. Remove duplicate words from a sentence.
3. Find repeated numbers in an array.
4. Find top 3 repeated characters in a string.
5. Find most repeated integer in an array.

---

## Week 5 - Matrix, Strings, and Advanced Logic

### Day 29
1. Print 2D array.
2. Find sum of matrix elements.
3. Transpose a matrix.
4. Find diagonal sum.
5. Print spiral matrix.

### Day 30
1. Find longest increasing subsequence.
2. Find maximum product subarray.
3. Find number of trailing zeros in factorial.
4. Check if a string has balanced parentheses.
5. Check if brackets are valid in an expression.

### Day 31
1. Evaluate whether a number is perfect.
2. Check if two numbers are co-prime.
3. Find gcd of two numbers.
4. Find lcm of two numbers.
5. Find cube of a number and sum digits.

### Day 32
1. Find all substrings of a string.
2. Print all permutations of a string.
3. Find whether a string is a valid number.
4. Find all indexes of a character in a string.
5. Find the first repeated char after a given index.

### Day 33
1. Find the smallest missing positive number.
2. Find kth smallest element in array.
3. Find kth largest element in array.
4. Find the median of an array.
5. Find the index of maximum value in array.

### Day 34
1. Use Comparator for sorting objects.
2. Use Comparable for sorting objects.
3. Sort custom objects by multiple fields.
4. Group strings by first letter using Map.
5. Filter null and empty strings from a list.

### Day 35
1. Create a class with overloaded constructors.
2. Use private constructor with static factory.
3. Explain object creation lifecycle.
4. Build a utility method to find second largest number.
5. Build a utility method to reverse words in a sentence.

---

## Week 6 - Selenium Java Fundamentals

### Day 36
1. Launch Chrome browser using WebDriver.
2. Open a URL.
3. Find element by ID.
4. Find element by XPath.
5. Find element by CSS selector.

### Day 37
1. Type into an input box.
2. Click a button.
3. Validate page title.
4. Validate current URL.
5. Use explicit wait for an element.

### Day 38
1. Use implicit wait.
2. Use fluent wait.
3. Handle dropdown with Select class.
4. Handle alert popup.
5. Handle browser navigation back and forward.

### Day 39
1. Handle frame switching.
2. Handle multiple windows.
3. Capture screenshot.
4. Perform mouse hover.
5. Perform drag and drop.

### Day 40
1. Handle checkbox selection.
2. Handle radio button selection.
3. Check if an element is displayed.
4. Check if an element is enabled.
5. Check if an element is selected.

---

## Week 7 - Selenium Framework and Automation Design

### Day 41
1. Create a Page Object Model class.
2. Create login page method using POM.
3. Create BasePage class with reusable methods.
4. Write a test using page object.
5. Explain why POM is useful.

### Day 42
1. Create PageFactory class with @FindBy.
2. Create reusable click utility.
3. Create reusable sendKeys utility.
4. Create reusable waitForElement method.
5. Create isElementPresent utility.

### Day 43
1. Read test data from properties file.
2. Read test data from CSV.
3. Read test data from Excel using Apache POI.
4. Use DataProvider in TestNG.
5. Parameterize a Selenium login test.

### Day 44
1. Handle stale element reference exception.
2. Handle NoSuchElementException.
3. Handle TimeoutException.
4. Use logger to print steps.
5. Use screenshot on failure.

### Day 45
1. Write TestNG beforeMethod and afterMethod.
2. Use priority in TestNG tests.
3. Use dependsOnMethods in TestNG.
4. Create assertions for title and URL.
5. Create a test suite with multiple test cases.

---

## Week 8 - Advanced Selenium and Real-World Automation

### Day 46
1. Handle dynamic ID locators.
2. Handle partially dynamic XPath.
3. Use CSS selectors for better performance.
4. Use JS executor to click hidden elements.
5. Use JS executor to scroll to an element.

### Day 47
1. Handle authentication popup.
2. Handle download popup.
3. Handle browser cookie operations.
4. Manage local storage in JavaScript.
5. Manage session storage in JavaScript.

### Day 48
1. Work with table data in Selenium.
2. Extract row and cell values from a table.
3. Handle nested frames.
4. Handle shadow DOM elements.
5. Use actions class for hover and click.

### Day 49
1. Design a reusable test utility class.
2. Create method to wait until URL contains text.
3. Create method to wait until page title matches.
4. Create method to click by JavaScript.
5. Create method to get element text safely.

### Day 50
1. Create login automation flow with POM.
2. Create dashboard validation after login.
3. Validate error messages on failed login.
4. Validate empty field validations.
5. Build a test for logout flow.

---

## Week 9 - Full Mock Interview Practice

### Day 51
1. Reverse a string while maintaining spaces.
2. Find missing number in array.
3. Check if string is palindrome.
4. Find second largest number in array.
5. Count vowels and consonants.

### Day 52
1. Find pair sum in array.
2. Count word frequency using HashMap.
3. Remove duplicates from list.
4. Find common elements in arrays.
5. Find duplicate elements in array.

### Day 53
1. Reverse a number.
2. Check prime number.
3. Generate Fibonacci series.
4. Find factorial of a number.
5. Check Armstrong number.

### Day 54
1. Sort a list of custom objects.
2. Convert list to Map.
3. Remove null values from list.
4. Group strings by first alphabet.
5. Find longest substring without repeating chars.

### Day 55
1. Validate an email and password.
2. Read file content and print lines.
3. Count lines in a file.
4. Read properties file.
5. Write to a file.

---

## Week 10 - Mixed Hard Java Questions

### Day 56
1. Find maximum contiguous sum.
2. Find longest common prefix.
3. Find maximum product subarray.
4. Find lowest common ancestor concept review.
5. Find major element in array.

### Day 57
1. Print all permutations of a string.
2. Check if a string is valid parentheses.
3. Find all pairs with target sum.
4. Find all unique pairs in sorted array.
5. Find number of trailing zeros in factorial.

### Day 58
1. Find k-th largest element.
2. Find k-th smallest element.
3. Find median of an array.
4. Compare two strings ignoring case.
5. Remove duplicates while preserving order.

### Day 59
1. Find longest palindrome substring.
2. Check if strings are anagrams.
3. Convert first letter of each word to uppercase.
4. Reverse words in a sentence.
5. Find most frequent character.

### Day 60
1. Two-sum using HashMap.
2. Three-sum problem.
3. Find all unique pairs with target sum.
4. Find smallest missing positive integer.
5. Find longest increasing subsequence.

---

## Week 11 - Selenium Advanced Coding Practice

### Day 61
1. Write custom method to wait until visible.
2. Write custom method to wait until clickable.
3. Write custom method to wait until page title matches.
4. Write custom method to wait until URL contains text.
5. Use explicit wait with ExpectedConditions.

### Day 62
1. Create a reusable method for login flow.
2. Reusable method for logout flow.
3. Reusable method for dropdown selection.
4. Reusable method for alert handling.
5. Reusable method for capturing screenshot.

### Day 63
1. Use JavaScriptExecutor to click hidden element.
2. Use JS executor to scroll.
3. Use JS executor to get page title.
4. Use JS executor to highlight element.
5. Use JS executor to set a value in input field.

### Day 64
1. Use Actions to hover and click.
2. Use Actions to drag and drop.
3. Use Actions to key press and key release.
4. Use Actions chain for multi-step interaction.
5. Use Robot class for keyboard events.

### Day 65
1. Handle a dynamic button count.
2. Handle list items from a dynamic table.
3. Validate multiple rows in a table.
4. Handle text-based pagination.
5. Handle page navigation using pagination.

---

## Week 12 - Final Interview Integration

### Day 66
1. Build a mini login framework using POM.
2. Create page objects for login and dashboard.
3. Write base test setup and tearDown.
4. Create utility to fetch test data.
5. Create simple test suite using TestNG.

### Day 67
1. Validate login and logout in POM style.
2. Validate invalid credentials message.
3. Validate homepage title and login URL.
4. Use list of locators and iterate.
5. Test dynamic page content retrieval.

### Day 68
1. Create a custom wait utility for Selenium.
2. Use FluentWait with polling interval.
3. Handle element state changes on AJAX pages.
4. Handle dynamic web tables.
5. Handle elements inside iFrames.

### Day 69
1. Build a data-driven test using Excel.
2. Build a data-driven test using CSV.
3. Build a data-driven test using properties file.
4. Validate results against expected values.
5. Build reusable assertion methods.

### Day 70
1. Write full Java Selenium script for login flow.
2. Add screenshot on failure.
3. Add wait before click.
4. Validate final page content.
5. Clean and refactor code. 

---

## Week 13 - Final Revision Week 1

### Day 71
1. Java basics recap.
2. String manipulation recap.
3. Array logic recap.
4. Collection recap.
5. OOP recap.

### Day 72
1. Exception handling recap.
2. Recursion recap.
3. Lambda and stream recap.
4. Generic recap.
5. File handling recap.

### Day 73
1. Selenium locators recap.
2. Waits recap.
3. Dropdown and alert recap.
4. Frames and windows recap.
5. Screenshots recap.

### Day 74
1. POM review.
2. BasePage review.
3. TestNG review.
4. DataProvider review.
5. Assertion review.

### Day 75
1. Full Java coding challenge 1.
2. Full Java coding challenge 2.
3. Full Java coding challenge 3.
4. Full Java coding challenge 4.
5. Full Java coding challenge 5.

---

## Week 14 - Final Revision Week 2

### Day 76
1. Solve 5 string-based coding problems from memory.
2. Solve 5 array-based problems from memory.
3. Solve 5 collection-based problems from memory.
4. Solve 5 recursion-based problems from memory.
5. Solve 5 matrix-based problems from memory.

### Day 77
1. Solve 5 Selenium locator challenges.
2. Solve 5 explicit wait challenges.
3. Solve 5 alert/frame/window challenges.
4. Solve 5 JavaScriptExecutor challenges.
5. Solve 5 Actions class use cases.

### Day 78
1. Rebuild a login page object.
2. Rebuild a utility class.
3. Rebuild a BaseTest class.
4. Rebuild a simple test suite.
5. Rebuild custom waits.

### Day 79
1. Mock Java interview coding round.
2. Mock Selenium automation round.
3. Mock POM design round.
4. Mock data-driven testing round.
5. Mock debugging round.

### Day 80
1. Write a 30-minute coding challenge from scratch.
2. Write a 30-minute Selenium flow from scratch.
3. Write a 30-minute POM design from scratch.
4. Write a 30-minute data handling code.
5. Write a 30-minute bug-fix scenario.

---

## Week 15 - Final Sprint

### Day 81
1. Java arrays and strings mixed practice.
2. Java maps and collections mixed practice.
3. Java OOP and exception mixed practice.
4. Java streams and recursion mixed practice.
5. Java file and date mixed practice.

### Day 82
1. Selenium DOM locator practice.
2. Selenium wait practice.
3. Selenium alert and frame practice.
4. Selenium table handling practice.
5. Selenium browser actions practice.

### Day 83
1. POM full implementation challenge.
2. DataProvider challenge.
3. Utility method challenge.
4. Assertion challenge.
5. Screenshot and failure handling challenge.

### Day 84
1. Full Java + Selenium mock round 1.
2. Full Java + Selenium mock round 2.
3. Full Java + Selenium mock round 3.
4. Full Java + Selenium mock round 4.
5. Full Java + Selenium mock round 5.

### Day 85
1. Debug and rewrite your weakest code set.
2. Rewrite 5 most difficult Java answers.
3. Rewrite 5 most difficult Selenium answers.
4. Review pattern matching and regex.
5. Review page object design patterns.

---

## Week 16 - Final Countdown

### Day 86
1. Full Java interview practice set 1.
2. Full Java interview practice set 2.
3. Full Java interview practice set 3.
4. Full Java interview practice set 4.
5. Full Java interview practice set 5.

### Day 87
1. Full Selenium interview practice set 1.
2. Full Selenium interview practice set 2.
3. Full Selenium interview practice set 3.
4. Full Selenium interview practice set 4.
5. Full Selenium interview practice set 5.

### Day 88
1. Full mock interview with Java coding only.
2. Full mock interview with Selenium coding only.
3. Full mock interview with POM tasks.
4. Full mock interview with data-driven testing.
5. Full mock interview with debugging tasks.

### Day 89
1. Final revision of all weak Java topics.
2. Final revision of all weak Selenium topics.
3. Final revision of all core assertions.
4. Final revision of all wait strategies.
5. Final revision of all object design patterns.

### Day 90
1. Final combined mock round.
2. Final Java coding recap.
3. Final Selenium coding recap.
4. Final project-level design recap.
5. Final confidence check and interview preparation checklist.

---

## Final Focus Areas for Interview Success
- Java basics and OOP
- Strings, arrays, collections, maps
- Exception handling
- Streams and lambda expressions
- Recursion and advanced logic
- Java Selenium WebDriver basics
- Waits, locators, alerts, frames, windows
- Page Object Model and Base Test setup
- Data-driven testing
- Debugging and maintainability

This 90-day plan is designed to cover almost all core concepts required for a Java Selenium automation test engineer role.
