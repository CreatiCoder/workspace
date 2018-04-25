
// package backjoon.p_14502;

import java.util.*;
import java.io.*;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int data[][];

    public static void main(String[] args) throws IOException {
        Queue<int[]> q = new LinkedList<int[]>();
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        data = new int[x][];
        for (int i = 0; i < x; i++) {
            data[i] = new int[y];
            st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < y; j++) {
                data[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 0:빈공간, 1:기둥, 2:바이러스 3:확인된 바이러스 4:확인된 바이러스 옆공간 5:확인된 빈공간
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (data[i][j] == 2) {
                    q.add(new int[] { i, j });
                    while (!q.isEmpty()) {
                        int[] pos = q.remove();
                        checkPlace(q, pos[0] + 1, pos[1], pos[0] + 1 < x);
                        checkPlace(q, pos[0] - 1, pos[1], pos[0] - 1 >= 0);
                        checkPlace(q, pos[0], pos[1] + 1, pos[1] + 1 < y);
                        checkPlace(q, pos[0], pos[1] - 1, pos[1] - 1 >= 0);
                    }
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (data[i][j] == 0)
                    data[i][j] = 5;
            }
        }
        System.out.println();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++)
                System.out.print(data[i][j] + " ");
            System.out.println("");
        }
    }

    public static void checkPlace(Queue<int[]> q, int t1, int t2, boolean isInside) {
        if (isInside) {
            if (data[t1][t2] == 2) {
                q.add(new int[] { t1, t2 });
                data[t1][t2] = 3;
            } else if (data[t1][t2] == 0) {
                data[t1][t2] = 4;
            }
        }
    }
}