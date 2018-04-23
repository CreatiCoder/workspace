package backjoon.p_11726;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		int n = Integer.parseInt(reader.readLine());
		writer.write((fibo(n))+"\n");
		writer.flush();
		
	}
	public static int fibo(int n) {
		int arr[] = new int[n];
		arr[0] = 1;
		if(n!=1) arr[1] = 2;
		for(int i=2;i<n;i++) {
			arr[i] = (arr[i-1] + arr[i-2])%10007;
		}
		return arr[n-1];
	}
}
