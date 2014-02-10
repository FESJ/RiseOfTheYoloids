// Work in Progress: NO

package roty;

import java.awt.event.*;
import javax.swing.*;

import roty.characters.*;

public class RiseOfTheYoloids extends JFrame implements KeyListener 
{

	private static final long serialVersionUID = -1346330874443146866L;
	
	// Constructor
	public RiseOfTheYoloids() 
	{		
		super("Rise of the Yoloids");
	
		this.addKeyListener(this);
		
		setSize(768, 480);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	public void keyTyped(KeyEvent e) {}
	
	public void keyPressed(KeyEvent e) 
	{
		JOptionPane.showMessageDialog(null, "Tastencode: "+e.getKeyCode());
	}
	
	public void keyReleased(KeyEvent e) {}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RiseOfTheYoloids game = new RiseOfTheYoloids();
		PlayerCharacter jim = new PlayerCharacter();
		game.add(jim);
		game.setVisible(true);
		
	}
}

