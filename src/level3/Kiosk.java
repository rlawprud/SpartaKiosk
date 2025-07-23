package level3;

import java.util.*;

public class Kiosk {
    // 메뉴를 관리하고 사용자 입력을 처리합니다.
    //
    // 1. 메뉴를 관리하는 리스트를 생성합니다.
    List<MenuItem> menuItems = new ArrayList<>();

    // 2. 생성자를 통하여 리스트에 메뉴를 할당합니다.
    // 가변 인자를 사용하여 할당받습니다. MenuItem 형식의 인자를 n개 할당받음
    public Kiosk(MenuItem ... menu){
        // MenuItem 의 형태로 들어온 menu를 할당합니다.
        // .addAll() 은 배열 형태를 받기 때문에, .asList()를 사용하여 넘겨줍니다.
        menuItems.addAll(Arrays.asList(menu));
    }

    // 3. start 메서드를 만들어, 그 안에서 입력과 반복문을 사용합니다.
    Scanner in = new Scanner(System.in);
    int input;

    void start(){
        // 주문을 시작합니다. 를 출력함.
        System.out.println("주문을 시작합니다.");

        // 이 안에서는 메뉴의 이름과 가격만 출력합니다.
        System.out.println("[Menu]");

        // 메뉴가 들어간 리스트를 순회합니다.
        for (int i = 0; i < menuItems.size(); i++) {
            // get()을 사용하여 인덱스를 사용해 리스트를 참조합니다.
            System.out.println(i + 1 + ". " + menuItems.get(i).name + "\t| " + menuItems.get(i).price + " |");
        }

        // 종료 커멘드를 알려주기 위한 라인
        System.out.println("0. 종료 \t| 종료 |");

        while (true) {
            // 반복문을 사용하여 메뉴를 출력합니다.
            // 메뉴 입력을 받는다는 걸 알려주기 위한 라인
            System.out.println("메뉴 번호를 입력해주세요.");

            // ++ 잘못된 값을 입력하면 다시 입력받도록 합니다.
            // = 예외처리
            try {
                input = in.nextInt();
                if (input == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else {
                    menuItems.get(input-1).printMenu(input);
                }
            } catch (InputMismatchException e1) {
                // 정수 외의 값이 들어왔을 경우
                System.out.println("정수를 입력해주세요.");
                // 라인을 비워서 다시는 오류가 나지 않게끔 합니다. 처음부터 다시 입력받을 수 있게끔
                in.nextLine();
            } catch (IndexOutOfBoundsException e2) {
                // 범위를 벗어난 값을 받았을 경우
                System.out.println("메뉴 목록 안 정수만 입력해주세요.");
            }
        }
    }
}
