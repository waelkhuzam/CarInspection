/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinspection.model;

import carinspection.Customer;
import carinspection.Vehicle;
import carinspection.InspectionCheckList;
import java.util.Date;

/**
 *
 * @author tmpuser-10233
 */
public class Receipt {

    public Receipt() {

    }

    public void generateReceipt(Customer name, Vehicle carRegNo, InspectionCheckList cost) {

        System.out.println("\n" + "*** Receipt ***"
                + "\n" + "Welcome to " + cost.getInspectionCompany()
                + "\n" + "Name : " + name.getName()
                + "\n" + "Car Reg No. : " + carRegNo.getCarRegNo()
                + "\n" + "Cost : " + cost.getCost());
        Date date = new Date();
        String receiptDate = String.format("Current Date/Time : %tc", date);
        System.out.println(receiptDate + "\n");

    }
}
