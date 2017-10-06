import java.util.ArrayList;

public class CandyShop extends ArrayList<Product> {
  int sugarLevel;
  int balance;
  static Candy CANDY;
  static Lollipop LOLLIPOP;

  public CandyShop(int sugar) {
    this.sugarLevel = sugar;
    this.balance = 0;
    CANDY = new Candy();
    LOLLIPOP = new Lollipop();
  }

  public void createSweets(Product product) {
    this.add(product);
    this.sugarLevel -= product.price;
  }

  public void sell (Product product, int number) {
    if (inventory(product) <= number) {
    }
    for (int i = 0; i < number; i++) {
      balance += product.price;
      this.remove(product);
    }
  }

  public void raise (int priceIncrease) {
    CANDY.price += priceIncrease;
    LOLLIPOP.price += priceIncrease;
  }

  public void buySugar(int sugarGrams) {
    this.sugarLevel += sugarGrams;
  }

  private int inventory(Product product) {
    int result = 0;
    for (Product sweet : this) {
      if (sweet.productID == product.productID) {
        result ++;
      }
    }
    return result;
  }

  @Override
  public String toString() {
    return "Inventory: " +
        inventory(CANDY) + ((inventory(CANDY) > 1) ? " candies, " : " candy, ") +
        inventory(LOLLIPOP) + ((inventory(LOLLIPOP) > 1) ? " lollipops, " : " lollipop, ") +
        "Income: " + balance + "$, " +
        "Sugar: " + sugarLevel +"gr";
  }
}