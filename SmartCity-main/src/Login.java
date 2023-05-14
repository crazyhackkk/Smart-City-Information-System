import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setBackground(new Color(0, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 753);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(199, 112, 708, 482);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setFont(new Font("Lucida Handwriting", Font.BOLD, 16));
		lblNewLabel.setBounds(110, 82, 138, 52);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Lucida Handwriting", Font.BOLD, 16));
		lblPassword.setBounds(110, 182, 128, 52);
		panel.add(lblPassword);
		
		JButton Login = new JButton("LOG IN");
		Login.setFont(new Font("Arial Black", Font.BOLD, 20));
		Login.setBounds(188, 285, 224, 52);
		panel.add(Login);
		
		username = new JTextField();
		username.setBounds(332, 91, 188, 43);
		panel.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(332, 189, 188, 43);
		panel.add(password);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(242, 33, 631, 61);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO Smart City");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 28));
		lblNewLabel_1.setBounds(113, 10, 382, 41);
		panel_1.add(lblNewLabel_1);
	}
	
}

