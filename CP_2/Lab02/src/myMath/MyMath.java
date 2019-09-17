package myMath;

public class MyMath<T extends Number> {

	//static 쓰면 안 되는 이유?
	public double getAverage(T[] data) {
		double _result = 0.0;
		
		/*
		for(int i = 0; i < data.length; i++) {
			_result += data[i].doubleValue(); // double로 형변환 시키면 오류난다!!
		}
		*/
		
		for (T k : data) {
			_result += k.doubleValue();
		}
		
		_result /= data.length;
		
		return _result;
	}
}
