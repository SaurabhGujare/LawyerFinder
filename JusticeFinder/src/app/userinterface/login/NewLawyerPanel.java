/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.login;

import app.data.Network;
import app.data.org.StateBarAssociation;
import app.entities.user.Lawyer;
import app.entities.user.UserAccount;
import app.entities.workqueues.LawyerApprovalRequest;
import app.userinterface.BasePanel;
import app.userinterface.common.CustomPanel;
import app.userinterface.lawyer.LawyerProfilePanel;
import app.utils.ConfigUtil;
import app.userinterface.sba.ViewSBARequestsPanel;
import app.utils.email.EmailTemplateFormatter;
import app.utils.email.EmailUtil;
import app.utils.email.templates.Templates;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.lang.Exception;

/**
 *
 * @author PC
 */
public class NewLawyerPanel extends CustomPanel {

    Lawyer lawyer = null;
    CardLayout layout;
    LawyerProfilePanel lawyerProfilePanel;
    NewUserAccount newUserAccount;
    /**
     * Creates new form NewLawyerPanel
     */
    public NewLawyerPanel() {
        initComponents();
        this.makeTransparent(this);

        lawyerProfilePanel = new LawyerProfilePanel(lawyer, false);
        container.add(lawyerProfilePanel,LawyerProfilePanel.class.getName());
        
        newUserAccount = new NewUserAccount();
        container.add(newUserAccount,NewUserAccount.class.getName());
        layout = (CardLayout) container.getLayout();
        this.makeTransparent(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nextBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        heading.setBackground(Color.decode(ConfigUtil.getProp("headerColor")));
        heading.setName("NA"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Lawyer");

        javax.swing.GroupLayout headingLayout = new javax.swing.GroupLayout(heading);
        heading.setLayout(headingLayout);
        headingLayout.setHorizontalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingLayout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(344, Short.MAX_VALUE))
        );
        headingLayout.setVerticalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        container.setLayout(new java.awt.CardLayout());

        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/path9096.png"))); // NOI18N
        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/path9663.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(nextBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextBtn)
                    .addComponent(backBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        if(lawyerProfilePanel.isVisible()){
            lawyer = lawyerProfilePanel.validateandGetLawyer(true);
            if(lawyer==null)
                return;
        }
        if(newUserAccount.isVisible()){
            UserAccount account = newUserAccount.getUser(lawyer);
            if(account==null){
                return;
            }
            try {
                Network.getInstance().getUSER_ACCOUNTS().addNew(account);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "User already present");
                return;
            }
            
            for(StateBarAssociation sba: lawyer.getRequestedStateBars().getAllEntries()){
               
                sba.getWorkQueue().createNewWorkItem(account, sba.getAdmin().getAccount(), "Request");
                
                String LAWYER_NAME = lawyer.getFirstName()+" "+lawyer.getLastName();
                String SBA_NAME = sba.getStateBarAssociationName();
                String body = "";
                try {
                    body = EmailTemplateFormatter.getMessage(Templates.LAWYER_REQUEST.getPageName(), SBA_NAME, LAWYER_NAME);
                } catch (IOException ex) {
                    Logger.getLogger(ViewSBARequestsPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                EmailUtil.sendMail(sba.getEmail(), "Lawyer Approval Request", body);
                
            }                
            JOptionPane.showMessageDialog(this, "Lawyer Sent for Approval");
            ((BasePanel)this.getParent().getParent()).loadPage(new LoginPanel());
        }
        
        layout.next(container);
    }//GEN-LAST:event_nextBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        if(lawyerProfilePanel.isVisible()){
            JPanel parent = (JPanel) this.getParent();
            CardLayout layout = (CardLayout) parent.getLayout();
            layout.show(parent, SelectUserType.class.getName());
        }
        else{
            layout.previous(container);
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel container;
    private javax.swing.JPanel heading;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nextBtn;
    // End of variables declaration//GEN-END:variables
}
