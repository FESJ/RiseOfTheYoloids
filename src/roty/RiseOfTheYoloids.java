// Work in Progress: NO

package roty;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RiseOfTheYoloids extends JFrame implements KeyListener 
{

	// Constructor
	public RiseOfTheYoloids() 
	{		
		super("Rise of the Yoloids");
		
		this.addKeyListener(this);
		
		setSize(768, 480);
		setVisible(true);
	
	}
		
	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {
		JOptionPane.showMessageDialog(null, "Tastencode: "+e.getKeyCode());
	}
	public void keyReleased(KeyEvent e) {}
	/**
	 * vfvfdv
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RiseOfTheYoloids();
	}
}

