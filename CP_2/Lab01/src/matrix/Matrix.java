package matrix;

/*
 * 파일명 : Matrix.java
 * 작성일 : 2019 09 02 (월)
 * 작성자 : 안형진
 * 목적 : 행렬의 연산을 다루는 Class이다. 이 Class를 이용하여 행렬의 합, 차, 곱을 구할 수 있다.
 */
public class Matrix {
	
	private double[][] matrix; // 필드 - 행렬을 저장할 실수형의 이차원 배열
	
	
	// 생성자 - 2차원 배열을 인자로 받아 필드에 저장
	public Matrix(double[][] arr) {
		this.matrix = arr;
	}
	
	// 덧셈
	public static Matrix add(Matrix m1, Matrix m2) {
		int row = m1.matrix.length;
		int column = m1.matrix[0].length;
		
		int row_2 = m2.matrix.length;
		int column_2 = m2.matrix[0].length;
		
		Matrix result; // 결과값을 저장할 Matrix 객체
		
		// 행, 열의 길이 검사 후 계산
		if(row != row_2 || column != column_2) {
			System.out.println("두 행렬의 행과 열의 길이가 같아야 합니다.");
			result = new Matrix(null);
		}else {
			result = new Matrix(new double[row][column]);
			
			for(int i = 0; i < row; i++) {
				for(int k = 0; k < column; k++) {
					result.matrix[i][k] = m1.matrix[i][k] + m2.matrix[i][k];
				}
			}
		}
		return result;
	}
	
	// 뺄셈
	public static Matrix minus(Matrix m1, Matrix m2) {
		int row = m1.matrix.length;
		int column = m1.matrix[0].length;
		
		int row_2 = m2.matrix.length;
		int column_2 = m2.matrix[0].length;
		
		Matrix result; // 결과값을 저장할 Matrix 객체
		
		// 행, 열의 길이 검사 후 계산
		if(row != row_2 || column != column_2) {
			System.out.println("두 행렬의 행과 열의 길이가 같아야 합니다.");
			result = new Matrix(null);
		}else {
			result = new Matrix(new double[row][column]);
			
			for(int i = 0; i < row; i++) {
				for(int k = 0; k < column; k++) {
					result.matrix[i][k] = m1.matrix[i][k] - m2.matrix[i][k];
				}
			}
		}
		return result;
	}
	
	// 곱셈
	public static Matrix multiply(Matrix m1, Matrix m2) {
		int row = m1.matrix.length;
		int column = m1.matrix[0].length;
		
		int row_2 = m2.matrix.length;
		int column_2 = m2.matrix[0].length;
		
		Matrix result; // 결과값을 저장할 Matrix 객체
		
		// 행, 열의 길이 검사 후 계산
		if(column != row_2) {
			System.out.println("첫번째 행렬의 열의 길이와 두번째 행렬의 행의 길이가 같아야 합니다.");
			result = new Matrix(null);
		}else {
			result = new Matrix(new double[row][column_2]);
			
			for(int i = 0; i < row; i++) {
				for(int k = 0; k < column_2; k++) {
					result.matrix[i][k] = 0;
					for(int h = 0; h < column; h++) {
						result.matrix[i][k] += m1.matrix[i][h] * m2.matrix[h][k];
					}
				}
			}
		}
		return result;
	}
	
	// toString 메소드 - 행렬(2차원 배열)을 출력
	public String toString() {
		if (this.matrix == null) {
			return "null";
		}else {
			// 2차원 배열 출력 - 1)
			String result_mat = "[";
			
			for(int i = 0 ; i < this.matrix.length - 1; i++) {
				result_mat += "[";
				for(int k = 0; k < this.matrix[0].length - 1; k++) {
					result_mat += this.matrix[i][k] + ", ";
				}
				result_mat += this.matrix[i][this.matrix[0].length - 1] + "]\n ";
			}
			
			result_mat += "[";
			
			for(int k = 0; k < this.matrix[0].length - 1; k++) {
				result_mat += this.matrix[this.matrix.length - 1][k] + ", ";
			}
			
			result_mat += this.matrix[this.matrix.length - 1][this.matrix[0].length - 1] + "]]";
			
			// 2차원 배열 출력 - 2)
			// result = java.util.Arrays.toString(this.matrix);
			return result_mat;
		}
	}
}
