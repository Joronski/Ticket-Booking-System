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
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JToggleButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

public class firstEvent extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    // The Declaration of the toggle buttons as seat selections in the 1st Event
    public static JToggleButton tglbtnA1SeatSelection, tglbtnA2SeatSelection, tglbtnA3SeatSelection, tglbtnA4SeatSelection, tglbtnA5SeatSelection, tglbtnA6SeatSelection, tglbtnA7SeatSelection, tglbtnA8SeatSelection;
    public static JToggleButton tglbtnB1SeatSelection, tglbtnB2SeatSelection, tglbtnB3SeatSelection, tglbtnB4SeatSelection, tglbtnB5SeatSelection, tglbtnB6SeatSelection, tglbtnB7SeatSelection, tglbtnB8SeatSelection;
    public static JToggleButton tglbtnC1SeatSelection, tglbtnC2SeatSelection, tglbtnC3SeatSelection, tglbtnC4SeatSelection, tglbtnC5SeatSelection, tglbtnC6SeatSelection, tglbtnC7SeatSelection, tglbtnC8SeatSelection;

    // The Declaration of integer variables in the 1st Event
    private int ticketQuantity;
    private int seatsSelected;
    private int numTicket;
    private int maximumTickets = 24;
    private int minimumTicket = 1;
    private int total;

    // The Declaration for the JLabel
    private JLabel lblVIPSeats;
    private JLabel lblInclinedSeats;
    private JLabel lblStandardSeats;
    private JLabel lblNumberTickets;
    private JLabel lblAvailableSeats;
    private JLabel lblPurchaseTickets;
    private JLabel lblTicketCount;

    // The Declaration for the JButtons
    private JButton btnReturnToTicket;
    private JButton btnBookTicket;
    private JButton btnConfirmTicket;
    private JButton btnIncrease;
    private JButton btnDecrease;
    private JButton btnCancelEvent;
	private JButton btnResetSeats;

    // The Declaration for the boolean if the seats are occupied
    private boolean A1Occupied = false, A2Occupied = false, A3Occupied = false, A4Occupied = false, 
                    A5Occupied = false, A6Occupied = false, A7Occupied = false, A8Occupied = false;
    private boolean B1Occupied = false, B2Occupied = false, B3Occupied = false, B4Occupied = false, 
                    B5Occupied = false, B6Occupied = false, B7Occupied = false, B8Occupied = false;
    private boolean C1Occupied = false, C2Occupied = false, C3Occupied = false, C4Occupied = false, 
                    C5Occupied = false, C6Occupied = false, C7Occupied = false, C8Occupied = false;
    
    // The Declaration for the strings of firstEvent
    private String txtTicket;
    private String ticketsCounted;

    // The Declaration for the itemListeners of every seats
    private ItemListener a1SeatListener, a2SeatListener, a3SeatListener, a4SeatListener, a5SeatListener, a6SeatListener, a7SeatListener, a8SeatListener, b1SeatListener, b2SeatListener, b3SeatListener, b4SeatListener, b5SeatListener, b6SeatListener, b7SeatListener, b8SeatListener, c1SeatListener, c2SeatListener, c3SeatListener, c4SeatListener, c5SeatListener, c6SeatListener, c7SeatListener, c8SeatListener;

    // The Declaration for a string array variable
    private String[] finalTransaction;
    private JLabel lblScreen;
    private JLabel lblARow;
    private JLabel lblBRow;
    private JLabel lblCRow;
    private JLabel lbl1Column;
    private JLabel lbl2Column;
    private JLabel lbl3Column;
    private JLabel lbl4Column;
    private JLabel lbl5Column;
    private JLabel lbl6Column;
    private JLabel lbl7Column;
    private JLabel lbl8Column;
    
    public firstEvent() {
        setBounds(100, 100, 825, 650);
        setResizable(false); 
        setUndecorated(true); 
        contentPane = new JPanel(); 
        contentPane.setBackground(new Color(65, 105, 225));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        tglbtnA1SeatSelection = new JToggleButton("1"); 
        tglbtnA1SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnA1SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnA1SeatSelection.isSelected()) {
        			tglbtnA1SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnA1SeatSelection.setText("X");
				} else {
					tglbtnA1SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnA1SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnA1SeatSelection.setText("1");
				}
        	}
        });
        tglbtnA1SeatSelection.setBackground(Color.GREEN);
        tglbtnA1SeatSelection.setEnabled(false);
        tglbtnA1SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnA1SeatSelection.setBounds(156, 288, 50, 50);
        contentPane.add(tglbtnA1SeatSelection);

        tglbtnA2SeatSelection = new JToggleButton("2"); 
        tglbtnA2SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnA2SeatSelection.isSelected()) {
        			tglbtnA2SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnA2SeatSelection.setText("X");
				} else {
					tglbtnA2SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnA2SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnA2SeatSelection.setText("2");
				}
        	}
        });
        tglbtnA2SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnA2SeatSelection.setBackground(Color.GREEN);
        tglbtnA2SeatSelection.setEnabled(false);
        tglbtnA2SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnA2SeatSelection.setBounds(216, 288, 50, 50);
        contentPane.add(tglbtnA2SeatSelection);
        
        tglbtnA3SeatSelection = new JToggleButton("3"); 
        tglbtnA3SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnA3SeatSelection.isSelected()) {
        			tglbtnA3SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnA3SeatSelection.setText("X");
				} else {
					tglbtnA3SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnA3SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnA3SeatSelection.setText("3");
				}
        	}
        });
        tglbtnA3SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnA3SeatSelection.setBackground(Color.GREEN);
        tglbtnA3SeatSelection.setEnabled(false);
        tglbtnA3SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnA3SeatSelection.setBounds(276, 288, 50, 50);
        contentPane.add(tglbtnA3SeatSelection);
        
        
        tglbtnA4SeatSelection = new JToggleButton("4"); 
        tglbtnA4SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnA4SeatSelection.isSelected()) {
        			tglbtnA4SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnA4SeatSelection.setText("X");
				} else {
					tglbtnA4SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnA4SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnA4SeatSelection.setText("4");
				}
        	}
        });
        tglbtnA4SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnA4SeatSelection.setBackground(Color.GREEN);
        tglbtnA4SeatSelection.setEnabled(false);
        tglbtnA4SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnA4SeatSelection.setBounds(336, 288, 50, 50);
        contentPane.add(tglbtnA4SeatSelection);
        
        tglbtnA5SeatSelection = new JToggleButton("5"); 
        tglbtnA5SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnA5SeatSelection.isSelected()) {
        			tglbtnA5SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnA5SeatSelection.setText("X");
				} else {
					tglbtnA5SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnA5SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnA5SeatSelection.setText("5");
				}
        	}
        });
        tglbtnA5SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnA5SeatSelection.setBackground(Color.GREEN);
        tglbtnA5SeatSelection.setEnabled(false);
        tglbtnA5SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnA5SeatSelection.setBounds(453, 288, 50, 50);
        contentPane.add(tglbtnA5SeatSelection);
        
        tglbtnA6SeatSelection = new JToggleButton("6"); 
        tglbtnA6SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnA6SeatSelection.isSelected()) {
        			tglbtnA6SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnA6SeatSelection.setText("X");
				} else {
					tglbtnA6SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnA6SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnA6SeatSelection.setText("6");
				}
        	}
        });
        tglbtnA6SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnA6SeatSelection.setBackground(Color.GREEN);
        tglbtnA6SeatSelection.setEnabled(false);
        tglbtnA6SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnA6SeatSelection.setBounds(513, 288, 50, 50);
        contentPane.add(tglbtnA6SeatSelection);
        
        tglbtnA7SeatSelection = new JToggleButton("7"); 
        tglbtnA7SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnA7SeatSelection.isSelected()) {
        			tglbtnA7SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnA7SeatSelection.setText("X");
				} else {
					tglbtnA7SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnA7SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnA7SeatSelection.setText("7");
				}
        	}
        });
        tglbtnA7SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnA7SeatSelection.setBackground(Color.GREEN);
        tglbtnA7SeatSelection.setEnabled(false);
        tglbtnA7SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnA7SeatSelection.setBounds(573, 288, 50, 50);
        contentPane.add(tglbtnA7SeatSelection);
        
        tglbtnA8SeatSelection = new JToggleButton("8"); 
        tglbtnA8SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnA8SeatSelection.isSelected()) {
        			tglbtnA8SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnA8SeatSelection.setText("X");
				} else {
					tglbtnA8SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnA8SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnA8SeatSelection.setText("8");
				}
        	}
        });
        tglbtnA8SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnA8SeatSelection.setBackground(Color.GREEN);
        tglbtnA8SeatSelection.setEnabled(false);
        tglbtnA8SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnA8SeatSelection.setBounds(633, 288, 50, 50);
        contentPane.add(tglbtnA8SeatSelection);

        tglbtnB1SeatSelection = new JToggleButton("1"); 
        tglbtnB1SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnB1SeatSelection.isSelected()) {
        			tglbtnB1SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnB1SeatSelection.setText("X");
				} else {
					tglbtnB1SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnB1SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnB1SeatSelection.setText("1");
				}
        	}
        });
        tglbtnB1SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnB1SeatSelection.setBackground(Color.GREEN);
        tglbtnB1SeatSelection.setEnabled(false);
        tglbtnB1SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnB1SeatSelection.setBounds(156, 349, 50, 50);
        contentPane.add(tglbtnB1SeatSelection);

        tglbtnB2SeatSelection = new JToggleButton("2"); 
        tglbtnB2SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnB2SeatSelection.isSelected()) {
        			tglbtnB2SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnB2SeatSelection.setText("X");
				} else {
					tglbtnB2SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnB2SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnB2SeatSelection.setText("2");
				}
        	}
        });
        tglbtnB2SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnB2SeatSelection.setBackground(Color.GREEN);
        tglbtnB2SeatSelection.setEnabled(false);
        tglbtnB2SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnB2SeatSelection.setBounds(216, 349, 50, 50);
        contentPane.add(tglbtnB2SeatSelection);
        
        tglbtnB3SeatSelection = new JToggleButton("3"); 
        tglbtnB3SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnB3SeatSelection.isSelected()) {
        			tglbtnB3SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnB3SeatSelection.setText("X");
				} else {
					tglbtnB3SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnB3SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnB3SeatSelection.setText("3");
				}
        	}
        });
        tglbtnB3SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnB3SeatSelection.setBackground(Color.GREEN);
        tglbtnB3SeatSelection.setEnabled(false);
        tglbtnB3SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnB3SeatSelection.setBounds(276, 349, 50, 50);
        contentPane.add(tglbtnB3SeatSelection);
        
        tglbtnB4SeatSelection = new JToggleButton("4"); 
        tglbtnB4SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnB4SeatSelection.isSelected()) {
        			tglbtnB4SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnB4SeatSelection.setText("X");
				} else {
					tglbtnB4SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnB4SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnB4SeatSelection.setText("4");
				}
        	}
        });
        tglbtnB4SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnB4SeatSelection.setBackground(Color.GREEN);
        tglbtnB4SeatSelection.setEnabled(false);
        tglbtnB4SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnB4SeatSelection.setBounds(336, 349, 50, 50);
        contentPane.add(tglbtnB4SeatSelection);
        
        tglbtnB5SeatSelection = new JToggleButton("5"); 
        tglbtnB5SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnB5SeatSelection.isSelected()) {
        			tglbtnB5SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnB5SeatSelection.setText("X");
				} else {
					tglbtnB5SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnB5SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnB5SeatSelection.setText("5");
				}
        	}
        });
        tglbtnB5SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnB5SeatSelection.setBackground(Color.GREEN);
        tglbtnB5SeatSelection.setEnabled(false);
        tglbtnB5SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnB5SeatSelection.setBounds(453, 349, 50, 50);
        contentPane.add(tglbtnB5SeatSelection);
        
        tglbtnB6SeatSelection = new JToggleButton("6"); 
        tglbtnB6SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnB6SeatSelection.isSelected()) {
        			tglbtnB6SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnB6SeatSelection.setText("X");
				} else {
					tglbtnB6SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnB6SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnB6SeatSelection.setText("6");
				}
        	}
        });
        tglbtnB6SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnB6SeatSelection.setBackground(Color.GREEN);
        tglbtnB6SeatSelection.setEnabled(false);
        tglbtnB6SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnB6SeatSelection.setBounds(513, 349, 50, 50);
        contentPane.add(tglbtnB6SeatSelection);
        
        tglbtnB7SeatSelection = new JToggleButton("7"); 
        tglbtnB7SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnB7SeatSelection.isSelected()) {
        			tglbtnB7SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnB7SeatSelection.setText("X");
				} else {
					tglbtnB7SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnB7SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnB7SeatSelection.setText("7");
				}
        	}
        });
        tglbtnB7SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnB7SeatSelection.setBackground(Color.GREEN);
        tglbtnB7SeatSelection.setEnabled(false);
        tglbtnB7SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnB7SeatSelection.setBounds(573, 349, 50, 50);
        contentPane.add(tglbtnB7SeatSelection);
        
        tglbtnB8SeatSelection = new JToggleButton("8"); 
        tglbtnB8SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnB8SeatSelection.isSelected()) {
        			tglbtnB8SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnB8SeatSelection.setText("X");
				} else {
					tglbtnB8SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnB8SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnB8SeatSelection.setText("8");
				}
        	}
        });
        tglbtnB8SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnB8SeatSelection.setBackground(Color.GREEN);
        tglbtnB8SeatSelection.setEnabled(false);
        tglbtnB8SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnB8SeatSelection.setBounds(633, 349, 50, 50);
        contentPane.add(tglbtnB8SeatSelection);

        tglbtnC1SeatSelection = new JToggleButton("1"); 
        tglbtnC1SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnC1SeatSelection.isSelected()) {
        			tglbtnC1SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnC1SeatSelection.setText("X");
				} else {
					tglbtnC1SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnC1SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnC1SeatSelection.setText("1");
				}
        	}
        });
        tglbtnC1SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnC1SeatSelection.setBackground(Color.GREEN);
        tglbtnC1SeatSelection.setEnabled(false);
        tglbtnC1SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnC1SeatSelection.setBounds(156, 410, 50, 50);
        contentPane.add(tglbtnC1SeatSelection);

        tglbtnC2SeatSelection = new JToggleButton("2"); 
        tglbtnC2SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnC2SeatSelection.isSelected()) {
        			tglbtnC2SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnC2SeatSelection.setText("X");
				} else {
					tglbtnC2SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnC2SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnC2SeatSelection.setText("2");
				}
        	}
        });
        tglbtnC2SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnC2SeatSelection.setBackground(Color.GREEN);
        tglbtnC2SeatSelection.setEnabled(false);
        tglbtnC2SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnC2SeatSelection.setBounds(216, 410, 50, 50);
        contentPane.add(tglbtnC2SeatSelection);
        
        tglbtnC3SeatSelection = new JToggleButton("3"); 
        tglbtnC3SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnC3SeatSelection.isSelected()) {
        			tglbtnC3SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnC3SeatSelection.setText("X");
				} else {
					tglbtnC3SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnC3SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnC3SeatSelection.setText("3");
				}
        	}
        });
        tglbtnC3SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnC3SeatSelection.setBackground(Color.GREEN);
        tglbtnC3SeatSelection.setEnabled(false);
        tglbtnC3SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnC3SeatSelection.setBounds(276, 410, 50, 50);
        contentPane.add(tglbtnC3SeatSelection);
        
        tglbtnC4SeatSelection = new JToggleButton("4"); 
        tglbtnC4SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnC4SeatSelection.isSelected()) {
        			tglbtnC4SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnC4SeatSelection.setText("X");
				} else {
					tglbtnC4SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnC4SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnC4SeatSelection.setText("4");
				}
        	}
        });
        tglbtnC4SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnC4SeatSelection.setBackground(Color.GREEN);
        tglbtnC4SeatSelection.setEnabled(false);
        tglbtnC4SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnC4SeatSelection.setBounds(336, 410, 50, 50);
        contentPane.add(tglbtnC4SeatSelection);

        tglbtnC5SeatSelection = new JToggleButton("5"); 
        tglbtnC5SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnC5SeatSelection.isSelected()) {
        			tglbtnC5SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnC5SeatSelection.setText("X");
				} else {
					tglbtnC5SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnC5SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnC5SeatSelection.setText("5");
				}
        	}
        });
        tglbtnC5SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnC5SeatSelection.setBackground(Color.GREEN);
        tglbtnC5SeatSelection.setEnabled(false);
        tglbtnC5SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnC5SeatSelection.setBounds(453, 410, 50, 50);
        contentPane.add(tglbtnC5SeatSelection);

        tglbtnC6SeatSelection = new JToggleButton("6"); 
        tglbtnC6SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnC6SeatSelection.isSelected()) {
        			tglbtnC6SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnC6SeatSelection.setText("X");
				} else {
					tglbtnC6SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnC6SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnC6SeatSelection.setText("6");
				}
        	}
        });
        tglbtnC6SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnC6SeatSelection.setBackground(Color.GREEN);
        tglbtnC6SeatSelection.setEnabled(false);
        tglbtnC6SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnC6SeatSelection.setBounds(513, 410, 50, 50);
        contentPane.add(tglbtnC6SeatSelection);

        tglbtnC7SeatSelection = new JToggleButton("7"); 
        tglbtnC7SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnC7SeatSelection.isSelected()) {
        			tglbtnC7SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnC7SeatSelection.setText("X");
				} else {
					tglbtnC7SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnC7SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnC7SeatSelection.setText("7");
				}
        	}
        });
        tglbtnC7SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnC7SeatSelection.setBackground(Color.GREEN);
        tglbtnC7SeatSelection.setEnabled(false);
        tglbtnC7SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnC7SeatSelection.setBounds(573, 410, 50, 50);
        contentPane.add(tglbtnC7SeatSelection);

        tglbtnC8SeatSelection = new JToggleButton("8"); 
        tglbtnC8SeatSelection.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		if (tglbtnC8SeatSelection.isSelected()) {
        			tglbtnC8SeatSelection.setForeground(new Color(255, 0, 0));
					tglbtnC8SeatSelection.setText("X");
				} else {
					tglbtnC8SeatSelection.setBackground(new Color(0, 255, 0));
					tglbtnC8SeatSelection.setForeground(new Color(255, 255, 255));
					tglbtnC8SeatSelection.setText("8");
				}
        	}
        });
        tglbtnC8SeatSelection.setForeground(new Color(255, 255, 255));
        tglbtnC8SeatSelection.setBackground(Color.GREEN);
        tglbtnC8SeatSelection.setEnabled(false);
        tglbtnC8SeatSelection.setMargin(new Insets(0, 0, 0, 0));
        tglbtnC8SeatSelection.setBounds(633, 410, 50, 50);
        contentPane.add(tglbtnC8SeatSelection);

        lblTicketCount = new JLabel("0");
        lblTicketCount.setHorizontalAlignment(SwingConstants.CENTER); 
        lblTicketCount.setForeground(Color.WHITE); 
        lblTicketCount.setFont(new Font("Tw Cen MT", Font.BOLD, 18)); 
        lblTicketCount.setBounds(703, 516, 28, 42);
        contentPane.add(lblTicketCount);

        btnConfirmTicket = new JButton("Confirm to Book Seats"); 
        btnConfirmTicket.setBackground(new Color(255, 255, 0));
        btnConfirmTicket.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
            	btnResetSeats.setEnabled(false);

            	// Getting the response from the user to its integer
                int res = JOptionPane.showConfirmDialog(null, "Would you like to Confirm the Number of Tickets?", "Confirm No. of Tickets", JOptionPane.YES_NO_OPTION);

                // If the user chooses yes, the following condition executes the code
                if (res == JOptionPane.YES_OPTION) {
                     seatsSelected = 0; // Setting the value of seat selection to 0 and it also resets the value every event of the button (pressing the button)
                     ticketsCounted = lblTicketCount.getText(); // Getting the label of the ticket count to string
                     ticketQuantity = Integer.parseInt(ticketsCounted); // Parse int the ticketCounted string to get its integer value

                     enableSeats(); // Calling of the enable seats method
                        
                     // Adding an action listener to each seat toggle button in the seat selection
                     a1SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                            // Getting the state of the toggle button if it is toggled on
                            if (e.getStateChange() == ItemEvent.SELECTED) {
                            	// Incrementing the number of Seats Selected if the seat is pressed or toggled on by the following event occurred
                                seatsSelected++; 
                                
                                // If the seats are selected and it exceeded the number of tickets entered it will apply the following condition
                                if (seatsSelected > ticketQuantity) {
                                	// Selecting the seat again to toggle off and notifies the user
                                    tglbtnA1SeatSelection.setSelected(true);
                                    JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                                }
                                      
                            // If the toggle Button is toggled off, it decreases the seats that is selected
                            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                            	// Decrement the number of seats selected if the seat is toggled off in the seat selection
                                seatsSelected--;
                            }
                        }
                     };

                     a2SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnA2SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };


                     a3SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnA3SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };    

                     a4SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnA4SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };    

                     a5SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnA5SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     a6SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnA6SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     a7SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnA7SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     a8SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnA8SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     b1SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnB1SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     b2SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnB2SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     b3SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnB3SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     b4SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnB4SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     b5SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnB5SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     b6SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnB6SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     b7SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnB7SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     b8SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnB8SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     c1SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnC1SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     c2SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnC2SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     c3SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnC3SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };


                     c4SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnC4SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     c5SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnC5SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     c6SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnC6SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     c7SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnC7SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };

                     c8SeatListener = new ItemListener() { 
                    	 public void itemStateChanged(ItemEvent e) {
                    		 if (e.getStateChange() == ItemEvent.SELECTED) {
                    			 seatsSelected++; 
                                
                    			 if (seatsSelected > ticketQuantity) {
                    				 tglbtnC8SeatSelection.setSelected(true);
                    				 JOptionPane.showMessageDialog(null, "You have already selected " + ticketQuantity + " seats.");
                    			 }
                    		 } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                seatsSelected--;
                    		 }
                    	 }
                     };
                     addItemListener(); // Adding item listeners for the toggle button of the seat selection
                } 
            }
        });
        btnConfirmTicket.setBounds(553, 569, 204, 21);
        contentPane.add(btnConfirmTicket);

        btnReturnToTicket = new JButton("Back to Ticket Purchase"); 
        btnReturnToTicket.setBackground(Color.LIGHT_GRAY);
        btnReturnToTicket.setEnabled(false); 
        btnReturnToTicket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeItemListener(); 
                resetSelection(); 
                disableSeats(); 
                btnConfirmTicket.setEnabled(true); 
                btnBookTicket.setEnabled(false); 
                btnIncrease.setEnabled(true); 
                btnDecrease.setEnabled(true); 
                btnReturnToTicket.setEnabled(false); 
            }
        });
        btnReturnToTicket.setBounds(553, 593, 204, 21);
        contentPane.add(btnReturnToTicket);

        btnBookTicket = new JButton("BOOK NOW"); //ButtonTicket after selecting seats
        btnBookTicket.setForeground(new Color(255, 255, 255));
        btnBookTicket.setBackground(new Color(0, 128, 0));
        btnBookTicket.setEnabled(false); //Set the Book Ticket Button at first
        btnBookTicket.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		// Enabling the reset seats button to get vacant seats
        		btnResetSeats.setEnabled(true);

        		// If the user occurs an event the book ticket check if the selected seats meet the number of tickets
        		if (seatsSelected < ticketQuantity) {
        			// If the selected seats does not meet the number of tickets it notifies the user
        			JOptionPane.showMessageDialog(null, "No. of seats does not meet the No. of tickets!", "Error Number of Seats", JOptionPane.ERROR_MESSAGE);
        		} else { // if the selected seats meets the number of tickets, it executes the following code
        			// Getting the user's response to an integer
        			int res = JOptionPane.showConfirmDialog(null, "Confirm Selected Seats?", "Seat(s) Confirmation", JOptionPane.YES_NO_OPTION);	
        	
        			// If the user chooses the yes option it will execute the following condition in a nested conditional statements
        			if (res == JOptionPane.YES_OPTION) {
        				total = 0; // The Integer of the total for the price of the ticket
        				LocalDate currentDate = LocalDate.now(); // Getting the current system date for its record
        				String currentTime = getCurrentTime(); // Getting the current system time for its record

        				// The Declaration of the price per type of seats in the event
        				String vipSeatPrice = "300"; 
        				String inclinedSeatPrice = "200"; 
        				String standardSeatPrice = "100";
        			
        				// Checking one by one if the seats are selected in the seat selection
        				if (tglbtnA1SeatSelection.isSelected()) {
        					// If the following seat is selected by the user
        					String[] seat_1A = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "A1", vipSeatPrice, currentDate.toString(),currentTime}; // String array for each seat in the Seat Selection
        					mainFrame.transactionModel.addRow(seat_1A); // Adding the string array 
        					A1Occupied = true; // The boolean will be true if the seat is taken by the user
        					tglbtnA1SeatSelection.setEnabled(false); // Disabling the selected seat if the user is completely chosen the seat
        					total += Integer.parseInt(vipSeatPrice); // Adding the price to the total overall price of the selected seat
        					maximumTickets--; // Decreasing the maximum ticket of the selected event from the system
        				}

        				if (tglbtnA2SeatSelection.isSelected()) {
        					String[] seat_2A = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "A2", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_2A); 
        					A2Occupied = true; 
        					tglbtnA2SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(vipSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnA3SeatSelection.isSelected()) {
        					String[] seat_3A = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "A3", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_3A); 
        					A3Occupied = true; 
        					tglbtnA3SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(vipSeatPrice); 
        					maximumTickets--; 
        				}

        				if (tglbtnA4SeatSelection.isSelected()) {
        					String[] seat_4A = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "A4", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_4A); 
        					A4Occupied = true; 
        					tglbtnA4SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(vipSeatPrice); 
        					maximumTickets--; 
        				}

        				if (tglbtnA5SeatSelection.isSelected()) {
        					String[] seat_5A = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "A5", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_5A); 
        					A5Occupied = true; 
        					tglbtnA5SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(vipSeatPrice); 
        					maximumTickets--; 
        				}

        				if (tglbtnA6SeatSelection.isSelected()) {
        					String[] seat_6A = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "A6", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_6A); 
        					A6Occupied = true; 
        					tglbtnA6SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(vipSeatPrice); 
        					maximumTickets--; 
        				}

        				if (tglbtnA7SeatSelection.isSelected()) {
        					String[] seat_7A = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "A7", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_7A); 
        					A7Occupied = true; 
        					tglbtnA7SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(vipSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnA8SeatSelection.isSelected()) {
        					String[] seat_8A = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "A8", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_8A); 
        					A8Occupied = true; 
        					tglbtnA8SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(vipSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnB1SeatSelection.isSelected()) {
        					String[] seat_1B = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "B1", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_1B); 
        					B1Occupied = true; 
        					tglbtnB1SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(inclinedSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnB2SeatSelection.isSelected()) {
        					String[] seat_2B = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "B2", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_2B); 
        					B2Occupied = true; 
        					tglbtnB2SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(inclinedSeatPrice); 
        					maximumTickets--; 
        				}
        		
        				if (tglbtnB3SeatSelection.isSelected()) {
        					String[] seat_3B = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "B3", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_3B); 
        					B3Occupied = true; 
        					tglbtnB3SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(inclinedSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnB4SeatSelection.isSelected()) {
        					String[] seat_4B = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "B4", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_4B); 
        					B4Occupied = true; 
        					tglbtnB4SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(inclinedSeatPrice); 
        					maximumTickets--; 
        				}
        			
        				if (tglbtnB5SeatSelection.isSelected()) {
        					String[] seat_5B = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "B5", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_5B); 
        					B5Occupied = true; 
        					tglbtnB5SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(inclinedSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnB6SeatSelection.isSelected()) {
        					String[] seat_6B = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "B6", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_6B); 
        					B6Occupied = true; 
        					tglbtnB6SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(inclinedSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnB7SeatSelection.isSelected()) {
        					String[] seat_7B = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "B7", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_7B); 
        					B7Occupied = true; 
        					tglbtnB7SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(inclinedSeatPrice); 
        					maximumTickets--; 
        				}
                    
        				if (tglbtnB8SeatSelection.isSelected()) {
        					String[] seat_8B = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "B8", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_8B); 
        					B8Occupied = true; 
        					tglbtnB8SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(inclinedSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnC1SeatSelection.isSelected()) {
        					String[] seat_1C = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "C1", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_1C); 
        					C1Occupied = true; 
        					tglbtnC1SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(standardSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnC2SeatSelection.isSelected()) {
        					String[] seat_2C = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "C2", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_2C); 
        					C2Occupied = true; 
        					tglbtnC2SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(standardSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnC3SeatSelection.isSelected()) {
        					String[] seat_3C = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "C3", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_3C); 
        					C3Occupied = true; 
        					tglbtnC3SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(standardSeatPrice); 
        					maximumTickets--; 
        				}
                    
        				if (tglbtnC4SeatSelection.isSelected()) {
        					String[] seat_4C = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "C4", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_4C); 
        					C4Occupied = true; 
        					tglbtnC4SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(standardSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnC5SeatSelection.isSelected()) {
        					String[] seat_5C = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "C5", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_5C); 
        					C5Occupied = true; 
        					tglbtnC5SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(standardSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnC6SeatSelection.isSelected()) {
        					String[] seat_6C = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "C6", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_6C); 
        					C6Occupied = true; 
        					tglbtnC6SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(standardSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnC7SeatSelection.isSelected()) {
        					String[] seat_7C = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "C7", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_7C); 
        					C7Occupied = true; 
        					tglbtnC7SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(standardSeatPrice); 
        					maximumTickets--; 
        				}
        				
        				if (tglbtnC8SeatSelection.isSelected()) {
        					String[] seat_8C = {String.valueOf(mainFrame.ID), mainFrame.chkEvent1.getText(), "C8", vipSeatPrice, currentDate.toString(),currentTime}; 
        					mainFrame.transactionModel.addRow(seat_8C); 
        					C8Occupied = true; 
        					tglbtnC8SeatSelection.setEnabled(false);  
        					total += Integer.parseInt(standardSeatPrice); 
        					maximumTickets--; 
        				}
                    
	                    // Putting the transaction details to its string array
	                    finalTransaction = new String[] {String.valueOf(mainFrame.ID), // The value number of the transaction number
	                    mainFrame.chkEvent1.getText(), // Getting the text of the movie name in the system
                    	lblTicketCount.getText(), // Getting the text of the ticket count in the system
                    	String.valueOf(total)}; // Getting the text of the total value
                    
	                    mainFrame.bookingModel.addRow(finalTransaction); // Adding the transaction details to the Booking Model from the Main Frame
                    
	                    // Option pane for the total price made by availing your amount of tickets
	                    JOptionPane.showMessageDialog(null, "The total price of the ticket is: " + total); 
	                    mainFrame.chkEvent1.setSelected(false); // Setting the selected state of check box to false

	                    mainFrame.ID++; // Incrementing the transaction ID for the system
	                    btnConfirmTicket.setEnabled(true); 
	                    btnBookTicket.setEnabled(false); 
	                    btnReturnToTicket.setEnabled(false); 
	                    btnIncrease.setEnabled(true); 
	                    btnDecrease.setEnabled(true); 
	                    lblTicketCount.setText("0"); 

	                    disableSeats(); // Method for calling disabling the seats to the system
	                    removeItemListener(); // Method for calling removing item listener per toggle button

	                    dispose(); 
                    }
                }
            }
        });
        btnBookTicket.setBounds(263, 516, 245, 29);
        contentPane.add(btnBookTicket);

        lblVIPSeats = new JLabel("VIP (A) = Php 300");
        lblVIPSeats.setForeground(Color.WHITE);
        lblVIPSeats.setFont(new Font("Perpetua", Font.BOLD, 18));
        lblVIPSeats.setBounds(38, 534, 225, 21);
        contentPane.add(lblVIPSeats);

        lblInclinedSeats = new JLabel("Inclined (B) = Php 200");
        lblInclinedSeats.setForeground(Color.WHITE);
        lblInclinedSeats.setFont(new Font("Perpetua", Font.BOLD, 18));
        lblInclinedSeats.setBounds(38, 556, 225, 21);
        contentPane.add(lblInclinedSeats);

        lblStandardSeats = new JLabel("Standard (C) = Php 100");
        lblStandardSeats.setForeground(Color.WHITE);
        lblStandardSeats.setFont(new Font("Perpetua", Font.BOLD, 18));
        lblStandardSeats.setBounds(38, 579, 225, 21);
        contentPane.add(lblStandardSeats);

        lblNumberTickets = new JLabel("Number of Tickets:");
        lblNumberTickets.setForeground(Color.WHITE);
        lblNumberTickets.setFont(new Font("Garamond", Font.BOLD, 18));
        lblNumberTickets.setBounds(553, 526, 156, 21);
        contentPane.add(lblNumberTickets);

        lblAvailableSeats = new JLabel("Seat Plan Selection");
        lblAvailableSeats.setHorizontalAlignment(SwingConstants.CENTER);
        lblAvailableSeats.setForeground(Color.WHITE);
        lblAvailableSeats.setFont(new Font("Perpetua Titling MT", Font.BOLD, 18));
        lblAvailableSeats.setBounds(253, 12, 308, 21);
        contentPane.add(lblAvailableSeats);

        lblPurchaseTickets = new JLabel("Purchasing Tickets:");
        lblPurchaseTickets.setForeground(Color.WHITE);
        lblPurchaseTickets.setFont(new Font("Perpetua Titling MT", Font.BOLD, 19));
        lblPurchaseTickets.setBounds(551, 484, 264, 33);
        contentPane.add(lblPurchaseTickets);

        btnIncrease = new JButton("+");
        btnIncrease.setForeground(new Color(255, 255, 255));
        btnIncrease.setBackground(new Color(0, 128, 0));
        btnIncrease.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtTicket = lblTicketCount.getText();
                numTicket = Integer.parseInt(txtTicket);
                if (numTicket < maximumTickets) {
                    numTicket++;
                } else {
                    JOptionPane.showMessageDialog(null, "The number of available seats is Exceeded!", "Exceeded Number of Seats!", JOptionPane.ERROR_MESSAGE);
                }
                lblTicketCount.setText(String.valueOf(numTicket));
            }
        });
        btnIncrease.setMargin(new Insets(0, 0, 0, 0));
        btnIncrease.setBounds(731, 516, 47, 23);
        contentPane.add(btnIncrease);

        btnDecrease = new JButton("-");
        btnDecrease.setForeground(Color.WHITE);
        btnDecrease.setBackground(Color.RED);
        btnDecrease.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtTicket = lblTicketCount.getText();
                numTicket = Integer.parseInt(txtTicket);
                if (numTicket >= minimumTicket) {
                    numTicket--;
                } 	
                lblTicketCount.setText(String.valueOf(numTicket));
            }
        });
        btnDecrease.setMargin(new Insets(0, 0, 0, 0));
        btnDecrease.setBounds(731, 537, 47, 23);
        contentPane.add(btnDecrease);

        JLabel lblSeatPrices = new JLabel("Prices:");
        lblSeatPrices.setForeground(Color.WHITE);
        lblSeatPrices.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 25));
        lblSeatPrices.setBounds(38, 494, 181, 29);
        contentPane.add(lblSeatPrices);

        btnCancelEvent = new JButton("Cancel");
        btnCancelEvent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                mainFrame.chkEvent1.setSelected(false);
            }
        });
        btnCancelEvent.setMargin(new Insets(0, 0, 0, 0));
        btnCancelEvent.setBackground(Color.LIGHT_GRAY);
        btnCancelEvent.setBounds(553, 618, 204, 21);
        contentPane.add(btnCancelEvent);
        
        btnResetSeats = new JButton("RESET OCCUPIED SEATS");
        btnResetSeats.setForeground(new Color(255, 255, 255));
        btnResetSeats.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int response = JOptionPane.showConfirmDialog(null, "Are you sure do you want to reset the seats you selected?", "Reset Seats Confirmation", JOptionPane.YES_NO_OPTION);
        		
        		if (response == JOptionPane.YES_OPTION) {
        			clearAll();
        			maximumTickets = 24;
        		}
        	}
        });
        btnResetSeats.setMargin(new Insets(0, 0, 0, 0));
        btnResetSeats.setBackground(new Color(255, 0, 0));
        btnResetSeats.setBounds(263, 565, 245, 29);
        contentPane.add(btnResetSeats);
        
        lblScreen = new JLabel("Event 1 Screen");
        lblScreen.setOpaque(true);
        lblScreen.setBackground(new Color(0, 0, 0));
        lblScreen.setForeground(new Color(255, 255, 255));
        lblScreen.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblScreen.setHorizontalAlignment(SwingConstants.CENTER);
        lblScreen.setBounds(156, 44, 527, 217);
        contentPane.add(lblScreen);
        
        lblARow = new JLabel("A");
        lblARow.setForeground(new Color(255, 255, 255));
        lblARow.setHorizontalAlignment(SwingConstants.CENTER);
        lblARow.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblARow.setBounds(118, 306, 28, 14);
        contentPane.add(lblARow);
        
        lblBRow = new JLabel("B");
        lblBRow.setForeground(new Color(255, 255, 255));
        lblBRow.setHorizontalAlignment(SwingConstants.CENTER);
        lblBRow.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblBRow.setBounds(118, 367, 28, 14);
        contentPane.add(lblBRow);
        
        lblCRow = new JLabel("C");
        lblCRow.setHorizontalAlignment(SwingConstants.CENTER);
        lblCRow.setForeground(Color.WHITE);
        lblCRow.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCRow.setBounds(118, 428, 28, 14);
        contentPane.add(lblCRow);
        
        lbl1Column = new JLabel("1");
        lbl1Column.setHorizontalAlignment(SwingConstants.CENTER);
        lbl1Column.setForeground(Color.WHITE);
        lbl1Column.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbl1Column.setBounds(166, 465, 28, 14);
        contentPane.add(lbl1Column);
        
        lbl2Column = new JLabel("2");
        lbl2Column.setHorizontalAlignment(SwingConstants.CENTER);
        lbl2Column.setForeground(Color.WHITE);
        lbl2Column.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbl2Column.setBounds(226, 465, 28, 14);
        contentPane.add(lbl2Column);
        
        lbl3Column = new JLabel("3");
        lbl3Column.setHorizontalAlignment(SwingConstants.CENTER);
        lbl3Column.setForeground(Color.WHITE);
        lbl3Column.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbl3Column.setBounds(286, 465, 28, 14);
        contentPane.add(lbl3Column);
        
        lbl4Column = new JLabel("4");
        lbl4Column.setHorizontalAlignment(SwingConstants.CENTER);
        lbl4Column.setForeground(Color.WHITE);
        lbl4Column.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbl4Column.setBounds(346, 465, 28, 14);
        contentPane.add(lbl4Column);
        
        lbl5Column = new JLabel("5");
        lbl5Column.setHorizontalAlignment(SwingConstants.CENTER);
        lbl5Column.setForeground(Color.WHITE);
        lbl5Column.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbl5Column.setBounds(463, 465, 28, 14);
        contentPane.add(lbl5Column);
        
        lbl6Column = new JLabel("6");
        lbl6Column.setHorizontalAlignment(SwingConstants.CENTER);
        lbl6Column.setForeground(Color.WHITE);
        lbl6Column.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbl6Column.setBounds(523, 465, 28, 14);
        contentPane.add(lbl6Column);
        
        lbl7Column = new JLabel("7");
        lbl7Column.setHorizontalAlignment(SwingConstants.CENTER);
        lbl7Column.setForeground(Color.WHITE);
        lbl7Column.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbl7Column.setBounds(583, 465, 28, 14);
        contentPane.add(lbl7Column);
        
        lbl8Column = new JLabel("8");
        lbl8Column.setHorizontalAlignment(SwingConstants.CENTER);
        lbl8Column.setForeground(Color.WHITE);
        lbl8Column.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbl8Column.setBounds(643, 465, 28, 14);
        contentPane.add(lbl8Column);
        
        setLocationRelativeTo(null); 
    }

    private void addItemListener() {
        JToggleButton[] seatSelections = {tglbtnA1SeatSelection, tglbtnA2SeatSelection, tglbtnA3SeatSelection, tglbtnA4SeatSelection, tglbtnA5SeatSelection, tglbtnA6SeatSelection, tglbtnA7SeatSelection, tglbtnA8SeatSelection,
                                tglbtnB1SeatSelection, tglbtnB2SeatSelection, tglbtnB3SeatSelection, tglbtnB4SeatSelection, tglbtnB5SeatSelection, tglbtnB6SeatSelection, tglbtnB7SeatSelection, tglbtnB8SeatSelection,
                                tglbtnC1SeatSelection, tglbtnC2SeatSelection, tglbtnC3SeatSelection, tglbtnC4SeatSelection, tglbtnC5SeatSelection, tglbtnC6SeatSelection, tglbtnC7SeatSelection, tglbtnC8SeatSelection};

        ItemListener[] seatListeners = {a1SeatListener, a2SeatListener, a3SeatListener, a4SeatListener, a5SeatListener, a6SeatListener, a7SeatListener, a8SeatListener, b1SeatListener, b2SeatListener, b3SeatListener, b4SeatListener, b5SeatListener, b6SeatListener, b7SeatListener, b8SeatListener, c1SeatListener, c2SeatListener, c3SeatListener, c4SeatListener, c5SeatListener, c6SeatListener, c7SeatListener, c8SeatListener};

        for (int i = 0; i < seatSelections.length; i++) {
            seatSelections[i].addItemListener(seatListeners[i]);
        }
    }

    private void removeItemListener() {
        JToggleButton[] seatSelections = {tglbtnA1SeatSelection, tglbtnA2SeatSelection, tglbtnA3SeatSelection, tglbtnA4SeatSelection, tglbtnA5SeatSelection, tglbtnA6SeatSelection, tglbtnA7SeatSelection, tglbtnA8SeatSelection,
                                tglbtnB1SeatSelection, tglbtnB2SeatSelection, tglbtnB3SeatSelection, tglbtnB4SeatSelection, tglbtnB5SeatSelection, tglbtnB6SeatSelection, tglbtnB7SeatSelection, tglbtnB8SeatSelection,
                                tglbtnC1SeatSelection, tglbtnC2SeatSelection, tglbtnC3SeatSelection, tglbtnC4SeatSelection, tglbtnC5SeatSelection, tglbtnC6SeatSelection, tglbtnC7SeatSelection, tglbtnC8SeatSelection};

        ItemListener[] seatListeners = {a1SeatListener, a2SeatListener, a3SeatListener, a4SeatListener, a5SeatListener, a6SeatListener, a7SeatListener, a8SeatListener, b1SeatListener, b2SeatListener, b3SeatListener, b4SeatListener, b5SeatListener, b6SeatListener, b7SeatListener, b8SeatListener, c1SeatListener, c2SeatListener, c3SeatListener, c4SeatListener, c5SeatListener, c6SeatListener, c7SeatListener, c8SeatListener};

        for (int i = 0; i < seatSelections.length; i++) {
            seatSelections[i].removeItemListener(seatListeners[i]);
        }
    }

    private void disableSeats() {
        JToggleButton[] seats = {tglbtnA1SeatSelection, tglbtnA2SeatSelection, tglbtnA3SeatSelection, tglbtnA4SeatSelection, tglbtnA5SeatSelection, tglbtnA6SeatSelection, tglbtnA7SeatSelection, tglbtnA8SeatSelection, 
                                tglbtnB1SeatSelection, tglbtnB2SeatSelection, tglbtnB3SeatSelection, tglbtnB4SeatSelection, tglbtnB5SeatSelection, tglbtnB6SeatSelection, tglbtnB7SeatSelection, tglbtnB8SeatSelection, 
                                tglbtnC1SeatSelection, tglbtnC2SeatSelection, tglbtnC3SeatSelection, tglbtnC4SeatSelection, tglbtnC5SeatSelection, tglbtnC6SeatSelection, tglbtnC7SeatSelection, tglbtnC8SeatSelection};

        for (JToggleButton seat : seats) {
            seat.setEnabled(false);
        }
    }

    private void enableSeats() {
        if (ticketQuantity > 0) {
            btnBookTicket.setEnabled(true);
            btnReturnToTicket.setEnabled(true);
            btnIncrease.setEnabled(false);
            btnDecrease.setEnabled(false);

            JToggleButton[] seats = {tglbtnA1SeatSelection, tglbtnA2SeatSelection, tglbtnA3SeatSelection, tglbtnA4SeatSelection, tglbtnA5SeatSelection, tglbtnA6SeatSelection, tglbtnA7SeatSelection, tglbtnA8SeatSelection, 
                                    tglbtnB1SeatSelection, tglbtnB2SeatSelection, tglbtnB3SeatSelection, tglbtnB4SeatSelection, tglbtnB5SeatSelection, tglbtnB6SeatSelection, tglbtnB7SeatSelection, tglbtnB8SeatSelection, 
                                    tglbtnC1SeatSelection, tglbtnC2SeatSelection, tglbtnC3SeatSelection, tglbtnC4SeatSelection, tglbtnC5SeatSelection, tglbtnC6SeatSelection, tglbtnC7SeatSelection, tglbtnC8SeatSelection};

            boolean[] occupiedStatus = {A1Occupied, A2Occupied, A3Occupied, A4Occupied, A5Occupied, A6Occupied, A7Occupied, A8Occupied, 
                                    B1Occupied, B2Occupied, B3Occupied, B4Occupied, B5Occupied, B6Occupied, B7Occupied, B8Occupied, 
                                    C1Occupied, C2Occupied, C3Occupied, C4Occupied, C5Occupied, C6Occupied, C7Occupied, C8Occupied};

            for (int i = 0; i < seats.length; i++) {
                if (!occupiedStatus[i]) {
                    seats[i].setEnabled(true);
                } else {
                    seats[i].setBackground(Color.red);
                }
            }

            for (JToggleButton seat : seats) {
                seat.setSelected(false);
            }

            btnConfirmTicket.setEnabled(false);
            btnReturnToTicket.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a valid number of tickets.");
        }
    }

    private void resetSelection() {
        JToggleButton[] seats = {tglbtnA1SeatSelection, tglbtnA2SeatSelection, tglbtnA3SeatSelection, tglbtnA4SeatSelection, tglbtnA5SeatSelection, tglbtnA6SeatSelection, tglbtnA7SeatSelection, tglbtnA8SeatSelection, 
                                tglbtnB1SeatSelection, tglbtnB2SeatSelection, tglbtnB3SeatSelection, tglbtnB4SeatSelection, tglbtnB5SeatSelection, tglbtnB6SeatSelection, tglbtnB7SeatSelection, tglbtnB8SeatSelection, 
                                tglbtnC1SeatSelection, tglbtnC2SeatSelection, tglbtnC3SeatSelection, tglbtnC4SeatSelection, tglbtnC5SeatSelection, tglbtnC6SeatSelection, tglbtnC7SeatSelection, tglbtnC8SeatSelection};

        for (JToggleButton seat : seats) {
            seat.setSelected(false);
        }
    }
    
    private void clearAll() {
    	JToggleButton[] seats = {tglbtnA1SeatSelection, tglbtnA2SeatSelection, tglbtnA3SeatSelection, tglbtnA4SeatSelection, tglbtnA5SeatSelection, tglbtnA6SeatSelection, tglbtnA7SeatSelection, tglbtnA8SeatSelection, 
                tglbtnB1SeatSelection, tglbtnB2SeatSelection, tglbtnB3SeatSelection, tglbtnB4SeatSelection, tglbtnB5SeatSelection, tglbtnB6SeatSelection, tglbtnB7SeatSelection, tglbtnB8SeatSelection, 
                tglbtnC1SeatSelection, tglbtnC2SeatSelection, tglbtnC3SeatSelection, tglbtnC4SeatSelection, tglbtnC5SeatSelection, tglbtnC6SeatSelection, tglbtnC7SeatSelection, tglbtnC8SeatSelection};
    	
    	A1Occupied = false; 
    	A2Occupied = false; 
    	A3Occupied = false; 
    	A4Occupied = false; 
    			 
    	A5Occupied = false; 
    	A6Occupied = false; 
    	A7Occupied = false; 
    	A8Occupied = false;
		 
    	B1Occupied = false; 
    	B2Occupied = false; 
    	B3Occupied = false; 
    	B4Occupied = false; 
    			 
    	B5Occupied = false; 
    	B6Occupied = false; 
    	B7Occupied = false; 
    	B8Occupied = false;
    	 
    	C1Occupied = false; 
    	C2Occupied = false; 
    	C3Occupied = false; 
    	C4Occupied = false; 
    		 
    	C5Occupied = false; 
    	C6Occupied = false; 
    	C7Occupied = false; 
    	C8Occupied = false;

		for (JToggleButton seat : seats) {
			seat.setSelected(false);
		}
    }
    
    public String getCurrentTime() {
        LocalTime time = LocalTime.now();
        return time.toString();
    }
}