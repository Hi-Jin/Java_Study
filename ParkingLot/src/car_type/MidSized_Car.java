package car_type;

import manage.VIP_manage;

public class MidSized_Car extends Car {
	
	public String getParkingFee(long time) {
		/*
		if (time*0.28 < 50)
			return "0";
		else
		*/
			return String.format("%.0f", time*0.28 / VIP_manage.vip_discount(this.getCar_num()));
	}
}
