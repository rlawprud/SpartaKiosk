package level3;

public class MenuItem {
    // level 2와 같이 이름, 가격, 정보를 가지는 필드입니다.
    // 기본 접근 제어자 -> 이 패키지 안에서만 접근 가능함.
    String name;
    int price;
    String info;

    // 마찬가지로 생성자입니다.
    // 매개변수 없이 해당 클래스 객체를 생성했을 때는 오류가 납니다.
    public MenuItem(String name, int price, String info){
        this.name = name;
        this.price = price;
        this.info = info;
    }

     void printMenu(int index){
        System.out.println(index + ". " + this.name + "\t| " + this.price + " |" + this.info);
    }
}
