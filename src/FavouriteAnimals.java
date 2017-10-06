
public class FavouriteAnimals {
  public static void main(String[] args) {
    // The program's aim is to collect your favourite animals and store them in a text file.
    // There is a given text file called '''favourites.txt''', it will contain the animals
    // If ran from the command line without arguments
    // It should print out the usage:
    // ```java FavouriteAnimals [animal] [animal]```
    // You can add as many command line arguments as many favourite you have.
    // One animal should be stored only at once
    // Each animal should be written in separate lines
    // The program should only save animals, no need to print them

    if (args.length == 0) {
      System.out.println("Usage: java FavouriteAnimals [animal] [animal] ...");
    }
    else if (args.length == 1) {
      System.out.println("Your favourite animal have been placed to favourites.txt");
      storeAnimals(args);
    }
    else {
      System.out.println("Your favourite animals have been placed to favourites.txt");
      storeAnimals(args);
    }
  }

  private static void storeAnimals(String[] args) {

    int argsCount = args.length;
    
  }
}