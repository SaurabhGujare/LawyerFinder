/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Common.CommonUtils;
import Business.Abstract.User;
import Business.Users.Admin;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ninad, Akshay, Saurabh
 */
public class AdminMainScreen extends javax.swing.JPanel {

    /**
     * Creates new form AdminMainScreen
     */
    private final JPanel panelRight;
    private final Admin admin;
    public AdminMainScreen(JPanel panelRight, Admin admin) {
        initComponents();
        this.panelRight = panelRight;
        this.admin = admin;
        ComponentAdapter adapter = new ComponentAdapter() {

            @Override
            public void componentShown(ComponentEvent ce) {
                super.componentShown(ce); 
                populate();
            }
            
        };
        
        this.addComponentListener(adapter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCust = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSup = new javax.swing.JTable();

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/icons/Add User Male_48px.png"))); // NOI18N
        btnCreate.setText("Create User");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        tableCust.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Date Created"
            }
        ));
        jScrollPane1.setViewportView(tableCust);

        tableSup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Name", "Number of Products"
            }
        ));
        jScrollPane2.setViewportView(tableSup);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.add(new AdminCreateScreen(panelRight, admin));
        layout.next(panelRight);
    }//GEN-LAST:event_btnCreateActionPerformed


    private void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tableSup.getModel();
        dtm.setRowCount(0);
        for(User u : admin.getSuppDir().getSupplierList()){
            Supplier s = (Supplier)u;
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=s;
            row[1]=s.getDirectory().getProductList().size();
            dtm.addRow(row);
        }
        
        dtm = (DefaultTableModel)tableCust.getModel();
        dtm.setRowCount(0);
        for(User u : admin.getCustDir().getCustomerList()){
            Customer c = (Customer)u;
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=c;
            row[1]=CommonUtils.formatDateTime(c.getDateCreated());
            dtm.addRow(row);
        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableCust;
    private javax.swing.JTable tableSup;
    // End of variables declaration//GEN-END:variables
}
