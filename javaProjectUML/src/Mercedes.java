import java.util.Scanner;
public class Mercedes extends Cars{
	public int calculatedInsurancePrice = 5000;

	public Mercedes(String licensePlate, int year, String driverInfo, String model, double enginePower) {
		
		super(licensePlate, year, driverInfo, model, enginePower);
	}

	public double getEngineerPower() {
		return enginePower;
	}
	public int getCalculatedInsurancePrice() {
		return calculatedInsurancePrice;
	}
	public void setEngineerPower(double enginePower) {
		this.enginePower = enginePower;
	}
	

	public void getInput() {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the car's engine power: ");
		this.enginePower = scn.nextDouble();
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nEnginePower=" + enginePower;
	}
	public void calculateAge() {
		if(this.year > 1 && year < 10)
			this.calculatedInsurancePrice += 300;
		else if(this.year >= 10 && this.year < 20)
			this.calculatedInsurancePrice += 500;
		else if(this.year >= 20 && this.year < 50)
			this.calculatedInsurancePrice += 1000;
	}
	public void calculateCrash() {
		if(this.driverInfo.equalsIgnoreCase("none"))
			this.calculatedInsurancePrice += 0;
		else if(this.driverInfo.equalsIgnoreCase("low"))
			this.calculatedInsurancePrice += 2000;
		else if(this.driverInfo.equalsIgnoreCase("medium"))
			this.calculatedInsurancePrice += 4000;
		else if(this.driverInfo.equalsIgnoreCase("high"))
			this.calculatedInsurancePrice += 7000;
	}
	
	public void calculateEnginePower() {
		if(this.enginePower > 100 && this.enginePower < 250)
			this.calculatedInsurancePrice += 300;
		else if(this.enginePower >= 250 && this.enginePower < 400)
			this.calculatedInsurancePrice += 400;
		else if(this.enginePower >= 400 && this.enginePower < 500)
			this.calculatedInsurancePrice += 600;
	}
}
