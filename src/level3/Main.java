package level3;

public class Main {
    public static void main (String[] args){
        // 메인입니다.

        // 객체 생성.
        // 생성자를 통해 객체를 설정합니다.
        MenuItem basicBurger = new MenuItem("Basic Burger",5600,"기본 햄버거. 빵, 패티, 피클, 양상추");
        MenuItem frenchFries = new MenuItem("French Fries",2700,"바삭바삭 감자튀김. 캐첩 두 개 드려요.");
        MenuItem icedCola = new MenuItem("Iced Cola",1800,"아주 차갑게 제공되는 콜라.");
        MenuItem chickenNugget = new MenuItem("Chicken nugget",3600,"치킨너겟. 100% 닭가슴살로 만듭니다.");

        // 생성자입니다. 설정한 객체를 넘겨줍니다.
        Kiosk kiosk = new Kiosk(basicBurger, frenchFries, icedCola, chickenNugget);

        kiosk.start();
    }
}
