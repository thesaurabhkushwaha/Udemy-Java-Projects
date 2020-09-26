package carDealership;

public class Employee {
	private String name;
	private String ID;
	private double ExperienceInYears;
	
	Employee(){}
	public Employee(String name, String iD, double experienceInYears) {
		super();
		this.name = name;
		ID = iD;
		ExperienceInYears = experienceInYears;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public double getExperienceInYears() {
		return ExperienceInYears;
	}
	public void setExperienceInYears(double experienceInYears) {
		ExperienceInYears = experienceInYears;
	}
	
	
	public void handleCustomer (Customer customer, Vehicle vehicle, boolean finance)
	{
		if (finance == true)
		{
			runCreditHistory(customer, vehicle.getPrice() - customer.getCashOnHand()); // loan = car price - cash; 
		}
		else if (vehicle.getPrice() <= customer.getCashOnHand())
		{
			processTransaction(customer,vehicle);
		}
		else
		{
			System.out.println("Purchase failed - Not enough cash on hand");
		}
	}
	
	
	public void runCreditHistory(Customer customer, double loanAmount)
	{
		if(loanAmount > 0)
		System.out.println("Loan required to purchase the car is $"+loanAmount);
		else
		System.out.println("No financing is required");
	}
	
	public void processTransaction(Customer c, Vehicle v)
	{
		System.out.println("Transaction successful !");
		System.out.println(v.getManufacturer()+" "+v.getModelName()+" is now owned by "+c.getName());
	}
	
	


}
