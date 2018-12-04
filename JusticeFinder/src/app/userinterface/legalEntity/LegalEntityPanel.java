/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.legalEntity;

import app.data.Network;
import app.data.Session;
import app.entities.user.Lawyer;
import app.entities.user.LegalEntity;
import app.entities.user.UserAccount;
import app.userinterface.BasePanel;
import java.awt.CardLayout;

/**
 *
 * @author PC
 */
public class LegalEntityPanel extends javax.swing.JPanel {

    /**
     * Creates new form LegalEntityPanel
     */
    UserAccount account ;
    CardLayout layout;
    public LegalEntityPanel() {
        initComponents();
        account = Session.getUserAccount();
        containerPanel.add(new ViewLEProfilePanel((LegalEntity)account.getUser(),false),ViewLEProfilePanel.class.getName());
        containerPanel.add(new SearchLawyerPanel(Network.getInstance().getLAWYER_DIRECTORY()),SearchLawyerPanel.class.getName());
        containerPanel.add(new RateLawyerPanel(),RateLawyerPanel.class.getName());
        containerPanel.add(new ViewSentRequest(),ViewSentRequest.class.getName());
        layout = (CardLayout) containerPanel.getLayout();
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
        logoutBtn = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        containerPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        viewProfileBtn = new javax.swing.JButton();
        searchLawyers = new javax.swing.JButton();
        ViewSentCases = new javax.swing.JButton();
        rateLawyer = new javax.swing.JButton();

        setOpaque(false);

        jPanel1.setOpaque(false);

        jLabel1.setText("Legal Entity Page");

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(logoutBtn))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setOpaque(false);

        containerPanel.setOpaque(false);
        containerPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(containerPanel);

        jPanel2.setOpaque(false);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(0, 1, 5, 5));

        viewProfileBtn.setText("View Profile");
        viewProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileBtnActionPerformed(evt);
            }
        });
        jPanel3.add(viewProfileBtn);

        searchLawyers.setText("Search Lawyer");
        searchLawyers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLawyersActionPerformed(evt);
            }
        });
        jPanel3.add(searchLawyers);

        ViewSentCases.setText("View Cases");
        ViewSentCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewSentCasesActionPerformed(evt);
            }
        });
        jPanel3.add(ViewSentCases);

        rateLawyer.setText("Rate Lawyer");
        rateLawyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateLawyerActionPerformed(evt);
            }
        });
        jPanel3.add(rateLawyer);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileBtnActionPerformed
        // TODO add your handling code here:
        layout.show(containerPanel, ViewLEProfilePanel.class.getName());
    }//GEN-LAST:event_viewProfileBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        ((BasePanel)this.getParent()).unloadPage(this);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void searchLawyersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchLawyersActionPerformed
        // TODO add your handling code here:
        layout.show(containerPanel, SearchLawyerPanel.class.getName());
    }//GEN-LAST:event_searchLawyersActionPerformed

    private void rateLawyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateLawyerActionPerformed
        // TODO add your handling code here:
        layout.show(containerPanel, RateLawyerPanel.class.getName());
    }//GEN-LAST:event_rateLawyerActionPerformed

    private void ViewSentCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewSentCasesActionPerformed
        // TODO add your handling code here:
        layout.show(containerPanel, ViewSentRequest.class.getName());
    }//GEN-LAST:event_ViewSentCasesActionPerformed
                                                  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewSentCases;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton rateLawyer;
    private javax.swing.JButton searchLawyers;
    private javax.swing.JButton viewProfileBtn;
    // End of variables declaration//GEN-END:variables
}
