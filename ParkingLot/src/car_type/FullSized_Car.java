package car_type;

public class FullSized_Car extends Car {
	
	public String getParkingFee(long time) {
		if (time*0.42 < 750)
			return "0";
		
		else
			return String.format("%.0f", time*0.42);
	}
}