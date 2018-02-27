package backjoon.p_1932;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		
		int size = Integer.parseInt(reader.readLine());

		int data[][] = new int [size][size];
		int res[][] = new int [size][size];
		//Queue<Integer[]> q = new LinkedList<Integer[]>();

		for( int i=0;i<size;i++) {
			Arrays.fill(data[i],Integer.MIN_VALUE);
			Arrays.fill(res[i],Integer.MIN_VALUE);
			String line[] = reader.readLine().split(" ");
			int l = line.length;
			for(int j=0; j<l;j++) {
				data[i][j]= Integer.parseInt(line[j]);
			}
		}
		// 값, 층, 위치
		// q.add(new Integer[] { (data[0][0]), 0, 0 } );
		res[0][0] = data[0][0];
		res[1][0] = res[0][0] + data[1][0];
		res[1][1] = res[0][0] + data[1][1];
		
		for( int i=2;i<size;i++) {
			for(int j=0;j<i+1;j++) {
				int right, left;
				if(j != 0) {
					right = (res[i-1][j-1] + data[i][j]);
					res[i][j] = ( res[i][j] > right )? res[i][j] : right;
				}
				if(j != i+1) {
					left = (res[i-1][j] + data[i][j]);
					res[i][j] = ( res[i][j] > left )? res[i][j] : left;
				}
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
				max = (max > res[i][j]) ? max :  res[i][j];
			}
		}
		writer.write(max+"\n");
		writer.flush();
	}
}