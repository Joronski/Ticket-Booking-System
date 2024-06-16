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
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private String[] transactionDetailColumn = {"Transaction ID", "Selected Event", "Selected Seats", "Price", "Date", "Time"};
	public static DefaultTableModel transactionModel = new DefaultTableModel();
	private String[] bookedTicket = {"Transaction ID", "Event", " Number Of Tickets", "Total Price"};
	public static DefaultTableModel bookingModel = new DefaultTableModel();
	
	public static int ID = 1;
	public static JCheckBox chkEvent1;
	public static JCheckBox chkEvent2;
	public static JCheckBox chkEvent3;
	private JLabel lblTransactionLog;
	private JLabel lblWelcomeText;
	private JLabel lblTicketBookingSystem;
	private JLabel lblSelectEvent;
	private JButton btnAddEvent;
	private JScrollPane scrollPaneTransactionLog;
	private JLabel lblTransactionDetails;
	private JScrollPane scrollPaneTransactionDetails;
	private JTable tblTransactionDetails; 
	private JTable tblTransactionLog; 


	public static void main(String[] args) {
		frameSplashScreen splashScreen = new frameSplashScreen();
        splashScreen.setVisible(true);

        new Thread(() -> {
            int counter = 0;
            try {
                while (counter <= 100) {
                    frameSplashScreen.progressBar.setValue(counter);
                    frameSplashScreen.progressBar.setString(counter + "%");
                    Thread.sleep(100);
                    counter++;
                }
                EventQueue.invokeLater(() -> {
                    splashScreen.dispose();
                    mainFrame frame = new mainFrame();
                    frame.setVisible(true);
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
	}

	public mainFrame() {
		setTitle("Recio's Group Ticket Booking System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 780);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWelcomeText = new JLabel("Welcome to Recio's Group");
		lblWelcomeText.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeText.setForeground(Color.WHITE);
		lblWelcomeText.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 20));
		lblWelcomeText.setBackground(new Color(255, 128, 0));
		lblWelcomeText.setBounds(128, 11, 589, 32);
		contentPane.add(lblWelcomeText);
		
		lblTicketBookingSystem = new JLabel("Ticket Booking System");
		lblTicketBookingSystem.setBackground(new Color(255, 128, 0));
		lblTicketBookingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketBookingSystem.setForeground(Color.WHITE);
		lblTicketBookingSystem.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 40));
		lblTicketBookingSystem.setBounds(128, 38, 589, 46);
		contentPane.add(lblTicketBookingSystem);
		
		lblSelectEvent = new JLabel("SELECT EVENT:");
		lblSelectEvent.setBackground(new Color(255, 128, 0));
		lblSelectEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectEvent.setForeground(Color.WHITE);
		lblSelectEvent.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectEvent.setBounds(128, 70, 254, 65);
		contentPane.add(lblSelectEvent);
		
		chkEvent1 = new JCheckBox("Event 1");
		chkEvent1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// If the check box is selected. The frame for green book will be displayed
		        if (chkEvent1.isSelected() == true) {
		        	firstEvent event1 = new firstEvent();
					event1.setVisible(true); 
		        } else { 
		        	firstEvent event1 = new firstEvent();
					event1.setVisible(false); 
		        }
			}
		});
		chkEvent1.setForeground(Color.WHITE);
		chkEvent1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));	
		chkEvent1.setBackground(new Color(255, 128, 0));
		chkEvent1.setBounds(350, 84, 344, 40);
		contentPane.add(chkEvent1);
		
		chkEvent2 = new JCheckBox("Event 2");
		chkEvent2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    	//If the check box is selected. The frame for cast away will be displayed
		        if (chkEvent2.isSelected() == true) {
		        	secondEvent event2 = new secondEvent();
					event2.setVisible(true); 
		        } else { 
		        	secondEvent event2 = new secondEvent();
					event2.setVisible(false); 
		        }
			}
		});

		chkEvent2.setForeground(Color.WHITE);
		chkEvent2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		chkEvent2.setBackground(new Color(255, 128, 0));
		chkEvent2.setBounds(350, 113, 344, 40);
		contentPane.add(chkEvent2);
		
		chkEvent3 = new JCheckBox("Event 3");
		chkEvent3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		     	// If the check box is selected. The frame for the shining will be displayed
		        if (chkEvent3.isSelected() == true) {
		        	thirdEvent event3 = new thirdEvent();
					event3.setVisible(true); 
		        } else { 
		        	thirdEvent event3 = new thirdEvent();
					event3.setVisible(false); 
		        }
			}
		});
		chkEvent3.setForeground(Color.WHITE);
		chkEvent3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		chkEvent3.setBackground(new Color(255, 128, 0));
		chkEvent3.setBounds(350, 142, 344, 40);
		contentPane.add(chkEvent3);
		
		btnAddEvent = new JButton("Add Event");
		btnAddEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameLogIn frame = new frameLogIn();
				frame.setVisible(true);
			}
		});
		btnAddEvent.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddEvent.setBounds(180, 122, 105, 25);
		contentPane.add(btnAddEvent);
		
		lblTransactionLog = new JLabel("TRANSACTION LOG");
		lblTransactionLog.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransactionLog.setForeground(Color.WHITE);
		lblTransactionLog.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblTransactionLog.setBounds(103, 173, 614, 40);
		contentPane.add(lblTransactionLog);
		
		scrollPaneTransactionLog = new JScrollPane();
		scrollPaneTransactionLog.setBounds(10, 209, 804, 230);
		contentPane.add(scrollPaneTransactionLog);
		
		bookingModel.setColumnIdentifiers(bookedTicket);
		tblTransactionLog = new JTable(bookingModel);
		tblTransactionLog.setEnabled(false);
		scrollPaneTransactionLog.setViewportView(tblTransactionLog);

		lblTransactionDetails = new JLabel("TRANSACTION DETAILS");
		lblTransactionDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransactionDetails.setForeground(Color.WHITE);
		lblTransactionDetails.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblTransactionDetails.setBounds(103, 437, 614, 40);
		contentPane.add(lblTransactionDetails);
		
		scrollPaneTransactionDetails = new JScrollPane();
		scrollPaneTransactionDetails.setBounds(10, 475, 804, 255);
		contentPane.add(scrollPaneTransactionDetails);
		
		transactionModel.setColumnIdentifiers(transactionDetailColumn);
		tblTransactionDetails = new JTable(transactionModel);
		scrollPaneTransactionDetails.setViewportView(tblTransactionDetails);
		
		setLocationRelativeTo(null);
	}
}
