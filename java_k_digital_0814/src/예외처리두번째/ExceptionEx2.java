package 예외처리두번째;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx2 {
    // Checked Exception : 컴파일러가 컴파일 타임에 예외 상황을 체크함
    public static void main(String[] args)  {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            br.readLine(); // 입력과 출력이 안되서 빨간줄 이었다.
            br.close();
        } catch (IOException e) { // FileReader, readLine, close 모두 예외처리
            System.out.println(e);
            System.out.println("파일이 없습니다. 다시 첨부해 주세요.");
        }
        }
}
