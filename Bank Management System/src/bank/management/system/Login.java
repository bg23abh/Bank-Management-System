package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton  loginButton, signUpButton , clearButton;
    JTextField cardNoText;
    JPasswordField passwordText;
    Login() {
        setTitle("Automated Teller Machine");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("icon/logo.png"));
        Image resize_logo = logo.getImage().getScaledInstance(100, 100 , Image.SCALE_DEFAULT);
        ImageIcon new_logo = new ImageIcon(resize_logo);
        JLabel label = new JLabel(new_logo);
        label.setBounds(350, 10, 64, 64);
        add(label);
        
        JLabel title = new JLabel("Welcome to Bank");
        title.setFont(new Font("Osward", Font.BOLD , 38));
        title.setBounds(230, 40, 800, 100);
        add(title);
        
        JLabel cardNo = new JLabel("Card Number: ");
        cardNo.setFont(new Font("Osward", Font.BOLD, 20));
        cardNo.setBounds(180, 120, 800, 100);
        add(cardNo);
        
        cardNoText = new JTextField();
        cardNoText.setBounds(330, 150, 200, 40);
        add(cardNoText);
        
        JLabel password = new JLabel("Pin: ");
        password.setFont(new Font("Osward", Font.BOLD, 20));
        password.setBounds(180, 170, 800, 100);
        add(password);
        
        passwordText = new JPasswordField();
        passwordText.setBounds(330, 200, 200, 40);
        add(passwordText);
        
        loginButton = new JButton("Login");
        loginButton.setBackground(Color.decode("#3752A6"));
        loginButton.setForeground(Color.decode("#FFFFFF"));
        loginButton.addActionListener(this);
        loginButton. setBounds(330, 250, 80, 40);
        add(loginButton);
        
        clearButton = new JButton("Clear");
        clearButton.setBackground(Color.decode("#3752A6"));
        clearButton.setForeground(Color.decode("#FFFFFF"));
        clearButton.addActionListener(this);
        clearButton.setBounds(450, 250, 80, 40);
        add(clearButton);
        
        signUpButton = new JButton("Sign Up");
        signUpButton.setBackground(Color.decode("#3752A6"));
        signUpButton.setForeground(Color.decode("#FFFFFF"));
        signUpButton.addActionListener(this);
        signUpButton.setBounds(330, 300, 200, 40);
        add(signUpButton);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800, 450);
        setVisible(true);
        setLocation(300, 100);
        

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == clearButton){
            cardNoText.setText("");
            passwordText.setText("");
        }else if (e.getSource() == loginButton){
            
        }else if (e.getSource() == signUpButton){
            
        }
    }
    public static void main(String[] args) {
        System.out.println("Is it working");
        new Login();
    }

    
}
