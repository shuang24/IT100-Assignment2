/*
 * File: FindRange.java
 * Name: Steven Huang
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int SENTINEL_VALUE = 0;

	public void run() {
		/* You fill this in */
		println("This program finds the largest and smallest numbers.");
		
		int value = readInt("? ");
		
		if(value == SENTINEL_VALUE) {
			println("Na value have been entered.");
		} else {
			int smallest = value;
			int largest = value;
			while(true){
				value = readInt("? ");
				if(value == SENTINEL_VALUE) break;
				if (smallest > value) smallest = value;
				else if (largest < value) largest = value;
			}
			println("smallest: " + smallest);
			println("largest: " + largest);
		}
	}
}

