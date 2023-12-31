package 스트림최종연산;

import java.util.Optional;
import java.util.stream.Stream;

// 요소의 소모 :
public class StreamEx5 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("넷", "셋", "둘","하나");
        Stream<String> stream2 = Stream.of("넷", "셋", "둘","하나");
        Optional<String> rst1 = stream1.reduce((s1, s2)-> s1 + "++" + s2); //null포인트를 방지
        rst1.ifPresent(e->System.out.print(e + " "));
        System.out.println();

       String rst2 = stream2.reduce("시작",(s1, s2)-> s1 + "++" + s2);
       System.out.println(rst2);
    }
}
