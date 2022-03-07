
package Eintty;

import javax.swing.JTable;
import kinder2.Tools;


public class ClassRoom implements InterFace{
    
    private int ClassNum;
    private String ClassName;
    private String Location;

    public int getClassNum() {
        return ClassNum;
    }

    public void setClassNum(int ClassNum) {
        this.ClassNum = ClassNum;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    @Override
    public void Add() {
        String insert = "insert into classroom values("
                + ClassNum  + "," 
                + "'" + ClassName + "',"
                + "'" + Location + "')" ;
        boolean isAdded = db.go.RunQeuery(insert);
        if(isAdded){
           Tools.MsgBox("Class Room is Added");
        }

    }

    @Override
    public void Delete() {
          String delete = "Delete from classroom"
                  + " where classnum = " + ClassNum;
                  boolean isdelete = db.go.RunQeuery(delete);
                  if(isdelete){
                    Tools.MsgBox("ClassRoom is delete");
                  
                  }
    }

    @Override
    public void Update() {
          String Update = "update classroom set "
                  + "classname='" + ClassName+"',"
                  + "location='" + Location +"' "
                  + " where classnum=" +ClassNum;
          boolean isUpdate = db.go.RunQeuery(Update);
          if(isUpdate){
             Tools.MsgBox("Class Room Is Update");
          
          }
    }

    @Override
    public void getAllRow(JTable table) {
     db.go.FillJTable("classroom", table);
    }

    @Override
    public void getOneRow(JTable table) {
          String strSelect = "select * from classroom"
                  + " where classnum =" + ClassNum;
          db.go.FillJTable(strSelect, table);
        }

    @Override
    public void getCoustemRow(String statement, JTable table) {
         db.go.FillJTable(statement, table);
    }

    @Override
    public String getNameByVaule(String value) {
       String strName= "select classname from classroom" 
                 + " where classnum=" + value ;
         String strv = (String)db.go.getTableData(strName).items[0][0].toString();
         return strv;
    }

    @Override
    public String getVauleByName(String Name) {
           String strVal= "select classnum from classroom" 
                 + " where classname='" + Name + "'";
         String str = (String)db.go.getTableData(strVal).items[0][0].toString();
         return str;
         
        }

    @Override
    public String getAutoNumber() {
       return  db.go.getAutoNumber("classroom", "ClassNum");
       

    }

    
    @Override
    public void getOneColumn(String statenent, JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
