package hotel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class AddEmployee extends JFrame { // Third Frame

    JTextField nameField, ageField, salaryField, phoneField, aadharField, emailField;
    JComboBox<String> c1;
    JRadioButton maleRadioButton, femaleRadioButton;

    public AddEmployee() {
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(new Color(209, 211, 211));
        setTitle("ADD EMPLOYEE DETAILS");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(778, 486);
        getContentPane().setLayout(null);

        JLabel nameLabel = new JLabel("NAME");
        nameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        nameLabel.setBounds(60, 30, 150, 27);
        add(nameLabel);

        nameField = createStyledTextField();
        nameField.setBounds(200, 30, 150, 27);
        add(nameField);

        // Add FocusListener to nameField
        nameField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                nameField.setBorder(new LineBorder(new Color(88, 164, 255), 2, true));
            }

            @Override
            public void focusLost(FocusEvent e) {
                nameField.setBorder(new LineBorder(Color.gray, 1));
            }
        });

        JLabel ageLabel = new JLabel("AGE");
        ageLabel.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        ageLabel.setBounds(60, 80, 150, 27);
        add(ageLabel);

        ageField = createStyledTextField();
        ageField.setBounds(200, 80, 150, 27);
        add(ageField);

        // Add FocusListener to ageField
        ageField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                ageField.setBorder(new LineBorder(new Color(88, 164, 255), 2, true));
            }

            @Override
            public void focusLost(FocusEvent e) {
                ageField.setBorder(new LineBorder(Color.gray, 1));
            }
        });

        JLabel genderLabel = new JLabel("GENDER");
        genderLabel.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        genderLabel.setBounds(60, 120, 150, 27);
        add(genderLabel);

        maleRadioButton = new JRadioButton("MALE");
        maleRadioButton.setBackground(Color.WHITE);
        maleRadioButton.setBounds(200, 120, 70, 27);
        maleRadioButton.setOpaque(false);
        add(maleRadioButton);

        femaleRadioButton = new JRadioButton("FEMALE");
        femaleRadioButton.setBackground(Color.WHITE);
        femaleRadioButton.setBounds(280, 120, 75, 27);
        femaleRadioButton.setOpaque(false);
        add(femaleRadioButton);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        JLabel jobLabel = new JLabel("JOB");
        jobLabel.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        jobLabel.setBounds(60, 170, 150, 27);
        add(jobLabel);

        String[] course = {"Front Desk Clerks", "Porters", "Housekeeping", "Kitchen Staff", "Room Service",
                "Waiter/Waitress", "Manager", "Accountant", "Chef"};
        c1 = new JComboBox<>(course);
        c1.setBackground(Color.WHITE);
        c1.setBackground(new Color(226, 232, 239));
        c1.setBounds(200, 170, 150, 30);
        add(c1);

        JLabel salaryLabel = new JLabel("SALARY");
        salaryLabel.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        salaryLabel.setBounds(60, 220, 150, 27);
        add(salaryLabel);

        salaryField = createStyledTextField();
        salaryField.setBounds(200, 220, 150, 27);
        add(salaryField);

        // Add FocusListener to salaryField
        salaryField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                salaryField.setBorder(new LineBorder(new Color(88, 164, 255), 2, true));
            }

            @Override
            public void focusLost(FocusEvent e) {
                salaryField.setBorder(new LineBorder(Color.gray, 1));
            }
        });

        JLabel phoneLabel = new JLabel("PHONE");
        phoneLabel.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        phoneLabel.setBounds(60, 270, 150, 27);
        add(phoneLabel);

        phoneField = createStyledTextField();
        phoneField.setBounds(200, 270, 150, 27);
        add(phoneField);

        // Add FocusListener to phoneField
        phoneField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                phoneField.setBorder(new LineBorder(new Color(88, 164, 255), 2, true));
            }

            @Override
            public void focusLost(FocusEvent e) {
                phoneField.setBorder(new LineBorder(Color.gray, 1));
            }
        });

        JLabel aadharLabel = new JLabel("AADHAR");
        aadharLabel.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        aadharLabel.setBounds(60, 320, 150, 27);
        add(aadharLabel);

        aadharField = createStyledTextField();
        aadharField.setBounds(200, 320, 150, 27);
        add(aadharField);

        // Add FocusListener to aadharField
        aadharField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                aadharField.setBorder(new LineBorder(new Color(88, 164, 255), 2, true));
            }

            @Override
            public void focusLost(FocusEvent e) {
                aadharField.setBorder(new LineBorder(Color.gray, 1));
            }
        });

        JLabel emailLabel = new JLabel("EMAIL");
        emailLabel.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        emailLabel.setBounds(60, 370, 150, 27);
        add(emailLabel);

        emailField = createStyledTextField();
        emailField.setBounds(200, 370, 150, 27);
        add(emailField);

        // Add FocusListener to emailField
        emailField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                emailField.setBorder(new LineBorder(new Color(88, 164, 255), 2, true));
            }

            @Override
            public void focusLost(FocusEvent e) {
                emailField.setBorder(new LineBorder(Color.gray, 1));
            }
        });

        setVisible(true);

        JLabel addLabel = new JLabel("ADD EMPLOYEE DETAILS");
        addLabel.setForeground(Color.BLUE);
        addLabel.setFont(new Font("Segoe UI", Font.PLAIN, 31));
        addLabel.setBounds(450, 13, 442, 35);
        add(addLabel);


        JButton saveButton = new JButton("SAVE");
        saveButton.setBounds(200, 420, 150, 30);
        saveButton.setBackground(new Color(68, 147, 228));
        saveButton.setForeground(Color.white);
        add(saveButton);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/employee.jpg"));
        Image i3 = i1.getImage().getScaledInstance(612, 408, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel image = new JLabel(i2);
        image.setBounds(410, 50, 480, 410);
        add(image);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String name = nameField.getText();
                String age = ageField.getText();
                String salary = salaryField.getText();
                String phone = phoneField.getText();
                String aadhar = aadharField.getText();
                String email = emailField.getText();

                String gender = null;

                if (maleRadioButton.isSelected()) {
                    gender = "Male";
                } else if (femaleRadioButton.isSelected()) {
                    gender = "Female";
                }

                String job = (String) c1.getSelectedItem();

                try {
                    conn c = new conn();
                    String str = "INSERT INTO employee values( '" + name + "', '" + age + "', '" + gender + "','" + job
                            + "', '" + salary + "', '" + phone + "','" + aadhar + "', '" + email + "')";

                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null, "Employee Added");
                    setVisible(false);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        setSize(1000, 570);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private JTextField createStyledTextField() {
        JTextField textField = new JTextField();
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        textField.setForeground(Color.BLACK);
        textField.setBackground(new Color(226, 232, 239));
        return textField;
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
