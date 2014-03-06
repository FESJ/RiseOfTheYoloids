// Work in Progress: NO

package roty;

import javax.swing.*;
import java.awt.*;

import roty.characters.*;
import roty.world.World;
import roty.world.misc.RotyTools;
//import roty.network.*;

public class RiseOfTheYoloids extends JFrame
{

	private static final long serialVersionUID = -1346330874443146866L;
	
	private JLayeredPane canvas;
	
	
	// Constructor
	public RiseOfTheYoloids() 
	{		
		super("Rise of the Yoloids");
		RotyTools.setWorldSize(new Dimension(768, 480));
		setSize(RotyTools.getWorldSize().width, RotyTools.getWorldSize().height);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		canvas = new JLayeredPane();
		
		World world = new World();
		world.setColor(Color.RED);
		world.setSize(768, 480);
		
		PlayerCharacter jim = new PlayerCharacter();
		
		this.add(canvas);
		canvas.add(world);
		canvas.add(jim);
		canvas.moveToFront(jim);
		
		
		
	}
	
	//public void startGame(){}		

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RiseOfTheYoloids game = new RiseOfTheYoloids();
		
		game.setVisible(true);		
	}
}

