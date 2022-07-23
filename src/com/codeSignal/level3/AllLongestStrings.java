/**
 Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
// 
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}

Saved
1012139118147156421316517
for(int j=0; j<inputArray.length;j++){
    if(inputArray[j].length()==size){
        result.add(inputArray[j]);
    }
}
return result.toArray(new String[result.size()]);
}
TESTS
CUSTOM TESTS
Tests passed: 10/10. Click Submit to run the full test suite and save your solution.
Test 1
Test 2
Test 3
Test 4
Test 5
Test 6
Test 7
Test 8
Test 9
Test 10
Test 11
Test 12
Test 13
Test 14
Test 15
Test 16
Test 17
Test 18
Test 19
Test 20
MORE
567
92
 **/

package com.codeSignal.level3;

import java.util.ArrayList;

public class AllLongestStrings {

public static void main(String ... args) {
	String[] inputArray = new String[]{"aba", "aa", "ad", "vcd", "aba"};
	for(String arr : solution(inputArray))
	System.out.println(arr);
}
	
	static String[] solution(String[] inputArray) {
		int size=inputArray[0].length();
		ArrayList<String> result = new ArrayList<>();

		//Find the max size of string in the array
		for(int i=0; i<inputArray.length;i++){
		    if(inputArray[i].length() >= size){
		    size = inputArray[i].length();
		    }
		   }
		for(int j=0; j<inputArray.length;j++){
		    if(inputArray[j].length()==size){
		        result.add(inputArray[j]);
		    }
		}
		return result.toArray(new String[result.size()]);
		}
}
