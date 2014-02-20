package roty.controls.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import roty.world.random.*;
import roty.characters.*;

public class Movement_Down extends AbstractAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5767939625926727319L;
	private PlayerCharacter container;
	
	/**
	 * 
	 */

	public Movement_Down(PlayerCharacter x)
	{
		container = x;
		
	}


	public void actionPerformed(ActionEvent e) 
	{
		container.changeYPosition(-50);
	}
}
