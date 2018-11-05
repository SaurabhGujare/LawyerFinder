/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import lab_8.entities.Comment;
import lab_8.entities.Post;
import lab_8.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    
    
    public void userWithMostLikes(){
        Map<Integer,Integer> userLikeAccount = new HashMap<>();
        
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        for(User user : users.values()){
            for(Comment c: user.getComments()){
                int likes = 0;
                if(userLikeAccount.containsKey(user.getId()));
                    likes = userLikeAccount.get(user.getId());
                likes += c.getLikes();
                userLikeAccount.put(user.getId(), likes);
            }
        }
        
        int max = 0;
        int maxId = 0;
        
        for(int id : userLikeAccount.keySet()){
            if(userLikeAccount.get(id)>max){
                max = userLikeAccount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes : "+max+"\n"+users.get(maxId));
    }
    
    public void getFiveMostLikedComment(){
        
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = (List<Comment>) comments.values();
        
        Collections.sort(commentList, new Comparator<Comment>(){
            
            @Override
            public int compare(Comment o1, Comment o2){
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("5 most liked comments:");
        for(int i = 0;i<commentList.size() && i<5;i++){
            System.out.println(commentList.get(i));
        }
    }
    
}
