import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
/**
 * Checker piece class 
 * @author singhva
 *
 */
public class CheckerPiece extends JComponent{
	//instance variables
	char status;
	int row, column;
	
	/**
	 * To initialize the status, row and count for a single checker piece
	 * @param status status of the checkerpiece
	 * @param row row to be placed
	 * @param column column to be placed
	 */
	public CheckerPiece(char status, int row, int column){
		if (status == 'r' || status == 'e' || status == 'b' ) this.status = status;
		else throw new IllegalArgumentException ("Only r,e, or b accepted! ");
		if (row <= 7 && row >= 0) this.row=row;
		else throw new IllegalArgumentException ("Rows need to be within 0 and 7 !");
		if (column <= 7 && column >= 0) this.column=column;
		else throw new IllegalArgumentException ("Columns need to be within 0 and 7 !");
		if ((status == 'r' || status=='b') && (!rowColumnHelper(row, column))) throw new IllegalArgumentException ("Red and Black cannot be placed on white squares");
	}
		
	/**
	 * It checks for white empty spaces
	 * @param r row 
	 * @param c column
	 * @return return false if empty, true if not
	 */
	public static boolean rowColumnHelper(int r, int c) {
		if ((r%2 == 0 && c%2!=0) || (c%2 == 0 && r%2!=0)) return true;
		else return false;
	}

	@Override 
	public void paintComponent(Graphics g) {
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
