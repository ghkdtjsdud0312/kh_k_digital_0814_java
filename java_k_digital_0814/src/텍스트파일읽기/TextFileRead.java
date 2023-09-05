package 텍스트파일읽기;
// 파일 글 찍히는 것 확인 - 이름/수학/영어 점수 split써서 구분되어 값 들어가게 구함
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

//해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기
public class TextFileRead {
    public static void main(String[] args) throws  IOException {
        TreeSet<Student> treeSet = new TreeSet<>();//정렬할때 사용, 내림차순이 기본 값.
        FileInputStream inputStream = new FileInputStream("src/텍스트파일읽기/Text.txt");
        Scanner sc = new Scanner(inputStream);

        //public static void main(String[] args) {
        //try {
        //inputStream = new FileInputStream("src/텍스트파일읽기/Text.txt");
        //}catch(FileNotFoundException e) {
        //System.out.println("읽을 페이지를 찾지 못했습니다");

        while (sc.hasNextLine()) {
            String[] lineSplit = sc.nextLine().split(" ");
            treeSet.add(new Student(lineSplit[0],
                    Integer.parseInt(lineSplit[1]),
                    Integer.parseInt(lineSplit[2]),
                    Integer.parseInt(lineSplit[3])));
        }
        for(Student e : treeSet) {
            System.out.println("이름 : " + e.name + ", 총점 : " + e.getTotal());
}
        }
    }

