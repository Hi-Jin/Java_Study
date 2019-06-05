package manage;

import car_type.Car;
import car_type.FullSized_Car;
import car_type.MidSized_Car;
import car_type.SmallSized_Car;


public class Program_Manage {
	
	public static void setCheck_time(Car space, long check_time) {
		space.setCheck_time(check_time);
	}
	
	public static void print_ParkingLot(Car[] cars) {
		int count = 0;
		for(int i = 0; i < 10; i++) {
			if (cars[i].getLocation()=="") {
				System.out.print("( "+count+" )");
				if(count == 4 || count == 9)
					System.out.println();
				count++;
			}
			else {
				System.out.print("( "+cars[i].getLocation()+" )");
				if(count == 4 || count == 9)
					System.out.println();
				count++;
			}
		}
	}
	
	public static void print_info(Car[] cars) {
		for(int i = 0; i < 10; i++) {
			if (cars[i].getLocation() == "■" ) {
				System.out.println("\n<<< 현재 " + i + "번 공간의 주차 정보 >>>");
				System.out.println("이름: " + cars[i].getUser_name());
				System.out.println("차량의 종류: " + cars[i].getTypeOfCar());
				System.out.println("차량 번호: " + cars[i].getCar_num());
				cars[i].setCheck_time(System.currentTimeMillis());
				cars[i].setParking_time(cars[i].getCheck_time() - cars[i].getIn_time());
				
				System.out.println(String.format("주차 시간 : %d분 %d초", cars[i].getParking_time() / 60, cars[i].getParking_time() % 60));
				
				if (cars[i] instanceof SmallSized_Car)
					System.out.println("요금 : " + ((SmallSized_Car) cars[i]).getParkingFee(cars[i].getParking_time()) + "원");
				else if (cars[i] instanceof MidSized_Car)
					System.out.println("요금 : " + ((MidSized_Car) cars[i]).getParkingFee(cars[i].getParking_time()) + "원");
				else
					System.out.println("요금 : " + ((FullSized_Car) cars[i]).getParkingFee(cars[i].getParking_time()) + "원");
			
			} else {
				System.out.println("\n" + i + "번의 공간에는 주차가 되어있지 않습니다.\n");
			}
		}
	}
}
