import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {

    public static int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public static double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
            System.out.println("total before" + " " + total);
            total += prices[i];
            System.out.println("total after" + " " + total);

        }
        return total;
    }

    public static void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public static void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName + " !");
        System.out.println("There are " + customers.size() + " " + "in front of you");
        customers.add(userName);
        System.out.println(customers);
    }

    public static boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i) + " -- " + prices.get(i));
        }
        return true;
    }

}