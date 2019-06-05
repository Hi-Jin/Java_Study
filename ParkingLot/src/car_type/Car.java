package car_type;

public abstract class Car {
	private String user_name = "";
	private String car_num = "";
	private long in_time = 0;
	private long out_time = 0;
	private long parking_time = 0;
	private String location = "";
	private String typeOfCar = "";
	private long check_time = 0;
	
	public long getCheck_time() {
		return check_time;
	}
	public void setCheck_time(long check_time) {
		this.check_time = check_time;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getCar_num() {
		return car_num;
	}
	public void setCar_num(String car_num) {
		this.car_num = car_num;
	}
	public long getIn_time() {
		return in_time;
	}
	public void setIn_time(long in_time) {
		this.in_time = in_time;
	}
	public long getOut_time() {
		return out_time;
	}
	public void setOut_time(long out_time) {
		this.out_time = out_time;
	}
	public long getParking_time() {
		return parking_time;
	}
	public void setParking_time(long parking_time) {
		this.parking_time = parking_time/1000;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setTypeOfCar(String typeOfCar) {
		this.typeOfCar = typeOfCar;
	}
	public String getTypeOfCar() {
		return this.typeOfCar;
	}
	
	abstract String getParkingFee(long time);
	
	public static void charge_inform(int i) {
		// TODO Auto-generated method stub
		
		
		
		
		
	}
}