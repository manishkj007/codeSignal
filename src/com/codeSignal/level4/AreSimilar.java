package com.codeSignal.level4;

/*Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

Example

For a = [1, 2, 3] and b = [1, 2, 3], the output should be
solution(a, b) = true.

The arrays are equal, no need to swap any elements.

For a = [1, 2, 3] and b = [2, 1, 3], the output should be
solution(a, b) = true.

We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be
solution(a, b) = false.

Any swap of any two elements either in a or in b won't make a and b equal.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Array of integers.

Guaranteed constraints:
3 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ 1000.

[input] array.integer b

Array of integers of the same length as a.

Guaranteed constraints:
b.length = a.length,
1 ≤ b[i] ≤ 1000.

[output] boolean

true if a and b are similar, false otherwise.*/
public class AreSimilar {
public static void main(String[] args) {
	int[] a = new int[]{1, 2, 3}; 
	int[] b = new int[]{1, 2, 3};
System.out.println(solution(a,b));
}
	static boolean solution(int[] a, int[] b) {

		boolean result = true;
		int swap=0;
		for(int i=0;i<a.length;i++){
		    for(int j=0; j<b.length;j++){
		        if(a[i]==b[j]){
		            if(i!=j && a[i]!=b[i]){
		                swap ++;
		            } 
		            b[j]=0;
		            break;
		        }
		    }
		}
		for(int i: b){
		if(i>0)
		result=false;    
		}

		if(swap>3){
		    result=false;
		}
		return result;
		}

}
