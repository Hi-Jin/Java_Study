package car_type;

public class MidSized_Car extends Car {
	
	public String getParkingFee(long time) {
		if (time*0.28 < 500)
			return "0";
		else
			return String.format("%.0f", time*0.28);
	}
}
