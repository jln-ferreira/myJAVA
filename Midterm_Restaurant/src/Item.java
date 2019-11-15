public class Item {

    //proprieties/ fields
    private String name;
    private double price;
    private int foodID;

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getFoodID() {
        return foodID;
    }
}

