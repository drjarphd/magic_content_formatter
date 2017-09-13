import java.io.*;
import java.util.*;

/* 
Copyright {2017} John Austin Robbins II
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0 
*/
// Programming practice
class Forms {
	
	static String capitalization(String content) {
	String new_content = content.toUpperCase();
	return new_content;
	}

	static String lower_case(String content) {
	String new_content = content.toLowerCase();
	return new_content;
	}

	static String normal_case(String content) {
		// SETUP
		Scanner input = new Scanner(content);
		String line = input.nextLine();
	
		String upper_case_line = "";
		Scanner line_scan = new Scanner(line);
		
		// MAGIC
		while (line_scan.hasNext()) {
			String word = line_scan.next();
			upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
	String new_content = upper_case_line;
	return new_content;
	}


	public static void main(String[] args) {
	


	System.out.println(normal_case("hello"));

  }
  
}
