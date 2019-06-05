package car_type;

import manage.VIP_manage;

public class FullSized_Car extends Car {
	
	public String getParkingFee(long time) {
		/*
		if (time*0.42 < 75)
			return "0";
		
		else
		*/
			return String.format("%.0f", time*0.42 / VIP_manage.vip_discount(this.getCar_num()));
	}
}