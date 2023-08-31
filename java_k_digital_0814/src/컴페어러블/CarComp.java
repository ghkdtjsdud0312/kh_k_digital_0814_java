package 컴페어러블;

public class CarComp implements Comparable<CarComp> {
    public String modelName;
    public int modelYear;
    public String color;

    public CarComp(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    // 반환 값이 1이면 정렬 해야 될 조건
    // 반환 값이 -1이면 정렬 조건이 아님
    // 반환 값이 0이면 정렬 조건은 아니지만 set을 사용하는 경우 중복 제거 조건이 됨
    public int compareTo(CarComp o) {
        if (this.modelYear > o.modelYear) return 1; // 연식으로 오름차순 정렬
        else {
            if (this.modelYear == o.modelYear) {
               return this.modelName.compareTo(o.modelName); // 사전 순 정렬
            }
        }
        return -1;

    }
}
