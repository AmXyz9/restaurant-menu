package Restaurant;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean newItem;

    public MenuItem(double price, String description, String category, boolean newItem) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
        Menu.fullMenu.add(this);
    }

    public double getPrice() {return price;}
    public String getDescription() {return description;}
    public String getCategory() {return category;}
    public boolean getNewItem() {return newItem;}
    public void setPrice(double aPrice) {this.price = aPrice;}
    public void setDescription(String aDescription) {this.description = aDescription;}
    public void setCategory(String aCategory) {this.category = aCategory;}
    public void setNewItem(boolean aNewItem) {this.newItem = aNewItem;}
    public void displayNew(){
        if (this.newItem) System.out.println("New Item!");
    }
    public void printItem(){
        if (this.description == null) {
            System.out.println("This item does not exist");
        } else {
            System.out.println(this.category + ": " + this.description + " $" + this.price);
            displayNew();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category);
    }
}
