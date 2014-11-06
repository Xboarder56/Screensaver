/**
 * Screensaver.java
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
		int startX = 0;
		int startY = 0;
		/**Values for the window Size*/
		int windowX = 1600;
		int windowY = 900;
		
		//Sets the size of the window for the program
		 setSize(windowX, windowY);
	
		 
		 //Creates the background wallpaper for the project. (setBackground(rand);=slower flash so used a rec instead)
		 GRect background = new GRect(windowX, windowY);
		 background.setLocation(startX, startY);
		 background.setFilled(true);

		 
		 //Object Initialization
		 GOval oval = new GOval(200, 200);
		 oval.setFilled(true);
		 
		 GOval oval1 = new GOval(400, 200);
		 oval1.setFilled(true);
		 
		 GRect rec = new GRect(500, 200);
		 rec.setFilled(true);
		 
		 GArc arc = new GArc(150, 200, 300, 300);
		 arc.setFilled(true);
		 
		 GPolygon gpoly = new GPolygon();
		 gpoly.addEdge(100,0);
		 gpoly.addEdge(-100,150);
		 gpoly.addEdge(-150,-250);
		 gpoly.setFilled(true);
		 
		 
		 
		 
			//THIS IS Terrible coding but wanted it to flash haha
			while(true)
			{
				// Loop the variables to allow it to change over and over.
				/**Color Randomizer to make it flash using the math.random*(max color spec =256) class as the Random generator fails to work*/
				int RED = (int) (Math.random( )*256);
				int GREEN = (int)(Math.random( )*256);
				int BLUE= (int)(Math.random( )*256);
				/**Randomizer for location multiple points*/
				int ranX = (int) (Math.random( )*windowX);
				int ranX1 = (int) (Math.random( )*windowX);
				int ranX2 = (int) (Math.random( )*windowX);
				int ranX3 = (int) (Math.random( )*windowX);

				int ranY = (int) (Math.random( )*windowY);
				int ranY1 = (int) (Math.random( )*windowY);
				int ranY2 = (int) (Math.random( )*windowY);
				int ranY3 = (int) (Math.random( )*windowY);
				
				/**Makes new Random color*/
				Color rand = new Color(RED,GREEN,BLUE);
				
				
				//Adds objects to the project/set color	
				background.setFillColor(rand);
				add(background);		
				
				oval.setLocation(ranX, ranY);
				oval.setFillColor(rand);
				add(oval);			
				
				rec.setLocation(ranX1, ranY1);
				rec.setFillColor(rand);
				add(rec);
				
				arc.setLocation(ranX2, ranY2);
				arc.setFillColor(rand);
				add(arc);
				
				gpoly.setLocation(ranX3, ranY3);
				gpoly.setFillColor(rand);
				add(gpoly);
			
			}
		
		
	}

}
