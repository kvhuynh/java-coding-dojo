import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "Guest";
        items = new ArrayList<Item>();
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        items = new ArrayList<Item>();
    }
    // ORDER METHODS
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double orderTotal = 0;
        for (Item item : items) {
            orderTotal += item.getPrice();
        }
        return orderTotal;
    }
    
    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
        System.out.println("Total :$" + getOrderTotal());
    }

    // GETTERS & SETTERS
    public String getName() {
        return this.name;
    }

    public boolean isReady() {
        return this.ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReadyStatus(boolean isReady) {
        this.ready = isReady;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    
}

