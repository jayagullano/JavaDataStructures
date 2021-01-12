package com.Testing;

import com.QueueADT.*;

public class Main{
	
	public static void main(String[] args) {
		
		String [] arr = {"John", "Rolando", "Philip", "Rodney", "Gunter"};
		
		System.out.println("The first winner is : " + Josephus.Josephus(Josephus.buildQueue(arr), 3));
	}	
}
   