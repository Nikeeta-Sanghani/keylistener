/*
 * Very important key typed always gives your keychar so only char 
 * if you want to use code you have to use keypressed event
 * in following program you can comment icon and uncomment label back ground and opaque lines you would see
 * a square moving around response to your keys with changing colors
 * 
 */
package keylistener;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class myframe implements KeyListener{
    
    JFrame frame;
    JLabel label;
    ImageIcon icon;
    myframe(){
	//icon = new ImageIcon("rocket.png");
	frame=new JFrame("KeyListner Demo");
	frame.setSize(800,800);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	frame.setVisible(true);
	label=new JLabel();
	frame.getContentPane().setBackground(Color.BLACK );
	label.setIcon(icon);
	label.setBackground(Color.RED);
	label.setOpaque(true);
	label.setBounds(0,0,350,350);
	
	frame.add(label);
	
	frame.addKeyListener(this);
    }
    
    @Override
    // gives key char of the key typed
    public void keyTyped(KeyEvent e) {

    }

    @Override
    // gives key code which is int number representing the key which is pressed
    public void keyPressed(KeyEvent e) {
	
	switch (e.getKeyCode())
	{
	
	case KeyEvent.VK_UP:

	   label.setLocation(label.getX(), label.getY()-5);
	   label.setBackground(Color.BLUE);
	   break;
	case KeyEvent.VK_DOWN:
	    label.setLocation(label.getX(), label.getY()+5);
	    label.setBackground(Color.GREEN);
	    break;
	case KeyEvent.VK_LEFT:
	    label.setLocation(label.getX()-5, label.getY());
	    label.setBackground(Color.YELLOW);
	    break;
	case KeyEvent.VK_RIGHT:   
	    label.setLocation(label.getX()+5, label.getY());
	    label.setBackground(Color.PINK);
	    break;
	}
    }

    @Override
    public void keyReleased(KeyEvent e) {
	//System.out.println("You Released a Key \"Char" +"   "+e.getKeyChar()+"    "+ "KeyCode is "+ "   "+e.getKeyCode() );
	
    }
    }
