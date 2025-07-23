package level4;

import java.awt.im.InputMethodRequests;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kiosk {
    void start(Menu menu) {
        // 스캐너 선언

        Scanner in = new Scanner(System.in);
        int input;

        while (true){
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menu.categoryList.size(); i++){
                System.out.println(i+1 +". " + menu.categoryList.get(i));
            }
            System.out.println("0. 종료 \t| 종료 |");
            input = in.nextInt();
            if(input == 0){
                System.out.println("프로그램 종료");
                break;
            }
            else {
                input-=1;
                while (true) {
                    System.out.println("[ "+menu.category+" ]");
                    for (int i = 0; i < menu.items.size(); i++) {
                        System.out.println(i+1 + ". " + menu.items.get(i).name + "\t| " + menu.items.get(i).price + " |" + menu.items.get(i).info);
                    }
                    System.out.println("0. 뒤로가기 \t| 뒤로가기 |");
                    int input2 = in.nextInt();
                    if (input2 == 0){
                        break;
                    }
                    else {
                        input2 -= 1;
                        System.out.println("선택한 메뉴 : " + menu.items.get(input2).name + "\t| " + menu.items.get(input2).price + " |" + menu.items.get(input2).info);
                    }

                }
            }
        }
    }
}
