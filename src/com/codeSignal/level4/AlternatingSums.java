package com.codeSignal.level4;

/**
 * Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers - the weights of the people. Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete.

Example

For a = [50, 60, 60, 45, 70], the output should be
solution(a) = [180, 105].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 105,
45 ≤ a[i] ≤ 100.

[output] array.integer**/
public class AlternatingSums {

	public static void main(String[] args) {
		int[] a = new int[] {100, 50, 50, 100};
		int[] res = solution(a);
		System.out.println(res[0]+" - "+ res[1]);	
	
	}
	
	static int[] solution(int[] a) {
		int[] team1=new int[a.length/2+1];
		int[] team2=new int[a.length/2+1];
		int[] result = new int[2];
		for(int i=0; i<a.length;i++){
		    if(i==0 || i!=1 && i%2==0){
		        team2[i/2]=a[i];
		    }else{
		        team1[i/2]=a[i];
		    }
		}
		for(int i=0; i<team2.length; i++){
		    result[1] +=team1[i];
		    result[0] += team2[i];
		}
		return result;
		}

}
