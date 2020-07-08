import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
/**
 * Class to print emoticons using JComponent  
 * @author singhva
 *
 */

public class Emoticon extends JFrame {

	/**
	 * Constructor to to intialize the frame
	 */
	public 	Emoticon() {
		setSize(1000, 600);
		setTitle("Emoticon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DrawingCanvas drawing = new DrawingCanvas();
		add(drawing);
		
	}
	
	/**
	 * 
	 *Hidden class to draw the emoticons by overloading paintComponent 
	 */
	class DrawingCanvas extends JComponent{
	
		 /**
		  * Overriding paint Component Method and using methods to draw shapes
		  */
		public void paintComponent(Graphics g) {
			char  status = 'r';
			int row =0;
			int column =0;
			/*g.setColor(Color.YELLOW);
			g.fillOval(0, 0, 200, 180);
			g.fillOval(205, 0, 200, 180);
			g.fillOval(420, 0, 200, 180);
			g.fillOval(650, 0, 200, 180);

			g.setColor(Color.BLUE);
			g.fillOval(40, 45, 30, 30);
			g.fillOval(130, 45, 30, 30);
			
			g.fillOval(245, 45, 30, 30);
			g.fillOval(90+245, 45, 30, 30);

			g.fillOval(460, 45, 30, 30);
			g.fillOval(90+460, 45, 30, 30);

			g.fillOval(690, 45, 30, 30);
			g.drawLine(90+690, 60, 120+690, 60);
			
			g.setColor(Color.RED);
			g.drawArc(65, 90, 70, 40, 180, 180);
			g.drawArc(265, 100, 70, 40, 0, 180);			
			g.drawArc(500, 100, 40, 35, 0, 360);			
			g.drawArc(650+65, 90, 70, 40, 180, 180);
			*/
			if (status == 'e' && !rowColumnHelper(row, column)) {
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, 60, 60);
			}
			if (status == 'e' && rowColumnHelper(row, column)) {
				g.setColor(Color.GREEN);
				g.fillRect(0, 0, 60, 60);
			}
			if (status == 'r') {
				g.setColor(Color.GREEN);
				g.fillRect(0, 0, 60, 60);
				g.setColor(Color.RED);
				g.fillOval(10,10,40,40);
				}
			else if (status == 'b' ) {
				g.setColor(Color.GREEN);
				g.fillRect(0, 0, 60, 60);
				g.setColor(Color.BLACK);
				g.fillOval(10,10,40,40);
			}		
		}
	}
	
public static boolean rowColumnHelper(int r, int c) {
	if ((r%2 == 0 && c%2!=0) || (c%2 == 0 && r%2!=0)) return true;
	else return false;
}

	/**
	 * main method to run program
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emoticon f= new Emoticon();
		f.setVisible(true);
	}

}
