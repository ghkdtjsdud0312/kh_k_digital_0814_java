package 커피메뉴만들기;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// HashMap으로 커피 메뉴 리스트 만들기
public class CoffeeMenuList {
    // 문자열로 만들어진 키와 커피의 여러 가지 정보가 포함된 객체를 값으로 사용
    static Map<String, MenuInfo> map = new HashMap<>(); // 클래스 구조의 객체를 넣어 기존의 제약사항이 없어짐
    public static void main(String[] args) throws IOException {
        makeMenu(); // 같은 클래스 내에 안에 있어서 따로 안 적어 줘도 됨
        selectMenu();
    }
    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano",2500,"coffee", "기본 커피"));
        map.put("Espresso", new MenuInfo("Espresso",3000,"coffee", "진한 커피"));
        map.put("Latte", new MenuInfo("Latte",4000,"coffee", "우유 포함 커피"));
    }
    static void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        String key = ""; // 키를 받기 위한 문자열 변수
        while (true) {
            System.out.println("=".repeat(10) + "메뉴 리스트" + "=".repeat(10));
            System.out.print("[1] 메뉴 보기 [2] 메뉴 조회 [3] 메뉴 추가 [4] 메뉴 삭제 [5] 메뉴 수정 [6] 종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1 :
                    System.out.println("=".repeat(10) + "메뉴 보기" + "=".repeat(10));
                    for(String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getCatagory());
                        System.out.println("설명 : " + map.get(e).getDescrition());
                        System.out.println("-".repeat(28));
                    }
                    break;
                case 2 :
                    System.out.print("조회할 메뉴를 입력 하세요 : ");
                    key = sc.next(); // 입력하면 문자열을 받음
                    // 포함 여부를 확인하는 메소드 containsKey(key) : map내에 해당 키가 있는지 확인하여 결과를 반환
                    if(map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).getName());
                        System.out.println("가격 : " + map.get(key).getPrice());
                        System.out.println("분류 : " + map.get(key).getCatagory());
                        System.out.println("설명 : " + map.get(key).getDescrition());
                    } else {
                        System.out.println("해당 메뉴가 존재하지 않습니다.");
                    }
                    break;
                case 3 :
                    System.out.print("추가 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String descrition = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, category,descrition));
                    }
                    break;
                case 4 :
                    System.out.print("삭제할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        map.remove(key);
                        System.out.println(key + " 메뉴를 삭제 하였습니다.");
                    } else {
                        System.out.println("삭제 할 메뉴가 없습니다.");
                    }
                    break;
                case 5 :
                    System.out.print("수정할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String descrition = sc.nextLine();
                        // 키 값은 동일하고 값이 변경되는 경우에 replace() 사용
                        map.replace(key, new MenuInfo(key, price, category,descrition));
                    } else {
                        System.out.println("수정 할 메뉴가 없습니다.");
                    }
                    break;
                case 6 :
                    System.out.println("메뉴를 종료 합니다.");
                    FileOutputStream fos = new FileOutputStream("src/커피메뉴만들기/coffee.bin");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(map);
                    oos.flush();
                    oos.close();
                    fos.close();
                    return;

//                    System.exit(0); // 강제 종료 / return; 대신 넣어도 됨
                default : System.out.println("선택하신 메뉴가 없습니다.");
            }
        }
    }
}

