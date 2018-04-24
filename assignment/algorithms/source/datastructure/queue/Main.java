
///*
package datastructure.queue;

//*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int data[] = new int[] { 1, 5, 4, 3, 6, 8, 7, 5, 8 };
        Queue<Integer> q = new LinkedList<Integer>();
        for (int d : data)
            q.add(d);
        while (!q.isEmpty())
            System.out.println(q.remove());
    }
}