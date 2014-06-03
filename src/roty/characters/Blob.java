package roty.characters;

import java.awt.Dimension;
import java.awt.Point;
import java.math.*;
import java.util.Timer;
import java.util.TimerTask;

import roty.controls.actions.*;
import roty.world.misc.RotyTools;

import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

import roty.world.misc.*;

public class Blob extends JLabel implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2772659055665476325L;

	private Point position = new Point(0, 0);
	private Dimension size = new Dimension(20, 20);
	private int dir;
	private int movement = 20;
	public Blob()
	{
		Timer time = new Timer();
		time.scheduleAtFixedRate(new TimerTask()
		{
			public void run()
			{
				dir = myRandom(1,5);
				if (dir == 1)
					changeXPosition(movement);
				if (dir == 2)
					changeXPosition(-movement);
				if (dir == 3)
					changeYPosition(movement);
				if (dir == 4)
					changeYPosition(-movement);
				
			}
		}, 0, 100 * 1);
	}
	public Point getPosition() 
	{
		return position;
	}
	public Dimension getDim()
	{
		return size;
	}
	public void paintComponent(Graphics g) 
	{
		   super.paintComponent(g);
		   // Assume x, y, and diameter are instance variables.
		   g.drawOval(position.x, position.y, size.width, size.height);
    }
	public static int myRandom(int low, int high) 
	{
		return (int) (Math.random() * (high - low) + low);
	}
	public void changeYPosition(int value)
	{
		if(RotyTools.isOutOfBounds(new Point(position.x,position.y+value), size) == false)
			position.y = position.y + value;
		else if (position.y <= 0)
			position.y = RotyTools.getWorldSize().height+(value);
		else
			position.y = 0;
		
		this.setLocation(position);
		repaint();
	}
	public void changeXPosition(int value)
	{
		if(RotyTools.isOutOfBounds(new Point(position.x+value,position.y), size) == false)
			position.x = position.x + value;
		else if (position.x <= 0)
			position.x = RotyTools.getWorldSize().width+(value);
		else
			position.x = 0;
			
		this.setLocation(position);
		repaint();
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
