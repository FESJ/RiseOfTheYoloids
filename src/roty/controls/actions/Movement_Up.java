package roty.controls.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import roty.characters.*;

public class Movement_Up extends AbstractAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5767939625926727319L;
	/**
	 * 
	 */
	private PlayerCharacter container;


	public Movement_Up(PlayerCharacter x)
	{

	}


	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(null, "Tastencode:OBEN");

	}
}
