package com.Algorithms;

import com.StackADT.Stack;
import com.StackADT.ArrayStack;
import com.StackADT.LinkedListStack;

public class AlgorithmLibrary {
	
	/**
	 * Reverse a given array of any data type.
	 * @param <E> Type of Data Type for Stack
	 * @param a Reference to Array
	 */
	public static <E> void reverse(E [] a) {
		Stack<E> buffer = new ArrayStack<>(a.length);
		for(int i = 0; i < a.length; i++)
			buffer.push(a[i]);
		for(int i = 0; i < a.length; i++)
			a[i] = buffer.pop();
	}
	
	
	/**
	 * Returns true if a string has opening and closing braces,
	 * false otherwise
	 * @param expression The string containing the text to be evaluated.
	 * @return true or false
	 */
	public static boolean isMatched(String expression) {
		final String opening = "({[";
		final String closing = ")}]";
		Stack<Character> buffer = new LinkedListStack<>();
		for(char c : expression.toCharArray()) {
			if(opening.indexOf(c) != -1) 
				buffer.push(c);
			else if (closing.indexOf(c) != -1) {
				if(buffer.isEmpty())
					return false;
				if(closing.indexOf(c) != opening.indexOf(buffer.pop()))
					return false;
			}		
		}
		return buffer.isEmpty();
	}
	
	/** 
	 * This method returns if a string of HTML text has valid tag matchups.
	 * @param html
	 * @return
	 */
	public static boolean isHTMLMatched(String html) {
		Stack<String> buffer = new LinkedListStack<>(); //Create a stack of String to hold the braces
		int j = html.indexOf('<');						//Retrieves the < referring to the root tag.
		while (j != -1) {								//While there index is valid, meaning it exists in the html
			int k = html.indexOf('>', j+1);				
			if(k == -1)
				return false;
			String tag = html.substring(j+1, k);
			if(!tag.startsWith("/"))
				buffer.push(tag);
			else {
				if(buffer.isEmpty())
					return false;
				if (!tag.substring(1).equals(buffer.pop()))
					return false;
			}
			
			j = html.indexOf('<', k+1);
		}
		
		return buffer.isEmpty();
	}
	

}

