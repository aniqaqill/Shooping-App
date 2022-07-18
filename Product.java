public abstract class Product {
  private String description;
  private double price;

  public Product(String description, double price) {
    this.description = description;
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public abstract double calcPrice();

  public abstract String dispInfo();

}
