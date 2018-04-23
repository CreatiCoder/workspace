package backjoon.p_1149;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{

		long start = System.currentTimeMillis();
		
		int size = Integer.parseInt(reader.readLine());
		int data[][] = new int [size][3];
		Queue<Integer[]> q = new LinkedList<Integer[]>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for( int i=0;i<size;i++) {
			String line[] = reader.readLine().split(" ");
			data[i][0]= Integer.parseInt(line[0]);
			data[i][1]= Integer.parseInt(line[1]);
			data[i][2]= Integer.parseInt(line[2]);
		}
		q.add(new Integer[] {data[0][0], 0, 0});
		q.add(new Integer[] {data[0][1], 1, 0});
		q.add(new Integer[] {data[0][2], 2, 0});
		
		for(int i=1;i<size-1;i++) {
			Integer[] temp = q.peek();
			while(temp[2]==i-1) {
				temp = q.remove();
				q.add(new Integer[] {temp[0] + data[i][((temp[1]+1)%3)], ((temp[1]+1)%3), i});
				q.add(new Integer[] {temp[0] + data[i][((temp[1]+2)%3)], ((temp[1]+2)%3), i});
				temp = q.peek();
			}
		}
		while(!q.isEmpty()) {
			Integer[] temp = q.remove();
			result.add(temp[0] + data[size-1][((temp[1]+1)%3)]);
			result.add(temp[0] + data[size-1][((temp[1]+2)%3)]);
		}
		writer.write((Collections.min(result))+"\n");
		writer.flush();

		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
	}
}