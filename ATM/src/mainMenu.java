//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainMenu extends JFrame {
	public static double balance;
	static int i=4;
	public static String[] H=new String[5];
	private JPanel contentPane;
	private JTextField scrn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainMenu frame = new mainMenu();
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
	public mainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton nxt = new JButton("Next");
		nxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i<4)
				{
					scrn.setText(H[i+1]);
					i++;
				}
				
			}
		});
		nxt.setBounds(335, 191, 89, 23);
		contentPane.add(nxt);
		
		JButton BI = new JButton("Balance Inquiry");
		BI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrn.setText(String.valueOf(balance));
				i=5;
			}
		});
		BI.setBounds(155, 191, 131, 23);
		contentPane.add(BI);
		
		JButton prv = new JButton("previous");
		prv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i>0)
				{
					scrn.setText(H[i-1]);
					i--;
				}
					
			}
		});
		prv.setBounds(10, 191, 89, 23);
		contentPane.add(prv);
		
		JButton dp = new JButton("Deposit");
		dp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Deposit db=new Deposit();
				db.setVisible(true);
			}
		});
		dp.setBounds(10, 79, 89, 23);
		contentPane.add(dp);
		
		JButton wd = new JButton("Withdraw");
		wd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Withdraw wd= new Withdraw();
				wd.setVisible(true);
			}
		});
		wd.setBounds(335, 79, 89, 23);
		contentPane.add(wd);
		
		scrn = new JTextField();
		scrn.setText("Welcome");
		scrn.setHorizontalAlignment(SwingConstants.CENTER);
		scrn.setBounds(155, 80, 131, 20);
		contentPane.add(scrn);
		scrn.setColumns(10);
		scrn.setEditable(false);
	}
}
