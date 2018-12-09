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
import app.userinterface.common.CustomPanel;
import app.userinterface.common.HeaderPanel;
import java.awt.CardLayout;

/**
 *
 * @author PC
 */
public class LegalEntityPanel extends CustomPanel {

    /**
     * Creates new form LegalEntityPanel
     */
    UserAccount account ;
    CardLayout layout;
    public LegalEntityPanel() {
        initComponents();
        this.makeTransparent(this);
        account = Session.getUserAccount();
        containerPanel.add(new ViewLEProfilePanel((LegalEntity)account.getUser(),false),ViewLEProfilePanel.class.getName());
        containerPanel.add(new SearchLawyerPanel(Network.getInstance().getLAWYER_DIRECTORY()),SearchLawyerPanel.class.getName());
        containerPanel.add(new RateLawyerPanel(),RateLawyerPanel.class.getName());
        containerPanel.add(new ViewFiledCases(),ViewFiledCases.class.getName());
        layout = (CardLayout) containerPanel.getLayout();
        headerPanel.add(new HeaderPanel(account, this, "Legal Entity"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        containerPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        viewProfileBtn = new javax.swing.JButton();
        searchLawyers = new javax.swing.JButton();
        rateLawyer = new javax.swing.JButton();
        ViewSentCases = new javax.swing.JButton();

        setOpaque(false);

        headerPanel.setOpaque(false);
        headerPanel.setLayout(new javax.swing.BoxLayout(headerPanel, javax.swing.BoxLayout.LINE_AXIS));

        jSplitPane1.setDividerLocation(250);
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

        rateLawyer.setText("Rate Lawyer");
        rateLawyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateLawyerActionPerformed(evt);
            }
        });
        jPanel3.add(rateLawyer);

        ViewSentCases.setText("View Cases");
        ViewSentCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewSentCasesActionPerformed(evt);
            }
        });
        jPanel3.add(ViewSentCases);

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
                .addContainerGap(411, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileBtnActionPerformed
        // TODO add your handling code here:
        layout.show(containerPanel, ViewLEProfilePanel.class.getName());
    }//GEN-LAST:event_viewProfileBtnActionPerformed

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
        layout.show(containerPanel, ViewFiledCases.class.getName());
    }//GEN-LAST:event_ViewSentCasesActionPerformed
                                                  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewSentCases;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton rateLawyer;
    private javax.swing.JButton searchLawyers;
    private javax.swing.JButton viewProfileBtn;
    // End of variables declaration//GEN-END:variables
}
