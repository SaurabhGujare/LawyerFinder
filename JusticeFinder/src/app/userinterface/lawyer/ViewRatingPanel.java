/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.lawyer;

import app.userinterface.legalEntity.*;
import app.data.Session;
import app.entities.Rating;
import app.entities.user.Lawyer;
import app.entities.user.LegalEntity;
import app.entities.workqueues.GrievanceRequest;
import app.entities.workqueues.GrievanceRequestWorkQueue;
import app.entities.workqueues.WorkItem;
import app.userinterface.MainFrame;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ViewRatingPanel extends javax.swing.JPanel {

    /**
     * Creates new form RateLawyerPage
     */
    public ViewRatingPanel() {
        initComponents();
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
        ratingTbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        viewBtn = new javax.swing.JButton();

        ratingTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Given By", "Rating Given"
            }
        ));
        jScrollPane1.setViewportView(ratingTbl);

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewBtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int selectedrow= ratingTbl.getSelectedRow();
        if(selectedrow>=0){
            Rating rating = (Rating) ratingTbl.getValueAt(ratingTbl.getSelectedRow(),1);
            RatePanel dialog = new RatePanel((Lawyer) Session.getUserAccount().getUser(), rating.getGivenBy(), MainFrame.self, true,true);
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
            Point newLocation = new Point(middle.x - (dialog.getWidth() / 2) - 150,
                    middle.y - (dialog.getHeight() / 2) - 150);

            dialog.setLocation(newLocation);
            dialog.pack();
            dialog.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Record first!!");
        }
    }//GEN-LAST:event_viewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ratingTbl;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) ratingTbl.getModel();
        model.setRowCount(0);
        Lawyer l = ((Lawyer)Session.getUserAccount().getUser());
        for(Rating rating : l.getRatings().getAllEntries()){
            Object[] row = new Object[2];
            row[0] = rating.getGivenBy().getFirstName()+" "+rating.getGivenBy().getLastName();
            row[1] = rating;
            model.addRow(row);
        }
    }
}
