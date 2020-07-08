import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
	
	 /**
	  * A class to create 3 buttons and change the background color
	  * @author singhva
	  *
	  */
	 @SuppressWarnings("serial")
 public class ColorFrame extends JFrame implements ActionListener {
	     //instance variables 
		 JButton r, g, b;
	/**
	 *  Default Constructor to initialize values and create a frame
	 */
  public ColorFrame() {
	         setSize(300,200 );
	         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         setLayout(new FlowLayout());
	         r = new JButton("Red");
	         add(r);
	         g = new JButton("Green");
	         add(g);
	         b = new JButton("Blue");
	         add(b);
		     r.addActionListener(this);
	         g.addActionListener(this);
	         b.addActionListener(this);
	  	 }
 
  	/**
  	 * Method overriding ActionPerformed method
  	 */
     @Override
	 public void actionPerformed(ActionEvent e) {
		 if (e.getActionCommand().equals("Red")) {
		 getContentPane().setBackground(Color.RED);
		 }
		 if (e.getActionCommand().equals("Green")) {
		 getContentPane().setBackground(Color.GREEN);
		 }
		 if (e.getActionCommand().equals("Blue")) {
		 getContentPane().setBackground(Color.BLUE);
		 }
		 }
	 
	 public static void main(String[] arg) {
	         ColorFrame c = new ColorFrame();
	         c.setVisible(true);
	 }
 }