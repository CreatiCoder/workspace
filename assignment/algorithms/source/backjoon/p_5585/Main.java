package backjoon.p_5585;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {

        int cash = 1000 - Integer.parseInt(reader.readLine());
        int count = 0;
        if (cash / 500 != 0) {
            count += cash / 500;
            cash = cash % 500;
        }
        if (cash / 100 != 0) {
            count += cash / 100;
            cash = cash % 100;
        }
        if (cash / 50 != 0) {
            count += cash / 50;
            cash = cash % 50;
        }
        if (cash / 10 != 0) {
            count += cash / 10;
            cash = cash % 10;
        }
        if (cash / 5 != 0) {
            count += cash / 5;
            cash = cash % 5;
        }
        if (cash / 1 != 0) {
            count += cash / 1;
            cash = cash % 1;
        }
        writer.write(count + "\n");
        writer.flush();
    }
}