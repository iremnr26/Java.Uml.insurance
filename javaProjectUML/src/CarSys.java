import java.util.*;

public class CarSys {

	private static ArrayList<Cars> CarInfo = new ArrayList<>();

	public static boolean checkLicensePlate(String plate) {
		
		for(int i=0; i<CarInfo.size(); i++) {
			if(CarInfo.get(i).findLicensePlate(plate))
				return true;
		}
		return false;
	}
	
	public static void displayCars() {
			
			for(int i=0; i<CarInfo.size(); i++) {
				System.out.print("Insurance price: " + CarInfo.get(i).calculatedInsurancePrice);
				System.out.print("Insurance price: " + CarInfo.get(i).enginePower);
				System.out.print("Insurance price: " + CarInfo.get(i).model);
			}
		}
		
	
	public static void addCar(String plate) {
		Cars car = null;
		
		if(checkLicensePlate(plate) == false) {
			Scanner scn = new Scanner(System.in);
			
			System.out.print("Enter the car's model: ");
			String model = scn.nextLine();
			
			System.out.print("Enter the car's license plate: ");
			String licensePlate = scn.nextLine();
			
			System.out.print("Enter the car's manufacture year: ");
			int year = scn.nextInt();
			
			System.out.print("Enter the driver info about crash:(None/Low/Medium/High)");
			String driverInfo = scn.nextLine();
			
			System.out.print("Enter the car's engine power: ");
			double enginePower = scn.nextDouble();
			
			if(model.equalsIgnoreCase("AUDI"))
				car = new AUDI(licensePlate, year, driverInfo, model, enginePower);
			else if(model.equalsIgnoreCase("BMW"))
				car = new BMW(licensePlate, year, driverInfo, model, enginePower);
			else if(model.equalsIgnoreCase("Mercedes"))
				car = new Mercedes(licensePlate, year, driverInfo, model, enginePower);
			
			CarInfo.add(car);
			
			System.out.println("This "+licensePlate+" license plate is added");
		}
		else
			System.out.println("This "+plate+" license plate is already added");	
	}
	
	public static void deleteCar(String plate) {
		int i=0;
		
		if(checkLicensePlate(plate) == true) {
			while(plate.equalsIgnoreCase(CarInfo.get(i).licensePlate) && i<CarInfo.size()) {
				i++;
			}
			CarInfo.remove(i);
		}
	}

	public static Cars searchCar(String plate) {
		Cars car = null;
		int i=0;
		
		if(checkLicensePlate(plate) == true) {
			while(plate.equalsIgnoreCase(CarInfo.get(i).licensePlate) && i<CarInfo.size()) {
				i++;
			}
			
			car = CarInfo.get(i);
		}
		return car;
	}

	
	
}
