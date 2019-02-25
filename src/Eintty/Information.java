/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eintty;

import javax.swing.JTable;
import kinder2.Tools;


public class Information implements InterFace{
    private int Number;
    private String Name;
    private String Level;
    private String Status;
    private String illness;

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    @Override
    public void Add() {
      String strAdd= "insert into inform values("
              + Number +","
              +"'"+ Name +"',"
              +"'"+ Level +"',"
              +"'"+ Status +"',"
              +"'"+ illness + "')";
      boolean isAdd =db.go.RunQeuery(strAdd);
        if (isAdd) {
            Tools.MsgBox("Sucss");
        }
    }

    @Override
    public void Delete() {
      String srtDel = "Delete from inform"
              + " where numberChild =" + Number;
      boolean isDelete=db.go.RunQeuery(srtDel);
      if(isDelete){
      
          Tools.MsgBox("Sucss");
      }
              
    }

    @Override
    public void Update() {
           String strUp = "Update inform set "
                   + "namechild='"+Name+"',"
                   + "Levelchild='"+Level+"',"
                   + "statuschild='"+Status+"',"
                   + "illnesschild='"+illness+"'," 
                   + "where NumberChild="+Number;
           boolean isUpdate=db.go.RunQeuery(strUp);
           if(isUpdate){
             Tools.MsgBox("Sucss");
           }
                   }

    @Override
    public String getAutoNumber() {
    return db.go.getAutoNumber("inform", "Numberchild");
    }

    @Override
    public void getAllRow(JTable table) {
       db.go.FillJTable("child_inform", table);
    }

    @Override
    public void getOneRow(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getCoustemRow(String statenent, JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameByVaule(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getVauleByName(String Name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public void getOneColumn(String statenent, JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
