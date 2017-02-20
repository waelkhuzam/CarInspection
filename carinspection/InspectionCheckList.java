/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinspection;
import java.util.Scanner;

/**
 *
 * @author tmpuser-10233
 */
public class InspectionCheckList {
        private final String inspectionCompany;
	private String inspectorName;
	// private String[] checkList;
	private String drivingLicense;
        private String engineCondition;
        private String wheels;
        private String doors;
        private String lights;
        private String gearBox;
        private String brakes;
        private int cost = 2000;
        
	
	public InspectionCheckList(){
		/*
		String[] checkList = new String[6];
		
		checkList [0] = "Wheels";
		checkList [1] = "Brakes";
		checkList [2] = "Lights";
		checkList [3] = "Gear Box";
		checkList [4] = "Doors";
		checkList [5] = "Engine";
		*/
		
		inspectionCompany = "ASD";
	}
	
    /*
    public void getDetails(){
		for(int i=0; i<checkList.length; i++){
			String values = checkList[i];
			System.out.println(values);
		}
	}
    */
	
	public String getInspectionCompany(){
		return inspectionCompany;
	}
	
	public String getInspectorName(){
		return inspectorName;
	}
	
	public String getEngineCondition(){
		return engineCondition;
	}
	
	public String getWheels(){
		return wheels;
	}
	
	public String getbrakes(){
		return brakes;
	}
	
	public String getLights(){
		return lights;
	}
	
	public String getGearBox(){
		return gearBox;
	}
	
	public String getDoors(){
		return doors;
	}
	
	public String getDrivingLicense(){
		return drivingLicense;
	}
        public int getCost(){
            return cost; 
        }
        public void setCost(){
            this.cost = cost;
            System.out.println("\n" + "The Cost is : " + cost);
        }
      
}
