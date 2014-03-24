package roty.world.random;

// (!!!) ToDo: Need (good) way to add rules!

// Class for storing a rule for random world generation
public class RandomRule 
{
	// Size of the arrays
	private int size;
	
	// Possible outcomes
	private int[] possibilities;

	// Odds of the corresponding outcome
	private double[] odds;
	
	
	// Constructor without arguments: 
	// 1 possible outcome (default) with 100% chance
	public RandomRule()
	{
		size = 1;
		possibilities = new int[]{0};
		odds = new double[]{1.0};
	}
	
	
	// Constructor with possibilities-array as argument:
	// Chance evenly distributed
	public RandomRule(int[] _possibilities)
	{
		// Setting size (number of possibilities + default)
		size = _possibilities.length + 1;
		possibilities = new int[size];
		odds = new double[size];
		
		// Chance of every outcome (without default)
		double evenodd = 1.0 / (size - 1);
		
		// Setting everything (despite default)
		for(int i = 1; i < size; i++)
		{
			possibilities[i] = _possibilities[i - 1];
			odds[i] = evenodd;
		}
		
		// Setting default
		possibilities[0] = 0;
		odds[0] = 1.0 - (evenodd * (size - 1));	
	}
	
	
	// Constructor with both possibilities- and odds-array:
	// Using data + default option
	public RandomRule(int[] _possibilities, double[] _odds)
	{
		try
		{
			// Checking size of arrays: Equal?
			if(_possibilities.length == _odds.length)
			{
				// Setting size (number of possibilities + default)
				size = _possibilities.length + 1;
				possibilities = new int[size];
				odds = new double[size];
				
				// Sum of odds for calculating default chance
				double addedodds = 0.0;
				
				// Setting everything (despite default), 
				// after checks, adding up odds
				for(int i = 1; i < size; i++)
				{	
					// Checking if odd is negative (cause no good)
					if(_odds[i - 1] >= 0)
					{
						possibilities[i] = _possibilities[i - 1];
						odds[i] = _odds[i - 1];
						addedodds += _odds[i - 1];
					}
					else
					{
						// Throwing Exception if odd is negative
						// (!!!) ToDo: Define specific Exception
						throw new Exception();
					}
				}
				
				// Setting default
				possibilities[0] = 0;
				odds[0] = 1.0 - addedodds;
			}
			else
			{
				// Throwing Exception if sizes are not equal
				// (!!!) ToDo: Define specific Exception
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			// Catching all errors, setting Rule to 
			// 1 possible outcome (default) with 100% chance
			// (!!!) ToDo: Specific Error-Handling
			size = 1;
			possibilities = new int[]{0};
			odds = new double[]{1.0};
		}
		
	}
	
	
	// Method for returning size of the rule-arrays
	public int getSize()
	{
		return size;
	}
	
	
	// Method for returning the odds of a specific outcome
	public double getOddsByPos(int pos)
	{
		// Check if position exists
		if(pos >= 0 && pos < size)
		{
			return odds[pos];
		}
		
		// Return 0% as default
		return 0.0;
	}
	
	
	// Method for returning the outcome for a position
	public int getOutcomeByPos(int pos)
	{
		// Check if position exists
		if(pos >= 0 && pos < size)
		{
			return possibilities[pos];
		}
		
		// Return 0 as default
		return 0;
	}
	
}
