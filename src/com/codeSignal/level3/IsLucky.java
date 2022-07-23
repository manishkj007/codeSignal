package com.codeSignal.level3;

public class IsLucky {

/**Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
solution(n) = true;
For n = 239017, the output should be
solution(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.**/	

	public static void main(String ...args) {
		System.out.println(solution(1230));
	}
	static boolean solution(int n) {
	    String num = String.valueOf(n);
	    int firstHalfSum =0;
	    int secondHalfSum =0;
	    String firstHalfNum = num.substring(0, num.length()/2);
	    String secondHalfNum = num.substring(num.length()/2, num.length());
	    for(int i=0; i<firstHalfNum.length();i++ ){
	        firstHalfSum += Integer.parseInt(firstHalfNum.substring(i,i+1));
	      secondHalfSum += Integer.parseInt(secondHalfNum.substring(i,i+1));
	     }
	    return firstHalfSum==secondHalfSum;
	}

}
