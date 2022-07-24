package com.codeSignal.level4;

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
