import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] prices = {50, 30, 40, 25, 20}; 
        int totalBill = 0; 

        while (true) {
            System.out.println("Select an option from the menu:");
            System.out.println("1. Dosa    - 60 Rs");
            System.out.println("2. Samosa  - 30 Rs");
            System.out.println("3. Idli    - 40 Rs");
            System.out.println("4. Vada    - 25 Rs");
            System.out.println("5. Tea     - 20 Rs");
            System.out.println("6. Generate Bill");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 6) { 
                System.out.println("Total Bill:" + totalBill);
                System.out.println("Thank you! Visit again.");
                break;
            } else if (choice >= 1 && choice <= 5) {
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();

                totalBill += prices[choice - 1] * quantity;
            } else {
                System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
