import java.util.ArrayList;
public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        this.menu.add(newItem);
        newItem.setIndex(menu.indexOf(newItem));

    }

    public void displayMenu() {
        for (Item item : this.menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " " + item.getPrice());
        }
    }

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order newOrder = new Order(name);
        displayMenu();
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            int item = Integer.parseInt(itemNumber);
            if (item < this.menu.size()) {
                Item orderItem = menu.get(item);
                newOrder.addItem(orderItem);
            } else {
                System.out.println("That item is not available");
            }
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("enter index of an item on the menu or press q to quit.");
            itemNumber = System.console().readLine();

        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        newOrder.display();
        this.orders.add(newOrder);
    }

}
