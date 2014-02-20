package roty.controls.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import roty.characters.*;

public class Movement_Down extends AbstractAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5767939625926727319L;
	private PlayerCharacter container;
	private int movement;
	
	/**
	 * 
	 */

	public Movement_Down(PlayerCharacter x)
	{
		container = x;
		movement = container.getDim()[0];
	}


	public void actionPerformed(ActionEvent e) 
	{
		container.changeYPosition(-movement);
	}
}
