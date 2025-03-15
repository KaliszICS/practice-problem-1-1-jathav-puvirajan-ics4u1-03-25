public class PracticeProblem {

	public static void main(String args[]) {
		int[][] test = { { 1, 3, 4, 6 },
		{ 3, 5, 7, 2 },
		{ 2, 3, 5, 0 },
		{ 0, 0, 0, 0 } };
		System.out.println(sumRow(test, 3));
	}

	public static int sum2D(int[][] array) {
		int n = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				n += array[i][j];
			}
		}

		return n;
	}
	public static int sumRow(int[][] array, int r) {
		int s = 0;
		if(array.length <= r){
			return 0;
		}
		for (int i = 0; i < array[r].length; i++) {
			s += array[r][i];  
		}
		return s;
	}
	public static int sumColumn(int[][] array, int c) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (c < array[i].length) {  
				sum += array[i][c];
			}
		}
		return sum;
	}
	
	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
