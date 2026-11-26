public class MenuItem{
    public enum Category{
        STARTER,MAIN_COURSE,DESSERT,BEVERAGE
    }

    private int id;
    private String name;
    private double price;
    private Category category;

    public MenuItem(int id, String name, double price,Category category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price){this.price = price; }
    public Category getCategory() { return category; }

    @Override
    public String toString(){
        return String.format("[&d] %-20s | %-12s | %.2f TL",id, name, category, price);
    }

}