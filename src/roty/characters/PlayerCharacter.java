package roty.characters;

import java.awt.Graphics;
import java.awt.event.*;
import roty.controls.actions.*;

import javax.swing.*;

public class PlayerCharacter extends JPanel implements ActionListener
{

	private static final long serialVersionUID = -7499253372209406900L;
	private int[] position = {100, 100};
	private Movement_Down down = new Movement_Down();
	private Movement_Left left = new Movement_Left();
	private Movement_Right right = new Movement_Right();
	private Movement_Up up = new Movement_Up();
	
	public PlayerCharacter()
	{
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
		JOptionPane.showMessageDialog(null, "Tastencode:Kartoffel");
		repaint();
	}
	
	public void paintComponent(Graphics g) 
	{
		   super.paintComponent(g);
		   // Assume x, y, and diameter are instance variables.
		   g.drawOval(position[0], position[1], 50, 50);
    }
}
