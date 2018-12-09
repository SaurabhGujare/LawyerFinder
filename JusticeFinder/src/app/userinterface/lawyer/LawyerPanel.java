/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.lawyer;
import app.business.LoginAction;
import app.data.Session;
import app.data.org.Court;
import app.entities.user.Lawyer;
import app.entities.user.UserAccount;
import app.userinterface.BasePanel;
import app.userinterface.MainFrame;
import app.userinterface.common.CustomPanel;
import app.userinterface.common.HeaderPanel;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
public class LawyerPanel extends CustomPanel {
    
    private UserAccount userAccount;
    CardLayout layout;
    Court court;

    /**
     * Creates new form LawyerPanel
     */
    public LawyerPanel() {
        initComponents();
        this.makeTransparent(this);
        userAccount = Session.getUserAccount();
        
        containerPanel.add(new LawyerProfilePanel((Lawyer) userAccount.getUser(),false),LawyerProfilePanel.class.getName());
        containerPanel.add(new NewRequestPanel(),NewRequestPanel.class.getName());
        containerPanel.add(new ViewClientsPanel(),ViewClientsPanel.class.getName());
        containerPanel.add(new ViewRatingPanel(),ViewRatingPanel.class.getName());
        containerPanel.add(new ViewFiledCases(),ViewFiledCases.class.getName());
        containerPanel.add(new ViewStatsPanel(),ViewStatsPanel.class.getName());
        
        layout = (CardLayout)containerPanel.getLayout();
        headerPanel.add(new HeaderPanel(userAccount, this, "Lawyer"));
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
        menuPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        checkProfileBtn = new javax.swing.JButton();
        viewRequestBtn = new javax.swing.JButton();
        viewClientsBtn = new javax.swing.JButton();
        fileCaseBtn = new javax.swing.JButton();
        caseUpdatesBtn = new javax.swing.JButton();
        viewFeedbackBtn = new javax.swing.JButton();
        viewStatsBtn = new javax.swing.JButton();

        headerPanel.setBackground(new java.awt.Color(204, 204, 204));
        headerPanel.setLayout(new javax.swing.BoxLayout(headerPanel, javax.swing.BoxLayout.LINE_AXIS));

        jSplitPane1.setDividerLocation(200);

        containerPanel.setBackground(new java.awt.Color(255, 255, 255));
        containerPanel.setOpaque(false);
        containerPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(containerPanel);

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        checkProfileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/icons8_Profile_20px.png"))); // NOI18N
        checkProfileBtn.setText("View Profile");
        checkProfileBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkProfileBtnActionPerformed(evt);
            }
        });
        jPanel2.add(checkProfileBtn);

        viewRequestBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/icons8_View_20px.png"))); // NOI18N
        viewRequestBtn.setText("View Requests");
        viewRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestBtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewRequestBtn);

        viewClientsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/icons8_Customer_20px.png"))); // NOI18N
        viewClientsBtn.setText("View Clients");
        viewClientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClientsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewClientsBtn);

        fileCaseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/icons8_Add_File_20px.png"))); // NOI18N
        fileCaseBtn.setText("File Case");
        fileCaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileCaseBtnActionPerformed(evt);
            }
        });
        jPanel2.add(fileCaseBtn);

        caseUpdatesBtn.setText("View Case Updates");
        caseUpdatesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseUpdatesBtnActionPerformed(evt);
            }
        });
        jPanel2.add(caseUpdatesBtn);

        viewFeedbackBtn.setText("View Feedback");
        viewFeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFeedbackBtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewFeedbackBtn);

        viewStatsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/icons8_Combo_Chart_20px_3.png"))); // NOI18N
        viewStatsBtn.setText("View My Stats");
        viewStatsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStatsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewStatsBtn);

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(menuPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkProfileBtnActionPerformed
        // TODO add your handling code here:
        layout.show(containerPanel, LawyerProfilePanel.class.getName());
    }//GEN-LAST:event_checkProfileBtnActionPerformed

    private void viewRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestBtnActionPerformed
        layout.show(containerPanel, NewRequestPanel.class.getName());
    }//GEN-LAST:event_viewRequestBtnActionPerformed

    private void viewClientsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClientsBtnActionPerformed
        // TODO add your handling code here:
        layout.show(containerPanel, ViewClientsPanel.class.getName());
    }//GEN-LAST:event_viewClientsBtnActionPerformed

    private void viewFeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFeedbackBtnActionPerformed
        // TODO add your handling code here:
        layout.show(containerPanel, ViewRatingPanel.class.getName());
    }//GEN-LAST:event_viewFeedbackBtnActionPerformed

    private void fileCaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileCaseBtnActionPerformed
        // TODO add your handling code here:        
        FileCaseDialog dialog = new FileCaseDialog(MainFrame.self, true, court, (Lawyer) Session.getUserAccount().getUser());

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
        Point newLocation = new Point(middle.x - (dialog.getWidth() / 2) - 150,
                middle.y - (dialog.getHeight() / 2) - 150);

        dialog.setLocation(newLocation);
        dialog.pack();

        dialog.setVisible(true);
    }//GEN-LAST:event_fileCaseBtnActionPerformed

    private void viewStatsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStatsBtnActionPerformed
        // TODO add your handling code here:
        layout.show(containerPanel, ViewStatsPanel.class.getName());
    }//GEN-LAST:event_viewStatsBtnActionPerformed

    private void caseUpdatesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseUpdatesBtnActionPerformed
        // TODO add your handling code here:
        layout.show(containerPanel, ViewFiledCases.class.getName());
    }//GEN-LAST:event_caseUpdatesBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton caseUpdatesBtn;
    private javax.swing.JButton checkProfileBtn;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JButton fileCaseBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton viewClientsBtn;
    private javax.swing.JButton viewFeedbackBtn;
    private javax.swing.JButton viewRequestBtn;
    private javax.swing.JButton viewStatsBtn;
    // End of variables declaration//GEN-END:variables
}
