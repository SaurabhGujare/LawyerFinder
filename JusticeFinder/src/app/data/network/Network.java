/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.data.network;

import app.data.directories.Directory;
import app.data.org.Organization;
import app.entities.user.Admin;
import app.entities.workqueues.WorkQueue;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class Network extends Organization{

    public Network(WorkQueue workQueue, Directory directory) {
        super(workQueue, directory,new Admin());
    }

}
