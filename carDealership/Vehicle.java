package carDealership;

public class Vehicle {
	private String Manufacturer;
	private String ModelName;
	private String VehicleType;
	private String Color;
	private String FuelType;
	private double Price;
	
	
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
	
	
}