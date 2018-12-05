/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface;

import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class BasePanel extends javax.swing.JPanel {

    /**
     * Creates new form BasePanel
     */
    public BasePanel() {
        initComponents();
        this.setPreferredSize(new Dimension(1364, 798));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);
        setLayout(new java.awt.CardLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void loadPage(JPanel panel) {
        CardLayout layout = (CardLayout)this.getLayout();
        this.add(panel, panel.getClass().getName());
        layout.next(this);
    }
    
    public void unloadPage(JPanel panel){
        CardLayout layout = (CardLayout)this.getLayout();
        layout.previous(this);
        this.remove(panel);
    }
}
