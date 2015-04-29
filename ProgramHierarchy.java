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
	
	private static final int BOX_HEIGHT = 20;
	private static final int BOX_WIDTH = 100;
	
	public void run() {
		drawRowOne();
		drawRowTwo();
	}

	private void drawRowOne() {
		int midX = getWitdh()/2;
		int midY = getHeight90/2;
		
		drawBox(midX,midY, "gObject");
	}
	
	private void drawRowTwo() {
		String boxType = "GLabel";
		for (int i = 1; i &lt; 5; i++) {
			int centerY = getHeight() * 2/3;
			int centerX = getWidth()/5 * i;
 
			switch (i) {
			case 1: break;
			case 2: boxType = &quot;GLine&quot;; break;
			case 3: boxType = &quot;GOval&quot;; break;
			case 4: boxType = &quot;GRect&quot;; break;
			}
 
			drawBox(centerX, centerY, boxType);
			drawLineToRowOne(centerX, centerY);
		}
	}
	
	private void drawBox(int centerX, int centerY, String boxType) {
		int boxX = centerX - BOX_WIDTH/2;
		int boxY = centerY - BOX_HEIGHT/2;
		GRect box = new GRect(boxX, boxY, BOX_WIDTH, BOX_HEIGHT);
		add(box);
 
		GLabel label = new GLabel(boxType);
		int labelX = centerX - (int) label.getWidth()/2;
		int labelY = centerY + (int) label.getAscent()/2;
		add(label, labelX, labelY);	
 
	}
 
	private void drawLineToRowOne(int centerX, int centerY) {
		int x0 = centerX;
		int y0 = centerY - BOX_HEIGHT/2;
		int x1 = getWidth()/2;
		int y1 = getHeight()/3 + BOX_HEIGHT/2;
		GLine line = new GLine(x0, y0, x1, y1);
		add(line);
	}
 
}