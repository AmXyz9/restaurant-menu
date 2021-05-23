package Restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem hotDog = new MenuItem(2.30, "hot dog", "appetizer", true);
        MenuItem peanut = new MenuItem(1.60, "peanut", "dessert", false);
        MenuItem soda = new MenuItem(7.00, "soda", "main course", false);
        Menu.removeItem(peanut);
        Menu.printMenu();
        System.out.println(hotDog.equals(peanut));
    }
}
