/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tmpuser-10233
 */
import carinspection.view.View;
import java.util.Scanner;


public class Main {
    private Scanner userInput;
    private String newCustomer;
    
    public Main(){
        userInput = new Scanner(System.in);
    }
    
    public static void main(String[] args){
        View v = new View();
        v.startNewInspection();

    }

}
