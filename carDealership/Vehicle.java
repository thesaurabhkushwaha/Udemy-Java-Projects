package carDealership;

public class Vehicle {
	private String Manufacturer;
	private String ModelName;
	private String VehicleType;
	private String Color;
	private String FuelType;
	private double Price;
	
	Vehicle(){}
	public Vehicle(String manufacturer, String modelName, String vehicleType, String color, String fuelType,
			double price) 
	{
		super();
		Manufacturer = manufacturer;
		ModelName = modelName;
		VehicleType = vehicleType;
		Color = color;
		FuelType = fuelType;
		Price = price;
	}
	
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getModelName() {
		return ModelName;
	}
	public void setModelName(String modelName) {
		ModelName = modelName;
	}
	public String getVehicleType() {
		return VehicleType;
	}
	public String getFuelType() {
		return FuelType;
	}
	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}
	
	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [Manufacturer=" + Manufacturer + ", ModelName=" + ModelName + ", VehicleType=" + VehicleType
				+ ", Color=" + Color + ", FuelType=" + FuelType + ", Price=" + Price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Color == null) ? 0 : Color.hashCode());
		result = prime * result + ((FuelType == null) ? 0 : FuelType.hashCode());
		result = prime * result + ((Manufacturer == null) ? 0 : Manufacturer.hashCode());
		result = prime * result + ((ModelName == null) ? 0 : ModelName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((VehicleType == null) ? 0 : VehicleType.hashCode());
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
		Vehicle other = (Vehicle) obj;
		if (Color == null) {
			if (other.Color != null)
				return false;
		} else if (!Color.equals(other.Color))
			return false;
		if (FuelType == null) {
			if (other.FuelType != null)
				return false;
		} else if (!FuelType.equals(other.FuelType))
			return false;
		if (Manufacturer == null) {
			if (other.Manufacturer != null)
				return false;
		} else if (!Manufacturer.equals(other.Manufacturer))
			return false;
		if (ModelName == null) {
			if (other.ModelName != null)
				return false;
		} else if (!ModelName.equals(other.ModelName))
			return false;
		if (Double.doubleToLongBits(Price) != Double.doubleToLongBits(other.Price))
			return false;
		if (VehicleType == null) {
			if (other.VehicleType != null)
				return false;
		} else if (!VehicleType.equals(other.VehicleType))
			return false;
		return true;
	}
	
	
	
	
}
