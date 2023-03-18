
package javaapplication4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
 
    JButton exit,playAgain;
    String name;
    Score(String name,int score)
    {
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i1);
        setLayout(null);
        image.setBounds(0,200,300,250);
        add(image);
        
        JLabel heading=new JLabel("Thankyou " + name + " for taking Quiz");
        heading.setBounds(20,50,700,80);
        heading.setFont(new Font("New Times Roman",Font.ITALIC,50));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel Score2=new JLabel("Your score is " + score);
        Score2.setBounds(400,220,700,80);
        Score2.setFont(new Font("New Times Roman",Font.ITALIC,50));
        Score2.setForeground(Color.BLACK);
        add(Score2);
        
        exit= new JButton("Exit");
        exit.setBounds(620,320,100,30);
        exit.setFont(new Font("New Times Roman",Font.PLAIN,18));
        exit.setBackground(Color.GREEN);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        playAgain= new JButton("Play again");
        playAgain.setBounds(420,320,150,30);
        playAgain.setFont(new Font("New Times Roman",Font.PLAIN,18));
        playAgain.setBackground(Color.ORANGE);
        playAgain.setForeground(Color.WHITE);
        playAgain.addActionListener(this);
        add(playAgain); 
        
        
        setLayout(null);
        setSize(900,600);
        setLocation(400,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource() == exit)
        {
            setVisible(false);
        }
        else
        {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String args[])
    {
        Score s = new Score("User",0);
    }
}
