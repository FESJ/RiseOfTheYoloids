package roty.controls.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import roty.characters.*;

public class Movement_Right extends AbstractAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5767939625926727319L;
	/**
	 * 
	 */
	private PlayerCharacter container;
	private int movement;
	
	public Movement_Right(PlayerCharacter x)
	{
		container = x;
		movement = container.getDim().width;
	}


	public void actionPerformed(ActionEvent e) 
	{
		container.changeXPosition(movement);
	}
}
