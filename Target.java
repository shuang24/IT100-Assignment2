/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	private static final double pixels_per_sq_inch = 72;
	private static final double circle_one_radius = 1*pixels_per_sq_inch;
	private static final double circle_two_radius = 0.3*pixels_per_sq_inch;
	private static final Color color_one = Color.RED;
	private static final Color color_two = Color.WHITE;
	
	public void run() {
		// Add 3 circle to make a target
		
		add(centredCircle(circle_one_radius, color_one));
		
	}
	
	private GOval centredCircle (double r, Color color) {
		GOval circle = new GOval(midX()-r,midY()-r, 2*r, 2*r);
		circle.setFilled(true);
		circle.setFillColor(color);
		circle.setColor(color);
		return circle;
	}
	
	// centre of the canvas
	private int midX() {
		int x = getWidth()/2;
		return x;
	}
	
	private int midY(){
		int y = getHeight()/2;
		return y;
	}
}
