/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.userinterface.admin;

import app.data.Network;
import app.data.org.StateBarAssociation;
import app.entities.workqueues.LawyerApprovalRequest;
import app.entities.workqueues.StateBarAssoWorkQueue;
import app.entities.workqueues.WorkItem;
import app.entities.workqueues.WorkQueue;
import app.utils.charts.ChartUtils;
import java.util.List;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author PC
 */
public class ChartPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChartPanel
     */
    public ChartPanel() {
        initComponents();

        int done=0,pending=0;
        
        if(!Network.getInstance().getSTATE_BAR_ASSOCIATIONS().getAllEntries().isEmpty()){
        StateBarAssociation sba = Network.getInstance().getSTATE_BAR_ASSOCIATIONS().getAllEntries().get(0);
        WorkQueue workQueue =  sba.getWorkQueue();
        List<WorkItem> list = workQueue.getWorkList();
        for(WorkItem req : list){
            LawyerApprovalRequest r = (LawyerApprovalRequest) req;
            
            if(r.getStatus().equals("PENDING")){
                pending++;
            }
            else{
                done++;
            }
        }
        
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Open Requests", pending);
        dataset.setValue("Resolved Requests", done);

        add(ChartUtils.getPieChart("Pending Vs. Closed Requests",dataset));
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

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
