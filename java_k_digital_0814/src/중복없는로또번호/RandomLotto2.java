package 중복없는로또번호;

import java.util.ArrayList;
import java.util.List;

public class RandomLotto2 {
    public static void main(String[] args) {

        // ArrayList 사용해서 풀기
        List<Integer> list = new ArrayList<>();
        int tmp = 0;
        while (true) {
            tmp = (int) ((Math.random() * 45) + 1);
            if (!list.contains(tmp)) {
            list.add(tmp);
            }
            if(list.size() == 6) break;
        }
            System.out.println(list);
    }

    }