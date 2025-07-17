package level2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 클래스 MenuItem 형태의 객체를 모아두는 컬렉션 menuItems 입니다.
        List<MenuItem> menuItems = new ArrayList<>();

        // 객체 생성
        MenuItem basicBurger = new MenuItem("Basic Burger",5600,"기본 햄버거. 빵, 패티, 피클, 양상추");
        MenuItem frenchFries = new MenuItem("French Fries",2700,"바삭바삭 감자튀김. 캐첩 두 개 드려요.");
        MenuItem icedCola = new MenuItem("Iced Cola",1800,"아주 차갑게 제공되는 콜라.");
        MenuItem chickenNugget = new MenuItem("Chicken nugget",3600,"치킨너겟. 100% 닭가슴살로 만듭니다.");

        // 리스트 안에 객체를 넣습니다.
        menuItems.add(basicBurger);
        menuItems.add(frenchFries);
        menuItems.add(icedCola);
        menuItems.add(chickenNugget);

        // 반복문을 사용하여 메뉴를 출력합니다.
        // 이 안에서는 메뉴의 이름과 가격만 출력합니다.
        System.out.println("[Menu]");
        // 리스트를 순회합니다.
        for (int i = 0; i < menuItems.size(); i++){
            // get()을 사용하여 인덱스를 사용해 리스트를 참조합니다.
            System.out.println(i+1+". "+menuItems.get(i).name+"\t| "+menuItems.get(i).price+" |");
        }
        // 종료 커멘드를 알려주기 위한 라인
        System.out.println("0. 종료 \t| 종료 |");

        // 제품 번호를 입력받아야 합니다.
        // Scanner를 사용해서 입력받고, 0이면 종료함을 출력하고 종료,
        // 1~4면 해당하는 메뉴의 이름, 가격, 설명을 출력합니다.
        // + 에외처리를 사용하여 다른 값 or 정수가 아닌 값을 입력하였을 시 경고문을 출력하도록 합니다.
        int input;
        Scanner in = new Scanner(System.in);
        // ++ 잘못된 값을 입력하면 다시 입력받도록 합니다.

        System.out.println("제품 번호를 입력해주세요.");
        while (true){
            try{
                input = in.nextInt();
                if (input == 0){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }else {
                    System.out.println( input+". "+menuItems.get(input-1).name+"\t| "
                                        +menuItems.get(input-1).price+" |"
                                        +menuItems.get(input-1).info);
                    break;
                }
            } catch (InputMismatchException e1) {
                // 정수 외의 값이 들어왔을 경우
                System.out.println("정수를 입력해주세요.");
                // 라인을 비워서 다시는 오류가 나지 않게끔 합니다. 처음부터 다시 입력받을 수 있게끔
                in.nextLine();
            } catch (IndexOutOfBoundsException e2){
                // 범위를 벗어난 값을 받았을 경우
                System.out.println("메뉴 목록 안 정수만 입력해주세요.");
            }
        }
    }
}
