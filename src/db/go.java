package db;
import kinder2.Tools;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import kinder2.Tools.Table;



/**
 *
 * @author Amr
 */
public class go{
     private  static String url = "";
     private static Connection con;
     
    
     private static void SetURL(){
        url = "jdbc:mysql://localhost:3306/kinder"
                + "?useUincode=true&characterEncoding=UTF-8";
    
    }
    private static void SetConnection() {
        try{
        SetURL();
        con =DriverManager.getConnection(url,"root","");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
          
        }
    
    }
    public static boolean CheckUserAndPass(String UserName,String Password){
       try{
        SetConnection();
        Statement stmt = con.createStatement();
        String checkUser = "select * from LOGIN where "
                + "username='" + UserName +"' and "
                + "password='" + Password + "'";
        stmt.executeQuery(checkUser);
        while(stmt.getResultSet().next()){
           con.close();
            return true;
          
        
        }
        con.close();
                
       }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());
       
       }
      return false;
    }
     public static boolean CheckUserAndPassword(String Password){
       try{
        SetConnection();
        Statement stmt = con.createStatement();
        String checkUser = "select * from users where "
               
                + "password='" + Password + "'";
        stmt.executeQuery(checkUser);
        while(stmt.getResultSet().next()){
           con.close();
            return true;
          
        
        }
        con.close();
                
       }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());
       
       }
      return false;
    }
    public static boolean RunQeuery(String sqlstatement){
         try {
             SetConnection();
             Statement stmt = con.createStatement();
             stmt.execute(sqlstatement);
             con.close();
             return true;
             
         } catch (SQLException ex) {
             Tools.MsgBox(ex.getMessage());
             return false; 
         
        } 
    
    }
   
    public static String getAutoNumber(String tableName , String colunmName){
      try{
        SetConnection();
      Statement stmt = con.createStatement();
      String strAuto = " select max(" + colunmName + ")+1 as autonum"
              + " from " + tableName;  
      stmt.executeQuery(strAuto);
      
        String Num = "";
              while(stmt.getResultSet().next()){
                Num = stmt.getResultSet().getString("autonum");
                
              }
              con.close();
              if(Num == null || "".equals(Num) ){
                return "1"; 
              }
              else{
                 return Num;
              }
      }catch(SQLException ex ){
         Tools.MsgBox(ex.getMessage());
         return "Erorr";
      
      }
     
    
    }
    
    public static  Table getTableData(String statement){
        Tools t = new Tools();
        try{
        SetConnection();
        Statement stmt = con.createStatement();
        ResultSet rs;
        rs =stmt.executeQuery(statement);
            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();
        Table table =t.new Table(c);
        while(rs.next()){
          Object row[] = new Object[c];
          for(int i = 0; i < c ; i++){
                 row[i]=rs.getString(i + 1);
          
          }
        table.addNewRow(row);
        
        }
        con.close();
        return table;
    
    
    
    }catch(SQLException ex){
            Tools.MsgBox(ex.getMessage());
            return t.new Table(0);
            }
     
    }
    public static void  FillCombo(String colunmName,String tableName,JComboBox combo){
      try{
      SetConnection();
      Statement stmt= con.createStatement();
      ResultSet rs;
      String strSelect ="select " + tableName + " from " + colunmName ;
      rs= stmt.executeQuery(strSelect);
      
      rs.last();
      int c = rs.getRow();
      rs.beforeFirst();
      
      String values[]=new String[c];
      int i =0;
      while(rs.next()){ 
          
          values[i]=rs.getString(1);
         i++;
      
      }
      con.close();
      combo.setModel(new DefaultComboBoxModel(values));
        
      }catch(SQLException ex){
         Tools.MsgBox(ex.getMessage());
      
      
      }
    }
    public static void FillJTable(String filltableorstatement ,JTable table){
      try{
      SetConnection();
      Statement stmt = con.createStatement();
      ResultSet rs ;
      String srtpart = filltableorstatement.substring(0,7).toLowerCase();
      String strSelect;
      if( "select ".equals (srtpart) ){
           strSelect=filltableorstatement;
      
      }else{
        strSelect = "select * from " + filltableorstatement ;
      
      }
      rs=stmt.executeQuery(strSelect);
      ResultSetMetaData rsmd = rs.getMetaData();
      int c =rsmd.getColumnCount();
      
          DefaultTableModel model = (DefaultTableModel)table.getModel();
      Vector v = new Vector();
      model.setRowCount(0);
      
      while(rs.next()){
           v =new Vector(c);
          for(int i = 1 ;i <= c;i++){
            v.add(rs.getString(i));
          
          }
      model.addRow(v);
      }
      if(table.getColumnCount() != c){
      Tools.MsgBox("JTablecolunmsCuontNot equals ");
      }
      con.close();
      
      }catch(SQLException ex){
          Tools.MsgBox(ex.getMessage());
         
      }
    
    
    
    }
    

    
    
}
