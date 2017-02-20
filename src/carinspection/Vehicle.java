/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinspection;
import java.util.Scanner;
import sun.security.util.Length;
/**
 *
 * @author tmpuser-10233
 */
public class Vehicle {
        private String drivingLicense;
	private String carRegNo;
	private String model;
        private Scanner userInput;
        
	public Vehicle(){
          userInput = new Scanner(System.in);
        }
                
	public String getDrivingLicense() {
		return drivingLicense;
	}
	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	public String getCarRegNo() {
		return carRegNo;
	}
	public void setCarRegNo() {
                System.out.println("\n" + "Enter  your car reg no");
		carRegNo = userInput.next();
                validRegNo();
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	} 
        public void validRegNo(){
            while (carRegNo.length()>7 || carRegNo.length()<7){
                System.out.println("Invalid Reg Number, Reg Number Most be 7 Digits");
                carRegNo = userInput.next();
            }
               
        }
}
