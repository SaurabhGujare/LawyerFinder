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
                if(userLikeAccount.containsKey(user.getId()))
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
        List<Comment> commentList = new ArrayList<Comment>(comments.values());
        
        Collections.sort(commentList, new LikesComparator());
        
        System.out.println("5 most liked comments:");
        for(int i = 0;i<commentList.size() && i<5;i++){
            System.out.println(commentList.get(i));
        }
    }
    
    public void postWithMostLikedComments(){
    
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        List<Post> postlist = new ArrayList<Post>(posts.values());
        
        Collections.sort(postlist, new Comparator<Post>(){
        
            @Override
            public int compare(Post p1, Post p2){
            
                    int firstpostlikes = 0;
                    int secondpostlikes = 0;
               
                    for(Comment com: p1.getComments())
                            firstpostlikes+=  com.getLikes();
                
                    for(Comment com1: p2.getComments())
                            secondpostlikes += com1.getLikes();
                    
                    return firstpostlikes-secondpostlikes;         
            }
    });
        System.out.println("Post with the most liked Comments: "+ postlist.get(0).getPostId());  
    }
    public void avgNumLikesPerComments(){
        
        double totalLikes = 0;
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<Comment>(comments.values());
        
        
        for(Comment c: commentList){
            totalLikes += c.getLikes();
        }
        
        double avg = totalLikes/commentList.size();
        System.out.println("Average Number Of Likes per Comment:"+ String.format("%.2f", avg));
    }
    
    public void top5InactiveUsersByPosts(){
        
        Map<Integer, Integer> userMap = new HashMap<>();
        
        Map<Integer,Post> postMap = DataStore.getInstance().getPosts();
        
        for(Post p : postMap.values()){
            int postCount = 0;
            if(userMap.containsKey(p.getUserId())){
                postCount = userMap.get(p.getUserId());
            }
            userMap.put(p.getUserId(), postCount+1);
        }
        
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(userMap.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        
        System.out.println("Top 5 inactive users by posts");
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        for(int i =0; i<5;i++){
            System.out.println(users.get(list.get(i).getKey()));
        }
        
    }
    
}
