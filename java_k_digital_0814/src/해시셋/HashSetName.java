package 해시셋;

import java.util.Arrays;
import java.util.HashSet;

// 중복 허용 하지 않음 ,순서 보장 하지 않음, 수학의 집합과 유사한 개념
public class HashSetName {
    public static void main(String[] args) { // 중복,순서 모두 허용 안함

        HashSet<String> set = new HashSet<>(); //asList("H","e","l","l","o"); 넣을 수 있음
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java");
        for(String e : set) System.out.print(e + " ");

    }
}
