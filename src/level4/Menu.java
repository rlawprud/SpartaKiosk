package level4;

import java.util.*;

public class Menu {
    // MenuItem 클래스를 List로 관리
    // 키(카테고리) : (Menu 배열) 을 가지는 2차원 배열(딕셔너리타입) 입니다.
    // 넣은 순서대로 열람하고 싶어요!! 그러니까 순서가 있는 링크드 해시 맵으로 불러왔습니다.
    Map<String, List<MenuItem>> menuItems = new LinkedHashMap<>();
    List<String> categoryList = new ArrayList<>(menuItems.keySet());
    String category;
    List<MenuItem> items = new ArrayList<>();


    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    // List를 리턴하는 함수

    // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
    void setCategory(int index){
        this.category = categoryList.get(index);
        setMenuItem();
    }
    void setMenuItem(){
        items = menuItems.get(category);
    }

}

