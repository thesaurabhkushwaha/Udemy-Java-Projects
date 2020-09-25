package carDealership;

public class LuxuryCar extends Vehicle {
	private int EntertainmentDisplayes;
	private boolean Refrigerator;
	private boolean HeatedSeats;
	private boolean HeatedSteeringWheel;
	private boolean AutonomousDriving;
	
	
	public boolean isAutonomousDriving() {
		return AutonomousDriving;
	}
	public void setAutonomousDriving(boolean autonomous) {
		AutonomousDriving = autonomous;
	}
	public int getEntertainmentDisplayes() {
		return EntertainmentDisplayes;
	}
	public void setEntertainmentDisplayes(int entertainmentDisplayes) {
		EntertainmentDisplayes = entertainmentDisplayes;
	}
	public boolean isRefrigerator() {
		return Refrigerator;
	}
	public void setRefrigerator(boolean refrigerator) {
		Refrigerator = refrigerator;
	}
	public boolean isHeatedSeats() {
		return HeatedSeats;
	}
	public void setHeatedSeats(boolean heatedSeats) {
		HeatedSeats = heatedSeats;
	}
	public boolean isHeatedSteeringWheel() {
		return HeatedSteeringWheel;
	}
	public void setHeatedSteeringWheel(boolean heatedSteeringWheel) {
		HeatedSteeringWheel = heatedSteeringWheel;
	}
	
}
