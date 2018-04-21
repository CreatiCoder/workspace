package backjoon.p_1931;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = scanner.nextInt();
        int data[][] = new int[size][];
        int current = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i < size; i++) {
            data[i] = new int[2];
            data[i][0] = scanner.nextInt();
            data[i][1] = scanner.nextInt();
        }

        Arrays.sort((Object[]) data, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (((int[]) o1)[1] > ((int[]) o2)[1]) {
                    return 1;
                } else if (((int[]) o1)[1] == ((int[]) o2)[1]) {
                    if (((int[]) o1)[0] >= ((int[]) o2)[0])
                        return 1;
                    else
                        return -1;
                } else if (((int[]) o1)[1] < ((int[]) o2)[1]) {
                    return -1;
                }
                return 0;
            }
        });
        current = data[0][1];
        count = 1;
        for (int i = 1; i < size; i++) {
            if (data[i][0] >= current) {
                count++;
                current = data[i][1];
            }
        }
        System.out.println(count);
    }
}