package com.Arrays;

import java.util.Random;
import static com.Arrays.ArraysInsertionSort.*;

public class RandomNumberGeneration {
	
	public static enum randomType { DEFAULT, STREAM }
	
	public static int[] RandomIntGenerator(int size, int limit) {
		int data[] = new int[size];
		
		Random rand = new Random();
		
		rand.setSeed(System.currentTimeMillis());
		
		for(int i = 0; i < data.length; i++)
			data[i] = rand.nextInt(limit);
		
		return data;
	}

	public static void main(String [] args) {
		
		int size = 10;
		int limit = 5;
		
		int data[] = new int[size];
		
		data = RandomIntGenerator(size, limit);
		
		displayArray(data);
		
		System.out.println();
		insertionSort(data, type.DESC);
		displayArray(data);
		
	}
}
