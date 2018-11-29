/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.admin;

import app.business.LoginAction;
import app.data.DataStore;
import app.data.Session;
import app.entities.Admin;
import app.userinterface.BasePanel;
import java.awt.CardLayout;
import java.awt.Dimension;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class AdminPanel extends javax.swing.JPanel {

    private Admin admin;
    CardLayout layout;
    LoginAction loginAction = new LoginAction();
    DataStore dataStore = DataStore.getInstance();
    /**
     * Creates new form LegalEntityPanel
     */
    public AdminPanel() {
        initComponents();
        admin = (Admin)Session.getUserAccount().getUser();
        userNameLbl.setText(Session.getUserAccount().getUsername());
        this.setPreferredSize(new Dimension(1023, 767));
        containerPanel.add(new StateBarAssociationPanel(dataStore.getSTATEBARASSOCIATION_DIRECTORY(),dataStore.getUSER_ACCOUNTS()),StateBarAssociationPanel.class.getName());
        containerPanel.add(new CourtPanel(),CourtPanel.class.getName());
        
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
        logoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        userNameLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        menuPanel = new javax.swing.JPanel();
        mainMenu = new javax.swing.JPanel();
        stateBarAssoBtn = new javax.swing.JButton();
        courtBtn = new javax.swing.JButton();
        containerPanel = new javax.swing.JPanel();

        setOpaque(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("User Name:");

        userNameLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 482, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutBtn)
                    .addComponent(jLabel2)
                    .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);

        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setOpaque(false);

        menuPanel.setOpaque(false);
        menuPanel.setLayout(new java.awt.CardLayout());

        mainMenu.setOpaque(false);

        stateBarAssoBtn.setText("State Bar Associations");
        stateBarAssoBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        stateBarAssoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateBarAssoBtnActionPerformed(evt);
            }
        });

        courtBtn.setText("Courts");
        courtBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        courtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courtBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
            .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(stateBarAssoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addComponent(courtBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
            .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainMenuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(stateBarAssoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(courtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(566, Short.MAX_VALUE)))
        );

        menuPanel.add(mainMenu, "card2");

        jSplitPane1.setLeftComponent(menuPanel);

        containerPanel.setOpaque(false);
        containerPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(containerPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        loginAction.logout();
        ((BasePanel)this.getParent()).unloadPage(this);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void stateBarAssoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateBarAssoBtnActionPerformed
        layout.show(containerPanel, StateBarAssociationPanel.class.getName());
    }//GEN-LAST:event_stateBarAssoBtnActionPerformed

    private void courtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courtBtnActionPerformed
        layout.show(containerPanel,CourtPanel.class.getName());
    }//GEN-LAST:event_courtBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containerPanel;
    private javax.swing.JButton courtBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton stateBarAssoBtn;
    private javax.swing.JLabel userNameLbl;
    // End of variables declaration//GEN-END:variables
}
