import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTest {

  @Test
  public void testAddPositiveNumbers() {
    Add additionneur = new Add();
    int resultat = additionneur.add(5, 3);
    assertEquals(8, resultat, "La somme de 5 et 3 devrait être 8");
  }

  @Test
  public void testAddNegativeNumbers() {
    Add additionneur = new Add();
    int resultat = additionneur.add(-2, -4);
    assertEquals(-6, resultat, "La somme de -2 et -4 devrait être -6");
  }

  @Test
  public void testAddZero() {
    Add additionneur = new Add();
    int resultat = additionneur.add(0, 7);
    assertEquals(7, resultat, "La somme de 0 et 7 devrait être 7");
  }
}
