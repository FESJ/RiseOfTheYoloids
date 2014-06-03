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
	private int movement;
	private UP_ARROW_ACTION upActionInstance=new UP_ARROW_ACTION();
	private UP_ARROW_RELEASED_ACTION upReleasedActionInstance=new UP_ARROW_RELEASED_ACTION();
	private DOWN_ARROW_ACTION downActionInstance=new DOWN_ARROW_ACTION();
	private DOWN_ARROW_RELEASED_ACTION downReleasedActionInstance=new DOWN_ARROW_RELEASED_ACTION();
	private LEFT_ARROW_ACTION leftActionInstance=new LEFT_ARROW_ACTION();
	private LEFT_ARROW_RELEASED_ACTION leftReleasedActionInstance=new LEFT_ARROW_RELEASED_ACTION();
	private RIGHT_ARROW_ACTION rightActionInstance=new RIGHT_ARROW_ACTION();
	private RIGHT_ARROW_RELEASED_ACTION rightReleasedActionInstance=new RIGHT_ARROW_RELEASED_ACTION();
	private boolean UP_ARROW_KEY, DOWN_ARROW_KEY, LEFT_ARROW_KEY, RIGHT_ARROW_KEY;
	private ImageIcon icon = returnIcon("down");
	
	public PlayerCharacter()
	{
		this.setSize(20, 20);
		movement = 20;
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
		/* this.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "down");
	 	this.getActionMap().put("down", down);
		this.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "left");
	 	this.getActionMap().put("left", left);
		this.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "right");
	 	this.getActionMap().put("right", right);
		this.getInputMap().put(KeyStroke.getKeyStroke("UP"), "up");
	 	this.getActionMap().put("up", up); */
		this.getInputMap().put(KeyStroke.getKeyStroke("UP"),"up pressed");
		this.getActionMap().put("up pressed",upActionInstance);
		this.getInputMap().put(KeyStroke.getKeyStroke("released UP"),"up released");
		this.getActionMap().put("up released",upReleasedActionInstance);
		this.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"down pressed");
		this.getActionMap().put("down pressed",downActionInstance);
		this.getInputMap().put(KeyStroke.getKeyStroke("released DOWN"),"down released");
		this.getActionMap().put("down released",downReleasedActionInstance);
		this.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"left pressed");
		this.getActionMap().put("left pressed",leftActionInstance);
		this.getInputMap().put(KeyStroke.getKeyStroke("released LEFT"),"left released");
		this.getActionMap().put("left released",leftReleasedActionInstance);
		this.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"right pressed");
		this.getActionMap().put("right pressed",rightActionInstance);
		this.getInputMap().put(KeyStroke.getKeyStroke("released RIGHT"),"right released");
		this.getActionMap().put("right released",rightReleasedActionInstance);
		
		
	}
	public class UP_ARROW_ACTION extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = -8729359793324607118L;

		public void actionPerformed(ActionEvent e){UP_ARROW_KEY=true;}}
	
	public class UP_ARROW_RELEASED_ACTION extends AbstractAction {
		/**
			 * 
			 */
			private static final long serialVersionUID = 6600346627168112358L;

		public void actionPerformed(ActionEvent e){UP_ARROW_KEY=false;}}
		 
	public class DOWN_ARROW_ACTION extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e){DOWN_ARROW_KEY=true;}}
		 
	public class DOWN_ARROW_RELEASED_ACTION extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e){DOWN_ARROW_KEY=false;}}
		 
	public class RIGHT_ARROW_ACTION extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e){RIGHT_ARROW_KEY=true;}}
		 
	public class RIGHT_ARROW_RELEASED_ACTION extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e){RIGHT_ARROW_KEY=false;}}
		 
	public class LEFT_ARROW_ACTION extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e){LEFT_ARROW_KEY=true;}}
		 
	public class LEFT_ARROW_RELEASED_ACTION extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e){LEFT_ARROW_KEY=false;}}
	
	private ImageIcon returnIcon(String direction)
	{
		try
		{
			java.net.URL imgURL = PlayerCharacter.class.getResource("../images/guy_01_"+direction+".png");
			
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
	private void resetIcon(String cont)
	{
		this.setIcon(returnIcon(cont));
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
	public void refresh()
	{
		String dir;
		if (UP_ARROW_KEY)
		{
			if (RIGHT_ARROW_KEY)
			{
				dir = "right";
				changeXPosition(movement,dir);
				changeYPosition(-movement,dir);

			}
			else if (LEFT_ARROW_KEY)
			{
				dir = "left";
				changeXPosition(-movement,dir);
				changeYPosition(-movement,dir);
			}
			else
			{
				dir = "up";
				changeYPosition(-movement,dir);
			}
		}
		else if (DOWN_ARROW_KEY)
		{
			if (RIGHT_ARROW_KEY)
			{
				dir = "right";
				changeXPosition(movement,dir);
				changeYPosition(movement,dir);

			}
			else if (LEFT_ARROW_KEY)
			{
				dir = "left";
				changeXPosition(-movement,dir);
				changeYPosition(movement,dir);
			}
			else
			{	
				dir = "down";
				changeYPosition(movement,dir);
			}

		}
		
		else if (RIGHT_ARROW_KEY)
		{
			dir = "right";
			changeXPosition(movement,dir);

		}
		else if (LEFT_ARROW_KEY)
		{
			dir = "left";
			changeXPosition(-movement,dir);
		}
		
		
	}

	public void changeYPosition(int value, String direction)
	{
		resetIcon(direction);
		if(RotyTools.isOutOfBounds(new Point(position.x,position.y+value), size) == false)
			position.y = position.y + value;
		else if (position.y <= 0)
			position.y = RotyTools.getWorldSize().height+(value);
		else
			position.y = 0;
		
		this.setLocation(position);
		repaint();
	}
	public void changeXPosition(int value, String direction)
	{
		resetIcon(direction);
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
