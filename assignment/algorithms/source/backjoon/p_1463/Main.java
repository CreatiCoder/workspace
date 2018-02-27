package backjoon.p_1463;

import java.io.*;
import java.util.*;

// 3:21:52.87
// https://www.acmicpc.net/source/7322464	c로 1줄로 짬
// https://www.acmicpc.net/source/3243631	java로 짬
public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList dp = new ArrayList();
		dp.add(0);
		dp.add(0);
		dp.add(1);
		dp.add(1);
		int l = scanner.nextInt();
		for (int i = 4; i <= l; i++) {
			if((i%2 ==0)&&(i%3==0))
				dp.add(min((int)dp.get(i-1), (int)dp.get(i/2), (int)dp.get(i/3))+1);
			else if((i%2 ==0))
				dp.add(min((int)dp.get(i-1), (int)dp.get(i/2))+1);
			else if((i%3 ==0))
				dp.add(min((int)dp.get(i-1), (int)dp.get(i/3))+1);
			else
				dp.add((int)dp.get(i-1)+1);
		}
		System.out.println(dp.get(l));
	}
	public static int min(int a, int b) {
		return (a > b)? b : a;
	}
	public static int min(int a, int b, int c) {
		return min(a,min(b,c));
	}
}