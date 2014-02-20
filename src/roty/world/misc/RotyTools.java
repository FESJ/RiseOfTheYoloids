package roty.world.misc;

import java.awt.*;

public class RotyTools 
{
	public RotyTools(){}
	
	public static boolean isOutOfBounds(Point pos, Dimension dim, Dimension boundaries)
	{	
		if(pos.x >= 0 
		&& pos.y >= 0 
		&& pos.x + dim.width <= boundaries.width 
		&& pos.y + dim.height <= boundaries.height)
						return true;
		
		return false;
	}
	
}
