package Challenge1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private Menu menu = new Menu();
    // 생성자 -> Menu 인 객체를 받습니다.
    public Kiosk(Menu menu){
        this.menu = menu;
    }

    // 사용할 메서드들입니다.
    // int index 를 받아 String(카테고리명)을 받아내는 메서드
    private String strCategory(int index){
        return menu.getCategory().get(index);
    }
    // String 카테고리를 받아 MenuItem 리스트를 리턴합니다.
    private List<MenuItem> catMenu(String category){
        return menu.getMenuItems().get(category);
    }
    // 두 개의 int를 받아 MenuItem 객체를 리턴하는 메서드입니다. (categoryIndex = 카테고리용 인덱스, menuIndex = 메뉴 아이템 용 인덱스)
    private MenuItem menu(int categoryIndex, int menuIndex){
        return catMenu(strCategory(categoryIndex)).get(menuIndex);
    }
    // String을 리턴하는 메서드입니다.
    private String printMenu(int categoryIndex, int menuIndex){
        return menu(categoryIndex,menuIndex).getName()+"\t| "+menu(categoryIndex,menuIndex).getPrice()+" |"+menu(categoryIndex,menuIndex).getInfo();
    }
    // start
    public void start(){
        Scanner in = new Scanner(System.in);
        int catIndex, menuIndex;

            while (true) {
                System.out.println("[ MAIN MENU ]");
                for (int i = 0; i < menu.getCategory().size(); i++) {
                    System.out.println(i + 1 + ". " + strCategory(i));
                }
                System.out.println("0. 종료 \t| 종료 |");
                System.out.println("카테고리를 선택해주세요.");
                try{
                catIndex = in.nextInt();
                if (catIndex == 0) {
                    break;
                } else {
                    System.out.println("[ " + strCategory(catIndex - 1) + " ]");
                    for (int i = 0; i < catMenu(strCategory(catIndex - 1)).size(); i++) {
                        System.out.println(i + 1 + ". " + printMenu(catIndex - 1, i));
                    }
                    System.out.println("0. 뒤로가기 \t| 뒤로가기 |");
                    while (true) {
                            System.out.println("메뉴 번호를 입력해주세요.");
                        try {
                                menuIndex = in.nextInt();
                            if (menuIndex == 0) {
                                break;
                            } else {
                                System.out.println("선택한 메뉴 : " + printMenu(catIndex - 1, menuIndex - 1));
                            }
                        }catch (InputMismatchException e1){
                            System.out.println("다시 확인해주세요.");
                            in.nextLine();
                        }catch (IndexOutOfBoundsException e2){
                            System.out.println("목록 안에서 골라주세요.");
                        }
                    }
                }
                }catch (InputMismatchException e1){
                    System.out.println("다시 확인해주세요.");
                    in.nextLine();
                }catch (IndexOutOfBoundsException e2){
                    System.out.println("목록 안에서 골라주세요.");
                }
            }

        System.out.println("프로그램 종료.");
    }
}
