package motivaor;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class TextShower extends JPanel implements Runnable
{

    public void paint(Graphics g)
    {
        Graphics2D gd = (Graphics2D) g;
        gd.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        
        GradientPaint paint = new GradientPaint(0,0,Color.BLUE,960,960,Color.RED);
        gd.setPaint(paint);
        gd.fillRect(0, 0, 1920, 1080);
   

        
    }
    
   
    
}
