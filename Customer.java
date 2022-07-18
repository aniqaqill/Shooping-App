import java.util.Vector;

class Customer {
  private String name;
  private double totalPrice;
  private Vector<Product> productList;

  public Customer(String name) {
    this.name = name;
    this.totalPrice = 0;
    productList = new Vector<Product>();
  }

  public void purchase(Product product) {
    totalPrice += product.calcPrice();
    productList.add(product);
  }

  public String toString() {
    return "<<<" + name + "'s shopping list >>>" + "\n";
  }

  public int calcProductPurchased() {
    return productList.size();
  }

  public void show() {
    System.out.println("Number of product purchased" + productList.size() + "\n");
    for (int i = 0; i < productList.size(); i++) {
      System.out.println(productList.get(i).dispInfo() + "\n");
    }
    System.out.println("TOTAL PRICE : RM " + totalPrice + "\n");
  }

}
