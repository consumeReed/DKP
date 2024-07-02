package org.henrya.ronin.publishdkp.frames;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JScrollPane;

/**
 * Represents the frame that shows up after the button is pressed
 * @author Henry Anderson
 */
public class ResultFrame extends JFrame {
	private JPanel contentPane;
	private ConsolePane pane = new ConsolePane();

	/**
	 * Constructs the frame
	 */
	public ResultFrame() {
		this.setTitle("Total Points");
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(this.pane);
		scrollPane.setBounds(0, 10, 500, 555);
		contentPane.add(scrollPane);
	}
	
	/**
	 * Returns the pane
	 * @return The pane
	 */
	public ConsolePane getPane() {
		return this.pane;
	}
}
