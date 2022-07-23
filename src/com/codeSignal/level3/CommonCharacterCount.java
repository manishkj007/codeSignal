/**
 Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[execution time limit] 3 seconds (java)

[input] string s1

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s1.length < 15.

[input] string s2

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s2.length < 15.

[output] integer
 **/
package com.codeSignal.level3;


public class CommonCharacterCount {

	public static void main(String ...args) {
		System.out.println(solution("aabcc", "adcaa"));
	}

	static int solution(String s1, String s2) {
		  
		  int before = s1.length();
		  for(int i=0;i<s2.length();i++){
			  System.out.println("s1 --->> "+s1 +"    <<--->>  "+s2.substring(i,i+1));
		    s1 = s1.replaceFirst(s2.substring(i,i+1), "");
		    
		  }
		 int after = s1.length();
		  return before-after;
		  }
}
