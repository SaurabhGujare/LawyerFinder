/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface;

import app.userinterface.login.LoginPanel;
import app.data.DBUtil;
import app.data.Network;
import app.data.Session;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class MainFrame extends javax.swing.JFrame {

    public static MainFrame self;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        initFrame();
        //loadLoginPage();
        self = this;
    }

    private void initFrame() throws HeadlessException {
        //this.setResizable(false);
        this.getContentPane().setBackground(Color.decode("#ffffff"));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
        Point newLocation = new Point(middle.x - (this.getWidth() / 2),
                middle.y - (this.getHeight() / 2));
        
        this.setLocation(newLocation);
        this.setPreferredSize(new Dimension(1366, 800));
        
        BasePanel basePanel = new BasePanel();
        basePanel.loadPage(new LoginPanel());
        this.add(basePanel);
    
        addWindowListener( new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                saveApp();
            }
        
        });
        
    }

    private static void saveApp(){
        
        try {
            Session.clearSession();
            DBUtil.getInstance().storeSystem(Network.getInstance());
            System.out.println("Application Saved");
        } catch (Exception ex) {
            ex.printStackTrace();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Justice Finder");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1367, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    /*private void loadLoginPage() {
        loadPage(new LoginPanel());
    }
    
    public void loadPage(JPanel panel) {
        CardLayout layout = (CardLayout)basePanel.getLayout();
        basePanel.add(panel, panel.getClass().getName());
        layout.show(basePanel, panel.getClass().getName());
    }*/
}
