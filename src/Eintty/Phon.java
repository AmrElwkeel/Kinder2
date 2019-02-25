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
public class Phon implements InterFace{
     private int idchild ;
     private String  PhonDad;
     private String PhonMother;
     private String PhonOther;

    public int getIdchild() {
        return idchild;
    }

    public void setIdchild(int idchild) {
        this.idchild = idchild;
    }

    public String getPhonDad() {
        return PhonDad;
    }

    public void setPhonDad(String PhonDad) {
        this.PhonDad = PhonDad;
    }

    public String getPhonMother() {
        return PhonMother;
    }

    public void setPhonMother(String PhonMother) {
        this.PhonMother = PhonMother;
    }

    public String getPhonOther() {
        return PhonOther;
    }

    public void setPhonOther(String PhonOther) {
        this.PhonOther = PhonOther;
    }

    @Override
    public void Add() {
        String strAdd = "insert into child_phon values ("
                
                + idchild + ","
                + "'" + PhonDad + "',"
                + "'" +PhonMother +"',"
                + "'" +PhonOther + "')";
        boolean isAdded = db.go.RunQeuery(strAdd);
        if (isAdded) {
            Tools.MsgBox("Phon Number is Add");
            
        }
    }

    @Override
    public void Delete() {
        String strDelete = "delete from child_phon"
                + " where idchild=" + idchild  ; 
        boolean isDelete = db.go.RunQeuery(strDelete);
        if(isDelete){
          Tools.MsgBox("Phon Number is Delete");
          
        }
    }

    @Override
    public void Update() {
        
        String strUpdate= "update child_phon set "
                
                + "phondad ='" + PhonDad + "',"
                + "phonMother ='" + PhonMother +"',"
                + "phonOther ='" + PhonOther + "'"
                + " where idchild ="+idchild;
        boolean isUpdate = db.go.RunQeuery(strUpdate);
        if (isUpdate) {
            Tools.MsgBox("PHON NUMBER IS UPDATE");
            
        }
    }

    @Override
    public String getAutoNumber() {
         return null;
    }

    @Override
    public void getAllRow(JTable table) {
        db.go.FillJTable("child_phones", table);
    }

    @Override
    public void getOneRow(JTable table) {
        
    }

    @Override
    public void getCoustemRow(String statenent, JTable table) {
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
