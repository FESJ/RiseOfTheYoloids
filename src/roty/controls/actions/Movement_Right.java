package roty.controls.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

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

	public Movement_Right(PlayerCharacter x)
	{

	}


	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(null, "Tastencode:RECHTS");

	}
}
