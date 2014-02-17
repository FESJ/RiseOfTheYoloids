package roty.controls.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import roty.world.random.*;

public class Movement_Down extends AbstractAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5767939625926727319L;
	/**
	 * 
	 */

	public Movement_Down()
	{

	}


	public void actionPerformed(ActionEvent e) 
	{
		RandomNeighbor karl = new RandomNeighbor();
		RandomRule steve = new RandomRule();
		
		JOptionPane.showMessageDialog(null, "Id: "+karl.getNeighborByRule(steve));

	}
}
