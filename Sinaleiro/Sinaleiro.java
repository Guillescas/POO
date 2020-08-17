public class Sinaleiro {
  public int MudaProximaCor() { // That's ok hehe
    int cor = 2;

    switch (cor) {
      case 2:
        cor = 0;
        break;
      case 0:
        cor = 1;
        break;
      case 1:
        cor = 2;
        break;
    }

  public static int MudaCorFixa(int cor) {
    if (cor == 2) {
      cor = 0;
    } else if (cor == 0) {
      cor = 1;
    } else if (cor == 1) {
      cor = 2;
    }
  }

  public static String MostraCor() {
    String results = "A cor é ";
    return results;
  }
}