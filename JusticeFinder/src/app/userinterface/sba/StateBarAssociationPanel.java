/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.sba;

import app.data.Session;
import app.entities.user.StateBarAssoAdmin;
import java.awt.CardLayout;
import app.data.directories.Directory;
import app.data.org.StateBarAssociation;
import app.entities.user.Lawyer;
import app.userinterface.common.CustomPanel;
import app.userinterface.common.HeaderPanel;

/**
 *
 * @author Akshay Relekar
 */
public class StateBarAssociationPanel extends CustomPanel {

   Directory<String , Lawyer> lawyerDir;
   CardLayout layout;
   StateBarAssoAdmin sba;
    
    public StateBarAssociationPanel() {
        initComponents();
                this.makeTransparent(this);

        headerPanel.add(new HeaderPanel(Session.getUserAccount(),this,"State Bar Association"));
        sba = (StateBarAssoAdmin) Session.getUserAccount().getUser();
//        containerpanel.add(new ViewSBARequestsPanel(),ViewSBARequestsPanel.class.getName());
        layout = (CardLayout) containerpanel.getLayout();
        containerpanel.add(new ApproveRejectRequestPanel((StateBarAssociation) sba.getParent()),ApproveRejectRequestPanel.class.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodypanel = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        menupanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        containerpanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1108, 714));
        setPreferredSize(new java.awt.Dimension(1208, 914));

        jSplitPane2.setDividerLocation(250);
        jSplitPane2.setMinimumSize(new java.awt.Dimension(7, 3));
        jSplitPane2.setPreferredSize(new java.awt.Dimension(256, 712));

        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(612, Short.MAX_VALUE))
        );

        jSplitPane2.setTopComponent(menupanel);

        containerpanel.setRequestFocusEnabled(false);
        containerpanel.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(containerpanel);

        javax.swing.GroupLayout bodypanelLayout = new javax.swing.GroupLayout(bodypanel);
        bodypanel.setLayout(bodypanelLayout);
        bodypanelLayout.setHorizontalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodypanelLayout.setVerticalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        headerPanel.setBackground(new java.awt.Color(102, 102, 102));
        headerPanel.setLayout(new javax.swing.BoxLayout(headerPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodypanel;
    private javax.swing.JPanel containerpanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel menupanel;
    // End of variables declaration//GEN-END:variables
}
