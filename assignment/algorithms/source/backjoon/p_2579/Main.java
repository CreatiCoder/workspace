package backjoon.p_2579;

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
		int s[] = new int[size];
		int dp[] = new int[size];
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < size; i++) {
			dp[i] = 0;
			s[i] = Integer.parseInt(reader.readLine());
		}
		dp[0] = s[0];
		if (size > 1)
			dp[1] = s[0] + s[1];
		if (size > 2)
			dp[2] = max((s[0] + s[2]), (s[1] + s[2]));
		if (size > 3)
			dp[3] = max(s[0] + s[1] + s[3], max(s[0] + s[2] + s[3], max(s[1] + s[2], (s[1] + s[3]))));
		for (int i = 4; i < size; i++) {
			if( dp[i-2]+s[i] > dp[i-3]+s[i-1]+s[i] )
				dp[i] = dp[i-2]+s[i];
			else
				dp[i] = dp[i-3]+s[i-1]+s[i];
		}
		
		writer.write(dp[size-1] + "\n");
		writer.flush();
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}