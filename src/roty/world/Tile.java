package roty.world;
import java.awt.Dimension;

import roty.world.misc.RotyTools;
import javax.swing.*;
import roty.world.random.*;

public class Tile extends JPanel
{
	private static final long serialVersionUID = -2857954614992719831L;

	private Dimension raster;
	private Field[][] fields;
	
	public Tile()
	{
		raster.width = RotyTools.getWorldSize().width / RotyTools.getFieldSize().width;
		raster.height = RotyTools.getWorldSize().height / RotyTools.getFieldSize().height;
		fields = new Field[raster.width][raster.height];
		
	}
	
/*	private int fieldsize = 24;
	private int 	dimx = RotyTools.getWorldSize().width/fieldsize,
					dimy = RotyTools.getWorldSize().height/fieldsize;
	
	
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
*/
}
