package backjoon.p_2193;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int size = Integer.parseInt(reader.readLine());
		writer.write(fibo(size)+"\n");
		writer.flush();
	}
	public static long fibo(int n) {
		long arr[] = new long[n];
		arr[0] = 1;
		if(n>=2) arr[1] = 1;
		for(int i=2;i<n;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n-1];
	}
}
