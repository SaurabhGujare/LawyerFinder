/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.legalEntity;

import app.data.Session;
import app.entities.user.Lawyer;
import app.entities.user.LegalEntity;
import app.entities.workqueues.CaseFileRequest;
import app.entities.workqueues.CaseFileRequestWorkQueue;
import app.entities.workqueues.GrievanceRequest;
import app.entities.workqueues.GrievanceRequestWorkQueue;
import app.entities.workqueues.WorkItem;
import app.userinterface.MainFrame;
import app.userinterface.clerk.CaseUpdatesDialog;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
public class ViewFiledCases extends javax.swing.JPanel {

    /**
     * Creates new form ViewSentRequest
     */
    public ViewFiledCases() {
        initComponents();
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) greivanceRequestTbl.getModel();
        model.setRowCount(0);
        LegalEntity legalEntity = (LegalEntity) Session.getUserAccount().getUser();
        for(WorkItem i: ((CaseFileRequestWorkQueue) legalEntity.getCaseQueue()).getWorkList()){
            CaseFileRequest request = (CaseFileRequest) i;
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getCasereq().getCasefileDate();
            row[2] = request.getCasereq().getCourt();
            row[3] = request.getCasereq().getLawyer();
            row[4] = request.getCasereq().getJudge();
            row[5] = request.getStatus();
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        greivanceRequestTbl = new javax.swing.JTable();
        openBtn = new javax.swing.JButton();

        setOpaque(false);

        jPanel1.setOpaque(false);

        greivanceRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Case Title", "Date Requested", "Lawyer Name", "Court", "Judge", "Status"
            }
        ));
        jScrollPane1.setViewportView(greivanceRequestTbl);

        openBtn.setText("Open");
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(openBtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= greivanceRequestTbl.getSelectedRow();
        if(selectedrow>=0){
            CaseFileRequest req = (CaseFileRequest) greivanceRequestTbl.getValueAt(greivanceRequestTbl.getSelectedRow(),0);

            CaseUpdatesPanel dialog = new CaseUpdatesPanel(MainFrame.self,true,req);

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
            Point newLocation = new Point(middle.x - (dialog.getWidth() / 2) - 150,
                middle.y - (dialog.getHeight() / 2) - 150);

            dialog.setLocation(newLocation);
            dialog.pack();

            dialog.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a Record first!!");
        }
    }//GEN-LAST:event_openBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable greivanceRequestTbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openBtn;
    // End of variables declaration//GEN-END:variables
}
