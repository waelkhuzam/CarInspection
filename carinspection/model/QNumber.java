/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinspection.model;

/**
 *
 * @author tmpuser-10233
 */
public class QNumber {
    private static int number;
    
    public QNumber(){
    incrementQueueNumber();
    }
    public int getNumber(){
        return number;
    }
    private void setNumber(int number){
        this.number = number;
    }
    public void incrementQueueNumber(){
        setNumber(getNumber()+1);
        System.out.println(number);
    }
}
