
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JPasswordField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1395, 960);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(255, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(521, 263, 112, 42);
		contentPane.add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.BOLD, 15));
		t1.setBounds(631, 263, 272, 42);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("   Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(412, 367, 221, 42);
		contentPane.add(lblNewLabel_2);
		
		t2 = new JPasswordField();
		t2.setFont(new Font("Tahoma", Font.BOLD, 15));
		t2.setBounds(631, 367, 272, 42);
		contentPane.add(t2);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try{
					/*
					 * Conn c1 = new Conn(); String u = t1.getText(); String v = new
					 * String(t2.getPassword());
					 * 
					 * String q = "select * from login where username='"+u+"' and password='"+v+"'";
					 * ResultSet rs = c1.s.executeQuery(q);
					 */
					 String u=t1.getText();
					// @SuppressWarnings("deprecation")
					String v= new String(t2.getPassword());
			            if(u=="Aaftab" && v=="1234"){
			            	Admin_homepage ob=new Admin_homepage();
			            	ob.setVisible(true);
			            	setVisible(false);
			            }else{
			                JOptionPane.showMessageDialog(null, "Invalid login");
			                setVisible(false);
			            }
			        }catch(Exception e2){
			            e2.printStackTrace();;
			        }
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 39));
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(555, 451, 154, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBackground(new Color(235, 38, 10));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 39));
		btnNewButton_1.setBounds(756, 451, 178, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Frame1 obj1=new Frame1(); obj1.setVisible(true);
				 */
			}
		});
		btnNewButton_2.setBackground(new Color(0, 255, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 39));
		btnNewButton_2.setBounds(24, 647, 138, 42);
		contentPane.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1381, 120);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("SmartCity");
		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 48));
		lblNewLabel_3.setBounds(new Rectangle(455, 5, 280, 77));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Delhi");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(new Rectangle(745, 71, 78, 49));
		panel.add(lblNewLabel);
	}
}