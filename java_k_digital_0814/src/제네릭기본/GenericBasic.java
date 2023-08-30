package 제네릭기본;

import java.util.ArrayList;
import java.util.List;

public class GenericBasic {
    public static void main(String[] args) {
        //제네릭 타입 전 - 형변환 해야 함
        List list = new ArrayList<>();
        list.add("hello");
        String str = (String) list.get(0);
        System.out.println(str);

        //제네릭 타입으로 변환 - <>에 타입변수를 넣어주니까 형변환 필요 없음
        List<String> list2 = new ArrayList<>();
        list2.add("java");
        String str2 = list2.get(0);
        System.out.println(str2);
    }
}

