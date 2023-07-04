import java.util.ArrayList;
public class CafeUtil{

    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i<=10; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double [] lineItems) {
        double total = 0;
        for (int i=0; i<lineItems.length;i++){
            total += lineItems[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        int count = 0;
        for(String item : menuItems){
            System.out.println(count + " " + item);
            count++;
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username);
        System.out.println("There are " + customers.size() + " people ahead of you.");
        customers.add(username);
    }




}