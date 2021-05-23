package Restaurant;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Menu {
    public static LocalDateTime updateMenu() {
        System.out.println(LocalDateTime.now());
        return LocalDateTime.now();
    }
    public static ArrayList<MenuItem> fullMenu = new ArrayList<MenuItem>();
    public static void printMenu() {
        for (int i = 0; i < fullMenu.size(); i++) {
            fullMenu.get(i).printItem();
        }
    }
    public static void removeItem(Object obj){
        int index = fullMenu.indexOf(obj);
        fullMenu.remove(index);
    }
}
