/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eintty;

import javax.swing.JTable;
import kinder2.Tools;

/**
 *
 * @author Amr
 */
public class AbsenceChild implements InterFace{
     private int idchild;
     private String NameChild;
     private String Day;
     private String History;

    public int getIdchild() {
        return idchild;
    }

    public void setIdchild(int idchild) {
        this.idchild = idchild;
    }

    public String getNameChild() {
        return NameChild;
    }

    public void setNameChild(String NameChild) {
        this.NameChild = NameChild;
    }

   

    @Override
    public void Add() {
      String strAdd= "insert into absenceChild values("
              + idchild +","
              +"'"+NameChild+"',"
              +"'"+Day+"',"
              +"'"+History+"')";
      boolean isAdded=db.go.RunQeuery(strAdd);
        if (isAdded) {
            Tools.MsgBox("Sucss");
        }
    }

    @Override
    public void Delete() {
       String strDel="Delete from absenceChild"
               +" where idchild="+idchild ;
       boolean isDelete=db.go.RunQeuery(strDel);
        if (isDelete) {
            Tools.MsgBox("Sucss");
        }
    }

    @Override
    public void Update() {
         String strUp="Update absenceChild set "
                 +"Namechild='"+NameChild + "',"
                 + "Presence='"+Day+"',"
                 + "Absence='"+History+"',"
                 + "whrer idChild="+idchild;
         boolean isUpdate=db.go.RunQeuery(strUp);
         if (isUpdate) {
            Tools.MsgBox("Sucss");
        }
    }

    @Override
    public String getAutoNumber() {
     return db.go.getAutoNumber("absenceChild ", "idChild");
    }

    @Override
    public void getAllRow(JTable table) {
        db.go.FillJTable("absenceChild", table);
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

    public String getDay() {
        return Day;
    }

    public void setDay(String Day) {
        this.Day = Day;
    }

    public String getHistory() {
        return History;
    }

    public void setHistory(String History) {
        this.History = History;
    }
}
