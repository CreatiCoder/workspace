package backjoon.p_11053;

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
		int input[] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int dp[] = new int[size];
		dp[0] = 1;
		for(int i=1;i<size;i++) {
			if(input[i-1] < input[i]) {
				dp[i] = dp[i-1] + 1;
			} else {
				
			}
		}
		// writer.write(combi(input[1], input[0]) +"\n");
		writer.flush();
	}
}
