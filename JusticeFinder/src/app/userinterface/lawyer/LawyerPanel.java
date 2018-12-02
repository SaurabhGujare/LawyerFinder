/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.lawyer;
import app.business.LoginAction;
import app.data.Session;
import app.entities.user.Lawyer;
import app.entities.user.UserAccount;
import app.userinterface.BasePanel;
import java.awt.CardLayout;

/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
public class LawyerPanel extends javax.swing.JPanel {
    
    private UserAccount userAccount;
    CardLayout layout;

    /**
     * Creates new form LawyerPanel
     */
    public LawyerPanel() {
        initComponents();
        userAccount = Session.getUserAccount();
        containerPanel.add(new NewRequestPanel(),NewRequestPanel.class.getName());
        containerPanel.add(new LawyerProfilePanel((Lawyer) userAccount.getUser(),false),LawyerProfilePanel.class.getName());
        layout = (CardLayout)containerPanel.getLayout();
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
        logoutButton = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        containerPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        checkProfileBtn = new javax.swing.JButton();
        viewRequestBtn = new javax.swing.JButton();
        viewClientsBtn = new javax.swing.JButton();
        fileCaseBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(729, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setDividerLocation(200);

        containerPanel.setBackground(new java.awt.Color(255, 255, 255));
        containerPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(containerPanel);

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        checkProfileBtn.setText("View Profile");
        checkProfileBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkProfileBtnActionPerformed(evt);
            }
        });
        jPanel2.add(checkProfileBtn);

        viewRequestBtn.setText("View Requests");
        viewRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestBtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewRequestBtn);

        viewClientsBtn.setText("View Clients");
        viewClientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClientsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewClientsBtn);

        fileCaseBtn.setText("File Case");
        jPanel2.add(fileCaseBtn);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(menuPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        ((BasePanel)this.getParent()).unloadPage(this);     
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void checkProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkProfileBtnActionPerformed
        // TODO add your handling code here:
        layout.show(containerPanel, LawyerProfilePanel.class.getName());
    }//GEN-LAST:event_checkProfileBtnActionPerformed

    private void viewRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestBtnActionPerformed
        layout.show(containerPanel, NewRequestPanel.class.getName());
    }//GEN-LAST:event_viewRequestBtnActionPerformed

    private void viewClientsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClientsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewClientsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkProfileBtn;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JButton fileCaseBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton viewClientsBtn;
    private javax.swing.JButton viewRequestBtn;
    // End of variables declaration//GEN-END:variables
}
