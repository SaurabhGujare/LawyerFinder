/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.legalEntity;

import app.entities.user.Lawyer;
import app.userinterface.common.CustomPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

/**
 *
 * @author PC
 */
public class searchResultPanel extends CustomPanel {

    List<Lawyer> lawyerList;
    /**
     * Creates new form searchResultPanel
     */
    public searchResultPanel(List<Lawyer> lawyerList) {
        initComponents();
        this.makeTransparent(this);
        resultPanel.setBackground(Color.WHITE);
        this.lawyerList = lawyerList;
        for(Lawyer l: lawyerList){
            searchRowPanel panel = new searchRowPanel(l);
            panel.setSize(new Dimension(765, 212));
            resultPanel.add(panel);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        resultPanel.setBackground(new java.awt.Color(255, 255, 255));
        resultPanel.setAutoscrolls(true);
        resultPanel.setLayout(new javax.swing.BoxLayout(resultPanel, javax.swing.BoxLayout.PAGE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel resultPanel;
    // End of variables declaration//GEN-END:variables
}
