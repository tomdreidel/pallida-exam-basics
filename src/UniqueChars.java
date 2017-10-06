import java.util.ArrayList;

public class UniqueChars {
  public static void main(String[] args) {
    // Create a function called `uniqueCharacters` that takes a string as parameter
    // and returns a list with the unique letters of the given string
    // Create basic unit tests for it with at least 3 different test cases
    System.out.println(uniqueCharacters("anagram"));
    // Should print out:
    // ["n", "g", "r", "m"]
  }

  public static ArrayList<String> uniqueCharacters(String anagram) {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<String> banned = new ArrayList<>();
    for (int i = 0; i < anagram.length(); i++) {
      if (result.contains(anagram.substring(i, i + 1))) {
        banned.add(anagram.substring(i, i + 1));
        result.remove(anagram.substring(i, i + 1));
      }
      else if (!result.contains(anagram.substring(i, i + 1)) && !banned.contains(anagram.substring(i, i + 1))){
        result.add((anagram.substring(i, i + 1)));
      }
    }
    return result;
  }
}