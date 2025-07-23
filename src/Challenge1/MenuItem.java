package Challenge1;

public class MenuItem {
    // 이제부터는 캡슐화를 합니다.

    // 필드 구역
    private String name;
    private int price;
    private String info;

    // 생성자
    public MenuItem(String name, int price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setInfo(String info){
        this.info = info;
    }
    // getter
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public String getInfo(){
        return this.info;
    }
}
