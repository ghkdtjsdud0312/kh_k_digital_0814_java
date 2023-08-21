package 배열을이용한정렬;
    // 1차원 배열을 이용한 기본 정렬(버블 정렬 / 삽입 정렬)
    // 사용 예시의 버블 정렬은 일반적인 방법 약간의 차이가 있음
    // 기본적인 버블정렬이나 삽입정렬은 시간의 복잡도를 나타내는 빅오표기법으로 표시하면 0(n2)
public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {9,4,3,10,5,8,7,6,2,1};
        int tmp = 0; // 정렬을 위한 임시 공간
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] < arr[j]) { //9>4
                    tmp = arr[j]; //기존값을 덮어버릴 수 있으므로 임시공간 있어야함 tmp =4
                    arr[j] = arr[i]; // j = 1 4를 9 i=0 자리엔 4
                    arr[i] = tmp; //j = 2 3를 4 i=0 자리엔 3
                }
            }
        }
        for(int e : arr) System.out.print(e + " ");
    }
}
