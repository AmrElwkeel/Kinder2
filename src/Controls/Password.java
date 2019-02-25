
package Controls;



import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Password extends  JPasswordField {
    
    public  Password(int size){
        super(size);
        
        setOpaque(false);
    
    
    }
    @Override
    public void paintComponent(Graphics g){
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 25, 25);
        super.paintComponent(g);
    
    }
    @Override
    public void paintBorder(Graphics g){
        g.setColor(Color.black);
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 25, 25);
    
    }
    
}
