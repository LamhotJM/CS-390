package swing.demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingDemo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btn;
	private JTextField text;

	public SwingDemo() {
		//initializeWindow();
		JPanel main = new JPanel();
		main.setBackground(Color.green);
		btn = new JButton("Ok");
		text = new JTextField(6);
		text.setLayout(new FlowLayout(FlowLayout.LEFT,20,40));
		JLabel label = new JLabel();
		main.add(label);
		label.setText("Input Something");
		main.add(text);
		main.add(btn);
		btn.addActionListener(new MyButtonListener());

		JButton btn_cancel = new JButton("Cancel");
		main.add(btn);
		main.add(btn_cancel);
		// add(main);
		add(BorderLayout.CENTER, main);
		setTitle("Hello World");// to set the title
		setVisible(true);
		setSize(250, 200);
	}
	
	

	public static void main(String[] args) {
		new SwingDemo();

	}

	class MyButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String textVal = text.getText();
			System.out.print(textVal);
			text.setText("you wrote :"+textVal);
		}
	}

}
