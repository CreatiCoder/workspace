
//*
package backjoon.p_2583;
//*/

import java.io.*;
import java.util.*;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int data[][] = new int[m][];
        List<Integer> result = new ArrayList<Integer>();
        Queue<int[]> q = new LinkedList<int[]>();

        for (int i = 0; i < m; i++) {
            data[i] = new int[n];
            for (int j = 0; j < n; j++)
                data[i][j] = 0;
        }
        for (int i = 0; i < k; i++) {
            StringTokenizer st2 = new StringTokenizer(reader.readLine());
            int y1 = Integer.parseInt(st2.nextToken());
            int x1 = Integer.parseInt(st2.nextToken());
            int y2 = Integer.parseInt(st2.nextToken());
            int x2 = Integer.parseInt(st2.nextToken());
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    data[x][y] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (data[i][j] == 0) {
                    data[i][j] = 2;
                    q.add(new int[] { i, j });
                    int count = 0;
                    while (!q.isEmpty()) {
                        int ele[] = (q.remove());
                        count++;
                        if ((ele[0] + 1 < m) && data[ele[0] + 1][ele[1]] == 0) {
                            q.add(new int[] { ele[0] + 1, ele[1] });
                            data[ele[0] + 1][ele[1]] = 2;
                        }
                        if ((ele[0] - 1 >= 0) && data[ele[0] - 1][ele[1]] == 0) {
                            q.add(new int[] { ele[0] - 1, ele[1] });
                            data[ele[0] - 1][ele[1]] = 2;
                        }
                        if ((ele[1] + 1 < n) && data[ele[0]][ele[1] + 1] == 0) {
                            q.add(new int[] { ele[0], ele[1] + 1 });
                            data[ele[0]][ele[1] + 1] = 2;
                        }
                        if ((ele[1] - 1 >= 0) && data[ele[0]][ele[1] - 1] == 0) {
                            q.add(new int[] { ele[0], ele[1] - 1 });
                            data[ele[0]][ele[1] - 1] = 2;
                        }
                    }
                    result.add(count);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            if (i != 0)
                System.out.print(" ");
            System.out.print(result.get(i));
        }
    }
}