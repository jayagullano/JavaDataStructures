package com.Recursion;

import java.io.File;

public class FileSystem {

	
	/* Calculates the total disk usage (in bytes) of the portion of the file system 
	 * at the given path, while printing a summary akin to the standard 'du' Unix tool. */
	public static long diskUsage(File root) {
		long total = root.length();							//start with direct disk usage
		if(root.isDirectory()) {							//and if this is a directory,
			for(String childName : root.list()) {			//then for each child
				File child = new File(root, childName);		//compose a full path to child
				total += diskUsage(child);					//add child's usage to total
			}
		}
		System.out.println(total + "\t" + root); 			//descriptive output
		return total;										//return grand total
	}
}
