import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class MyWindow extends JFrame{

	/**
	 * singhva
	 */
	public MyWindow() {
		super("Sign in - XYZ System");
		JPanel panel = new JPanel ();
		panel.setLayout(new GridLayout(3,1));
		
		JPanel firstPanel = new JPanel();
		JLabel label = new JLabel("XYZ System", JLabel.CENTER);
		label.setPreferredSize(new Dimension(400,80));
		firstPanel.add(label);
		firstPanel.setBorder(new EtchedBorder());
		
		JPanel secondPanel = new JPanel();
		secondPanel.setLayout(new GridLayout(2,2));
		JLabel userName = new JLabel("Username: ");
		JLabel password = new JLabel ("Password: ");
		JTextField user = new JTextField("Enter your username");
		JTextField pass = new JTextField("Enter your password");
		secondPanel.setBorder(new TitledBorder(new EtchedBorder(), "Sign in to your account"));
		secondPanel.add(userName,0);
		secondPanel.add(user, 1);
		secondPanel.add(password,2);
		secondPanel.add(pass,3);
		
		JPanel thirdPanel = new JPanel();
		JButton button1 = new JButton("Sign in");
		JButton button2 = new JButton("Forgot username/password");
		thirdPanel.setLayout(new FlowLayout());
		thirdPanel.setMaximumSize(new Dimension(400,100));
		button1.setPreferredSize(new Dimension(180, 20));
		button2.setPreferredSize(new Dimension(180,20));
		thirdPanel.add(button1);
		thirdPanel.add(button2);
		thirdPanel.setBorder(new EtchedBorder());
		
		panel.add(firstPanel, BorderLayout.NORTH);
		panel.add(secondPanel, BorderLayout.CENTER);
		panel.add(thirdPanel, BorderLayout.SOUTH);
		
		add(panel);
	}
	public static void main(String[] args) {
		MyWindow window =new MyWindow();
		window.setSize(400, 240);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
