package com.codeSignal.level4;

/**
 * Codewriting

300

Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

solution(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
Input/Output

[execution time limit] 3 seconds (java)

[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ≤ picture.length ≤ 100,
1 ≤ picture[i].length ≤ 100.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.**/
import java.util.Arrays;

public class AddBorder {

	public static void main(String...args) {
		String[] picture = new String[] {"abc", "ded"};
	System.out.println(Arrays.toString(solution(picture))); 
	}
	static String[] solution(String[] picture) {
	    String border = "";
	  String[] result = new String[picture.length+2];
	  for(int i=0; i<picture.length;i++){
	      picture[i] = "*"+picture[i]+"*";   
	  }
	  for(int j=0;j<picture[0].length();j++){
	            border += "*"; 
	      }    
	      for(int i=0; i<picture.length;i++){
	           if(i==0){
	            result[i]=border; 
	          result[i+1]= picture[i];    
	           }else{
	          result[i+1]= picture[i];
	           }
	            if(i+1==picture.length){
	           result[picture.length+1]=border;    
	           }
	           
	      }
	return result;
	}

}
