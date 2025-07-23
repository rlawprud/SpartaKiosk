package level2;

public class MenuItem {
    // 메뉴명, 가격, 정보를 저장할 변수 캐스팅
    // ! 기본 접근제어자 -> 이 패키지 안에서만 사용 가능해요.
    String name;
    int price;
    String info;

    // 생성자
    public MenuItem(String name, int price, String info){
        // 이 클래스로 만들어진 객체의 메뉴명과 가격, 정보를 매개로 받아 저장합니다.
        // 사용할 경우 -> new 키워드를 사용하여 새 인스턴스를 만들 때 매개변수를 주어야 합니다.
        this.name = name;
        this.price = price;
        this.info = info;
    }
    void printMenu(int index){
        System.out.println(index + ". " + this.name + "\t| " + this.price + " |" + this.info);
    }
}
