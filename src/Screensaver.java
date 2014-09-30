/**
 * House.java
 * @author Garrett J. Beasley
 * 09/29/2014
 * Draws a House Picture
 */

//Imports for the program.
import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.Color;
import java.util.Random;

public class Screensaver extends GraphicsProgram 
{
	public void run()
	{
		
		//Variables for the project.
		/**Values for the rect start points*/
		int startX = 100;
		int startY = 100;
		/**Values for the window Size*/
		int windowX = 400;
		int windowY = 300;
		
		//Sets the size of the window for the program
		 setSize(windowX, windowY);
		
		GRect rec = new GRect(50, 50);
		rec.setLocation(startX, startY);
			
			
			rec.setFillColor(Color.BLACK);
			rec.setFilled(true);
			add(rec);
		
		
	}

}
