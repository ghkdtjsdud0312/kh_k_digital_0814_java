package 홀수짝수나누어담기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenFunc {
//    int[] input = new int[7]; //입력이 7개로 제한 되어 있음
//    int[] even = new int[7];
//    int[] odd = new int[7];
   List<Integer> input = new ArrayList<>();
   List<Integer> even = new ArrayList<>();
   List<Integer> odd = new ArrayList<>();


    // 7개의 정수를 입력 받아서 배열에 넣기
    public void inputFunc() {
        System.out.print("입력 : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
           input.add(sc.nextInt());
        }
    }

    public void oddEvenCalc() {
       for(Integer e : input) {
           if(e % 2 == 0) even.add(e);
           else odd.add(e);
       }
    }

    public void oddEvenOutput() {
        System.out.print("홀수 : ");
        for(Integer e : odd) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(Integer e : even) System.out.print(e + " ");
    }
    }

