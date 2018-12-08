/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.utils.charts;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author PC
 */
public class ChartUtils {

    public static JPanel getPieChart(String chartTitle, DefaultPieDataset dataset) {

        return new ChartPanel(ChartFactory.createPieChart(
                chartTitle,  
                dataset,     
                true,   
                true,
                false));
    }
}
