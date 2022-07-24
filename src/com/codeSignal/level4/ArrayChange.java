package com.codeSignal.level4;

/*
 * You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

Example

For inputArray = [1, 1, 1], the output should be
solution(inputArray) = 3.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Guaranteed constraints:
3 ≤ inputArray.length ≤ 105,
-105 ≤ inputArray[i] ≤ 105.

[output] integer

The minimal number of moves needed to obtain a strictly increasing sequence from inputArray.
It's guaranteed that for the given test cases the answer always fits signed 32-bit integer type.*/

public class ArrayChange {
	public static void main(String[] args) {
		int[] arr = new int[] { -1000, 0, -2, 0 };
		System.out.println(solution(arr));
	}

	static int solution(int[] inputArray) {
		int move = 0;
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] >= inputArray[i + 1]) {
				int diff = inputArray[i] - inputArray[i + 1] + 1;
				move += diff;
				inputArray[i + 1] += diff;
			}
		}
		return move;
	}
}
