import P1.*;

class clienteCalculadora {
  public static void main(String[] args) {
    int y = Calculadora.soma(2,2);

    System.out.println(y);

    int z = Calculadora.subtracao(2,2);

    System.out.println(z);

    System.out.println("Total de somas      = " + Calculadora.contadorAdicao);
    System.out.println("Total de Subtrações = " + Calculadora.contadorSubtracao);
  }
}
