package backjoon.p_2217;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = scanner.nextInt();
        int data[] = new int[size];
        int prev = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
        }

        Arrays.sort(data);

        //System.out.println("-=-=-=-=-=-=-=");
        for (int i = 0; i < size; i++) {
            if (prev != data[i]) {
                //System.out.println(i + "\t" + data[i] + "\t" + data[i] * (size - i));
                if (max < data[i] * (size - i)) {
                    max = data[i] * (size - i);
                }
            }
        }

        System.out.println(max);
    }
}