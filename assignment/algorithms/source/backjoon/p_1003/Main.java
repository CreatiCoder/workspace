package backjoon.p_1003;

import java.io.*;
import java.util.*;

// 0:20:43.57
public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		for (int tc = scanner.nextInt(); tc > 0; tc--) {
			int a = scanner.nextInt();
			int b = fibonacci(a-1);
			
			System.out.println(((a == 0) ? 1 : b) + " " + ((a==1)?1:(b + fibonacci(a - 2))));
		}

	}
	public static int fibonacci(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}