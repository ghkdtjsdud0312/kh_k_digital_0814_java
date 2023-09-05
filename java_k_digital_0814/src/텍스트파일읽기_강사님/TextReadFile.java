package 텍스트파일읽기_강사님;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class TextReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Student> treeSet = new TreeSet<>();
        FileInputStream fis = new FileInputStream("src/텍스트파일읽기_강사님/score.txt");
        Scanner sc = new Scanner(fis);
        while(sc.hasNextLine()) {
            // 안유진 99 78 45
            String[] lineSplit = sc.nextLine().split(" ");
            treeSet.add(new Student(lineSplit[0],
                    Integer.parseInt(lineSplit[1])
                            + Integer.parseInt(lineSplit[2])
                    +Integer.parseInt(lineSplit[3])));
        }
        for(Student e : treeSet) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }
}
