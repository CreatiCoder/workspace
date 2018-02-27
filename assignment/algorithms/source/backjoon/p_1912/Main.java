package backjoon.p_1912;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int size = Integer.parseInt(reader.readLine());
		int data[] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Integer data2[] = Arrays.stream( data ).boxed().toArray( Integer[]::new );
		int temp[] = new int[size];
		int max = (int) Collections.max(Arrays.asList(data2));
		Arrays.fill(temp,0);

		for(int i=0;i<size;i++)
			for(int j=i;j<size;j++) {
				temp[i] += data[j];
				if(temp[i] <= 0) break;
				else if(max < temp[i]) max = temp[i];
			}
		writer.write(max +"\n");
		writer.flush();
	}
}
