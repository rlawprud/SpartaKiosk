package Challenge1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    private Map<String, List<MenuItem>> menuItems = new LinkedHashMap<>();
    private List<String> category = new ArrayList<>();

    public Map<String, List<MenuItem>> getMenuItems(){
        return menuItems;
    }
    public List<String> getCategory(){
        return category;
    }

    // setter
    // 카테고리 이름과 메뉴 아이템을 받아 콜랙선에 추가하는 메서드입니다.
    public void setMenuItems(String category, MenuItem... menuItem){
        // 조건문 -> 이 카테고리를 맵이 가지고 있다면
        if (menuItems.containsKey(category)) {
            for (MenuItem item : menuItem){
                menuItems.get(category).add(item);
            }
        } else {
            // 카테고리가 없을 시 -> 받은 개체를 리스트에 넣어서 추가함.
            // 이후, 같은 이름의 key를 만들고, category 리스트에 카테고리를 추가합니다.
            menuItems.put(category, new ArrayList<>(List.of(menuItem)));
            this.category.add(category);
        }
    }
}
