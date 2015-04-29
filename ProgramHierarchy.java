/*
 * File: ProgramHierarchy.java
 * Name: Steven Huang
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	private static final int belowBoxs = 4;
	private static final int boxWidth = 100;
	private static final int boxHeight = 50;
	private static final int boxDistances = 20;
	private static final int rowDistances = 150;
	
	private void createBox(int X, int Y, String name)
	{
		GRect gObjectBox = new GRect(X, Y, boxWidth, boxHeight);
		GLabel text = new GLabel(name);
 
		// replace the X,Y with the new cords to place the text into the middle of the box
		X += (boxWidth / 2) - (text.getWidth()/2);
		Y += (boxHeight / 2) + (text.getAscent()/2);
		text.setLocation(X, Y);
 
		add(gObjectBox);
		add(text);
	}
 
	public void run() {
		// You fill this in
		// find the centre, to then build around it
		int midX = getWidth() / 2;
		int midY = (getHeight() / 2)-boxHeight;
 
		String names[] = new String[5];
		names[0] = "GObject";
		names[1] = "GLabel";
		names[2] = "GLine";
		names[3] = "GOval";
		names[4] = "GRect";
 
		createBox(midX - (boxWidth / 2), midY - (rowDistances / 2),names[0]);
 
		int placeX = midX - ((belowBoxs * boxWidth)/2) - ((belowBoxs * boxDistances)/2);
		for (int i =0; i < belowBoxs; i++)
		{
			createBox(placeX, midY + (rowDistances / 2), names[i+1]);
			GLine joiningLine = new GLine(midX, midY - ((rowDistances / 2)-boxHeight),
										placeX + (boxWidth/2), midY + (rowDistances/2));
			add(joiningLine);
			placeX += (boxWidth + boxDistances);
		}
	}
}
 
