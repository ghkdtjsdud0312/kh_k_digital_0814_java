package 해시맵기본;

import java.util.*;

public class HashBasic {
    public static void main(String[] args) {
        // key, value
        Map<String, Integer> map = new HashMap<>();
        // 객체 저장 : key, value
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 70); // key가 같기 때문에 나중에 저장된 값으로 대체(값은 중복 허용, 키는 중복 허용 안 함)
        System.out.println("총 Entry 수 : " + map.size()); //키와 값이 쌍으로 들어간 것이 엔트리라고 함

        // 객체 찾기 : get(key), 지정된 키에 대한 값을 반환 함
        System.out.println(map.get("동그라미")); // list에는 get에 인덱스 들어가고 map에는 get에 키를 넣어줌

        // 향상된 for문으로 map 순회
        for(String key : map.keySet()) { // key가 set구조(중복이 되지 않기 때문), map에 있는 key값을 set구조로 바꾸어냄
                                         // keySet() key가 포함된 Set 컬렉션으로 반환(set(집합구조)자료구조라고 생각하면 됨)
          System.out.println(key + "\t" + map.get(key)); // key대한 값을 map.get(key) 사용하면 이름과 점수가 다 나옴
        }
//        // iterator(반복자)를 사용 하는 방법(참고)
//        Set<String> keySet = map.keySet();
//        Iterator<String> iterator = keySet.iterator();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            Integer value = map.get(key);
//            System.out.println(key + "\t" + value);
//        }

        // 객체 삭제 : key값으로 해당 Entry를 삭제
        map.remove("최수연");
        for(String key : map.keySet()) { // key가 set구조(중복이 되지 않기 때문), map에 있는 key값을 set구조로 바꾸어냄
            // keySet() key가 포함된 Set 컬렉션으로 반환(set(집합구조)자료구조라고 생각하면 됨)
            System.out.println(key + "\t" + map.get(key)); // key대한 값을 map.get(key) 사용하면 이름과 점수가 다 나옴
        }
    }
}
