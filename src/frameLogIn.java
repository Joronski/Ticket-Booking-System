/* Project Made by Recio's Group for FINALS GROUP RESEARCH PROJECT CCS103 COMPUTER PROGRAMMING 2

Group Members:

Joaquin Aaron P. Recio - Lead Programmer
Anne Galzeleigh L. Eliang - Co-Lead Programmer
Kirsten Joi A. Lazarte - Member 
Jaymart G. Impas - Member
John Henrics L. Mateo - Member
Brenda Lazado - Member
Jennelyn N. Magtibay - Member
Marc Alvin P. Quitorio - Member
Kim Francis O. Dela Cruz - Member
Julius L. Natividad - Member

Recio's Group Multi-form Ticket Booking System (© 2024 RECIO) */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class frameLogIn extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JButton btnCancel;

	public frameLogIn() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String initialValue = mainFrame.chkEvent1.getText();
				String initialValue2 = mainFrame.chkEvent2.getText();
				String initialValue3 = mainFrame.chkEvent3.getText();
				if(txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin")) {
					JOptionPane.showMessageDialog(null, "Log In Successfully!");
					String eventName = JOptionPane.showInputDialog("New Movie For Slot 1: ", initialValue);
					mainFrame.chkEvent1.setText(eventName);
					
					String eventName2 = JOptionPane.showInputDialog("New Movie For Slot 2: ", initialValue2);
					mainFrame.chkEvent2.setText(eventName2);
					
					String eventName3 = JOptionPane.showInputDialog("New Movie For Slot 3: ", initialValue3);
					mainFrame.chkEvent3.setText(eventName3);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect Log In Credentials", "Incorrect Credentials", JOptionPane.ERROR_MESSAGE);
					setVisible(false);
				}
			}
		});
		btnLogin.setBounds(160, 167, 106, 30);
		contentPane.add(btnLogin);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(160, 208, 106, 30);
		contentPane.add(btnCancel);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setBounds(124, 67, 80, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setBounds(124, 113, 80, 14);
		contentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(124, 82, 180, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(124, 127, 180, 20);
		contentPane.add(txtPassword);
		
		JLabel lblAppTitle = new JLabel("RECIO'S GROUP TICKET BOOKING SYSTEM");
		lblAppTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblAppTitle.setForeground(Color.WHITE);
		lblAppTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAppTitle.setBounds(10, 11, 414, 20);
		contentPane.add(lblAppTitle);
		
		JLabel lblLogInTitle = new JLabel("LOG IN");
		lblLogInTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogInTitle.setForeground(Color.WHITE);
		lblLogInTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLogInTitle.setBounds(10, 42, 414, 20);
		contentPane.add(lblLogInTitle);
		
		setLocationRelativeTo(null);
	}
}
