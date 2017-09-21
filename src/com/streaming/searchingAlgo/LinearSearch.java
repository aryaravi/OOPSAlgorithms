package com.streaming.searchingAlgo;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main (String args[]) {
	int i,num,item,array[];
	Scanner input=new Scanner(System.in);
	System.out.println("Enter num");
	num=input.nextInt();
	array=new int[num];
	System.out.println("Enter"+num);
	for(i=0;i<num;i++) 
		array[i]=input.nextInt();
	System.out.println("enter search");
	item=input.nextInt();
	for(i=0;i<num;i++) {
		if(array[i]==item) {
			System.out.println(array[i]);
			break;
		}
	}
	
	if(i==num)
		System.out.println(item + " doesn't exist in array.");
	}
	

}
