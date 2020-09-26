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

	public String toString() {
		return "Employee [name=" + name + ", ID=" + ID + ", ExperienceInYears=" + ExperienceInYears + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(ExperienceInYears);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(ExperienceInYears) != Double.doubleToLongBits(other.ExperienceInYears))
			return false;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
	


}
