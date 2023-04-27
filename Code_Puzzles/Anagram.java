package com.app;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		System.out.println("Enter string 1");
		String str1 = sc.nextLine();
		
		System.out.println("Enter 2nd string");
		String str2 = sc.nextLine();
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		if(arr1.length != arr2.length) {
			System.out.println("Strings are not Anagram");
			return;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int count = 0;
		
		for(i = 0; i < arr1.length; i++) {
			
			if(arr1[i] == arr2[i]) {
				
			}
			else {
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Strings are Anagram");
		}
		else
			System.out.println("Strings are not Anagram");
		
		

	}

}