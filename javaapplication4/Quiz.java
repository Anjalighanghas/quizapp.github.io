
package javaapplication4;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{

    String questions[][]=new String[12][5];
    String answers[][]=new String[12][2];
    String userAnswers[][]=new String[12][1];
    
    public static int count=0;
    JLabel qno,ques;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupOptions;
    JButton next,lifeline,submit;
    public static int timer=30;
    public static int ans_given=0;
    public static int score=0;
    String name;
    
    Quiz(String name)
    {
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image=new JLabel(i1);
        setLayout(null);
        image.setBounds(0,0,1200,300);
        add(image);
        
        qno=new JLabel("1.");
        qno.setBounds(80,350,50,30);
        qno.setFont(new Font("New Times Roman",Font.PLAIN,20));
        add(qno);
        
        ques=new JLabel("");
        ques.setBounds(120,340,1000,50);
        ques.setFont(new Font("New Times Roman",Font.PLAIN,20));
        add(ques);
        
       
        
        questions[0][0] = "Which statement is true about Java?";
        questions[0][1] = "Java is a sequence-dependent programming language";
        questions[0][2] = " Java is a code dependent programming language";
        questions[0][3] = "Java is a platform-dependent programming language";
        questions[0][4] = "Java is a platform-independent programming language";

        questions[1][0] = "Which is used to find and fix bugs in the Java programs?";
        questions[1][1] = "JVM";
        questions[1][2] = "JDK";
        questions[1][3] = "JRE";
        questions[1][4] = "JDB";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "What does the expression float a = 35 / 0 return?";
        questions[5][1] = "0";
        questions[5][2] = "Not a Number";
        questions[5][3] = "Infinity";
        questions[5][4] = "Run time exception";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "Evaluate the following Java expression, if x=3, y=5, and z=10:++z + y - y + z + x++.";

				
        questions[7][1] = "23";
        questions[7][2] = "24";
        questions[7][3] = "20";
        questions[7][4] = "25";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following for loop declaration is not valid?";
        questions[9][1] = "for ( int i = 99; i >= 0; i / 9 )";
        questions[9][2] = "for ( int i = 7; i <= 77; i += 7 )";
        questions[9][3] = "for ( int i = 20; i >= 2; - -i )";
        questions[9][4] = "for ( int i = 2; i <= 20; i = 2* i )";
	
	questions[10][0] = "Which of the following option leads to the portability and security of Java?";
        questions[10][1] = "Bytecode is executed by JVM";
        questions[10][2] = "The applet makes the Java code secure and portable";
        questions[10][3] = "Use of exception handling";
        questions[10][4] = "Dynamic binding between objects";
	
	questions[11][0] = "Which of the following is true about the anonymous inner class?";
        questions[11][1] = "It has only methods";
        questions[11][2] = "Objects can't be created";
        questions[11][3] = "It has a fixed class name";
        questions[11][4] = "It has no class name";

	
        
        answers[0][1] = "Java is a platform-independent programming language";
        answers[1][1] = "JDB";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Infinity";
        answers[6][1] = "import";
        answers[7][1] = "25";
        answers[8][1] = "java.lang.StringBuilder";
 	answers[9][1] = "for ( int i = 99; i >= 0; i / 9 )";
        answers[10][1] = "Bytecode is executed by JVM";
	answers[11][1] = "It has no class name";
	
        
        opt1=new JRadioButton("");
        opt1.setBounds(120,400,1000,30);
        opt1.setFont(new Font("New Times Roman",Font.PLAIN,18));
        opt1.setBackground(Color.WHITE);
        add(opt1);
        
        opt2=new JRadioButton("");
        opt2.setBounds(120,430,1000,30);
        opt2.setFont(new Font("New Times Roman",Font.PLAIN,18));
        opt2.setBackground(Color.WHITE);
        add(opt2);
        
        opt3=new JRadioButton("");
        opt3.setBounds(120,460,1000,30);
        opt3.setFont(new Font("New Times Roman",Font.PLAIN,18));
        opt3.setBackground(Color.WHITE);
        add(opt3);
        
        opt4=new JRadioButton("");
        opt4.setBounds(120,490,1000,30);
        opt4.setFont(new Font("New Times Roman",Font.PLAIN,18));
        opt4.setBackground(Color.WHITE);
        add(opt4);
        
        groupOptions=new ButtonGroup();
        groupOptions.add(opt1);
        groupOptions.add(opt2);
        groupOptions.add(opt3);
        groupOptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(100,550,100,30);
        next.setFont(new Font("New Times Roman",Font.PLAIN,18));
        next.setBackground(Color.GREEN);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("50 50 lifeline");
        lifeline.setBounds(250,550,100,30);
        lifeline.setFont(new Font("New Times Roman",Font.PLAIN,18));
        lifeline.setBackground(Color.ORANGE);
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(400,550,100,30);
        submit.setFont(new Font("New Times Roman",Font.PLAIN,18));
        submit.setBackground(Color.GREEN);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setLayout(null);
        setSize(1200,700);
        setLocation(200,200);
        setVisible(true);
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        String time = "Time left " + timer + " seconds";
        g.setColor(Color.black);
        g.setFont(new Font("Times New Roman",Font.BOLD,35));
        
        if(timer>0)
        {
            g.drawString(time, 850, 620);
        }else
        {
            g.drawString("Time's up!", 850, 620);
        }
        
        timer--;
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given=0; // to assign answer given for next question as zero
            timer=30; // setting timer for next question
        }
        else if(timer < 0){
            timer = 30;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 10){
               next.setEnabled(false);
               submit.setEnabled(true);
           }
           
            if(count == 11)
            {
                if(groupOptions.getSelection() == null)
                {
               userAnswers[count][0]="";
                }
                else
                {
               //fetches the value of given answer
               userAnswers[count][0]=groupOptions.getSelection().getActionCommand();
                }
                for(int i=0;i<userAnswers.length;i++)
                {
                    if(userAnswers[i][0].equals(answers[i][1]))
                    {
                        score += 1;
                    }
                }
                setVisible(false);
            }
            else
            {
                if(groupOptions.getSelection() == null)
           {
               userAnswers[count][0]="";
           }else
           {
               //fetches the value of given answer
               userAnswers[count][0]=groupOptions.getSelection().getActionCommand();
           }
            }
            //if no option is selected
           if(groupOptions.getSelection() == null)
           {
               userAnswers[count][0]="";
           }else
           {
               //fetches the value of given answer
               userAnswers[count][0]=groupOptions.getSelection().getActionCommand();
           }
           
           
           count++;
           //
           start(count);
        }
    }
    
    
    public void start(int count)
    {
        qno.setText("" + (count + 1) + ".");
        ques.setText(questions[count][0]);
        
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupOptions.clearSelection();
        
        
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource() == next)
        {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            
            if(groupOptions.getSelection() == null)
           {
               userAnswers[count][0]="";
           }
            else
           {
               //fetches the value of given answer
               userAnswers[count][0]=groupOptions.getSelection().getActionCommand();
           }
             
            if(count == 10){
               next.setEnabled(false);
               submit.setEnabled(true);
           }
            count++;
            start(count);
        }
        else if(evt.getSource() == lifeline)
        {
            if(count == 0){
                opt2.setEnabled(false);
                opt4.setEnabled(false);
            }
            else if(count == 1)
            {
                opt1.setEnabled(false);
                opt2.setEnabled(false);
            }
            else if(count == 2)
            {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }
            else if(count == 3)
            {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            else if(count == 4)
            {
                opt1.setEnabled(false);
                opt3.setEnabled(false);
            }
            else if(count == 5)
            {
                opt2.setEnabled(false);
                opt4.setEnabled(false);
            }
            else if(count == 6)
            {
                opt3.setEnabled(false);
                opt4.setEnabled(false);
            }
            else if(count == 7)
            {
                opt1.setEnabled(false);
                opt3.setEnabled(false);
            }
            else if(count == 8)
            {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }
            else if(count == 9)
            {
                opt3.setEnabled(false);
                opt4.setEnabled(false);
            }
            else if(count == 10)
            {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }
            else{
                opt1.setEnabled(false);
                opt3.setEnabled(false);
            }
           lifeline.setEnabled(false); 
        }
        
        else if(evt.getSource() == submit)
        {
            ans_given=1;
            if(groupOptions.getSelection() == null)
                {
               userAnswers[count][0]="";
                }
                else
                {
               //fetches the value of given answer
               userAnswers[count][0]=groupOptions.getSelection().getActionCommand();
                }
                for(int i=0;i<userAnswers.length;i++)
                {
                    if(userAnswers[i][0].equals(answers[i][1]))
                    {
                        score += 1;
                    }
                }
                setVisible(false);
                new Score(name,score);
        }
                
                    
                
                
    }
    public static void main(String[] args) {
        Quiz q=new Quiz("User");
    }
    
}
