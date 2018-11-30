/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities.workqueues;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 * @param <I>
 */
public abstract class WorkQueue<I extends WorkItem> {
    
    private final List<WorkItem> workList;

    public WorkQueue() {
        workList = new ArrayList<>();
    }

    public List<WorkItem> getWorkList() {
        return workList;
    }
    
    public void addWorkItem(I item){
        this.workList.add(item);
    }
    
    public WorkItem createNewWorkItem(){
        WorkItem item = this.getNewItem();
        workList.add(item);
        return item;
    }
    
    protected abstract WorkItem getNewItem();
    
    public void removeItem(I item){
        this.workList.remove(item);
    }
}
