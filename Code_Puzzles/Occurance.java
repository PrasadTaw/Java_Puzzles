package com.app;

import java.util.*;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		String  str = sc.nextLine();
		
		char[] arr = str.toCharArray();
		int[] indx = new int[arr.length];
		
		System.out.println("Please enter a character");
		char ip = sc.next().charAt(0);
		
		int index = 0, i,count = 0;
		
		for(i = 0; i < arr.length; i++) {
			
			if(ip == arr[i]) {
				indx[index] = i;
				index++;
			}
		}
		
		if(index >= 2) {
			index = index - 2;
			System.out.println("The second last occurance of "+ip+" observed at index: "+indx[index]);
		}
		else if(index == 1) {
			System.out.println("No two occurences");
		}
		else if(index <= 0) {
			System.out.println("Element not found in the string");
		}
		
		System.out.println("---End of Program---");

	}

}
