import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

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
      System.out.println("\nUsage: java FavouriteAnimals [animal] [animal] ...\n");
    } else {
      System.out.println(storeAnimals(args));
    }
  }

  private static String storeAnimals(String[] args) {
    Path filePath = Paths.get("/Users/tamasredly/greenfox/gf-exams/exam-1-live/pallida-exam-basics/favouriteanimals/favourites.txt");
    ArrayList<String> myAnimals = new ArrayList<>();
    for (int i = 0; i < args.length; i++) {
      if (!myAnimals.contains(args[i])) {
        myAnimals.add(args[i]);
      }
    }

    if (!Files.exists(filePath)) {
      try {
        Files.createFile(filePath);
      } catch (IOException e) {
        return "\nCould not create file\n";
      }
    }

    try {
      Files.write(filePath, myAnimals);
    } catch (IOException e) {
      return "\nCould not write file\n";
    }
    return "\nYour favourite animal" + ((myAnimals.size() > 1) ? "s" : "") + " have been placed to favourites.txt\n";
  }
}