package 중복없는로또번호;

import java.util.HashSet;

public class RandomLotto3 {
    public static void main(String[] args) {

        // Set : 자바에서 사용 집합 개념(기본적으로 중복제거함)
        HashSet<Integer> set = new HashSet<>();
        while(true) {
            int tmp = (int) ((Math.random() * 45) + 1);
            set.add(tmp);
            if(set.size() == 6) break;
        }
        System.out.println(set);
    }
}
