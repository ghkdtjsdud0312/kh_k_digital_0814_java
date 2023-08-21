package 대소문자바꾸기;

import java.util.Scanner;

// A = 65, a = 97 (ASCII값)
 // 영어 대문자외 소문자로 이루어진 단어를 입력 받은 뒤,
 // 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
 // charAt(index) : 문자열에 해당 인덱스 문자를 추출
 // toCharArray() : 문자열을 문자 배열로 변환
public class AlphabetChange {
    public static void main(String[] args) {
        // 스캐너 생성
        // 문자열 입력 받음
        // 문자열 길이 만큼 순회 하면서 문자에 대한 아스키코드값 확인해서 대문자, 소문자인지 확인하고 계산해줌

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 :");
        String alpha = sc.next();
       for(int i = 0; i < alpha.length(); i++) {
           char ch = alpha.charAt(i);
           if(ch < 'a') System.out.print((char) (ch + ('a'-'A'))); // a 보다 작으면 대문자 65+(97-65) = 97
           else System.out.print((char) (ch - ('a' - 'A')));

       }

    }
}
