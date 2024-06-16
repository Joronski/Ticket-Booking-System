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

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JProgressBar;

public class frameSplashScreen extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public static JProgressBar progressBar;

    public frameSplashScreen() {
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        ImageIcon iconSecond = new ImageIcon(this.getClass().getResource("/ticket-loading.gif"));
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/orange-background.png"));
        
        JLabel lblWelcomeText = new JLabel("Welcome to Recio's Group Multi-form Ticket Booking System ");
        lblWelcomeText.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcomeText.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblWelcomeText.setForeground(new Color(255, 255, 255));
        lblWelcomeText.setBounds(10, 11, 780, 48);
        contentPane.add(lblWelcomeText);
        
        JLabel lblLoadingText = new JLabel("Starting Application...");
        lblLoadingText.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblLoadingText.setForeground(new Color(255, 255, 255));
        lblLoadingText.setHorizontalAlignment(SwingConstants.CENTER);
        lblLoadingText.setBounds(297, 519, 190, 20);
        contentPane.add(lblLoadingText);
        
        JLabel lblCopyright = new JLabel("© 2024 RECIO's Group");
        lblCopyright.setForeground(new Color(255, 255, 255));
        lblCopyright.setHorizontalAlignment(SwingConstants.CENTER);
        lblCopyright.setBounds(220, 60, 345, 14);
        contentPane.add(lblCopyright);
        
        // Set UIManager properties to change the color of the progress bar text
        UIManager.put("ProgressBar.selectionForeground", Color.BLACK);
        UIManager.put("ProgressBar.selectionBackground", Color.BLACK);

        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setBackground(new Color(255, 128, 0));
        progressBar.setForeground(new Color(255, 255, 255));
        progressBar.setBounds(55, 559, 672, 20);
        contentPane.add(progressBar);
        
        JLabel lblIcon = new JLabel("");
        lblIcon.setIcon(iconSecond);
        lblIcon.setBounds(190, 90, 400, 400);
        contentPane.add(lblIcon);

        JLabel lblImage = new JLabel("");
        lblImage.setIcon(icon);
        lblImage.setBounds(0, 0, 800, 600);
        contentPane.add(lblImage);

        setLocationRelativeTo(null);
    }
}
