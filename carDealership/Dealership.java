package carDealership;

public class Dealership {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setName("Saurabh");
		customer1.setAddress("Bangalore");
		customer1.setCashOnHand(50000);
		
		Customer customer2 = new Customer();
		customer2.setName("Toby");
		customer2.setAddress("Atlanta");
		customer2.setCashOnHand(20000);
		
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setManufacturer("BMW");
		vehicle1.setModelName("i8");
		vehicle1.setColor("Blue");
		vehicle1.setVehicleType("Sports");
		vehicle1.setFuelType("Electric");
		vehicle1.setPrice(25000);
		
		Employee employee1 = new Employee();
		employee1.setName("Timmy");
		employee1.setID("E1");
		employee1.setExperienceInYears(5.5);
		
		System.out.println("Customer 1 report");
		customer1.purshaseCar(vehicle1, employee1, false); // test with true or false
		System.out.println("\nCustomer 2 report");
		customer2.purshaseCar(vehicle1, employee1, true); // test with true or false	
		
	}


}
