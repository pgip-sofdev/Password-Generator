import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PasswordGenerator1 {

	private JFrame frame;

	/**
	 * Launch the application. Pat Williams 7/30/2019
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordGenerator1 window = new PasswordGenerator1();
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
	public PasswordGenerator1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.getContentPane().setLayout(null);
		
		JLabel lblPasswordCreater = new JLabel("Password Creater");
		lblPasswordCreater.setBackground(Color.BLACK);
		lblPasswordCreater.setBounds(165, 31, 99, 41);
		frame.getContentPane().add(lblPasswordCreater);
		
		JButton btnPush = new JButton("Click");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = 12;
				System.out.println(password(length));
				
			}
				char[] password(int len)
				{
					System.out.println("Create password using random ()");
					System.out.println("The new password is:  ");
					
				String Captial_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String Lower_chars = "abcdefghijklmnopqrstuvwxyz";
				String Numbers = "0123456789";
				String Symbols = "!@#$%^&*?<>+";
				
				String values = Captial_chars + Lower_chars + Numbers + Symbols ;
				
				Random rndm_method = new Random ();
				
				char[] password = new char [len];
				
				for (int i = 0; i < len; i ++)
				{
					
					password[i] = values.charAt(rndm_method.nextInt(values.length()));
				
				}
				
				return password;
				}		
			
			}
		});
		btnPush.setBounds(165, 149, 89, 23);
		frame.getContentPane().add(btnPush);
		
		JLabel lblClickForNew = new JLabel("Click for New Password");
		lblClickForNew.setBounds(154, 95, 122, 43);
		frame.getContentPane().add(lblClickForNew);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
