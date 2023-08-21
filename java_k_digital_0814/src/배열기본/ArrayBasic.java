package 배열기본;
    // 자바의 배열은 동일한 데이터 요소들을 연속적으로 저장하는 자료 구조(인덱스만 알고 있으면 한번만에 찾아낼 수 있음/삽입과 삭제에는 치명적)
    // 인덱스를 사용해서 각 요소를 접근할 수 있습니다.(인덱스는 0부터 시작)
    // 배열은 크기를 먼저 지정 해야 합니다. /동적할당을 함
    // 타입[] 배열이름 = new 타입[배열길이];
public class ArrayBasic {
        public static void main(String[] args) {
            // 배열의 크기를 할당하고 이후에 초기화 하는 방법
            int[] grade1 = new int[3]; //힙 영역에서 정수 3개를 저장할 메모리 공간을 확보
//        grade1[0] = 85;
//        grade1[1] = 99;
//        grade1[2] = 77;
//
//        for(int i = 0; i < grade1.length; i++) {
//            System.out.println(grade1[i] + " ");
//        }
            //향상된 for문 : 주어진 배열 등의 크기를 자동 순회를 함
//        for(int e : grade1) {  // 'e' -> 요소라는 의미로 변수 이름은 아무거나 넣어도 됨/처음부터 끝까지 자동순회를 함
//            System.out.println(e + " ");

//        int[] odd = {1,3,5,7,9}; //이미 정해진 값을 배열에 대입하는 경우는 크기와 new를 사용하지 않아도 됨 / 몇개의 값이 들어오는지 알기 때문에 컴파일러가 알아낸다. / 크기지정안해도됨
//        String[] weeks = {"월요일", "화요일", "수", "목", "금", "토", "일"}; //참조타입은 내부 한번 더 점프 , 기본타입은 바로 들어감
//        char[] weeks = {'월', '화', '수', '목', '금','토', '일'};

            int[] grade2 = {88, 99, 56}; // 이미 값을 알고 있는 경우
            int[] grade3 = new int[]{99, 88, 88}; //메모리 위치가 다름
            int[] grade4; //객체 타입의 참조 변수 이므로 실제 객체의 주소를 받아야 함
            grade4 = new int[4]; //heap 메모리에 3개 대입받음
            grade4[0] = 100;
            grade4[1] = 88;
            grade4[2] = 77;
            grade4[3] = 55;
            int sum = 0; //중점을 구하기 위한 변수
            for (int val : grade4) {
                val += 10;
                sum += val; //총점 구하기
            }
            System.out.println("총점 : "+sum);
            System.out.printf("평균 : %.2f\n",(double)sum/grade4.length);

        for (int i = 0; i < grade4.length; i++) { // length 배열의 길이 확인(변수)
            grade4[i] += 10;
            sum += grade4[i];
        }
        System.out.println("총점 : "+sum);
        System.out.printf("평균 : %.2f\n",(double)sum/grade4.length);
    }
}

