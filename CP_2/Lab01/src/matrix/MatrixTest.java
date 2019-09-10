package matrix;

public class MatrixTest {
	public static void main(String[] args) {

		Matrix mat1 = new Matrix(new double[][] {{1, -2},{3,4},{5,6}});
		Matrix mat2 = new Matrix(new double[][] {{1, 2, 3},{4,5,6}});

		System.out.println("첫번째 행렬");
		System.out.println(mat1);
		System.out.println("\n두번째 행렬");
		System.out.println(mat2);
		System.out.println("\n첫번째 행렬 + 첫번째 행렬");
		System.out.println(Matrix.add(mat1, mat1));
		System.out.println("\n두번째 행렬 - 두번째 행렬");
		System.out.println(Matrix.minus(mat2, mat2));
		System.out.println("\n첫번째 행렬 * 두번째 행렬");
		System.out.println(Matrix.multiply(mat1, mat2));
		System.out.println("\n첫번째 행렬 + 두번째 행렬");
		System.out.println(Matrix.add(mat1, mat2));
		System.out.println("\n첫번째 행렬 - 두번째 행렬");
		System.out.println(Matrix.minus(mat1, mat2));
		System.out.println("\n첫번째 행렬 * 첫번째 횅렬");
		System.out.println(Matrix.multiply(mat1, mat1));
	}

}