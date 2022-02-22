package motivaor;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.event.*; 
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class MainFrame extends JPanel implements Runnable
{
    public void run() 
    {
        
        //Main Frame
        JFrame fr = new JFrame();
        fr.setBounds(0,0,1920,1080);
        fr.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fr.setUndecorated(true);
        fr.setResizable(true);
        fr.setLayout(null);
        


        //Quotes array (will change it to a quote class)
        String[] quotes = {" Consistency Matters Dude!"," Work Hard Util You Achieve It!"," Great People Discuss Ideas Not Other People!"," You Are Enough Just As You Are!","Everyday Is A Second Chance!"," You Are So Strong!"," Wake Up And Be Awesome!"," Always Believe In Yourself!","The purpose of our lives is to be happy!","You only live once, but if you do it right, once is enough!","Many of life’s failures are people who did not realize\nhow close they were to success when they gave up!"};
        int min = 0, max = quotes.length-1;//maximum and minimum values for choosing random quote{array first and last index}
        
        
        //container for storing objects
        Container c = fr.getContentPane();
        c.setLayout(null);

        //creating TextShower Class object
        TextShower ts = new TextShower();

        //Motivate Button
        JButton MotivatorButton = new JButton(new ImageIcon("C:\\Users\\DELLPC\\Pictures\\Assests\\MotivatorButton.png"));
        MotivatorButton.setText("Motivate ME!");
        MotivatorButton.setFont(new Font("Impact",Font.PLAIN,25));
        MotivatorButton.setForeground(Color.WHITE);
        MotivatorButton.setHorizontalTextPosition(JButton.CENTER);
        MotivatorButton.setVerticalTextPosition(JButton.CENTER);
        MotivatorButton.setBounds(0,0,200,100);
        MotivatorButton.setFocusPainted(false);
        MotivatorButton.setBorderPainted(false);
        MotivatorButton.setContentAreaFilled(false);


        //Exit Button
        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(0,0,400,400);
        exitButton.setFont(new Font("Impact",Font.PLAIN,15));
        exitButton.setForeground(Color.WHITE);
        exitButton.setBackground(Color.orange);
        exitButton.setHorizontalTextPosition(JButton.CENTER);
        exitButton.setVerticalTextPosition(JButton.CENTER);
       

        //button panel
        JPanel jp = new JPanel();
        jp.setBounds(560,500,220,120);
        jp.setOpaque(false);

        //FullScreenButtonPanel
        JPanel FullScreenButtonPanel = new JPanel();
        FullScreenButtonPanel.setBounds(10,10,500,500);
        FullScreenButtonPanel.setOpaque(false);
        

        //background panel
        JPanel jp2 = new JPanel();
        jp2.setBounds(0,0,1920,1080);
        BoxLayout bl = new BoxLayout(jp2, BoxLayout.Y_AXIS);
        jp2.setLayout(bl);


        //motivation text 
        JLabel quoteText = new JLabel("Label",JLabel.CENTER);
        quoteText.setText("Your Quotes!");
        quoteText.setFont(new Font("Impact",Font.BOLD,50));
        quoteText.setForeground(Color.WHITE);

        
        //motivaor button funtioning
        MotivatorButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int random = (int)(Math.random()*(max-min+1)+min);//generates random value to choose element from the array
                

                if(quotes[random].length() > 45)
                {
                    quoteText.setFont(new Font("Impact",Font.BOLD,30));
                    quoteText.setText(quotes[random]);
                }
                

                else if(quotes[random].length() > 68)
                {
                    quoteText.setFont(new Font("Impact",Font.BOLD,10));
                    quoteText.setText(quotes[random]);
                }

                else
                {                                                   
                    quoteText.setFont(new Font("Impact",Font.BOLD,50));
                    quoteText.setText(quotes[random]);
                }
            }
        }
        );

        exitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        }
        );
        

        //motivation text panel
        JPanel jp3 = new JPanel();
        jp3.setBounds(160,270,1020,200);
        jp3.setOpaque(false);
        
        
        
        
        //adding components to panel
        FullScreenButtonPanel.add(exitButton);
        jp.add(MotivatorButton);
        jp2.add(ts);
        jp3.add(quoteText);
        

        //adding panels to container
        c.add(FullScreenButtonPanel);
        c.add(jp3);
        c.add(jp);
        c.add(jp2);
        fr.setVisible(true);
        

    }

    public void paint(Graphics g)
    {
        Graphics2D gd = (Graphics2D) g;
        gd.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);//amti-aliasing
        
    }
}
