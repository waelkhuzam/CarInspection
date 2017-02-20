/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinspection.dbhandler;

/**
 *
 * @author tmpuser-10233
 */
public class Garage {
    private boolean door;
    
    public Garage(){
        openGarageDoor();
        closeGarageDoor();
    }
    
    public boolean openGarageDoor(){
        return true;
    }
    public boolean closeGarageDoor(){
        return false;
    }
    
}
