package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.Timer;

public class Dashboard extends JFrame {

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }

    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");

        setForeground(Color.CYAN);
        setLayout(null);

        // Create a layered pane to hold components with layers
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1400, 700);

        // Add the first image
        ImageIcon image1Icon = new ImageIcon(ClassLoader.getSystemResource("icons/hotel.jpg"));
        Image image1 = image1Icon.getImage().getScaledInstance(340, 633, Image.SCALE_DEFAULT);
        ImageIcon image1IconResized = new ImageIcon(image1);
        JLabel image1Label = new JLabel(image1IconResized);
        image1Label.setBounds(3, 0, 340, 637);
        layeredPane.add(image1Label, JLayeredPane.DEFAULT_LAYER);

        // Add the second image
        ImageIcon image2Icon = new ImageIcon(ClassLoader.getSystemResource("icons/hotel_2.jpg"));
        Image image2 = image2Icon.getImage().getScaledInstance(1037, 633, Image.SCALE_DEFAULT);
        ImageIcon image2IconResized = new ImageIcon(image2);
        JLabel image2Label = new JLabel(image2IconResized);
        image2Label.setBounds(315, 0, 1100, 637);
        layeredPane.add(image2Label, JLayeredPane.DEFAULT_LAYER);

        // Create a JLabel for the text
        JLabel customTextLabel = new JLabel();
        customTextLabel.setForeground(Color.white);
        customTextLabel.setFont(new Font("Arial", Font.BOLD, 100));
        customTextLabel.setBounds(240, 50, 1400, 200);
        layeredPane.add(customTextLabel, JLayeredPane.PALETTE_LAYER);

        // Create a Timer to update the text position
        Timer timer = new Timer(180, new ActionListener() {
            int wordIndex = 0;
            String[] words = {"WELCOME", "TO", "HOTEL", "BLUE", "MOON"};
            StringBuilder displayedText = new StringBuilder();
            boolean blueLineBreak = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (wordIndex < words.length) {
                    if (wordIndex > 0) {
                        displayedText.append(" "); // Add space between words
                    }
                    displayedText.append(words[wordIndex]);
                    if (wordIndex == 2 && !blueLineBreak) {
                        displayedText.append("<br>"); // Add line break after "BLUE"
                        blueLineBreak = true;
                    }
                    customTextLabel.setText("<html>" + displayedText.toString() + "</html>");
                    wordIndex++;
                } else {
                    // Stop the timer when all words have been displayed
                    ((Timer) e.getSource()).stop();
                }
            }
        });
        timer.start();



        // Create the JMenuBar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(23, 14, 46));
        menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        menuBar.setBorderPainted(false);

        // Set the JMenuBar to the frame
        setJMenuBar(menuBar);

        JMenu hotelSystemMenu = new JMenu("HOTEL MANAGEMENT");
        hotelSystemMenu.setForeground(Color.WHITE);
        hotelSystemMenu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        menuBar.add(hotelSystemMenu);

        JMenuItem receptionMenuItem = new JMenuItem("RECEPTION");
        receptionMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        hotelSystemMenu.add(receptionMenuItem);

        JMenu adminMenu = new JMenu("ADMIN");
        adminMenu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        adminMenu.setForeground(Color.white);
        menuBar.add(adminMenu);

        JMenuItem addEmployeeMenuItem = new JMenuItem("ADD EMPLOYEE");
        addEmployeeMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        adminMenu.add(addEmployeeMenuItem);

        addEmployeeMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddEmployee().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JMenuItem addRoomsMenuItem = new JMenuItem("ADD ROOMS");
        addRoomsMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        adminMenu.add(addRoomsMenuItem);

        addRoomsMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddRoom().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        receptionMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new Reception();
            }
        });

        JMenuItem addDriversMenuItem = new JMenuItem("ADD DRIVERS");
        addDriversMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        adminMenu.add(addDriversMenuItem);

        addDriversMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddDrivers().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        // Set the layered pane as the content pane of the frame
        setContentPane(layeredPane);

        setSize(1400, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
