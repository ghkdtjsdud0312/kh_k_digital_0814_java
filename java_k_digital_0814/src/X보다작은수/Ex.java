package X보다작은수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt(); // 배열의 개수
        int x = sc.nextInt(); // 크기를 비교하는 기준 값(미만 값을 찾음)
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // 리스트에 값을 추가 함
            if (list.get(i) < x) System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

}