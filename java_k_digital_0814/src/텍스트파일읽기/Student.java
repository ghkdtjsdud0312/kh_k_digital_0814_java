package 텍스트파일읽기;

public class Student implements Comparable<Student>{

    String name;
    int kor;
    int eng;
    int mat;

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    int getTotal() {
        return kor + eng + mat; // 합계구함 getTotal
    }

    // 정렬조건
    @Override
    public int compareTo(Student o) {
        if(this.getTotal() < o.getTotal()) return 1; // 뒤에 값이 앞에 값보다 크며 바꿔줌
        else return -1; // return 0 하면 함수값이 중복 값을 삭제하므로 -1 처리,  + treeset은 중복 삭제하니까 같은 점수일 경우도 처리해 줘야힘
    }
}
