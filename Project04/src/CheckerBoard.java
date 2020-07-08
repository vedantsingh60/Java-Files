import java.awt.GridLayout;
import java.awt.*;
import javax.swing.JPanel;
/**
 * Class checker board to generate the board for the game
 * @author singhva
 *
 */
public class CheckerBoard extends JPanel {
	//instance variables
	int row=8;
	int column=8;
	private char[][] boardStatus = new char[][] {
		{'e','b','e','b','e','b','e','b'},
		{'b','e','b','e','b','e','b','e'},
		{'e','b','e','b','e','b','e','b'},
		{'e','e','e','e','e','e','e','e'},
		{'e','e','e','e','e','e','e','e'},
		{'r','e','r','e','r','e','r','e'},
		{'e','r','e','r','e','r','e','r'},
		{'r','e','r','e','r','e','r','e'}
	};
	/**
	 * Sets the checkerboard after passing the array
	 */
	public CheckerBoard() {
		setLayout(new GridLayout(8,8));
		CheckerPiece piece;
		for (int i=0;i<row;i++) {
			for (int j=0; j<8;j++) {
				piece=new CheckerPiece(boardStatus[i][j],i,j);
				add(piece,i*row+j);
			}
		}
	}
	
	public void setBoardStatus(char[][] boardStatus) {
		this.boardStatus=boardStatus;
		CheckerBoard cb = new CheckerBoard();
		cb.repaint();
	}
	/**
	 * Method to display the game status as the game is being played
	 * @return the count of the red and black checkers left
	 */
	public String gameStatus() {
		int redCount, blackCount;
		redCount = blackCount = 0;
		for (int i=0; i<row;i++) {
			for(int j =0; j<column; j++) {
				if (boardStatus[i][j]=='r')redCount++;
				if(boardStatus[i][j]=='b')blackCount++;
			}
		}
		return "Red : " + redCount + " Black: " +blackCount;
	}
	public void setCheckerPiece(char status, int row, int column) {
		status = boardStatus[row][column];
		CheckerPiece piece = new CheckerPiece(status, row, column);
		piece.repaint();		
	}	
	
}
