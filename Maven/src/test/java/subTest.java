package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class subTest {

  @Test
  public void testSubPositiveNumbers() {
    Sub substraction = new Sub();
    int resultat = substraction.sub(5, 3);
    assertEquals(8, resultat, "La soustraction de 5 et 3 devrait être 2");
  }

  @Test
  public void testSubNegativeNumbers() {
    Sub substraction = new Sub();
    int resultat = substraction.sub(-2, -4);
    assertEquals(-6, resultat, "La soustraction de -2 et -4 devrait être 2");
  }

  @Test
  public void testSubZero() {
    Sub substraction = new Sub();
    int resultat = substraction.sub(0, 7);
    assertEquals(7, resultat, "La soustraction de 0 et 7 devrait être -7");
  }
}
