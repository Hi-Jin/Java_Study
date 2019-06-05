package parkingLot;

import user_interface.Error;
import user_interface.User_Input;
import car_type.*;
import manage.Program_Manage;

public class Car_Out {
	public static void setOut_time(Car space, long out_time) {
		space.setOut_time(out_time);
	}

	public static void setParking_time(Car space, long parking_time) {
		space.setParking_time(parking_time);
	}

	public static void printTimeAndFee(Car cars) {
		System.out.println(String.format("주차 시간 : %d분 %d초", cars.getParking_time() / 60, cars.getParking_time() % 60));
		if (cars instanceof SmallSized_Car)
			System.out.println("요금 : " + ((SmallSized_Car) cars).getParkingFee(cars.getParking_time()) + "원");
		else if (cars instanceof MidSized_Car)
			System.out.println("요금 : " + ((MidSized_Car) cars).getParkingFee(cars.getParking_time()) + "원");
		else
			System.out.println("요금 : " + ((FullSized_Car) cars).getParkingFee(cars.getParking_time()) + "원");
	}

	public static void out(Car[] cars) {
		System.out.println();
		Program_Manage.print_ParkingLot(cars);
		while (true) {
			int loOfCar = User_Input.out_location_num();
			if (cars[loOfCar].getLocation() == "■") {
				setOut_time(cars[loOfCar], System.currentTimeMillis());
				setParking_time(cars[loOfCar], cars[loOfCar].getOut_time() - cars[loOfCar].getIn_time());
				cars[loOfCar].setLocation("");
				printTimeAndFee(cars[loOfCar]);
				break;
				
			} else {
				Error.out_error();
			}
		}
	}
}