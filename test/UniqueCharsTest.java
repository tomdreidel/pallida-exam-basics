import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class UniqueCharsTest {
  UniqueChars testUnique = new UniqueChars();
  ArrayList<String> testString;

  @Before
  public void setUp() throws Exception {
    testString = new ArrayList<>(Arrays.asList("n", "g", "r", "m"));
  }

  @Test
  public void test_1() throws Exception {
    assertEquals(testString, testUnique.uniqueCharacters("anagram"));
  }

  @Test
  public void test_2() throws Exception {
    assertEquals(testString, testUnique.uniqueCharacters("enegrem"));
  }

  @Test
  public void test_3() throws Exception {
    assertEquals(testString, testUnique.uniqueCharacters("nagolloraeeffm11"));
  }
}