// Work in Progress: NO

package roty;

import javax.swing.*;

import roty.characters.*;

public class RiseOfTheYoloids extends JFrame
{

	private static final long serialVersionUID = -1346330874443146866L;
	
	// Constructor
	public RiseOfTheYoloids() 
	{		
		super("Rise of the Yoloids");
		
		setSize(768, 480);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RiseOfTheYoloids game = new RiseOfTheYoloids();
		PlayerCharacter jim = new PlayerCharacter();
		game.add(jim);
		game.setVisible(true);
		
	}
}

