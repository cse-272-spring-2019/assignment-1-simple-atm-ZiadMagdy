import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class verification {
	
	private JFrame frame;
	private JTextField pwf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					verification window = new verification();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public verification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 430, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel pwl = new JLabel("enter card number");
		pwl.setBounds(29, 68, 117, 14);
		frame.getContentPane().add(pwl);
		
		JButton be = new JButton("enter");
		be.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pwf.getText().equals("12345"))
				{
					mainMenu main=new mainMenu();
					main.setVisible(true);
					frame.dispose();
				}
				else
					JOptionPane.showMessageDialog(frame,"invalid card number");
			}
		});
		be.setBounds(291, 64, 89, 23);
		frame.getContentPane().add(be);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwf.setText(pwf.getText() + "1");
				
			}
		});
		b1.setBounds(41, 111, 89, 23);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwf.setText(pwf.getText() + "2");
			}
		});
		b2.setBounds(165, 111, 89, 23);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwf.setText(pwf.getText() + "3");
			}
		});
		b3.setBounds(291, 111, 89, 23);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwf.setText(pwf.getText() + "4");
			}
		});
		b4.setBounds(41, 145, 89, 23);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwf.setText(pwf.getText() + "5");
			}
		});
		b5.setBounds(165, 145, 89, 23);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwf.setText(pwf.getText() + "6");
			}
		});
		b6.setBounds(291, 145, 89, 23);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwf.setText(pwf.getText() + "7");
			}
		});
		b7.setBounds(40, 179, 89, 23);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwf.setText(pwf.getText() + "8");
			}
		});
		b8.setBounds(165, 179, 89, 23);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwf.setText(pwf.getText() + "9");
			}
		});
		b9.setBounds(291, 179, 89, 23);
		frame.getContentPane().add(b9);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwf.setText(pwf.getText() + "0");
			}
		});
		b0.setBounds(165, 213, 89, 23);
		frame.getContentPane().add(b0);
		
		pwf = new JTextField();
		pwf.setHorizontalAlignment(SwingConstants.CENTER);
		pwf.setBounds(165, 64, 89, 23);
		frame.getContentPane().add(pwf);
		pwf.setColumns(10);
	}
}
