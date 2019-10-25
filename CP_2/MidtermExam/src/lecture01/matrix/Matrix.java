/*
 * Matrix
 * 
 * matrix => 2 dimentional vector => 2 dimentional array
 * 
 * field
 * - matrix[][]
 * 
 * method
 * - add
 * - minus
 * - multiply
 * - toString
 * 
 * toString method != static method
 */
package lecture01.matrix;

import java.util.Arrays;

public class Matrix {

	private double[][] matrix;
	
	public Matrix(double[][] arr) {
		this.matrix = arr;
	}
	
	public static Matrix add(Matrix m1, Matrix m2) {
		if(m1.matrix.length != m2.matrix.length || 
				m1.matrix[0].length != m2.matrix[0].length) {
			System.out.println("Error / length is not equal");
			return null;
		} else {
			Matrix result = new Matrix(new double[m1.matrix.length][m1.matrix[0].length]);
			
			for(int i = 0; i < m1.matrix.length; i++) {
				for(int j = 0; j < m1.matrix[0].length; j++)
					result.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
			}
			
			return result;
		}
	}
	
	public static Matrix minus(Matrix m1, Matrix m2) {
		if(m1.matrix.length != m2.matrix.length || 
				m1.matrix[0].length != m2.matrix[0].length) {
			System.out.println("Error / length is not equal");
			return null;
		} else {
			Matrix result = new Matrix(new double[m1.matrix.length][m1.matrix[0].length]);
			
			for(int i = 0; i < m1.matrix.length; i++) {
				for(int j = 0; j < m1.matrix[0].length; j++)
					result.matrix[i][j] = m1.matrix[i][j] - m2.matrix[i][j];
			}
			return result;
		}
	}
	
	public static Matrix multiply(Matrix m1, Matrix m2) {
		if(m1.matrix[0].length != m2.matrix.length) {
			System.out.println("Error / make length of m1 row and m2 column equal");
			return null;
		}else {
			Matrix result = new Matrix(new double[m1.matrix.length][m2.matrix[0].length]);
			
			for(int i = 0; i < m1.matrix.length; i++) {
				for(int j = 0; j < m2.matrix[0].length; j++) {
					result.matrix[i][j] = 0;
					for(int k = 0; k < m1.matrix[0].length; k++) {
						result.matrix[i][j] += m1.matrix[i][k] * m2.matrix[k][j];
					}
				}
			}
			return result;
		}
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for(int i = 0; i < this.matrix.length; i++)
			result.append(Arrays.toString(this.matrix[i]) + "\n");
		result.deleteCharAt(result.length() - 1);
		result.append("]\n");
		
		return result.toString();
	}
}
