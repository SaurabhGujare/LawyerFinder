/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class CustomPanel extends JPanel{
    
    protected void removeAndGoBack(JPanel panelRight) {                                        
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.remove(this);
        layout.previous(panelRight);
    }    
    
    protected void goTo(JPanel panelRight,Component component){
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.add(component);
        layout.next(panelRight);
    }
}
