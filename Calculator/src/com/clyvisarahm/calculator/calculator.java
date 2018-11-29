package com.clyvisarahm.calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisplay;
	
	String operations;
	double firstnum;
	double secondnum;
	double results;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//************************************* Round Buttons
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
		
		//***********************************************
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculator() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(12, 13, 248, 46);
		contentPane.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnBckSpace = new JButton("<");
		btnBckSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backspace = null;
				
				if(txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
				
				//********************************************
			}
		});
		btnBckSpace.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBckSpace.setBounds(12, 72, 50, 50);
		contentPane.add(btnBckSpace);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtDisplay.setText(null);
				
				//***********************************************
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnC.setBounds(74, 72, 50, 50);
		contentPane.add(btnC);
		
		JButton btnOo = new JButton("CE");
		btnOo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText("");
				
				//***********************************************	
			}
		});
		btnOo.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOo.setBounds(136, 72, 50, 50);
		contentPane.add(btnOo);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				//***********************************************
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_2.setBounds(198, 72, 50, 50);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("-");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
				//***************************************************

			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_3.setBounds(198, 135, 50, 50);
		contentPane.add(button_3);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String enterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(enterNumber);
 				//*******************************************
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(136, 135, 50, 50);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String enterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(enterNumber);
 				//*******************************************
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(74, 135, 50, 50);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(enterNumber);
 				//*******************************************
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(12, 135, 50, 50);
		contentPane.add(btn1);
		
		JButton button_7 = new JButton("*");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
				//***************************************************

			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_7.setBounds(198, 198, 50, 50);
		contentPane.add(button_7);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(enterNumber);
 				//*******************************************
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(136, 198, 50, 50);
		contentPane.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(enterNumber);
 				//*******************************************
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(74, 198, 50, 50);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(enterNumber);
 				//*******************************************
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(12, 198, 50, 50);
		contentPane.add(btn4);
		
		JButton button_11 = new JButton("/");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
				//***************************************************
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_11.setBounds(198, 261, 50, 50);
		contentPane.add(button_11);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(enterNumber);
 				//*******************************************
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(136, 261, 50, 50);
		contentPane.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(enterNumber);
 				//*******************************************
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(74, 261, 50, 50);
		contentPane.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(enterNumber);
 				//*******************************************
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(12, 261, 50, 50);
		contentPane.add(btn7);
		
		JButton button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondnum = Double.parseDouble(txtDisplay.getText());
				
				switch(operations) {
					
					case "+":
						results = firstnum + secondnum;
						txtDisplay.setText(String.format("%.2f", results));
						break;
						
					case "-":
						results = firstnum - secondnum;
						txtDisplay.setText(String.format("%.2f", results));
						break;
						
					case "*":
						results = firstnum * secondnum;
						txtDisplay.setText(String.format("%.2f", results));
						break;
						
					case "/":
						results = firstnum / secondnum;
						txtDisplay.setText(String.format("%.2f", results));
						break;
						
					default :
				}

				//***************************************************
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_15.setBounds(198, 324, 50, 50);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("\u00B1");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double operation = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				operation = operation * (-1);
				txtDisplay.setText(String.valueOf(operation));
				//***************************************************

			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_16.setBounds(136, 324, 50, 50);
		contentPane.add(button_16);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(enterNumber);
 				//*******************************************
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBounds(74, 324, 50, 50);
		contentPane.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(! txtDisplay.getText().contains(".")) {
					txtDisplay.setText(txtDisplay.getText() + btnDot.getText());
				}
 				//*******************************************
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDot.setBounds(12, 324, 50, 50);
		contentPane.add(btnDot);
	}
}
