package car_type;

public class SmallSized_Car extends Car{
	
	public String getParkingFee(long time) {
		if (time*0.14 < 250)
			return "0";
		
		else
			return String.format("%.0f", time*0.14);
	}

}
