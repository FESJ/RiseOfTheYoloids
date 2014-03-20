package roty.world;
//import java.awt.*;
import roty.world.random.*;

public class Tile 
{
	private static int fieldsize = 24;
	
	private String[] farbtest;
	private double[] percents;
	private RandomRule randoms;
	private int counter;
	
	public Tile()
	{
		farbtest = new String[]{"red", "blue", "green"};
		percents = new double[]{0.25, 0.25, 0.5};
		randoms = new RandomRule(percents);
	}
	
	public String getTile()
	{
		counter = RandomNeighbor.getNeighborByRule(randoms);
		return farbtest[counter];
	}
}
