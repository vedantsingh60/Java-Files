
import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import javax.swing.JMenu;

import javax.swing.JMenuBar;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

import javax.swing.JPanel;
/**
 * CheckerGame class
 * @author singhva
 *
 */
public class CheckerGame extends JFrame implements ActionListener {

	CheckerBoard checkerBoard;
	public CheckerGame() {
		setLayout(new BorderLayout());
		checkerBoard = new CheckerBoard();
		add(checkerBoard, BorderLayout.CENTER);
		JMenuBar menuBar = new JMenuBar();
		JMenu menuOptions = new JMenu("Game");
		JMenuItem newGame = new JMenuItem("New");
		newGame.addActionListener(this);
		newGame.setActionCommand("New");
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(this);
		exit.setActionCommand("EXIT");
		menuOptions.add(newGame);
		menuOptions.add(exit);
		menuBar.add(menuOptions);
		JMenu menuOption2 = new JMenu("Help");
		JMenuItem rules = new JMenuItem("Checker Game Rules");
		rules.addActionListener(this);
		rules.setActionCommand("Checker Game Rules");
		JMenuItem gameInfo = new JMenuItem("About Checker Game App");
		gameInfo.addActionListener(this);
		menuOption2.add(rules);
		menuOption2.add(gameInfo);
		menuBar.add(menuOption2);
		add(menuBar, BorderLayout.NORTH);
		JPanel gameStatus = new JPanel(new GridLayout(2, 0));
		JLabel label = new JLabel(checkerBoard.gameStatus(), JLabel.CENTER);
	    gameStatus.add(label);
		gameStatus.add(new JLabel("This game was developed by Vedant Singh", JLabel.CENTER));
		add(gameStatus,BorderLayout.SOUTH);

	} 
	
	@Override
	public void actionPerformed(ActionEvent evt) {
        if ("EXIT".equals(evt.getActionCommand())) System.exit(NORMAL);
        if ("New".equals(evt.getActionCommand())) {
        	checkerBoard.repaint();
        }
        if ("Checker Game Rules".equals(evt.getActionCommand())) {
        	String text = "Here's a link to the Rules: https://www.wikihow.com/Play-Checkers";
            JOptionPane.showMessageDialog(null, text);
        }
        if ("About Checker Game App".equals(evt.getActionCommand())) {
        	String str = " Vedant Singh \n singhva@miamioh.edu \n Miami University";
            JOptionPane.showMessageDialog(null, str);

        }
	}

	public static void main(String[] args) {
		CheckerBoard c = new CheckerBoard();
		c.gameStatus();
		CheckerGame game = new CheckerGame();
		game.setSize(505, 585);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setVisible(true);
	}
}