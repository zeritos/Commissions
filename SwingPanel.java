package org.application;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingPanel {

	public static void createAndShowGUI() {
	        JFrame frame = new JFrame("HelloWorldSwing");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        //Add the ubiquitous "Hello World" label.
	        JLabel label = new JLabel("Hello World");
	        frame.getContentPane().add(label);
	        
	        //Add button and text
	        final JTextField tf=new JTextField();  
	        tf.setBounds(10,10, 50,20);  
	        JButton b=new JButton("Click Here");  
	        b.setBounds(50,100,95,30);  
	        	        
	        //Add elements
	        frame.add(b);frame.add(tf);
	        frame.setSize(200,200);  
	        
	        //Display the window.
	        //frame.pack();
	        frame.setVisible(true);
	    }

	
	
}
