/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.admin;

import app.data.directories.Directory;
import app.data.org.StateBarAssociation;
import app.entities.user.UserAccount;
import app.entities.workqueues.StateBarAssoWorkQueue;
import app.userinterface.common.CustomPanel;
import app.userinterface.interfaces.HasTable;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
public class StateBarAssociationPanel extends CustomPanel implements HasTable {

    Directory<String, StateBarAssociation> stateBarDir;
    Directory<String, UserAccount> userAccDir;
    private StateBarAssociation association;

    /**
     * Creates new form StateBarAssociationPanel
     */
    public StateBarAssociationPanel(Directory<String, StateBarAssociation> stateBarDir, Directory<String, UserAccount> userAccDir) {
        initComponents();
        this.stateBarDir = stateBarDir;
        this.userAccDir = userAccDir;
        this.makeTransparent(this);
        ComponentAdapter adapter = new ComponentAdapter() {

            @Override
            public void componentShown(ComponentEvent ce) {
                super.componentShown(ce);
                populateTableData();
            }

        };

        this.addComponentListener(adapter);
        populateTableData();
        nameTxt.setEnabled(false);
        emailTxt.setEnabled(false);
        userNameTxt.setEnabled(false);
        passwordTxt.setEnabled(false);
        saveBtn.setEnabled(false);
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

        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        viewUpdateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        recordsTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();

        setOpaque(false);

        jPanel5.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("State Bar Associations");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setOpaque(false);

        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/path6261.png"))); // NOI18N
        addBtn.setText("Add New");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        viewUpdateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/round.png"))); // NOI18N
        viewUpdateBtn.setText("View/Update");
        viewUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUpdateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/path6826.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(addBtn)
                .addGap(6, 6, 6)
                .addComponent(viewUpdateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(addBtn)))
                .addContainerGap())
        );

        recordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(recordsTable);

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(434, 235));

        jLabel1.setText("Name:");

        jLabel2.setText("Email ID:");

        jLabel3.setText("User Name:");

        jLabel4.setText("Password:");

        jPanel3.setOpaque(false);

        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/path7395.png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTxt)
                    .addComponent(emailTxt)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        UserAccount oldAcc = null;
        boolean newAssoc = false;
        if (association == null) {
            association = new StateBarAssociation();
            association.setId(UUID.randomUUID().toString());
            newAssoc = true;
        } else {
            oldAcc = association.getAdmin().getAccount();
        }
        if(nameTxt.getText()!=null && !nameTxt.getText().trim().equals("") && emailTxt.getText()!=null && !emailTxt.getText().trim().equals("") && userNameTxt.getText()!=null && !userNameTxt.getText().trim().equals("") && passwordTxt.getText()!=null && !passwordTxt.getText().trim().equals("")){
            association.setStateBarAssociationName(nameTxt.getText());
            association.setEmail(emailTxt.getText());
        UserAccount account = null;
        if (oldAcc != null) {
            if (!oldAcc.getUsername().equals(userNameTxt.getText())) {
                account = new UserAccount(userNameTxt.getText(), passwordTxt.getText(), association.getAdmin());
                userAccDir.delete(oldAcc.getUsername());
                try {
                    userAccDir.addNew(account);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                    System.out.println(ex.getMessage());
                    clearForm();
                    return;
                }
            } else {
                oldAcc.setPassword(passwordTxt.getText());
            }
        } else {
            account = new UserAccount(userNameTxt.getText(), passwordTxt.getText(), association.getAdmin());
            try {
                userAccDir.addNew(account);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
                System.out.println(ex.getMessage());
                clearForm();
                return;
            }
        }

        if(newAssoc){
            try {

                if (stateBarDir.contains(association)) {
                    JOptionPane.showMessageDialog(this, "State Bar Asscociation with this name already present");
                    clearForm();
                    return;
                }
                stateBarDir.addNew(association);

            } catch (Exception ex) {

            }

            JOptionPane.showMessageDialog(this, "State Bar Association Added Successfully!");
        }
        else{
            JOptionPane.showMessageDialog(this, "State Bar Association Updated Successfully!");
        }
        
        populateTableData();
        clearForm();
    }
        else{
            JOptionPane.showMessageDialog(this, "Enter all the details first");
        }
    }

    private void clearForm() {
        nameTxt.setEnabled(false);
        emailTxt.setEnabled(false);
        userNameTxt.setEnabled(false);
        passwordTxt.setEnabled(false);
        nameTxt.setText("");
        emailTxt.setText("");
        userNameTxt.setText("");
        passwordTxt.setText("");
        association = null;
        saveBtn.setEnabled(false);
    }

//GEN-LAST:event_saveBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        nameTxt.setEnabled(true);
        nameTxt.setText("");

        emailTxt.setEnabled(true);
        emailTxt.setText("");

        userNameTxt.setEnabled(true);
        userNameTxt.setText("");

        passwordTxt.setEnabled(true);
        passwordTxt.setText("");
        association = null;
        saveBtn.setEnabled(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void viewUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUpdateBtnActionPerformed
        // TODO add your handling code here:
        saveBtn.setEnabled(true);
        int selectedRow = recordsTable.getSelectedRow();

        if (selectedRow >= 0) {
            nameTxt.setEnabled(true);
            emailTxt.setEnabled(true);
            userNameTxt.setEnabled(true);
            passwordTxt.setEnabled(true);

            association = (StateBarAssociation) recordsTable.getValueAt(selectedRow, 0);
            nameTxt.setText(association.getStateBarAssociationName());
            emailTxt.setText(association.getEmail());
            userNameTxt.setText(association.getAdmin().getAccount().getUsername());
            passwordTxt.setText(association.getAdmin().getAccount().getPassword());
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Record first!!");
        }
    }//GEN-LAST:event_viewUpdateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = recordsTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Association??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                nameTxt.setText("");
                emailTxt.setText("");
                userNameTxt.setText("");
                passwordTxt.setText("");
                StateBarAssociation sba = (StateBarAssociation) recordsTable.getValueAt(selectedRow, 0);
                sba.setActive(false);
                stateBarDir.delete(sba.getId());
                userAccDir.delete(sba.getAdmin().getAccount().getUsername());
                populateTableData();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    @Override
    public void populateTableData() {

        DefaultTableModel model = (DefaultTableModel) recordsTable.getModel();
        model.setRowCount(0);
        for (StateBarAssociation s : stateBarDir.getAllEntries()) {
            Object[] row = new Object[2];
            row[0] = s;
            row[1] = s.getAdmin().getAccount().getUsername();
            model.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTable recordsTable;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JButton viewUpdateBtn;
    // End of variables declaration//GEN-END:variables
}
