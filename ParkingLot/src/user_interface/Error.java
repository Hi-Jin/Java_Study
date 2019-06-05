package user_interface;

public class Error {
	public static void in_error() {
		System.out.println("해당 공간에는 다른 차량이 주차되어 있습니다. 다시 입력하세요.");
	}
	
	public static void out_error() {
		System.out.println("해당 공간에는 차량이 주차되어 있지 않습니다. 다시 입력하세요.");
	}
	public static void range_error() {  //처음 선택에서 범위 내의 수를 선택하지 않았을 때의 메시지
		System.out.println("0~4까지의 수 중에서 선택해주세요.");
	}
	
	public static void park_range_Error() {  //주차 공간 0~9를 선택하지 않았을때의 오류 메시지
		System.out.println("주차 공간 내에서 선택해주세요.");
	}
	
	public static void type_Error() {
		System.out.println("차량의 종류의 입력이 잘못되었습니다.\n다시 입력해주세요.");
	}
	
	public static void location_In_Error() {
		System.out.println("주차 공간 내에서 선택해주세요.");
	}
	
	public static void manage_Password_Error() {
		System.out.println("유효한 범위를 벗어났습니다.\n다시 입력해주세요: ");
	}
	
	public static void check_Manage_Password_Error() {
		System.out.println("관리자 비밀번호를 확인하세요. ");
	}
	
	public static void input_manage_Password_Error() {
		System.out.println("숫자만 입력하세요.");
	}
	
}
