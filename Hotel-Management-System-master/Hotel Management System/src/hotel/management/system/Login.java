package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;

    Login() {
        super("Login");
        setLayout(null);

//        l1 = new JLabel("Username");
//        l1.setBounds(100, 150, 100, 30);
//        add(l1);

//        l2 = new JLabel("Password");
//        l2.setBounds(40, 70, 100, 30);
//        add(l2);



// ...

        t1 = new JTextField();
        t1.setBounds(393, 213, 200, 28);
        t1.setForeground(Color.WHITE);
        t1.setBackground(new Color(3, 20, 28));
        t1.setBorder(new EmptyBorder(0, 0, 0, 0)); // Set an empty border
        add(t1);

        t2 = new JPasswordField();
        t2.setBounds(393, 303, 200, 28);
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(3, 20, 28));
        t2.setBorder(new EmptyBorder(0, 0, 0, 0)); // Set an empty border
        add(t2);



        // Load the image and scale it to fit the JFrame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/new_login.png"));
        Image i2 = i1.getImage().getScaledInstance(1200, 628, Image.SCALE_SMOOTH); // Use SCALE_SMOOTH for better quality
        ImageIcon i3 = new ImageIcon(i2);

        // Set the image as the background by using a JLabel
        JLabel background = new JLabel(i3);
        background.setBounds(0, 0, 1200, 628); // Set the size to match the JFrame
        add(background);

        b1 = new JButton("SUBMIT");
        b1.setBounds(403, 438, 120, 30);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.setFocusPainted(false); // Disable focus painting
        b1.setBorderPainted(false); // Disable border painting
        b1.setContentAreaFilled(false); // Disable default content painting
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

//        b2 = new JButton("Cancel");
//        b2.setBounds(180, 140, 120, 30);
//        b2.setFont(new Font("serif", Font.BOLD, 15));
//        b2.setBackground(Color.BLACK);
//        b2.setForeground(Color.WHITE);
//        add(b2);
//
//        b2.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(1200, 628); // Set the frame size to match the image size
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                conn c1 = new conn();
                String u = t1.getText();
                String v = t2.getText();

                String q = "select * from login where username='" + u + "' and password='" + v + "'";

                ResultSet rs = c1.s.executeQuery(q);
                if (rs.next()) {
                    new Dashboard().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main(String[] arg) {
        new Login();
    }
}
