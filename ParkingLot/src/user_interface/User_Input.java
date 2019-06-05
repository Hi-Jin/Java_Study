package user_interface;

import java.util.Scanner;

public class User_Input {
	static Scanner sc = new Scanner(System.in);
	
	public static String input_name() {
		System.out.print("이름을 입력하세요: ");
		return sc.next();
	}
	
	public static String input_car_num() {
		System.out.print("차 번호를 입력하세요: ");
		return sc.next();
	}
	
	public static int input_location_num() {
		System.out.print("어떤 공간에 주차하시겠습니까? ");
		int num = sc.nextInt();
		
		return num;
	}
	
	public static String input_TypeOfCar() {
		System.out.print("차량의 종류를 입력하세요: ");
		String TypeOfCar = sc.next();
		
		return TypeOfCar;
	}
	
	public static int out_location_num() {
		System.out.print("어떤 공간에서 출차하시겠습니까? ");
		int num = sc.nextInt();
		
		return num;
	}
	
	public static int check_Manage_Password() {
		System.out.println("관리자 비밀번호를 입력하세요: ");
		int num = sc.nextInt();
		
		return num;
	}
	
	public static int change_Manage_Password() {
		System.out.println("새로운 관리자 비밀번호를 입력하세요: \n(0~99999999 사이로 설정하세요.)");
		int num = sc.nextInt();
		
		return num;
	}
	
}
