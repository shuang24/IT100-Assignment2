/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;

	private double counter = 12;

	public void run() {
		for (double i = 0; i < BRICKS_IN_BASE; i++) { // controls the number of
														// rows (height)
			// System.out.print("\n i= "+i+"\t");
			for (double j = counter / 2; j > 0; j--) { // prints bricks to the
														// left of center point
				GRect rect = new GRect(getWidth() / 2 - (BRICK_WIDTH * j),
						BRICK_HEIGHT + (BRICK_HEIGHT * i), BRICK_WIDTH,
						BRICK_HEIGHT);
				add(rect);
				// System.out.print("j= "+j+"\t");
			}

			for (double k = counter / 2; k > 0; k--) { // prints bricks to the
														// right of center point
				GRect rect2 = new GRect(getWidth() / 2 + (BRICK_WIDTH * k),
						BRICK_HEIGHT - (BRICK_HEIGHT * i), BRICK_WIDTH,
						BRICK_HEIGHT);
				add(rect2);
				// System.out.print(" k="+ k +"\t");
			}
			counter -= 1;
		}
	}
}
