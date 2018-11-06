/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harshalneelkamal
 */
public class Post {
    
    private int postId;
    private int userId;
    private List<Comment> comments;
    private int likes;

    public Post(int postId, int userId) {
        this.postId = postId;
        this.userId = userId;
        this.comments = new ArrayList<>();
    }

    public int getLikes() {
        return likes;
    }
    
    public int getPostId() {
        return postId;
    }

    public int getUserId() {
        return userId;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }
    
    @Override
    public String toString() {
        return "\nPost{" + "id = " + postId + ", Number of Comments = " + this.comments.size() + '}';
    }
}
