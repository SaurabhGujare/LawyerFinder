/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.data.org;

import app.data.directories.Directory;
import app.data.directories.interfaces.DirectoryEntry;
import app.entities.user.User;
import app.entities.workqueues.WorkItem;
import app.entities.workqueues.WorkQueue;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)

 */
public class Organization implements DirectoryEntry<Integer> {
    
    private static int count = 0;
    protected int id;
    private WorkQueue workQueue;
    private Directory directory;
    protected User admin;

    public Organization(WorkQueue workQueue, Directory directory,User admin) {
        this.workQueue = workQueue;
        this.directory = directory;
        this.id = count;
        this.admin = admin;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    @Override
    public Integer getKey() {
        return id;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return id+"";
    }
    
    
    
}
