package backjoon.p_1010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		int size = Integer.parseInt(reader.readLine());
		for(int i=0;i<size;i++) {
			int input[] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			writer.write(combi(input[1], input[0]) +"\n");
		}
		writer.flush();
	}
	public static int combi(int a, int b) {
		if (b > (a-b)) b = a-b;
		int r = 1;
		for(int i=0;i<b;i++) {
			r = r*(a-i)/(i+1);
		}
		return r;
	}
}
