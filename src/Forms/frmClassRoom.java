/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Eintty.ClassRoom;
import java.awt.Color;
import javax.swing.JOptionPane;
import kinder2.Tools;

/**
 *
 * @author Amr
 */
public class frmClassRoom extends javax.swing.JFrame {

    /**
     * Creates new form frmClassRoom
     */
    public frmClassRoom() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnAll = new Controls.button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClass = new javax.swing.JTable();
        btnAdd = new Controls.button();
        btnUpdate = new Controls.button();
        btnClear = new Controls.button();
        txtLoc = new Controls.TextBox(20);
        txtSearch = new Controls.TextBox(20);
        txtName = new Controls.TextBox(20);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDelete = new Controls.button();
        jrdLoc = new javax.swing.JRadioButton();
        jrdNum = new javax.swing.JRadioButton();
        jrdName = new javax.swing.JRadioButton();
        btnSearch = new Controls.button();
        btnFind = new Controls.button();
        txtNum = new Controls.TextBox(20);
        btnBack = new Controls.button();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/home_32.png"))); // NOI18N
        btnAll.setText("تحديث");
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnAll);
        btnAll.setBounds(460, 480, 150, 40);

        jTableClass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTableClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "class Number", "Class Name", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClass.setRowHeight(30);
        jTableClass.getTableHeader().setResizingAllowed(false);
        jTableClass.getTableHeader().setReorderingAllowed(false);
        jTableClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClassMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClass);
        if (jTableClass.getColumnModel().getColumnCount() > 0) {
            jTableClass.getColumnModel().getColumn(0).setMinWidth(100);
            jTableClass.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableClass.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(640, 180, 740, 510);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/add_32.png"))); // NOI18N
        btnAdd.setText("اضافه");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(460, 210, 150, 40);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/arrow_down_32.png"))); // NOI18N
        btnUpdate.setText("تعديل");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(460, 270, 150, 41);

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/web_layout_32.png"))); // NOI18N
        btnClear.setText("تنظيف");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(460, 430, 150, 40);

        txtLoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtLoc);
        txtLoc.setBounds(150, 380, 280, 40);

        txtSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtSearch);
        txtSearch.setBounds(850, 120, 220, 40);

        txtName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtName);
        txtName.setBounds(150, 300, 280, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("المكان");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 370, 150, 70);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("رقم الفصل");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 220, 150, 60);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("اسم الفصل");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 280, 200, 80);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 60)); // NOI18N
        jLabel4.setText("اضافة فصل");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(490, 10, 370, 50);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/close_32.png"))); // NOI18N
        btnDelete.setText("حذف");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(460, 330, 150, 40);

        jrdLoc.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(jrdLoc);
        jrdLoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrdLoc.setText("المكان");
        jrdLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdLocActionPerformed(evt);
            }
        });
        getContentPane().add(jrdLoc);
        jrdLoc.setBounds(1090, 70, 140, 25);

        jrdNum.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(jrdNum);
        jrdNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrdNum.setText("رقم الفصل");
        getContentPane().add(jrdNum);
        jrdNum.setBounds(800, 70, 140, 25);

        jrdName.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(jrdName);
        jrdName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrdName.setText("اسم الفصل");
        getContentPane().add(jrdName);
        jrdName.setBounds(950, 70, 120, 25);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/search_32.png"))); // NOI18N
        btnSearch.setText("بحث");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(1120, 120, 130, 40);

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/search_32.png"))); // NOI18N
        btnFind.setText("ايجاد");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind);
        btnFind.setBounds(460, 380, 150, 40);

        txtNum.setEditable(false);
        txtNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        getContentPane().add(txtNum);
        txtNum.setBounds(150, 230, 280, 40);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/arrow_left_32.png"))); // NOI18N
        btnBack.setText("رجوع");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(10, 640, 150, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/6.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1390, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
       
       Class.getAllRow(jTableClass);
    }//GEN-LAST:event_btnAllActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setSize(1380,740);
        setLocation(300,100);
        this.getContentPane().setBackground(new  Color(0,220,220));
        cleardata();
        Class.getAllRow(jTableClass);
    }//GEN-LAST:event_formWindowOpened

    private void jrdLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdLocActionPerformed
     private void setValues(){
       Class.setClassNum(Integer.parseInt(txtNum.getText()));
       Class.setClassName(txtName.getText());
       Class.setLocation(txtLoc.getText());
       
     }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       setValues();
       Class.Add();
       cleardata();
       Class.getAllRow(jTableClass);
       
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       String search = "select * from classroom where " ;
      if(jrdNum.isSelected()){
         search += "classNum";
      }else if (jrdName.isSelected()){
       search += "className";
      }
      else{
        search += "Location";
      }
      search += " like'%" + txtSearch.getText() + "%'";
       Class.getCoustemRow(search, jTableClass);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
       String input=(String) Tools.InputBox("Enter ClassRoom Number");
       int ClassNum = Integer.parseInt(input);
       Class.setClassNum(ClassNum);
       Class.getOneRow(jTableClass);
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       this.dispose();
        Tools.OpenForm(new frmmain());
    }//GEN-LAST:event_btnBackActionPerformed
     ClassRoom Class = new ClassRoom();
     
    private void cleardata(){
     Tools.ClearText(this);
     txtNum.setText(Class.getAutoNumber());
     btnAdd.setEnabled(true);
     btnUpdate.setEnabled(false);
     btnDelete.setEnabled(true);
     txtName.requestFocus();
      }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       cleardata();
       Class.getAllRow(jTableClass);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      setValues();
      Class.Update();
      cleardata();
       Class.getAllRow(jTableClass);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    if(Tools.ConfirmMessage("Do you want Delete this ?")){       
        setValues();
        Class.Delete();
        cleardata();
        Class.getAllRow(jTableClass);}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void jTableClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClassMouseClicked
       try{
           
             int row = jTableClass.getSelectedRow();
             String strNum = jTableClass.getValueAt(row, 0).toString();
             String strName = jTableClass.getValueAt(row, 1).toString();
             String strLoc = jTableClass.getValueAt(row, 2).toString();
             
             txtNum.setText(strNum);
             txtName.setText(strName);
             txtLoc.setText(strLoc);
             
             btnAdd.setEnabled(false);
             btnUpdate.setEnabled(true);
             btnDelete.setEnabled(true);
             
       
       
       }catch(Exception ex){
         Tools.MsgBox(ex.getMessage());
       }
    }//GEN-LAST:event_jTableClassMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmClassRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClassRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClassRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClassRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClassRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Controls.button btnAdd;
    private Controls.button btnAll;
    private Controls.button btnBack;
    private Controls.button btnClear;
    private Controls.button btnDelete;
    private Controls.button btnFind;
    private Controls.button btnSearch;
    private Controls.button btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClass;
    private javax.swing.JRadioButton jrdLoc;
    private javax.swing.JRadioButton jrdName;
    private javax.swing.JRadioButton jrdNum;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}