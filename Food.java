public class Food extends Product {
  private double quantity;

  public Food(String description, double price, double quantity) {
    super(description, price);
    this.quantity = quantity;
  }

  public double calcPrice() {
    return getPrice() * quantity;
  }

  public String dispInfo() {
    return ("Description: " + getDescription() + "\n" + "Price:RM " + getPrice() + "per KG" + "\n"
        + "Quantity: " + quantity + "\n" + "Subtotal price: " + calcPrice() + "\n");
  }
}
