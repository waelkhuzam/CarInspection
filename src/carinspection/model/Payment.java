/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinspection.model;
import carinspection.CreditCardInfo;
import java.util.Scanner;

/**
 *
 * @author tmpuser-10233
 */
public class Payment {
    private String creditCardInfo;
    private String pin;
    private Scanner userInput;
    
    public Payment(){
        userInput = new Scanner(System.in);
    }
    
    public void enterPinCode(){
        System.out.println("Insert your Credit Card Please and Enter You PIN Code");
        pin = userInput.next();
        validPin();
    }
     public void validPin(){
         while(pin.length()<4 || pin.length()>4){
             System.out.println("Invalid PIN Code, PIN Code Most be 4 Digits");
             pin = userInput.next();
         }
         System.out.println("The Payment Is Finished.");
     }

    public String getCreditCardInfo(){
        return creditCardInfo;
    }
    public void setCreditCardInfo(){
        this.creditCardInfo = creditCardInfo;
    }
    
}
