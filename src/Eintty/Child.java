/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eintty;

import db.go;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import kinder2.Tools;


public class Child implements InterFace{
    private int idChild ;
    private String ChildName;
    private String Addres;
    private double Payments;
    private String HiringDate;
    private String BirthDate;
    private int ClassNum;
    private String ClassName;
    private String PhoneNumber;
    private String kind;
    private ImageIcon image;

    public int getIdChild() {
        return idChild;
    }

    public void setIdChild(int idChild) {
        this.idChild = idChild;
    }

    public String getChildName() {
        return ChildName;
    }

    public void setChildName(String ChildName) {
        this.ChildName = ChildName;
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

    public String getHiringDate() {
        return HiringDate;
    }

    public void setHiringDate(String HiringDate) {
        this.HiringDate = HiringDate;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public int getClassNum() {
        return ClassNum;
    }

    public void setClassNum(int ClassNum) {
        this.ClassNum = ClassNum;
    }

    @Override
    public void Add() {
        String insert = "insert into Child values("
                + idChild + ","
                +"'"+ChildName+"',"
                +"'"+Addres+"',"
                + Payments +","
                +"'"+HiringDate+"',"
                +"'"+BirthDate+"',"
                +"'"+ kind +"',"
                +"'"+ ClassName + "',"
                + ClassNum  + ")";
        boolean isAdd = db.go.RunQeuery(insert);
        if(isAdd){
          Tools.MsgBox("Child is Add");
        }
    }

    @Override
    public void Delete() {
      String strDelete = "delete from child"
              + " where idChild = " + idChild ;
      boolean isDelete = db.go.RunQeuery(strDelete);
      if(isDelete){
         Tools.MsgBox("Child is Delete");
      }
    }

    @Override
    public void Update() {
       String srtUpdate = "update child set "
               + "NameChild ='" + ChildName + "',"
               + "Addres ='" + Addres + "',"
               + "Payments =" + Payments +","
               + " HiringDate='" + HiringDate + "',"
               + "BirthDate='" + BirthDate + "',"
               + "kind ='" + kind + "',"
               + "classname='" + ClassName + "',"
               + "classnum="+ ClassNum 
               + " where idChild ="+ idChild;
               
              boolean isUpdate = db.go.RunQeuery(srtUpdate);
              if(isUpdate){
                Tools.MsgBox("is Update");
              }
               }

    @Override
    public String getAutoNumber() {
         return db.go.getAutoNumber("child", "idchild");
    }

    @Override
    public void getAllRow(JTable table) {
       db.go.FillJTable("child", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strOneRow = "select * from child"
                + " where idChild =" + idChild ;
        db.go.FillJTable(strOneRow, table);
    }

    @Override
    public void getCoustemRow(String statenent, JTable table) {
          db.go.FillJTable(statenent, table);
    }

    @Override
    public String getNameByVaule(String value) {
          String strval = "select * from namechild "
                  +" where idchild =" + value ;
         String getName = (String)db.go.getTableData(strval).items[0][0].toString();
         return getName;

    }

    @Override
    public String getVauleByName(String Name) {
       String strName="select * from idchild "
               + " where namechild ='" + Name ;
       String vale=(String)db.go.getTableData(strName).items[0][0].toString();
       return vale;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

   

    @Override
    public void getOneColumn(String statenent, JTable table) {
        String str ="select * from nameChild ";
                
      db.go.RunQeuery(str);
    }

   

   

    

    
    
    

}