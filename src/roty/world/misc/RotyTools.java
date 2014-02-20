package roty.world.misc;

import java.awt.*;

public class RotyTools 
{
	private static Dimension worldsize;
	
	public RotyTools(){}
	
	public static void setWorldSize(Dimension _worldsize)
	{
		worldsize = _worldsize;
	}
	
	public static Dimension getWorldSize()
	{
		return worldsize;
	}
	
	public static boolean isOutOfBounds(Point pos, Dimension dim)
	{	
		if(pos.x >= 0 
		&& pos.y >= 0 
		&& pos.x + dim.width <= worldsize.width 
		&& pos.y + dim.height <= worldsize.height)
						return false;
		
		return true;
	}
	
}
