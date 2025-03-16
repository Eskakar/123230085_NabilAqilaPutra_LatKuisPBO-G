
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latkuizpbo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




/**
 *
 * @author ASUS
 */
public class Login extends JFrame implements ActionListener{
    //stats login
    public boolean status = false;
    //username dan password
    final String username = "123230085";
    final String password = "ifkelasg";
    JLabel lUsername = new JLabel("Username : ");
    JLabel lPassword = new JLabel("Password : ");
        private JTextField inUsername = new JTextField();
    private JTextField inPassword = new JTextField();
    
    //button
    JButton btnLogin = new JButton("Login");
    
    public Login(){
        setTitle("Login");
        setDefaultCloseOperation(3);
        setSize(300,200);
        
        setLayout(null);
        add(lUsername);
        add(inUsername);
        add(lPassword);
        add(inPassword); 
        add(btnLogin);
        
        //set bound
        lUsername.setBounds(10,10,120,20);
        inUsername.setBounds(140,10,120,20);
        lPassword.setBounds(10,40,120,20);
        inPassword.setBounds(140,40,120,20);
        btnLogin.setBounds(65,80,120,20);
        
        //listener
        btnLogin.addActionListener(this);
        
        //biar framenya tampil ditengah
        setLocationRelativeTo(null);
	setVisible(true);
    }
    public void actionPerformed(ActionEvent e){ //ini harus ada untuk override Action listener
	if(e.getSource()==btnLogin){
            String buffer2 = inPassword.getText();
            String buffer1 = inUsername.getText();
            if(buffer2.equals(password) && buffer2.equals(username)){
                JOptionPane.showMessageDialog(null,"Login Berhasil","Login",JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new Home();
            }else{
                JOptionPane.showMessageDialog(null,"Login Gagal","Login",JOptionPane.INFORMATION_MESSAGE);
            }
	}
    }
    
}
