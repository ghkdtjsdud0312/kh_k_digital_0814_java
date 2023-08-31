package 프로퍼티;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

// Map의 하나의 형태 : 키와 값이 모두 String 타입으로 제한된 형태
public class PropertiesMain {
        public static void main(String[] args) throws IOException { // 예외처리를 통틀어 함
            Properties properties = new Properties();
            String path = PropertiesMain.class.getResource("../커피메뉴만들기/database.properties").getPath();
            path = URLDecoder.decode(path, "utf-8"); // 문자열에 대해서 디코딩하겠다라는 뜻 한글이 포함되어있으면 8로 디코딩 해줘야함
                                                          // 한글에 대한 처리를 위해서
            properties.load(new FileReader(path));
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            System.out.println("driver : " + driver);
            System.out.println("url : " + url);
            System.out.println("username : " + username);
            System.out.println("password : " + password);
        }
}
