
package kinder2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Tools {
    
    
    public static void MsgBox(String message){
        JOptionPane.showMessageDialog(null, message);
    
    }
    public static void OpenForm(JFrame form){
        try {
            Image img = ImageIO.read(Tools.class.getResource("a.png"));
            form .setIconImage(img);
            form.setLocationRelativeTo(null);
            form.setLocation(300, 250);
            form.getContentPane().setBackground(Color.WHITE);
            form.setDefaultCloseOperation(2);
            form.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public static boolean ConfirmMessage(String Message){
       int msg = JOptionPane.showConfirmDialog(null, Message);
       if(msg == JOptionPane.YES_OPTION){
          return true;
       }else{
         return false;
       }
    }
     
    public  void CreateFolder(String folderName , String path){
    
         File f =new File(path +"/" + folderName);
         f.mkdir();
         
    }
    public  void CreatedNewFolder (String FolderName){
    File f = new File(FolderName);
    f.mkdir();
    }
        
    
    
    public static void ClearText(Container form){
        
          for(Component c : form.getComponents()){
           if(c instanceof JTextField){
               JTextField txt = (JTextField)c;
               txt.setText("");
           }else if(c instanceof Container){
               ClearText((Container)c);
           }    
          }
          
          }
    
    public  void CreateFileEmpty(String fileName){
        
        try {
            File f = new File(fileName);
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    public  void createFile(String fileName , Object data[]){
    
        try {
            PrintWriter p = new PrintWriter(fileName);
            for( Object obj : data){
               p.println(obj);
            }
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }
    public  static Object InputBox(String titl){
    
             Object ob = JOptionPane.showInputDialog(titl);
             return ob;
    
    }
    public String getNumber(String text){
         
        String val = "";
        for(char c : text.toCharArray()){
             if(c=='0' || c=='1' || c=='2'|| c=='3'|| c=='4'|| c=='5'|| c=='6'|| c=='7'|| c=='8'|| c=='9'){
                 
                 val+=c;
      
             }
        }
        return val;
    }
   
    
    public  int getstring(Object text){
         
    String val = "";
        for(char c : text.toString().toCharArray()){
             if(c=='0' || c=='1' || c=='2'|| c=='3'|| c=='4'|| c=='5'|| c=='6'|| c=='7'|| c=='8'|| c=='9'){
                 
                 val+=c;
      
             }
}
          return Integer.parseInt(val);
        
}
    
    public  void createEmptyFiles(String fileNames[]){
       
         for(String str : fileNames){
             CreateFileEmpty(str);
         
         }
    
    }
    
    public  void createFiles(String fileNames[] , Object data[][]){
       
        for(int x = 0; x < fileNames.length ;x++){
            createFile(fileNames[x], data[x]);
        }
       
    
    
    }
    
    public  void printscreen(String imageName ){
        try {
            Robot r = new Robot();
            
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img = r.createScreenCapture(rec);
            ImageIO.write(img, "jpg", new File(imageName + ".jpg"));
            img.createGraphics();
            
       
        } catch (Exception ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
     public  void printscreen(String imageName , JFrame form){
        try {
            form.setState(1);
            Robot r = new Robot();
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img = r.createScreenCapture(rec);
            ImageIO.write(img, "jpg", new File(imageName + ".jpg"));
            form.setState(0);
        }
         catch (Exception ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
     }
     private  String inverseText ;
     public  void  printCharByChar(String text){
         
         for(char c : text.toCharArray()){
         System.out.println(c);
         
         }
     
     }
    
     public  void  printCharByCharInverse(String text){
         StringBuilder sb = new StringBuilder(text);
         inverseText = sb.reverse().toString();
          for(char c : inverseText.toCharArray()){
         System.out.println(c);
          }
         }
     public class Table{
         
         
     public Object[][]items;
     public int columns;
     
     
     public Table(int colunms){
         this.columns = colunms;
         items = new Object[0][colunms];
         
     }
     public void addNewRow(Object row[]){
         Object TempItems[][] = items;
     items = new Object[items.length + 1][columns];
          for(int x = 0 ; x < TempItems.length ; x++){
           items[x] =TempItems[x];
          }
          items [items.length -1]= row;
       
     }
     public void printItems(){
           
         for(Object objs[] : items ){
         for(Object obj : objs){
             System.out.print(obj + " ; ");
         } 
         System.out.println();
          
         
         }
     
     }
      public void editRow(int rowIndex , int columnsIndex , Object newData){
      items[rowIndex][columnsIndex] = newData ;
      
      }
      
      public void deleteRow(int rowIndex){
          
          Object TempItems[][] = items;
          items = new Object[items.length - 1][columns];
          int y = 0;
          for (int x = 0 ; x < TempItems.length; x++){
          if(x != rowIndex ){
          
              items[y] = TempItems[x];
              y++;
          }
          
          
          }
      
      }
      public Object getValue(int rowIndex , int columnsIndex){
           
        return items [rowIndex][columnsIndex];
      
      }
      public Object[] getRow(int rowIndex){
            return items[rowIndex]; 
      }
              
     }
     public class MyDraw {
         
     private JFrame form ;
     private int wform;
     private int hform;
     
     public MyDraw(JFrame form){
       
         this.form = form ;
         wform=form.getWidth();
         hform = form.getHeight();
         

     }
     public int border  = 1 ;
     public Color color = Color.BLUE;
      
     public void drawLine(int x1 ,int y1 , int whidth ,int Height ){
          
         JPanel pnl = new JPanel(){
         
         @Override
         public void paintComponent(Graphics  g){
         
             Graphics2D g2 = (Graphics2D)g;
             g2.setStroke(new BasicStroke(border));
             g2.setColor(java.awt.Color.red);   
             g2.drawLine(0, 0, getWidth(), getHeight());


             
             }
             
                     
         };
         form.add(pnl);
         pnl.setBounds(0,0, wform, hform);
                 
     
     
         
         }
     
     
     
        public void drawRect(int x , int y , int whidth , int Height){
            
            JPanel pnl = new JPanel(){
         @Override     
        public void paintComponent(Graphics  g){
             
            Graphics2D g2 = (Graphics2D)g;
            g2.setColor(java.awt.Color.red);
            g2.setStroke(new BasicStroke(border));
            g2.drawRect(y,x, wform , hform);
           
        }
             
            };
            form.add(pnl);
            pnl.setBounds(0, 0, wform, hform);
           
        
        
        
        
        }
        
        public void DrawOvle(int x, int y , int whidth , int Height){
            JPanel pnl = new JPanel(){
            
            @Override
            public void paintComponent(Graphics g){
               
                Graphics2D g2 = (Graphics2D)g;
                g2.setColor(java.awt.Color.red);
                g2.setStroke(new BasicStroke(border));
                g2.drawOval(x, y, wform ,hform);
            
            
            
            }
            
            
            };
            form.add(pnl);
            pnl.setBounds(0, 0, wform, hform);
        
        
        
        }
        
        
        public void DrawPolygon(int xPoints[] ,int  yPoints[], int nPoints ){
            
             JPanel pnl = new JPanel(){
             @Override
             public void paintComponent(Graphics g){
             Graphics2D g2 = (Graphics2D)g;
             g2.setColor(java.awt.Color.red);
             g2.setStroke(new BasicStroke(border));
             g2.drawPolygon(xPoints, yPoints, nPoints);
              
             
             }
             
             
             
             };
             form.add(pnl);
             pnl.setBounds(0, 0, wform, hform);
        
        
        
        }
        
        public void DrawString(int x ,int y ,String text , String FontName , int Fontsize ){
            
            JPanel pnl = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D)g;
            g2.setColor(java.awt.Color.red);
            Font font = new Font(FontName ,Fontsize, Font.BOLD);
            g2.setFont(font);
            g2.drawString(text, x, y);
            
            
            
            
            }
            
            
            };
            form.add(pnl);
            pnl.setBounds(x, y, wform, hform);
        }
        
        public void DrawImage(int x , int y , String paht){
            
            JPanel pnl = new JPanel(){
            
        @Override
         
        public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(java.awt.Color.red);
        
            try {
                File fileimage = new File(paht);
                Image img = ImageIO.read(fileimage);
                g2.drawImage(img, x, y, form);
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null , ex.getMessage() );
            }
       
        
        
        
        }        
            
            };
            form.add(pnl);
            pnl.setBounds(0, 0, wform, hform);
        }
        
        public void DrawRoundRect(int x , int  y , int width ,int Height , int borderRadius){
            
            JPanel pnl = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D)g;
                g2.setColor(java.awt.Color.red);
                g2.setStroke(new BasicStroke(border));
                g2.drawRoundRect(x, y, width, Height, borderRadius ,borderRadius);
            
            
            }
            
            
            
            
            };
            form.add(pnl);
            pnl.setBounds(0, 0, wform, hform);
        
        
        }
        
     }
        
        
          }        
    
    






     
     


    
        
            
            
        
        
    
    


    
    

