// Work in Progress: NO

package roty;

import javax.swing.*;
import java.awt.*;
import roty.characters.*;
//import roty.world.*;

import roty.world.misc.RotyTools;

public class RiseOfTheYoloids extends JFrame
{

	private static final long serialVersionUID = -1346330874443146866L;
	
	// Constructor
	public RiseOfTheYoloids() 
	{		
		super("Rise of the Yoloids");
		RotyTools.setWorldSize(new Dimension(768, 480));
		setSize(RotyTools.getWorldSize().width, RotyTools.getWorldSize().height);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.red);
		this.setForeground(Color.blue);
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

