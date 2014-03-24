package roty.world;

import javax.swing.*;

import roty.world.misc.RotyTools;
import roty.world.random.*;

public class Field extends JLabel
{
	private static final long serialVersionUID = 7729473382316004096L;
	
	private RandomRule rule;

	public Field()
	{
		rule = new RandomRule(new int[]{0,1,2}, new double[]{0.1, 0.3, 0.6});
		this.setSize(RotyTools.getFieldSize());
	}
	
	public RandomRule getRule()
	{
		return rule;
	}
}
