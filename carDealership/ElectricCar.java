package carDealership;

public class ElectricCar extends Vehicle {
	private double BatteryCapacityKWH;
	private double range;
	private boolean AutonomousDriving;
	
	
	public double getBatteryCapacityKWH() {
		return BatteryCapacityKWH;
	}
	public void setBatteryCapacityKWH(double batteryCapacityKWH) {
		BatteryCapacityKWH = batteryCapacityKWH;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public boolean isAutonomousDriving() {
		return AutonomousDriving;
	}
	public void setAutonomousDriving(boolean autonomousDriving) {
		AutonomousDriving = autonomousDriving;
	}

}
