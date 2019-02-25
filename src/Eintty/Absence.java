
package Eintty;

import javax.swing.JTable;
import kinder2.Tools;

public class Absence implements InterFace{
    
    private int IdTeach;
    private String NameTeach;
    private String JobTeach;
    private String SuberTeach;
    private String DayTeach;
    private String Hiring; 

    public int getIdTeach() {
        return IdTeach;
    }

    public void setIdTeach(int IdTeach) {
        this.IdTeach = IdTeach;
    }

    public String getNameTeach() {
        return NameTeach;
    }

    public void setNameTeach(String NameTeach) {
        this.NameTeach = NameTeach;
    }

    public String getJobTeach() {
        return JobTeach;
    }

    public void setJobTeach(String JobTeach) {
        this.JobTeach = JobTeach;
    }

    public String getSuberTeach() {
        return SuberTeach;
    }

    public void setSuberTeach(String SuberTeach) {
        this.SuberTeach = SuberTeach;
    }

    public String getDayTeach() {
        return DayTeach;
    }

    public void setDayTeach(String DayTeach) {
        this.DayTeach = DayTeach;
    }

    public String getHiring() {
        return Hiring;
    }

    public void setHiring(String Hiring) {
        this.Hiring = Hiring;
    }

    @Override
    public void Add() {
      String strAdd = "insert into absence values ("
              + IdTeach +","
              +"'"+NameTeach+"',"
              +"'"+JobTeach+"',"
              +"'"+SuberTeach+"',"
              +"'"+DayTeach+"',"
              +"'"+Hiring + "')";
      boolean srtAdded = db.go.RunQeuery(strAdd);
      if(srtAdded){
        Tools.MsgBox("Sucss");
      }
    }

    @Override
    public void Delete() {
        String strDel = "Delete from absence "
                + " where idTeach =" +IdTeach;
        boolean strDelete = db.go.RunQeuery(strDel);
        if (strDelete) {
         Tools.MsgBox(" Sucss");
                
            }
    }

    @Override
    public void Update() {
         String strUp = "update absence set "
                 + " NameTeach='" + NameTeach + "',"
                 + "JobTeach='" + JobTeach +"',"
                 + "SuperTeach='" +SuberTeach+"',"
                 + "DayTeach='" +DayTeach + "',"
                 + "History=" +Hiring
                 + "where idTeach=" +IdTeach;
         boolean strUpdate=db.go.RunQeuery(strUp);
         if (strUpdate) {
             Tools.MsgBox("Sucss");
            
        }

    }

    @Override
    public String getAutoNumber() {
   return  db.go.getAutoNumber("absence", "idTeach");
    }

    @Override
    public void getAllRow(JTable table) {
     db.go.FillJTable("absence", table);
    }

    @Override
    public void getOneRow(JTable table) {
       String strGEt="select * from Absence "
               + "where idTeach=" + IdTeach ;
       db.go.FillJTable(strGEt, table);
    }

    @Override
    public void getCoustemRow(String statenent, JTable table) {
       db.go.FillJTable(statenent, table);
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
