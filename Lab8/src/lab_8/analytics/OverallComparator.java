/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8.analytics;

import java.util.Comparator;
import java.util.Map;
import lab_8.entities.User;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class OverallComparator implements Comparator<Map.Entry<Integer, User>> {

    @Override
    public int compare(Map.Entry<Integer, User> u1, Map.Entry<Integer, User> u2) {
        return AnalysisHelper.getOverAllScore(u1.getValue()) - AnalysisHelper.getOverAllScore(u2.getValue());
    }
}
