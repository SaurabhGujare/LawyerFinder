/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.sba;

import app.data.org.StateBarAssociation;
import app.entities.user.Lawyer;
import app.entities.workqueues.LawyerApprovalRequest;
import app.entities.workqueues.StateBarAssoWorkQueue;
import app.entities.workqueues.WorkItem;
import app.userinterface.MainFrame;
import app.userinterface.common.CustomPanel;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ApproveRejectRequestPanel extends CustomPanel {

    StateBarAssociation sba;
    /**
     * Creates new form ApproveRejectRequestPanel
     */
    public ApproveRejectRequestPanel(StateBarAssociation sba) {
        initComponents();
        this.sba = sba;
                this.makeTransparent(this);

        ComponentAdapter adapter = new ComponentAdapter() {

            @Override
            public void componentShown(ComponentEvent ce) {
                super.componentShown(ce); 
                populateTable();
            }
            
        };
        this.addComponentListener(adapter);
        populateTable();
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
        RequestTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        openBtn = new javax.swing.JButton();

        RequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ApprovalRequest", "From Lawyer", "Date", "Decision"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RequestTable);

        openBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/icons8_Open_Envelope_20px.png"))); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(openBtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(openBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= RequestTable.getSelectedRow();
        if(selectedrow>=0){
            LawyerApprovalRequest req = (LawyerApprovalRequest) RequestTable.getValueAt(RequestTable.getSelectedRow(),0);
            
            JDialog dialog = new JDialog(MainFrame.self, "Request Details",true);
            ViewSBARequestsPanel panel = new ViewSBARequestsPanel(sba, dialog); 
            panel.setSaveBtnListner(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    populateTable();
                }
            });
            dialog.getContentPane().add(panel);
            
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
            Point newLocation = new Point(middle.x - (dialog.getWidth() / 2) - 200,
                    middle.y - (dialog.getHeight() / 2) - 200);

            dialog.setLocation(newLocation);
            dialog.pack();
            
            panel.showDialog(req);
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Please select a record from the table.");
        }
    }//GEN-LAST:event_openBtnActionPerformed

    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) RequestTable.getModel();
        model.setRowCount(0);
        for(WorkItem i: ((StateBarAssoWorkQueue) sba.getWorkQueue()).getWorkList()){
            LawyerApprovalRequest request = (LawyerApprovalRequest) i;
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = ((Lawyer) request.getSender().getUser()).getFirstName();
            row[2] = request.getRequestDate();
            row[3] = request.getStatus();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RequestTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openBtn;
    // End of variables declaration//GEN-END:variables
}
