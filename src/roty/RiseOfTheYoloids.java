// Work in Progress: NO

package roty;

import javax.swing.*;

import java.awt.*;
import java.sql.ResultSet;


//import roty.world.*;
import roty.characters.*;
import roty.world.World;
import roty.world.misc.RotyTools;
import roty.network.*;

public class RiseOfTheYoloids extends JFrame
{

	private static final long serialVersionUID = -1346330874443146866L;
	private static World world = new World();
	// Constructor
	public RiseOfTheYoloids() 
	{		
		super("Rise of the Yoloids");
		RotyTools.setWorldSize(new Dimension(768, 480));
		setSize(RotyTools.getWorldSize().width, RotyTools.getWorldSize().height);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		world.SetColor(Color.RED);
		world.setSize(768, 480);
		this.add(world);
	}
		

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RiseOfTheYoloids game = new RiseOfTheYoloids();
		PlayerCharacter jim = new PlayerCharacter();
		world.add(jim);
		game.add(world);
		game.setVisible(true);
		
		try
		{
			Database dbtest = new Database("mysql://db516614999.db.1and1.com", "dbo516614999", "RotY_2013");
			dbtest.executeQuery("Select * FROM 'Test'");
			ResultSet dbtestresult = dbtest.getResult();
			
			while(dbtestresult.next())
			{
				System.out.println("blubb: " + dbtestresult.getString("1") + " - " + dbtestresult.getString("2") + " - " + dbtestresult.getString("3"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}		
	}
}

