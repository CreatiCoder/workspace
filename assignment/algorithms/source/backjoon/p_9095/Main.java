package backjoon.p_9095;

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
		writer.write(stair(size)+"\n");
		writer.flush();
	}
	public static long stair(int a) {
		long dp[][] = new long[a][10];
		dp[0][0] = 0;		dp[0][1] = 1;		dp[0][2] = 1;		dp[0][3] = 1;		dp[0][4] = 1;
		dp[0][5] = 1;		dp[0][6] = 1;		dp[0][7] = 1;		dp[0][8] = 1;		dp[0][9] = 1;
		for(int i=1;i<a;i++) {
			dp[i][0] = (dp[i-1][1])%1000000000;
			dp[i][1] = (dp[i-1][0] + dp[i-1][2])%1000000000;
			dp[i][2] = (dp[i-1][1] + dp[i-1][3])%1000000000;
			dp[i][3] = (dp[i-1][2] + dp[i-1][4])%1000000000;
			dp[i][4] = (dp[i-1][3] + dp[i-1][5])%1000000000;
			dp[i][5] = (dp[i-1][4] + dp[i-1][6])%1000000000;
			dp[i][6] = (dp[i-1][5] + dp[i-1][7])%1000000000;
			dp[i][7] = (dp[i-1][6] + dp[i-1][8])%1000000000;
			dp[i][8] = (dp[i-1][7] + dp[i-1][9])%1000000000;
			dp[i][9] = (dp[i-1][8])%1000000000;
		}
		
		return (dp[a-1][0]+dp[a-1][1]+dp[a-1][2]+dp[a-1][3]+dp[a-1][4]+dp[a-1][5]+dp[a-1][6]+dp[a-1][7]+dp[a-1][8]+dp[a-1][9])%1000000000;
	}
}
