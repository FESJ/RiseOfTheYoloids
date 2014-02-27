package roty.world;
import java.awt.*;
import roty.world.random.*;

public class Tile 
{
	private String[] farbtest;
	private double[] percents;
	private RandomRule randoms;
	private RandomNeighbor neighbor;
	private int counter;
	
	public Tile()
	{
		farbtest = new String[]{"red", "blue", "green"};
		percents = new double[]{0.25, 0.25, 0.5};
		randoms = new RandomRule(percents);
		neighbor = new RandomNeighbor();
	}
	
	public String getTile()
	{
		counter = neighbor.getNeighborByRule(randoms);
		return farbtest[counter];
	}
/*	public Tile getTile(Point cont)
	{
		return;
	}*/
}
