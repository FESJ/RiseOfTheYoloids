package roty.characters;

import java.awt.Graphics;
import java.awt.event.*;
import roty.controls.actions.*;
import java.awt.*;
import javax.swing.*;
import roty.world.misc.*;

public class PlayerCharacter extends JLabel implements ActionListener
{

	private static final long serialVersionUID = -7499253372209406900L;
	private Point position = new Point(0, 0);
	private Dimension size = new Dimension(20, 20);
	private Movement_Down down = new Movement_Down(this);
	private Movement_Left left = new Movement_Left(this);
	private Movement_Right right = new Movement_Right(this);
	private Movement_Up up = new Movement_Up(this);
	private ImageIcon icon = returnIcon("down");
	public PlayerCharacter()
	{
		this.setSize(20, 20);
		if (icon == null)
		{
			this.setOpaque(true);
			this.setBackground(Color.BLACK);
			this.setLocation(position);
		}
		else
		{
		this.setIcon(icon);
		}
		//Mapping movement actions to corresponding keys. 
		this.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "down");
	 	this.getActionMap().put("down", down);
		this.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "left");
	 	this.getActionMap().put("left", left);
		this.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "right");
	 	this.getActionMap().put("right", right);
		this.getInputMap().put(KeyStroke.getKeyStroke("UP"), "up");
	 	this.getActionMap().put("up", up);
	}
	private ImageIcon returnIcon(String direction)
	{
		try
		{
			java.net.URL imgURL = PlayerCharacter.class.getResource("images/guys_01_"+direction+".png");
			
			if (imgURL != null)
	        {
	            return new ImageIcon(imgURL);
	        } 
	        else 
	        {
	            return null;
	        }
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return null;		
    }
	
	public void actionPerformed(ActionEvent e) 
	{
	}
	
	public void paintComponent(Graphics g) 
	{
		   super.paintComponent(g);
		   // Assume x, y, and diameter are instance variables.
		   //g.drawOval(position.x, position.y, size.width, size.height);
    }

	public Point getPosition() 
	{
		return position;
	}
	public Dimension getDim()
	{
		return size;
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
}
