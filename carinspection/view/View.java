/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinspection.view;
import carinspection.Customer;
import carinspection.controller.QueueSystem;
import carinspection.dbhandler.Garage;
import carinspection.model.Receipt;
/**
 *
 * @author tmpuser-10233
 */
public class View {
    private QueueSystem qSystem;
    private Garage openGarageDoor;
    private Garage closeGarageDoor;
    
    public View(){
        
    }
    
    public void startNewInspection(){
        qSystem = new QueueSystem();
        openGarageDoor = new Garage();
        
        carinspection.Customer name = new carinspection.Customer();
        name.setName();
        
        carinspection.Vehicle carRegNo = new carinspection.Vehicle();
        carRegNo.setCarRegNo();
        
        carinspection.InspectionCheckList cost = new carinspection.InspectionCheckList();
        cost.setCost();
        
        carinspection.controller.PaymentSystem pin = new carinspection.controller.PaymentSystem();
        Receipt receipt = new Receipt();
        receipt.generateReceipt(name, carRegNo, cost);
        
        Customer customer=new Customer();
        customer.newCustomer();
        
        
        
    }
   
}
