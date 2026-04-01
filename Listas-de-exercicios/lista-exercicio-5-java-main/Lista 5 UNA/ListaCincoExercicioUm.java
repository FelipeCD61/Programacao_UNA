import java.util.Scanner;
public class ListaCincoExercicioUm {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    float numeroUm = scanner.nextFloat();
    System.out.print("Digite o segundo número: ");
    float numeroDois = scanner.nextFloat();

    float mediaAritmetica = calcularMediaAritmetica(numeroUm, numeroDois);
    
   System.out.printf("\nA média aritimética dos dois números é %.2f", mediaAritmetica);

    scanner.close();
  }

  public static float calcularMediaAritmetica(float numeroUm, float numeroDois) {
    return (numeroUm + numeroDois) / 2;
  }
}
