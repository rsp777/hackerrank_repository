package com.hackerrankquestions.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GamingArray {

	public static void main(String[] args) {

		//	List<Integer>array = new ArrayList<Integer>(Arrays.asList(2156,90629,23857, 
		//			94325,33447,78537,48772,35902,47202,
		//			79445,63982,4784,68417,3497,90081,
		//			36426,86918,30739,95728,31932,7775,14575)) ;
		//		List<Integer>array = new ArrayList<Integer>(Arrays.asList(5,2,6,3,4)) ; 
		//			List<Integer>array = new ArrayList<Integer>(Arrays.asList(1,3,5,7,9)) ;
		//			List<Integer>array = new ArrayList<Integer>(Arrays.asList(7,4,6,5,9)) ;
		List<Integer>array = new ArrayList<Integer>(Arrays.asList(3,1)) ;
		String result = gamingArray(array);
		System.out.println(result);

	}
	public static String gamingArray(List<Integer> array) {
		int constant = 0;
		int max =0 ;
		int maxIndex = 0;

		if(!(array.isEmpty())) {
			max = Collections.max(array);
			maxIndex = array.indexOf(max);
		}

		for(int index = array.size()-1 ; index >=maxIndex ; index--) {
			//			
			//			if(index == -1) {
			//				System.exit(0);
			//			}

			
				array.remove(index);
				constant++;


			
		}
		System.out.println(array);
		System.out.println("Constant : "+constant);
		if(array.isEmpty()) {
			if((constant) % 2 == 0) {
				return "ANDY";
			}
			else {
				return "BOB";
			}
		}

		String result = gamingArray(array);    
		return result;
	}
}
