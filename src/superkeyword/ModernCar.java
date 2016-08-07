package superkeyword;
//subclass
public class ModernCar extends Car {
	int run = super.milesItCanRun;
	public ModernCar(String model){
		//super keyword
		//super() can be used to invoke immediate super class's constructor
		super(model);
	}
	public void fuelType(){
		super.runOnElectricBattery();
		System.out.println("more efficient");
	}

}
