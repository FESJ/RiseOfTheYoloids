package roty.world.random;

public class RandomRule 
{
	private int size;
	private double[] odds;
	
	public RandomRule()
	{
		size = 3;
		odds = new double[]{0.1, 0.1, 0.8};
	}	
	public RandomRule(double[] y)
	{
		try
		{
			setOdds(y);
		}
		catch (Exception e)
		{
			
		}
	}
	private void setOdds(double[] x) throws Exception
	{
		try
		{
			int tester = 0;
			for(int i=0; i<odds.length; i++)
			{
				if(x[i] < 0)
					throw new Exception();
				tester += x[i];
			}
			if(tester != 1)
				throw new Exception();
		}
		catch (Exception e)
		{
			// Odds are not adding up to 100% or a negative Odd
		}
		odds = x;
		size = odds.length;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public double getOddsByPos(int pos)
	{
		return odds[pos];
	}
	
}
