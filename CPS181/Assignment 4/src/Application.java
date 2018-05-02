import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
================================================================
Author:      Alex Kim
Date:        2/21/18
Description: Calculate information based on data from a file.
================================================================
*/

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Set up file to be read
		File file = new File("vehicleData.txt");
		Scanner sc = new Scanner(file);
		
		// Initialize variables
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		int carCount = 0, truckCount = 0, airplaneCount = 0, seatCount = 0;
		String largestAirplane = null;
		double cargoMax = 0;
		
		// Write file contents to array
		int tick = 0;
		while (sc.hasNextLine()) {
			tick++;
			String whatIsIt = sc.next();
			
			// Read car data
			
			if (whatIsIt.equals("car")) {
				int speed = sc.nextInt();
				int weight = sc.nextInt();
				String model = sc.next() + " " + sc.next();
				if (tick == 2) model += " " + sc.next(); // Quick fix for vehicle 2 which has three Strings for model instead of 2
				int mpg = sc.nextInt();
				String type = sc.next();
				String category = sc.next();
				
				Car temp = new Car(speed, weight, model, mpg, type, category);
				
				vehicles.add(temp);
				
				carCount++;
			}
			
			// Read truck data
			
			if (whatIsIt.equals("truck")) {
				int speed = sc.nextInt();
				int weight = sc.nextInt();
				String model = sc.next() + " " + sc.next();
				int mpg = sc.nextInt();
				double cargo = sc.nextDouble();
				int wheels = sc.nextInt();
				
				Truck temp = new Truck(speed, weight, model, mpg, cargo, wheels);
				
				vehicles.add(temp);
				
				truckCount++;
			}
			
			// Read airplane data
			
			if (whatIsIt.equals("airplane")) {
				int speed = sc.nextInt();
				int weight = sc.nextInt();
				String model = sc.next() + " " + sc.next();
				int seats = sc.nextInt();
				
				Airplane temp = new Airplane(speed, weight, model, seats);
				
				vehicles.add(temp);
				
				airplaneCount++;
			}
		}
		
		// Print the number of each type of vehicle
		System.out.printf("Number of:\nCars - %d\nTrucks - %d\nAirplanes - %d\n", carCount, truckCount, airplaneCount);
		
		// Print the model of the largest airplane (more seats)
		for (Vehicle x : vehicles) {
			if (x.getWeight() > 15000) { // All airplanes weight more than 15,000 but no other vehicle does
				Airplane temp = (Airplane) x;
				if (temp.getSeats() > seatCount) {
					seatCount = temp.getSeats();
					largestAirplane = temp.getModel();
				}
			}
		}
		System.out.printf("Largest airplane is %s with a seatcount of %d.\n", largestAirplane, seatCount);
		
		// Print the average cargo capacity of trucks
		
		for (Vehicle x : vehicles) {
			// I have no idea how to check for trucks other than this
			if (x.getModel().equals("Ford F150") || x.getModel().equals("Dodge Dakota") || x.getModel().equals("Dodge Ram1500") || x.getModel().equals("Kaiser M35A2C")) {
				Truck temp = (Truck) x;
				cargoMax += temp.getCargo();
			}
		}
		
		System.out.printf("Average cargo capacity of trucks is %f.\n", (cargoMax / truckCount));
	}

}
