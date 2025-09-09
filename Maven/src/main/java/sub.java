public class Sub {
    public int sub(int a, int b) {
    return a - b;
  }

  public static void main(String[] args) {
    Sub substraction = new Sub();
    int resultat = substraction.sub(5, 3);
    System.out.println("La soustraction est : " + resultat);
  }
}
