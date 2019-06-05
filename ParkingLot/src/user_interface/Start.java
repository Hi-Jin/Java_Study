package user_interface;

import car_type.*;

import java.util.*;
import java.util.Scanner;
import parkingLot.Car_In;
import parkingLot.Car_Out;
import manage.*;

public class Start {
	protected int manage_Password = 12345678;

	public int getManage_Password() {
		return manage_Password;
	}

	public int setManage_Password(int manage_Password) {
		this.manage_Password = manage_Password;
		return manage_Password;
	}

	public void set() { // 초기 설정들을 담은 메소드
		Car[] cars = new Car[10]; // Car의 배열 선언(주차 공간)

		for (int i = 0; i < 10; i++) {
			cars[i] = new SmallSized_Car(); // 배열 소형차로 초기화
		}

		System.out.println("                          무인 자동차 관리");

		start(cars); // start 메소드 실행(같은 클래스에 존재)
	}

	public void start(Car[] cars) {
		Scanner sc = new Scanner(System.in);

		int selection; // 1~4 숫자 선택
		System.out.println("[주차(1) 출차(2) 관리(3) 종료(4) 설정(0)]");
		System.out.print("번호를 입력하세요 : "); // 선택
		selection = sc.nextInt();
		if (selection >= 0 && selection <= 4) { // 1~4 사이일 때
			switch (selection) {
			case 1:
				Car_In.parking(cars); // Car_In 클래스의 parking 메소드 실행
				start(cars); // start 메소드 선언해서 반복
				break;

			case 2:
				Car_Out.out(cars); // Car_Out 클래스의 out 메소드 실행
				start(cars); // start 메소드 선언해서 반복
				break;

			case 3:
				while (true) {
					if (getManage_Password() == User_Input.check_Manage_Password()) {
						System.out.println("관리자 승인이 되었습니다.\n");
						Program_Manage.print_ParkingLot(cars); // 관리 메뉴 개발했으면 추가해주세요.
						Program_Manage.print_info(cars);
						start(cars);
						break;
					} else {
						Error.check_Manage_Password_Error();
					}
				}
				// start 메소드 선언해서 반복
				break;

			case 4:
				Exit.exit();
				break; // 4번 선택 시 그냥 빠져나가서 Main에 있는 exit 실행

			case 0:
				while (true) {
					if (getManage_Password() == User_Input.check_Manage_Password()) {
						System.out.println("관리자 승인이 되었습니다.\n");
						int change_Password = User_Input.change_Manage_Password();
						
						try {
							while (true) {
								if (change_Password < 0 || change_Password > 99999999) {
									Error.manage_Password_Error();
								} else
									break;
							}
						} catch (InputMismatchException ime) {
							Error.input_manage_Password_Error();
						}

						setManage_Password(change_Password);
						System.out.println("관리자 비밀번호가 변경되었습니다.");
						break;
					} else {
						Error.check_Manage_Password_Error();
					}
				}
				start(cars);
				break;
			}
		} else {
			Error.range_error(); // 1~4 아닐 때 나오는 오류 메시지
			start(cars); // start 메소드 선언해서 반복
		}
		
		sc.close();
	}
}
