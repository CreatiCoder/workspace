package hw2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) throws IOException {

		File file = new File(mainClass.class.getResource("").getPath() + "testcase5.txt");
		Scanner input = new Scanner(file);

		int n = Integer.valueOf(input.next());
		System.out.println(n);
		double[][] arr = new double[n][n];
		double[][][] col = new double[n][n][n];
		double[][] sqa = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = Double.valueOf(input.next());
				for (int m = 0; m < n; m++) {
					if( m == 0 || i == 0 ) {
						col[i][j][m] = arr[i][j];
					}else if ( m != 0 ) {
						col[i][j][m] = col[i-1][j][m-1] + arr[i][j];
					}
				}
				//col[i][j] = round((i == 0) ? arr[i][j] : (col[i - 1][j] + arr[i][j]));
				//sqa[i][j] = round((j != 0 &&  i != 0) ? (sqa[i - 1][j] + col[i][j]) : col[i][j] );
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(col[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(sqa[i][j] + " ");
			}
			System.out.println();
		}
	}
	// double형 반올림
	static double round(double d) {
		return Math.round(d * Math.pow(10, 1)) / Math.pow(10, 1);
	}
}