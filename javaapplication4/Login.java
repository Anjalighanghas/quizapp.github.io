
package javaapplication4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton start,exit;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE); //takes whole panel
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        setLayout(null);
        image.setBounds(0,0,600,500);
        add(image);
        JLabel heading1=new JLabel("TeQuiz");
        JLabel heading2=new JLabel("-A Technical quiz");
        heading1.setBounds(900,70,300,45);
        heading2.setBounds(950,110,300,45);
        heading1.setFont(new Font("Comic Sans MC",Font.BOLD,40));
        heading2.setFont(new Font("Comic Sans MC",Font.ITALIC,18));
        
        add(heading1);
        add(heading2);
        JLabel name=new JLabel("Enter your name:");
        name.setBounds(800,200,300,30);
        name.setFont(new Font("Times New Roman",Font.PLAIN,30));
        //name.setForeground(new Color(30,144,254));
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(790,250,300,25);
        tfname.setFont(new Font("Times New Roman",Font.PLAIN,20));
        add(tfname);
        
        start=new JButton("Start");
        start.setBounds(790,300,100,25);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        add(start);
        
        exit=new JButton("Exit");
        exit.setBounds(950,300,100,25);
        exit.setBackground(new Color(30,144,254));
        exit.setForeground(Color.WHITE);
        add(exit);
        start.addActionListener(this);
        exit.addActionListener(this);
        setSize(1200,500);
        setLocation(200,200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evt){
        if(evt.getSource() == start){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
            
        }
        
        else if(evt.getSource() == exit)
        {
            setVisible(false);
        }
    }
    public static void main(String args[])
    {
        Login l=new Login();
        
    }
}
