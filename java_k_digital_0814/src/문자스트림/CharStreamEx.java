package 문자스트림;

import 디폴트메서드.RemoteControl;

import java.io.*;

// Writer : 문자열 기반 출력 스트림의 최상위 클래스로 추상 클래스
    // Reader : 문자열 기반 입력 스트림의 최상위 클래스로 추상 클래스
public class CharStreamEx {
    public static void main(String[] args) throws IOException {
//        Writer writer = new FileWriter("test.txt");
//        char[] data = "곰돌이사육사".toCharArray(); // 문자열 자체가 하나하나의 문자배열로 바뀜
//        for(int i = 0; i < data.length; i++) {
//            writer.write(data[i]);
//        }
//        writer.write(data);
//        writer.flush(); // 버퍼 비우기
//        writer.close();
        Reader reader = new FileReader("test.txt");
        while (true) {
            int readData = reader.read();
            if(readData == -1) break;
            System.out.print((char)readData);
        }
        reader.close();
    }
}
