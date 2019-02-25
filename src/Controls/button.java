

package Controls;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;

import javax.swing.JButton;

public class button extends JButton{
    
    
    public  button( ){
       
       setOpaque(false);
        setContentAreaFilled(false);
        setForeground(Color.BLACK);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
      
    }
    @Override
    protected void paintComponent(Graphics g){
      g.setColor(new Color(70,180,130));
      g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1,20,20);
      super.paintComponent(g);
    
    
    }
    @Override
    protected void paintBorder(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
    
    }
    
}
