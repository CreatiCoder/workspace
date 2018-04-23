package backjoon.p_11047;

import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11047
 * 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
 * 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
 * 첫째 줄에 K원을 만드는데 필요한 동전 개수의 최소값을 출력한다.
 * 
 */
public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws NumberFormatException, IOException {

        int size = scan.nextInt();
        int price = scan.nextInt();
        int coin[] = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            coin[i] = scan.nextInt();
        }

        for (int i = size - 1; i >= 0 && (price != 0); i--) {
            int quotient = price / coin[i];
            if (quotient != 0) {
                count += quotient;
                price -= quotient * coin[i];
                if (price == 0)
                    break;
            }
        }
        System.out.println(count);
    }
}