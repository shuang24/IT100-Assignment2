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
		int y = getHeight() - BRICK_HEIGHT;
		for (int n = BRICKS_IN_BASE; n >= 0; n--) {
			int rowLength = n * BRICK_WIDTH;
			int x = ((getWidth() / 2) - (rowLength / 2) - (BRICK_WIDTH / 2));
			for (int i = 0; i <= rowLength; i += BRICK_WIDTH) {
				pause(20);
				GRect brick = new GRect(x + i, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			y -= BRICK_HEIGHT;
		}
	}
}
