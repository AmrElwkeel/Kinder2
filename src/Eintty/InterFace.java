
package Eintty;

import javax.swing.JTable;


public interface InterFace {
    
    
     public  void Add();
     public  void Delete();
     public  void Update();
     public  String getAutoNumber();
     public void getAllRow(JTable table);
     public  void getOneRow(JTable table);
     public  void getCoustemRow(String statenent , JTable table);
     public  String getNameByVaule(String value);
     public  String getVauleByName(String Name);
     public  void getOneColumn(String statenent,JTable table);
}
