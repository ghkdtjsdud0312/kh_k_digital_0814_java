package Arrays클래스;

import java.util.*;

// Array 클래스는 배열을 다루기 위한 다양한 메소드가 포함되어 있습니다.
public class ArraysClass {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 7, 8, 9, 2, 1};
     //   Arrays.sort(arr); // 오름 차순 정렬
//        Arrays.sort(arr, Collections.reverseOrder()); // 내림 차순 정렬,  Collections은 기본타입 허용 안함
//        for(int e : arr) System.out.print(e + " ");


        // 정렬 오버라이딩 : 재정의
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) { // 정렬 비교 조건 넣기
//                if (o1 > o2) return 1; // 오름 차순 / return 1 은 정렬 조건이고 순서를 바꿔 달라는 뜻
//                // if(o1 < o2) return 1; // 내림 차순
//
//
//            }
        }
    }
