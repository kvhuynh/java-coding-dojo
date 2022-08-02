public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    private int index;
    
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // Getters
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getIndex() {
        return this.index;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
