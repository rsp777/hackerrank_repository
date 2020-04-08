package com.hackerrankquestions.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GamingArrayTwo {

	public static void main(String[] args) {
		
		List<Integer>array = new ArrayList<Integer>(Arrays.asList(7,4,6,5,9)) ;
		String result = gamingArray(array);
		System.out.println(result);
	}
	
	public static String gamingArray(List<Integer> array) {
		
		int max = 0;
		int count = 0;
		for(int i = 0; i < array.size() ; i++) {
			if (max < array.get(i)) {
				max = array.get(i);
				count++;
			}
		}
		
		if (count%2 == 0) {
			return "ANDY";
		}
		return "BOB";
	}

}
