public class Add {
    public int add(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    Add additionneur = new Add();
    int resultat = additionneur.add(5, 3);
    System.out.println("La somme est : " + resultat);
  }
}
