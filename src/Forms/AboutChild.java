/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Eintty.Child;
import Eintty.Phon;
import java.awt.Color;
import kinder2.Tools;

/**
 *
 * @author Amr
 */
public class AboutChild extends javax.swing.JFrame {

    /**
     * Creates new form RegisterClassOne
     */
    public AboutChild() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAll = new javax.swing.JTable();
        btnBack = new Controls.button();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jTableAll.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTableAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idChild", "Name", "Addres", "Payments", "HiringDate", "BirthDate", "Gander", "ClassRoom", "ClassNumber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAll.setColumnSelectionAllowed(true);
        jTableAll.setEditingColumn(-4);
        jTableAll.setEditingRow(-4);
        jTableAll.setFillsViewportHeight(true);
        jTableAll.setGridColor(new java.awt.Color(0, 0, 0));
        jTableAll.setName(""); // NOI18N
        jTableAll.setRowHeight(30);
        jTableAll.getTableHeader().setResizingAllowed(false);
        jTableAll.getTableHeader().setReorderingAllowed(false);
        jTableAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAllMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAll);
        jTableAll.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableAll.getColumnModel().getColumnCount() > 0) {
            jTableAll.getColumnModel().getColumn(0).setMinWidth(100);
            jTableAll.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableAll.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 80, 1140, 630);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/arrow_left_32.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(10, 715, 160, 40);

        jLabel1.setBackground(new java.awt.Color(225, 153, 153));
        jLabel1.setFont(new java.awt.Font("Script MT Bold", 3, 60)); // NOI18N
        jLabel1.setText("All Child");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 10, 410, 50);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Child", "Phone Dad", "Phone Mother", "Phone Other"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEditingColumn(-4);
        jTable1.setEditingRow(-4);
        jTable1.setFillsViewportHeight(true);
        jTable1.setRowHeight(30);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1140, 80, 430, 630);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/5.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1580, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocation(60,40);
        setSize(1580,800);
        c.getAllRow(jTableAll);
        p.getAllRow(jTable1);
       getContentPane().setBackground(new Color(120 ,225,225));
    }//GEN-LAST:event_formWindowOpened
 Child c = new Child();
 Phon p = new Phon();
 
    private void jTableAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAllMouseClicked
        int row =jTableAll.getSelectedRow();
        Child c = new Child();
         db.go.FillJTable("child_data", jTableAll);
        c.getAllRow(jTableAll);
    }//GEN-LAST:event_jTableAllMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       Tools.OpenForm(new frmmain());
       dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int row1 = jTable1.getSelectedRow();
       Phon p = new Phon();
       db.go.FillJTable("child_phones", jTable1);
       p.getAllRow(jTable1);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(AboutChild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutChild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutChild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutChild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutChild().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Controls.button btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableAll;
    // End of variables declaration//GEN-END:variables
}