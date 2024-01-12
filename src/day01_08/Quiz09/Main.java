package day01_08.Quiz09;

import java.util.Set;
// 사용할 Set 구현체를 import합니다.
import java.util.HashSet;
// ItemManager 클래스를 작성합니다.
class ItemManager{
    private Set<String> itemIds = new HashSet<>();
    public void addItem(String itemId){
        itemIds.add(itemId);
    }
    public boolean removeItem(String itemId){
        return itemIds.remove(itemId);
    }
    public void showItems(){
        System.out.println(itemIds);
    }
}
public class Main {
    public static void main(String[] args) {
        ItemManager manager = new ItemManager();

        // 아이템 ID 추가
        manager.addItem("sword1001");
        manager.addItem("shield2001");
        manager.addItem("potion3001");
        // 동일한 ID를 가진 아이템 추가
        manager.addItem("potion3001");

        // 전체 아이템 ID 조회
        manager.showItems();

        // 아이템 ID 제거
        manager.removeItem("potion3001");
        manager.showItems();
    }
}