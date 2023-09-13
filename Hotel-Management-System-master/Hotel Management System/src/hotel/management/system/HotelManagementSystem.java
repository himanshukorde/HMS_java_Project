package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {

        JLabel l1;
        JButton b1;

        public HotelManagementSystem() {
                setSize(1400, 700);
                setLocationRelativeTo(null); // Center the frame on the screen
                setLayout(null);

                l1 = new JLabel(" ");
                b1 = new JButton("<html><u>Next</u></html>");

                // Customize the button's appearance
                b1.setOpaque(false); // Make the button transparent
                b1.setContentAreaFilled(false); // Remove default content fill
                b1.setBorderPainted(false); // Remove button border
                b1.setFocusPainted(false); // Remove focus border
                b1.setForeground(Color.GRAY); // Text color
                b1.setFont(new Font("Arial", Font.BOLD, 20)); // Text font

                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1395, 695, Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);

                JLabel lid = new JLabel("HOTEL MANAGEMENT SYSTEM");
                lid.setBounds(30, 570, 1500, 100);
                lid.setFont(new Font("serif", Font.PLAIN, 30));
                lid.setForeground(Color.GRAY);
                l1.add(lid);

                // Create a JLabel for the text
                JLabel customTextLabel = new JLabel("HOTEL BLUE MOON");
                customTextLabel.setForeground(Color.white);
                customTextLabel.setFont(new Font("Arial", Font.BOLD, 80));
                customTextLabel.setBounds(240, 50, 1400, 200);
                l1.add(customTextLabel);

                // Create a JLabel for the text
                JLabel customTextLabel2 = new JLabel("Merge yourself with luxury");
                customTextLabel2.setForeground(Color.white);
                customTextLabel2.setFont(new Font("Palatino Linotype", Font.BOLD, 40));
                customTextLabel2.setBounds(240, 120, 1400, 200);
                l1.add(customTextLabel2);


                b1.setBounds(1170, 595, 130, 40);
                l1.setBounds(0, 0, 1400, 700); // Adjusted dimensions to match frame size

                // Remove title bar
                setUndecorated(true);

                l1.add(b1);
                add(l1);

                b1.addActionListener(this);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the frame when clicking the close button
                setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
                new Login().setVisible(true);
                this.dispose(); // Close the current frame
        }

        public static void main(String[] args) {
                SwingUtilities.invokeLater(() -> {
                        HotelManagementSystem window = new HotelManagementSystem();
                        window.setVisible(true);
                });
        }
}
