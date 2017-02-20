/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinspection.controller;
import carinspection.model.Payment;
import java.util.Scanner;
/**
 *
 * @author tmpuser-10233
 */
public class PaymentSystem {
    private Payment creditCardInfo;

    
    public PaymentSystem(){
        creditCardInfo = new Payment();
        carinspection.model.Payment p = new carinspection.model.Payment();
        p.enterPinCode();
    }
   
    
}
