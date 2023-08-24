package 집주소;

import java.util.Scanner;

public class HouseAddress {
    public static void main(String[] args) {
        int[] numSize = {4,2,3,3,3,3,3,3,3,3};
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        while(true) {
            String num = sc.nextLine();
            if(num.equals("0")) break;
            for(int i = 0; i < num.length(); i++) {
                sum += numSize[num.charAt(i) - '0'] + 1;
            }
        }
        System.out.println(sum + 1);
        sum = 0;
    }
}
