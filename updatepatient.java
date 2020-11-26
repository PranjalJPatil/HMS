/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmp;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Mrunal
 */
public class updatepatient extends javax.swing.JFrame {
    
    MongoDatabase database ;
    
   
    public updatepatient() {
        initComponents();
        bill.setVisible(false);
        MongoClient mongoClient=new MongoClient("localhost",27017);
        
        
        database = mongoClient.getDatabase("HMS");
        MongoCollection<Document> collection= database.getCollection("rooms");
        
        
        
        FindIterable<Document> it=collection.find(Filters.eq("alloted", "0"));
        MongoCursor<Document> cursor = it.iterator();
        
            while(cursor.hasNext()){
               Document entry = cursor.next();
            AddRowToJTable(new Object[]{
           entry.get("_id")});
        }
            
    }
    public static void AddRowToJTable(Object[] dataRow){
        DefaultTableModel model;
        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(dataRow);
      
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
        jLabel1 = new javax.swing.JLabel();
        ipd = new javax.swing.JRadioButton();
        opd = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        room = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bill = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Input Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        buttonGroup1.add(ipd);
        ipd.setText("IPD");
        ipd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipdActionPerformed(evt);
            }
        });
        getContentPane().add(ipd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        buttonGroup1.add(opd);
        opd.setText("OPD");
        opd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opdActionPerformed(evt);
            }
        });
        getContentPane().add(opd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 287, 41));

        jLabel3.setText("Choose:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel4.setText("Room no. :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));
        getContentPane().add(room, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 138, 40));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jButton4.setText("Goback");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        bill.setText("Generate Bill");
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });
        getContentPane().add(bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Available rooms"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 100, 290));

        jLabel6.setText("Id:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 290, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hmp/don5H1.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ipdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipdActionPerformed
        // TODO add your handling code here:
        room.setVisible(true);
        jLabel4.setVisible(true);
        submit.setVisible(true);
        bill.setVisible(false);
        jScrollPane1.setVisible(true);
    }//GEN-LAST:event_ipdActionPerformed

    private void opdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opdActionPerformed
        // TODO add your handling code here:
        room.setVisible(false);
        jLabel4.setVisible(false);
        submit.setVisible(false);
        bill.setVisible(true);
        jScrollPane1.setVisible(false);
    }//GEN-LAST:event_opdActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        MongoCollection<Document> collection = database.getCollection("patient");
        MongoCollection<Document> col = database.getCollection("rooms");
        ipd.setActionCommand("IPD");
        opd.setActionCommand("OPD");
        String id1 = id.getText();
        int id2 = Integer.parseInt(id1);
        
        collection.updateOne(Filters.eq("_id",id1), Updates.set("IOpatient",buttonGroup1.getSelection().getActionCommand()));
        
        collection.updateOne(Filters.eq("_id",id1), Updates.set("room",room.getText()));
        col.updateOne(Filters.eq("_id",room.getText()), Updates.set("alloted","1"));
        col.updateOne(Filters.eq("_id",room.getText()), Updates.set("pid",id1));
        col.updateOne(Filters.eq("_id",room.getText()), Updates.set("pname",name.getText()));
    }//GEN-LAST:event_submitActionPerformed

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        // TODO add your handling code here:
        MongoCollection<Document> collection = database.getCollection("patient");
        
        ipd.setActionCommand("IPD");
        opd.setActionCommand("OPD");
        String id1 = id.getText();
         
        
        collection.updateOne(Filters.eq("_id",id1), Updates.set("IOpatient",buttonGroup1.getSelection().getActionCommand()));
        
        bill b= new bill();
       b.setVisible(true);
    }//GEN-LAST:event_billActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  dashboard m=new dashboard();
                m.setVisible(true);
                setVisible(false);
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(updatepatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatepatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatepatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatepatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new updatepatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bill;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField id;
    private javax.swing.JRadioButton ipd;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton opd;
    private javax.swing.JTextField room;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}