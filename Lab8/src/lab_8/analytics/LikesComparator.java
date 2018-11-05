/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8.analytics;

import java.util.Comparator;
import lab_8.entities.Comment;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class LikesComparator implements Comparator<Comment>{

    @Override
    public int compare(Comment o1, Comment o2) {
        return o2.getLikes() - o1.getLikes();
    }
    
}
