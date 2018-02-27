package backjoon.p_2156;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {

		int size = Integer.parseInt(reader.readLine());
		int data[] = new int[size];
		int dp[] = new int[size];
		int st[] = new int[size];
		
		for (int i = 0; i < size; i++)
			data[i] = Integer.parseInt(reader.readLine());

		if(size == 1) {
			writer.write(data[0]+"\n");
		}else if(size == 2) {
			writer.write(data[0]+data[1]+"\n");
		}else {
			dp[0] = data[0];
			dp[1] = data[0]+data[1];
			st[0] = 1;
			st[1] = 2;
			if( data[0] + data[2] > data[1] + data[2] ) {
				if(dp[1] < data[0] + data[2]) {
					dp[2] = data[0] + data[2];
					st[2] = 1;
				}else {
					dp[2] = dp[1];
					st[2] = 0;
				}
			}else {
				if(dp[1] < data[1] + data[2]) {
					dp[2] = data[1] + data[2];
					st[2] = 2;
				}else {
					dp[2] = dp[1];
					st[2] = 0;
				}
			}
			for(int i=3;i<size;i++) {
				if(st[i-1] != 2) {
					dp[i] = dp[i-1]+data[i];
					st[i] = st[i-1]+1;
				}else{
					if(dp[i-2]+data[i] > dp[i-3]+data[i-1]+data[i]) {
						if( dp[i-1] < dp[i-2]+data[i]) {
							dp[i] = dp[i-2]+data[i];
							st[i] = 1;
						}else {
							dp[i] = dp[i-1];
							st[i] = 0;
						}
					}else {
						if(dp[i-1] < dp[i-3]+data[i-1]+data[i]) {
							dp[i] = dp[i-3]+data[i-1]+data[i];
							st[i] = 2;
						}else {
							dp[i] = dp[i-1];
							st[i] = 0;
						}
					}
				}
			}
			writer.write(dp[size-1]+"\n");
		}
		writer.flush();
	}
}
