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
public class NewAcount  implements InterFace{
    private String userName ;
    private String Password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public void Add() {
        String strNew = "insert into login values("
                +"'"+userName+"',"
                +"'"+Password +"')";
        boolean isAdd=db.go.RunQeuery(strNew);
        if (isAdd){
          Tools.MsgBox("ACOUNT IS ADD");
        }
              
    }

    @Override
    public void Delete() {
        String strDel ="delete from login "+
                " where USERNAME='"+userName+"',"+
                        "PASSWORD='"+Password;
        boolean isDelete=db.go.RunQeuery(strDel);
        if(isDelete){
           Tools.MsgBox("Account is Delete");
        }
    }

    @Override
    public void Update() {
         String strUp="update login set"
                 +"USERNAME='"+userName+"',"
                 +"PASSWORD="+Password;
         boolean isUpdate =db.go.RunQeuery(strUp);
         if(isUpdate){
           Tools.MsgBox("Account is update");
         }

    }

    @Override
    public String getAutoNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getAllRow(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
