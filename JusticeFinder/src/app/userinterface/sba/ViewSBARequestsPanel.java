/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.sba;

import app.data.Network;
import app.data.org.StateBarAssociation;
import app.entities.user.Lawyer;
import app.entities.workqueues.LawyerApprovalRequest;
import app.userinterface.MainFrame;
import app.userinterface.lawyer.LawyerProfilePanel;
import app.utils.email.EmailTemplateFormatter;
import app.utils.email.EmailUtil;
import app.utils.email.templates.Templates;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshay Relekar
 */
public class ViewSBARequestsPanel extends javax.swing.JPanel {

    LawyerApprovalRequest request;
    StateBarAssociation association;
    JDialog dialog;
    private ActionListener saveBtnListner;
            
    /**
     * Creates new form SBAPendingRequests
     */
    public ViewSBARequestsPanel(StateBarAssociation association,JDialog dialog) {
        initComponents();
        //this.request = request;
        this.association= association;
        //populateForm();
        reqByTxt.setEnabled(false);
        reqDate.setEnabled(false);
        reqMsgTxt.setEnabled(false);
        reqNumTxt.setEnabled(false);
        this.dialog = dialog;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reqNumTxt = new javax.swing.JTextField();
        reqByTxt = new javax.swing.JTextField();
        reqDate = new javax.swing.JTextField();
        reqMsgTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        viewLawyerBtn = new javax.swing.JButton();
        approveBtn = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(741, 353));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Request Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabel1.setText("Request Number:");

        jLabel2.setText("Requested By:");

        jLabel3.setText("Request Date:");

        jLabel4.setText("Request Message:");

        jLabel5.setText("Status:");

        statusLabel.setText("PENDING");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(reqNumTxt)
                        .addComponent(reqByTxt)
                        .addComponent(reqMsgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reqDate, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusLabel))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(statusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reqNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reqByTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(reqDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(reqMsgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jPanel3.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        viewLawyerBtn.setText("View Lawyer");
        viewLawyerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLawyerBtnActionPerformed(evt);
            }
        });
        jPanel3.add(viewLawyerBtn);

        approveBtn.setText("Approve");
        approveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBtnActionPerformed(evt);
            }
        });
        jPanel3.add(approveBtn);

        rejectBtn.setText("Reject");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });
        jPanel3.add(rejectBtn);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        // TODO add your handling code here:
        request.setStatus("REJECTED");
        ((Lawyer)request.getSender().getUser()).getRequestedStateBars().delete(association.getKey());
        request.setResolveDate(new Date());
        JOptionPane.showMessageDialog(null, "Request Rejected!!");
        dialog.setVisible(false);
        saveBtnListner.actionPerformed(evt);
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void approveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBtnActionPerformed
        try {
            association.getDirectory().addNew(((Lawyer)request.getSender().getUser()));
            ((Lawyer)request.getSender().getUser()).getAllowedStateBars().addNew(association);
            ((Lawyer)request.getSender().getUser()).getRequestedStateBars().delete(association.getKey());
            request.setStatus("APPROVED");
            request.setResolveDate(new Date());
            Network.getInstance().getLAWYER_DIRECTORY().addNew(((Lawyer)request.getSender().getUser()));
        } catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
        
        JOptionPane.showMessageDialog(null, "Request Approved!!");
        Lawyer lawyer = (Lawyer)request.getSender().getUser();
        
        String body = "";
        try {
            body = EmailTemplateFormatter.getMessage(Templates.LAWYER_APPROVED.getPageName(), lawyer.getFirstName()+" "+lawyer.getLastName());
        } catch (IOException ex) {
            Logger.getLogger(ViewSBARequestsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        EmailUtil.sendMail(lawyer.getEmail(), "Request Approved", body);
        
        dialog.setVisible(false);
        saveBtnListner.actionPerformed(evt);
    }//GEN-LAST:event_approveBtnActionPerformed

    private void viewLawyerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLawyerBtnActionPerformed
        // TODO add your handling code here:
        JDialog dialog = new JDialog(MainFrame.self, "Lawyer Details",true);
        LawyerProfilePanel panel = new LawyerProfilePanel(((Lawyer)request.getSender().getUser()), true);
        dialog.getContentPane().add(panel);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
        Point newLocation = new Point(middle.x - (dialog.getWidth() / 2) - 400,
                middle.y - (dialog.getHeight() / 2) - 400);

        dialog.setLocation(newLocation);
        dialog.pack();
        dialog.setVisible(true);
    }//GEN-LAST:event_viewLawyerBtnActionPerformed

    public ActionListener getSaveBtnListner() {
        return saveBtnListner;
    }

    public void setSaveBtnListner(ActionListener saveBtnListner) {
        this.saveBtnListner = saveBtnListner;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JTextField reqByTxt;
    private javax.swing.JTextField reqDate;
    private javax.swing.JTextField reqMsgTxt;
    private javax.swing.JTextField reqNumTxt;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton viewLawyerBtn;
    // End of variables declaration//GEN-END:variables

    private void populateForm() {
        reqNumTxt.setText(request.getId()+"");
        reqByTxt.setText(((Lawyer)request.getSender().getUser()).getFirstName());
        reqDate.setText(request.getRequestDate().toString());
        statusLabel.setText(request.getStatus());
    }
    
    public void showDialog(LawyerApprovalRequest request){
        this.request = request;
        populateForm();
        if(!request.getStatus().equals("PENDING")){
            approveBtn.setEnabled(false);
            rejectBtn.setEnabled(false);
        }
        
        dialog.setVisible(true);
    }
}
