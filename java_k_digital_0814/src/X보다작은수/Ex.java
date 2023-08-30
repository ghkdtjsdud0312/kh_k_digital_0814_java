package X보다작은수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());

            if (list.get(i) < x) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }

}