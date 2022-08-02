public class OrderTest {
    // Create 2 orders for unspecified guests (without specifying a name);
    public static void main(String[] args) {
        Item item1 = new Item("mocha", 20.00);
        Item item2 = new Item("latte", 4.00);
        Item item3 = new Item("drip coffee", 1.00);
        Item item4 = new Item("capuccino", 10.00);    

        Order unnamedOrder1 = new Order();
        Order unnamedOrder2 = new Order();
    
        Order namedOrder1 = new Order("Kevin");
        Order namedOrder2 = new Order("Susan");
        Order namedOrder3 = new Order("Benji");

        unnamedOrder1.addItem(item1);
        unnamedOrder1.addItem(item3);
        unnamedOrder2.addItem(item2);

        namedOrder1.addItem(item3);
        namedOrder2.addItem(item4);
        namedOrder3.addItem(item1);

        unnamedOrder1.setReadyStatus(true);
        namedOrder1.setReadyStatus(true);


        // System.out.printf("Total: %s\n", unnamedOrder1.getOrderTotal());
        // System.out.printf("Total: %s\n", unnamedOrder2.getOrderTotal());
        // System.out.printf("Total: %s\n", namedOrder1.getOrderTotal());
        // System.out.printf("Total: %s\n", namedOrder2.getOrderTotal());
        // System.out.printf("Total: %s\n", namedOrder3.getOrderTotal());

        // System.out.printf("Total: %s\n", unnamedOrder1.getStatusMessage());
        // System.out.printf("Total: %s\n", unnamedOrder2.getStatusMessage());
        // System.out.printf("Total: %s\n", namedOrder1.getStatusMessage());
        // System.out.printf("Total: %s\n", namedOrder2.getStatusMessage());
        // System.out.printf("Total: %s\n", namedOrder3.getStatusMessage());

        // System.out.printf("Total: %s\n", unnamedOrder1.getOrderTotal());
        // System.out.printf("Total: %s\n", unnamedOrder2.getOrderTotal());
        // System.out.printf("Total: %s\n", namedOrder1.getOrderTotal());
        // System.out.printf("Total: %s\n", namedOrder2.getOrderTotal());
        // System.out.printf("Total: %s\n", namedOrder3.getOrderTotal());


        
        unnamedOrder1.display();
        namedOrder1.display();
    }


}
