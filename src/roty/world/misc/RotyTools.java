package roty.world.misc;

import java.awt.*;

// Class for storing globals and providing helper-functions
public final class RotyTools 
{	
	// Size of displayed World (Window)
	// (!!!) ToDo: Name is misleading
	private static Dimension worldsize;
	
	// Raster-size
	private static Dimension fieldsize;
	
	
	// Method for setting raster-size
	public static void setFieldSize(Dimension _fieldsize)
	{
		fieldsize = _fieldsize;
	}
	
	
	// Method for setting world-size (see above)
	public static void setWorldSize(Dimension _worldsize)
	{
		worldsize = _worldsize;
	}
	
	
	// Method for returning raster-size
	public static Dimension getFieldSize()
	{
		return fieldsize;
	}
	
	
	// Method for returning world-size (see above)
	public static Dimension getWorldSize()
	{
		return worldsize;
	}
	
	
	// Helper-method to check if an Object is still in the displayed area
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
