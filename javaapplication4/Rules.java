
package javaapplication4;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Rules(String name){
        this.name=name;
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       JLabel heading1=new JLabel("Welcome " +name +" to TeQuiz");
       JLabel heading2=new JLabel("Rules:");
       heading1.setBounds(200,20,800,45);
       heading2.setBounds(50,80,300,45);
       heading1.setFont(new Font("Comic Sans MC",Font.BOLD,40));
       heading2.setFont(new Font("Comic Sans MC",Font.ITALIC,25));
       add(heading1);
       add(heading2);
       
       JLabel rules = new JLabel();
       rules.setBounds(50,150,650,300);
       rules.setFont(new Font("Comic Sans MC",Font.PLAIN,20));
       rules.setText(
       "<html>"+ 
                "1. There are total 12 questions." + "<br><br>" +
                "2. 30 seconds are provided for each question." + "<br><br>" +
		"3.Each question contains 1 marks." + "<br><br>" +
                "4. After 30 seconds,the page will redirect to next question" + "<br><br>" +
                "5. 1 lifeline '50-50' can be used once.(2 options will be removed)" + "<br><br>" +
                
		
            "</html>"
       );
       add(rules);
       
       start=new JButton("Start");
       start.setBounds(200,500,100,25);
       start.setBackground(new Color(30,144,254));
       start.setForeground(Color.WHITE);
       add(start);
       
       back=new JButton("Back");
       back.setBounds(450,500,100,25);
       back.setBackground(new Color(30,144,254));
       back.setForeground(Color.WHITE);
       add(back);
       
       start.addActionListener(this);
       back.addActionListener(this);
       
       setSize(900,650);
       setLocation(350,100);
       //making frame visible
       setVisible(true);
    }
     public void actionPerformed(ActionEvent evt)
     {
         if(evt.getSource() == start)
         {
             setVisible(false);
             new Quiz(name);
         }
         else if(evt.getSource() == back)
         {
             setVisible(false);
             new Login();
         }
     }
    public static void main(String args[]){
        Rules r = new Rules("User");
    }
}
