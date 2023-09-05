package 파일복사하기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {
    public static void main(String[] args) throws IOException {
        String originFileName = "src/파일복사하기/춘식이.jpg";
        String targetFileName = "d:/tmp/bear.jpg";

        FileInputStream fis = new FileInputStream(originFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        byte[] readBytes = new byte[100];
        while((readByteNo = fis.read(readBytes)) != -1) { // 파일의 끝 만날 때까지 읽어냄
            fos.write(readBytes, 0, readByteNo); // 0은 맨 앞부터 읽는다.
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}
