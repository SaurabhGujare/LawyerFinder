/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.login;

import app.data.Network;
import app.data.org.PublicDomain;
import app.entities.user.LegalEntity;
import app.entities.user.UserAccount;
import app.userinterface.BasePanel;
import app.userinterface.common.CustomPanel;
import app.userinterface.lawyer.LawyerProfilePanel;
import app.userinterface.legalEntity.ViewLEProfilePanel;
import app.utils.ConfigUtil;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class NewLegalEntity extends CustomPanel {

    LegalEntity legalEntity = null;
    CardLayout layout;
    ViewLEProfilePanel viewLEProfilePanel;
    NewUserAccount newUserAccount;
    /**
     * Creates new form NewLegalEntity
     */
    public NewLegalEntity() {
        initComponents();
                this.makeTransparent(this);

        viewLEProfilePanel = new ViewLEProfilePanel(legalEntity, false);
        container.add(viewLEProfilePanel,LawyerProfilePanel.class.getName());
        
        newUserAccount = new NewUserAccount();
        container.add(newUserAccount,NewUserAccount.class.getName());
        layout = (CardLayout) container.getLayout();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        heading = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(nextBtn))
                .addContainerGap())
        );

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());

        heading.setBackground(Color.decode(ConfigUtil.getProp("headerColor")));
        heading.setName("NA"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Legal Entity");

        javax.swing.GroupLayout headingLayout = new javax.swing.GroupLayout(heading);
        heading.setLayout(headingLayout);
        headingLayout.setHorizontalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingLayout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        headingLayout.setVerticalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        
        // TODO add your handling code here:
        if(viewLEProfilePanel.isVisible()){
            JPanel parent = (JPanel) this.getParent();
            CardLayout layout = (CardLayout) parent.getLayout();
            layout.show(parent, SelectUserType.class.getName());
        }
        else{
            layout.previous(container);
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        if(viewLEProfilePanel.isVisible()){
            legalEntity = viewLEProfilePanel.validateandGetLE(true);
            if(legalEntity==null)
                return;
            
            try {
                ((PublicDomain) legalEntity.getParent()).getDirectory().addNew(legalEntity);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "User already present in the system.");
                return;
            }
        }
        
        if(newUserAccount.isVisible()){
            UserAccount account = newUserAccount.getUser(legalEntity);
            if(account==null)
                return;
            try {
                Network.getInstance().getUSER_ACCOUNTS().addNew(account);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "User already present");
                return;
            }
            
            
            JOptionPane.showMessageDialog(this, "Legal Entity Created");
            ((BasePanel)this.getParent().getParent()).loadPage(new LoginPanel());
        }
        layout.next(container);
        
    }//GEN-LAST:event_nextBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel container;
    private javax.swing.JPanel heading;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton nextBtn;
    // End of variables declaration//GEN-END:variables
}
