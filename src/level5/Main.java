package level5;


public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();
        menu.setMenuItems("Burger",new MenuItem("Basic Burger",5600, "기본 햄버거. 빵, 패티, 피클, 양상추."),
                new MenuItem("Shrimp Burger", 6200, "탱글탱글 생새우가 들어간 새우버거."),
                new MenuItem("Beef Burger", 6100, "소고기로 만든 비프버거. 매콤한 소스가 들어가요!"),
                new MenuItem("Eco Burger", 7100, "100% 콩고기로 만든 에코 버거. 식물성 재료로 만들었어요."));
        menu.setMenuItems("Drink",new MenuItem("Iced Cola", 2200, "얼음이 들어가 이빨이 시리도록 차가운 콜라"),
                new MenuItem("Bottled Water", 1200, "시원한 생수. 평창수 입니다."),
                new MenuItem("Milk Shake", 3100, "달콤하고 고소한 밀크셰이크. 감자튀김 찍어드세요."));
        menu.setMenuItems("Side Menu", new MenuItem("French Fries", 2700, "바삭바삭 짭짤한 감자튀김. 바로 튀겨드려요."),
                new MenuItem("Chicken nugget", 3700, "100% 닭가슴살로 만든 치킨너겟. 공룡 모양은 없어요."));

        Kiosk kiosk = new Kiosk(menu);

        kiosk.start();
    }
}
