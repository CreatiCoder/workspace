package backjoon.p_11399;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/11399
 * 첫째 줄에 사람의 수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄에는 각 사람이 돈을 인출하는데 걸리는 시간 Pi가 주어진다. (1 ≤ Pi ≤ 1,000)
 * 첫째 줄에 각 사람이 돈을 인출하는데 필요한 시간의 합의 최소값을 출력한다.
 * 
 */
public class Main {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {

		int size = Integer.parseInt(reader.readLine().trim());
		int input[] = Arrays.stream(reader.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		int result[] = new int[size];
		int sum = 0;

		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if (input[i] > input[j]) {
					int temp = input[j];
					input[j] = input[i];
					input[i] = temp;
				}
			}
			//result[i] = (i == 0) ? input[i] : result[i - 1] + input[i];
			//sum += result[i];
			sum += input[i] * (size - i);
		}

		// for (int i = 0; i < input.length; i++) {
		// 	writer.write(input[i] + "\n");
		// }
		// for (int i = 0; i < input.length; i++) {
		// 	writer.write(result[i] + "\n");
		// }
		writer.write(sum + "\n");
		writer.flush();
	}
}