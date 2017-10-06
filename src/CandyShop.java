import java.util.ArrayList;

public class CandyShop {
  int sugarLevel;
  int balance;
  static Candy CANDY;
  static Lollipop LOLLIPOP;
  ArrayList<Product> storage;


  public CandyShop(int sugar) {
    this.sugarLevel = sugar;
    this.balance = 0;
    storage = new ArrayList<>();
    CANDY = new Candy();
    LOLLIPOP = new Lollipop();
  }


  public void createSweets(Product product) {
    storage.add(product);
    this.sugarLevel -= product.price;
  }

  public String sell (Product product, int number) {
    if (inventory(product) < number) {
      return "Sorry we only have " + number + ".";
    }
    for (int i = 0; i < number; i++) {
      storage.remove(product);
      balance += product.price;
    }
    return "Thanks";
  }

  public void raise (int priceIncrease) {
    CANDY.price += priceIncrease;
    LOLLIPOP.price += priceIncrease;
  }

  public void buySugar(int sugarGrams) {
    this.sugarLevel += sugarGrams;
  }

  public int inventory(Product product) {
    int result = 0;
    for (Product sweet : storage) {
      if (sweet.price == product.price) {
        result ++;
      }
    }
    return result;
  }
}