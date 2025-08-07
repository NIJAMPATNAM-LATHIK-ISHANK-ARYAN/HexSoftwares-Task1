/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

/**
 *
 * @author nlshi
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JButton login, signup, clear;
    JTextField accTextField;
    JPasswordField pwdTextField; 

    Login() {
        setTitle("A.T.M");
        setLayout(null);

       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo(1).jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel label = new JLabel(i3); 
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel accno = new JLabel("A/c No:");
        accno.setFont(new Font("Raleway", Font.BOLD, 28)); 
        accno.setBounds(120, 150, 250, 30); 
        add(accno);

        accTextField = new JTextField();
        accTextField.setBounds(300, 150, 230, 30);
        accTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(accTextField);

        JLabel pwd = new JLabel("Password:");
        pwd.setFont(new Font("Raleway", Font.BOLD, 28)); 
        pwd.setBounds(120, 220, 250, 30);
        add(pwd);

        
        pwdTextField = new JPasswordField(); 
        pwdTextField.setBounds(300, 220, 230, 30);
        pwdTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pwdTextField);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 300, 100, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        login = new JButton("LOGIN"); 
        login.setBounds(300, 350, 230, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocation(350, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            accTextField.setText("");
            pwdTextField.setText("");
        } else if (ae.getSource() == signup) {
            JOptionPane.showMessageDialog(null, "Sign Up Clicked!");
        } else if (ae.getSource() == login) {
            String accNum = accTextField.getText();
            String password = new String(pwdTextField.getPassword());
            JOptionPane.showMessageDialog(null, "Login Clicked!\nAcc: " + accNum + "\nPwd: " + password);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}