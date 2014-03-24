package roty.world.random;

import java.lang.Math;

// Class for Functions regarding randomizing the world
public final class RandomNeighbor {
	
	
	// Get the ID of a tile/field by a given rule
	public static int getByRule(RandomRule rule)
	{
		// Roll between 0 and 1
		double roll = Math.random();
		
		// Subtracting down to find resulting field/tile
		for(int i=0; i<rule.getSize(); i++)
		{
			roll -= rule.getOddsByPos(i);
			
			if(roll < 0.0)
			{
				return rule.getOutcomeByPos(i);
			}
		}
			
		// If no field/tile found, return default
		return 0;
	}
}
