package roty.world.random;

public class RandomRule 
{
	private int size;
	private int[] id;
	private double[] odds;
	
	public RandomRule()
	{
		size = 3;
		id = new int[]{0, 1, 2};
		odds = new double[]{0.1, 0.1, 0.8};
	}	
	
	public int getSize()
	{
		return size;
	}
	
	public int getIdByPosition(int pos)
	{
		return id[pos];
	}
	
	public double getOddsByPos(int pos)
	{
		return odds[pos];
	}
	
}
