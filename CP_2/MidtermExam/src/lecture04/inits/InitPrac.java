package lecture04.inits;

public class InitPrac {

	public static void main(String[] args) {
		int[] a = new int[3];
		String[] s = new String[3];
		char[] c = new char[3];
		boolean[] b = new boolean[3];
		
		for(int as : a)
			System.out.println(as);
		
		for(char cc : c)
			System.out.println(cc);
		
		for(boolean bb : b)
			System.out.println(bb);
	}
}
