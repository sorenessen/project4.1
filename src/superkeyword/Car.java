package superkeyword;
//superclass
public class Car {
	String model;
	int milesItCanRun = 220;
	//public Car(String model){this is the constructor}
	public Car(String model){
		//this.model = model; {this initilizes model}
		 this.model = model;
		 System.out.println(model);
	}
	public void runOnElectricBattery(){
		System.out.println("Engine runs by electric battery.");
	}
}
