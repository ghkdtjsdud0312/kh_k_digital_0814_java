package 학생성적정렬;

class StudentInfo implements Comparable<StudentInfo> {
    String name;
    int score;

    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if (this.score < o.score) return 1; // 내림차순 정렬
        else {
            return this.name.compareTo(o.name); // 사전 순 정렬 , compareTo()문자열 비교
        }
    }
}
