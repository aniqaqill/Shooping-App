public class Vehicle extends Product implements Taxable {
  private String type;

  public Vehicle(String type, double price, String description) {
    super(description, price);
    this.type = type;
  }

  public double calcTax() {
    return getPrice() * TaxRate;
  }

  public double calcPrice() {
    return getPrice() + calcTax();
  }

  public String dispInfo() {

    return ("Description: " + getDescription() + "\n" + "Type: " + this.type + "\n" + "Price before tax:RM "
        + getPrice() + "\n" + "Price after tax:RM " + this.calcPrice() + "\n" + "The tax levied:RM " + this.calcTax()
        + "\n");
  }
}
