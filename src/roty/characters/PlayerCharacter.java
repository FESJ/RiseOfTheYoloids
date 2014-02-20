package roty.characters;

import java.awt.Graphics;
import java.awt.event.*;
import roty.controls.actions.*;

import javax.swing.*;

public class PlayerCharacter extends JPanel implements ActionListener
{

	private static final long serialVersionUID = -7499253372209406900L;
	private int[] position = {100, 100};
	private Movement_Down down = new Movement_Down(this);
	private Movement_Left left = new Movement_Left();
	private Movement_Right right = new Movement_Right();
	private Movement_Up up = new Movement_Up();
	
	public PlayerCharacter()
	{
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

	public void actionPerformed(ActionEvent e) 
	{
	}
	public 
	
	public void paintComponent(Graphics g) 
	{
		   super.paintComponent(g);
		   // Assume x, y, and diameter are instance variables.
		   g.drawOval(getPosition()[0], getPosition()[1], 50, 50);
    }

	public int[] getPosition() 
	{
		return position;
	}

	public void changeYPosition(int y, int value)
	{
		this.position[y] = this.position[y] - value;
		repaint();
	}
	public void changeXPosition(int x, int value)
	{
		this.position[x] = this.position[x] - value;
		repaint();
	}
}
