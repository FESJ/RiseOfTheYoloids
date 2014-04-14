// Work in Progress: NO

package roty;

import javax.swing.*;
import java.awt.*;

import roty.characters.*;
import roty.world.*;
import roty.world.misc.RotyTools;
import roty.network.*;

public class RiseOfTheYoloids extends JFrame
{

	private static final long serialVersionUID = -1346330874443146866L;
	
	private String 	dbserver	= "remote-mysql3.servage.net", 
					dbname		= "felixvansjoe", 
					dbuser		= "felixvansjoe", 
					dbpass		= "xchat2013";
	
	private JLayeredPane canvas;
	
	
	// Constructor
	public RiseOfTheYoloids() 
	{	
		// Setting Name
		super("Rise of the Yoloids");
		
		// Connect to DB
		try
		{ 
			Database db = new Database(dbserver, dbname, dbuser, dbpass);
			db.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		// Setting Size
		RotyTools.setWorldSize(new Dimension(800, 600));
		RotyTools.setFieldSize(new Dimension(20, 20));
		this.getContentPane().setPreferredSize(RotyTools.getWorldSize());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Creating Canvas
		canvas = new JLayeredPane();
		canvas.setSize(RotyTools.getWorldSize());
		
		// Creating World
		World world = new World();
		world.setColor(Color.RED);
		world.setSize(RotyTools.getWorldSize());
		
		Tile tile = new Tile();
		
		// Creating Player
		PlayerCharacter jim = new PlayerCharacter();
		
		// Adding all to the Canvas
		this.add(canvas);
		canvas.add(world);
		world.add(tile);
		canvas.add(jim);
		//canvas.moveToFront(tile);
		canvas.moveToFront(jim);
		
		// And show it!
		this.setVisible(true);
		this.pack();
	}
	
	//public void startGame(){}		

	public static void main(String[] args) 
	{		
		// TODO Auto-generated method stub
		new RiseOfTheYoloids();			
	}
}

