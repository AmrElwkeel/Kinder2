
package Controls;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class TextTree extends  JTextArea{
 
    public  TextTree(int size){
      
        
        setOpaque(false);
    
    
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-2, getHeight()-2, 25, 25);
        super.paintComponent(g);
    
    }
    @Override
    public void paintBorder(Graphics g){
        g.setColor(new Color(120,0,230));
        g.drawRoundRect(0, 0, getWidth()-2, getHeight()-2, 25, 25);
    
    }
    
}
