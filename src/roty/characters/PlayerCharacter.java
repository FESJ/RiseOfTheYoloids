package roty.characters;

import java.awt.Graphics;
import java.awt.event.*;


import javax.swing.*;

public class PlayerCharacter extends JPanel implements ActionListener
{

	private static final long serialVersionUID = -7499253372209406900L;
	private int[] position = {100, 100};

	public PlayerCharacter(){}

	public void actionPerformed(ActionEvent e) 
	{
		repaint();
	}
	
	public void paintComponent(Graphics g) 
	{
		   super.paintComponent(g);
		   // Assume x, y, and diameter are instance variables.
		   g.drawOval(position[0], position[1], 50, 50);
    }
}
