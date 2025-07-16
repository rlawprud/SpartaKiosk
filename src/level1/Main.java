package level1;
import java.util.Scanner;

public class Main {
    // static인 이유 -> 지금 실행한 파일 = 하드코딩
    // 이후 변경점이나 유지보수를 하지 않는다는 전제로 만들어짐
    // 따라서, 기본적으로 프로그램 실행 시 생성되도록 함.
    // -> static 을 사용함으로 main()에서 사용할 수 있게 됨.
    static void printMenu(){
        System.out.println("[Menu]");
        System.out.println("1. Basic Burger"+"\t|"+"W 5,6"+"|\t"+"기본 햄버거. 빵, 패티, 피클, 양상추");
        System.out.println("2. French Fries"+"\t|"+"W 2,7"+"|\t"+"바삭바삭 감자튀김. 캐첩 두 개 드려요.");
        System.out.println("3. Iced Cola"+"\t|"+"W 1,8"+"|\t"+"아주 차갑게 제공되는 콜라.");
        System.out.println("4. Chicken nugget"+"\t|"+"W 3,6"+"|\t"+"치킨너겟. 100% 닭가슴살로 만듭니다.");
        System.out.println("0. 종료 \t| 종료");
    }
    // level 1의 main 입니다. 이 안에 구현합니다.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;

        printMenu();
        while (true){
            System.out.println("번호를 입력해주세요.");
            input = in.nextLine();
            switch (input){
                case "1" -> {
                    System.out.println("햄버거 선택됨"); return;
                }
                case "2" -> {
                    System.out.println("감자튀김 선택됨"); return;
                }
                case "3" -> {
                    System.out.println("콜라 선택됨"); return;
                }
                case "4" -> {
                    System.out.println("치킨너겟 선택됨"); return;
                }
                case "0" -> {
                    System.out.println("프로그램 종료합니다."); return;
                }
                default -> System.out.println("지원하지 않는 형식이나 번호입니다.");
            }
        }
    }
}