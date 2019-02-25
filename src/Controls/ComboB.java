
package Controls;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class ComboB extends JComboBox {
    
    public  ComboB(){
        
        
        setOpaque(false);
    
    
    }
    @Override
    public void paintComponent(Graphics g){
        g.setColor(getBackground());
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 50,50);
        super.paintComponent(g);
    
    }
    @Override
    public void paintBorder(Graphics g){
        g.setColor(Color.red);
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 25, 25);
    
    }
    
}
