/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinspection;

import java.util.Scanner;
import carinspection.view.View;

/**
 *
 * @author tmpuser-10233
 */
public class Customer {

    private String name;
    private String address;
    private String drivingLicense;
    private Scanner userInput;
    private String newCustomer;

    public Customer() {
        userInput = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public void setName() {

        do {
            System.out.println("Please Enter Your Name : ");
            name = userInput.next();
        } 
        while (checkName(name) == false);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public void newCustomer() {
        do {
            System.out.println("New Customer : Enter y for Yes or n for Exit :");
            newCustomer = userInput.next();
        } while (!(newCustomer.equals("y")) && !(newCustomer.equals("n")));
        if (newCustomer.equals("y")) {
            View view = new View();
            view.startNewInspection();
        }

    }

    private boolean checkName(String name) {
        boolean b = true;

        int i = 0;
        while (i < name.length()) {
            char a = name.charAt(i);
            int ascii = (int) a;

            if (((ascii > 64) && (ascii < 91)) || ((ascii > 96) && (ascii < 123)) || ((ascii > 191) && (ascii < 255))){

            } else {
                b = false;
                System.out.println("Name Must Not Contain Numbers or Special Characters");
            }
            i++;
        }
        return b;
        
    }

}
