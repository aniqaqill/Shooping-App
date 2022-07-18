import java.util.*;

public class ProductApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice = 0, quantity;
    String description, type;
    double price;
    Customer customer = null;
    Food food;

    do {
      displayMenu();
      try {
        choice = sc.nextInt();
        System.out.println();
        switch (choice) {
          case 1:
            System.out.println("<<< Add Customer >>>");
            System.out.print("Enter Customer Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            customer = new Customer(name);
            break;
          case 2:
            if (customer == null) {
              System.out.println("There is no customer.Please start by entering the customer's name.");
              break;
            }

            System.out.println("<<< Purchase Vehicle >>>");
            System.out.print("Description: ");
            sc.nextLine();
            description = sc.nextLine();
            System.out.print("Type: ");
            type = sc.nextLine();
            System.out.print("Price(in RM) : ");
            price = sc.nextDouble();

            customer.purchase(new Vehicle(type, price, description));
            break;

          case 3:
            if (customer == null) {
              System.out.println("There is no customer.Please start by entering the customer's name.");
              break;
            }
            System.out.println("<<< Purchase Food >>>");
            System.out.print("Description: ");
            sc.nextLine();
            description = sc.nextLine();
            System.out.print("Price: ");
            price = sc.nextDouble();
            System.out.print("Quantity: ");
            quantity = sc.nextInt();
            customer.purchase(new Food(description, price, quantity));
            break;

          case 4:
            if (customer == null) {
              System.out.println("There is no customer.Please start by entering the customer's name.");
              break;
            }
            if (customer.calcProductPurchased() == 0) {
              System.out.println("No products were purchased!!");
              break;
            }
            customer.show();
            break;
          case 5:
            System.out.println("<<< Exit >>>");
            break;
          default:
            throw new Exception();
        }
      } catch (Exception e) {
        System.out.println("Invalid input.Please try again.");
      }

    } while (choice != 5);
  }

  public static void displayMenu() {
    System.out.println("========== Menu ==========");
    System.out.println("[1] Add Customer");
    System.out.println("[2] Purchase Vehicle");
    System.out.println("[3] Purchase Food");
    System.out.println("[4] Display Shopping List");
    System.out.println("[5] Exit");
    System.out.println("==========================");
    System.out.print("\nSelect task: ");
  }
}