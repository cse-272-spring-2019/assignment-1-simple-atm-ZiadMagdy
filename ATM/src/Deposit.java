//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deposit extends JFrame {

	private JPanel contentPane;
	private JTextField txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit frame = new Deposit();
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
	public Deposit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText()+"0");
			}
		});
		b0.setBounds(172, 227, 89, 23);
		contentPane.add(b0);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText()+"8");
			}
		});
		b8.setBounds(172, 180, 89, 23);
		contentPane.add(b8);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText()+"5");
			}
		});
		b5.setBounds(172, 133, 89, 23);
		contentPane.add(b5);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText()+"2");
			}
		});
		b2.setBounds(172, 86, 89, 23);
		contentPane.add(b2);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText()+"1");
			}
		});
		b1.setBounds(45, 86, 89, 23);
		contentPane.add(b1);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText()+"4");
			}
		});
		b4.setBounds(45, 133, 89, 23);
		contentPane.add(b4);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText()+"7");
			}
		});
		b7.setBounds(45, 180, 89, 23);
		contentPane.add(b7);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText()+"3");
			}
		});
		b3.setBounds(299, 86, 89, 23);
		contentPane.add(b3);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText()+"6");
			}
		});
		b6.setBounds(299, 133, 89, 23);
		contentPane.add(b6);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText()+"9");
			}
		});
		b9.setBounds(299, 180, 89, 23);
		contentPane.add(b9);
		
		JLabel lblEnterAmountTo = new JLabel("enter amount to deposit");
		lblEnterAmountTo.setBounds(10, 36, 155, 14);
		contentPane.add(lblEnterAmountTo);
		
		txt = new JTextField();
		txt.setBounds(172, 33, 96, 20);
		contentPane.add(txt);
		txt.setColumns(10);
		
		JButton db = new JButton("Deposit");
		db.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMenu.balance=mainMenu.balance+Float.parseFloat(txt.getText());
				mainMenu.i=0;
				while(mainMenu.i<4)
				{
					mainMenu.H[mainMenu.i]=mainMenu.H[mainMenu.i+1];
					mainMenu.i++;
				}
				mainMenu.H[4]="deposit"+txt.getText();
				mainMenu.i=5;
				dispose();
				mainMenu main=new mainMenu();
				main.setVisible(true);
			}
		});
		db.setBounds(299, 32, 89, 23);
		contentPane.add(db);
	}

}
