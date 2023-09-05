package 커피메뉴만들기;

import java.io.Serializable;

public class MenuInfo implements Serializable{
    private String name; // 메뉴명
    private int price; // 가격
    private String catagory; // 분류
    private String descrition; // 메뉴에 대한 설명

    public MenuInfo(String name, int price, String catagory, String descrition) {
        this.name = name;
        this.price = price;
        this.catagory = catagory;
        this.descrition = descrition;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCatagory() {
        return catagory;
    }

    public String getDescrition() {
        return descrition;
    }
}
