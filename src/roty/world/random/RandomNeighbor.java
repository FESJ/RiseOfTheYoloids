package roty.world.random;

import java.lang.Math;

public class RandomNeighbor {

	public RandomNeighbor(){}
	
	public static int getNeighborByRule(RandomRule rule)
	{
		double roll = Math.random();
		
		for(int i=0; i<rule.getSize(); i++)
		{
			roll -= rule.getOddsByPos(i);
			
			if(roll < 0.0)
			{
				return i;
			}
		}
		
		
		return -1;
	}	
}
