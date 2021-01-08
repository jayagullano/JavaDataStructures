package com.Testing;

import java.io.File;

import com.Recursion.FileSystem;

public class Main{

	//Basic Change
	
	
	public static void main(String[] args) {
			
		File obj = new File("C:\\Users\\Thumb\\Desktop\\Books\\Java");
		
		long value = FileSystem.diskUsage(obj);
		
		System.out.println(value);
	}	
}
