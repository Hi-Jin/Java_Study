package parkingLot;

import user_interface.User_Input;
import user_interface.Error;
import car_type.*;
import manage.Program_Manage;

public class Car_In {
	public static void setUser_name(Car space, String user_name) {
		space.setUser_name(user_name);
	}
	
	public static void setCar_num(Car space, String car_num) {
		space.setCar_num(car_num);
	}
	
	public static void setIn_time(Car space, long in_time) {
		space.setIn_time(in_time);
	}
	
	public static void setCar_Type(Car space, String typeOfCar) {
		space.setTypeOfCar(typeOfCar);
	}
	
	public static void total_Setter(Car c) {
		if(c.getLocation() != "■") {
			setUser_name(c, User_Input.input_name());
			setCar_num(c, User_Input.input_car_num());
			setIn_time(c, System.currentTimeMillis());
			c.setLocation("■");
			System.out.println("주차 완료.\n");
		}
		else {
			Error.in_error();
		}
	}
	
	public static void parking(Car[] cars) {
		System.out.println();
		Program_Manage.print_ParkingLot(cars);
		while (true) {
			int location = User_Input.input_location_num();
			if (location>=0&&location<=9) {
				while (true) {
					String type = User_Input.input_TypeOfCar();
					if (type.contentEquals("소형차")) {
						cars[location].setTypeOfCar(type);
						total_Setter(cars[location]);
						break;
					}
					else if (type.contentEquals("중형차")) {
						cars[location] = null;
						cars[location] = new MidSized_Car();
						cars[location].setTypeOfCar(type);
						total_Setter(cars[location]);
						break;
					}
					else if (type.contentEquals("대형차")){
						cars[location] = null;
						cars[location] = new FullSized_Car();
						cars[location].setTypeOfCar(type);
						total_Setter(cars[location]);
						break;
					}
					else {
						Error.type_Error();
					}
				}
				break;
			}
			else
				Error.location_In_Error();
		}
	}
}