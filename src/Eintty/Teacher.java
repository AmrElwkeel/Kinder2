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
public class Teacher implements InterFace{
    private int IdTeacher;
    private String Name;
    private String Addres;
    private double Payments;
    private String Phone;

    public int getIdTeacher() {
        return IdTeacher;
    }

    public void setIdTeacher(int IdTeacher) {
        this.IdTeacher = IdTeacher;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddres() {
        return Addres;
    }

    public void setAddres(String Addres) {
        this.Addres = Addres;
    }

    public double getPayments() {
        return Payments;
    }

    public void setPayments(double Payments) {
        this.Payments = Payments;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    
    public void Add() {
        String strAdd = " insert into Teacher values("
                + IdTeacher + ","
                +"'" + Name +"',"
                +"'" + Addres+"',"
                + "" + Payments + ","
                + "'" + Phone +"')";
        boolean isAdd = db.go.RunQeuery(strAdd);
        if(isAdd){
            Tools.MsgBox("New Teacher Is Add");
        
        }else{
          Tools.MsgBox("something is Erorr");
        
        }

    }

    @Override
    public void Delete() {
      String srtDelete= "delete from teacher"
              + " where idteacher = " + IdTeacher;
      boolean isDelete=db.go.RunQeuery(srtDelete);
        if (isDelete) {
            Tools.MsgBox("Teacher Is Delete");
        }
    }

    @Override
    public void Update() {
          String strUpdate="update Teacher set "
                  + "Name ='" + Name + "',"
                  + "Addres='" + Addres + "',"
                  + "Payments =" + Payments + ","
                  + "Phone ='" + Phone +"'"
                  + "where idteacher=" + IdTeacher ;
          
          boolean isUpdate=db.go.RunQeuery(strUpdate);
          if(isUpdate){
            Tools.MsgBox("Teacher Is update");
          
          }else{Tools.MsgBox("erorr");}
                  
    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("teacher","idTeacher");
    }

    @Override
    public void getAllRow(JTable table) {
       db.go.FillJTable("Teacher", table);
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
