package Trabalho2.Especialista;

import Trabalho2.Matematica.Retangulo;

public class EngenheiroCivil {
  public exibir_dados_pessoais() {
    private static String nome = "Oscar Neymar";
    private static int idade = 40;

    private static void exibir_dados_pessoais() {
      System.out.println( nome );
      System.out.println( idade + " anos");
    }

    public static void main(String[] args) {
      System.out.println(exibir_dados_pessoais());

      definir_lados(4.7, 8.2);

      System.out.println(area());
      System.out.println(perimetro());
    }
  }
}