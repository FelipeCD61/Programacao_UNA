import java.util.Scanner;
public class ListaCincoExercicioQuatro {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print(" Digite o 1° número: ");
    float numeroUm = scanner.nextFloat();
    System.out.print("Digite o 2° número: ");
    float numeroDois = scanner.nextFloat();
    System.out.print("Digite o 3° número: ");
    float numeroTres = scanner.nextFloat();

    float mediaAritmetica = calcularMediaAritmetica(numeroUm, numeroDois, numeroTres);
    float mediaHarmonica = calcularMediaHarmonica(numeroUm, numeroDois, numeroTres);
    float mediaGeometrica = calcularMediaGeometrica(numeroUm, numeroDois, numeroTres);

    System.out.printf("\nA média aritimética desses valores é: %.2f", mediaAritmetica);
    System.out.printf("\nA média harmônica desses valores é: %.2f", mediaHarmonica);
    System.out.printf("\nA média geométrica desses valores é: %.2f", mediaGeometrica);

    scanner.close();
  }

  public static float calcularMediaAritmetica(float numeroUm, float numeroDois, float numeroTres) {
   return (numeroUm + numeroDois + numeroTres) / 3; 
  }
  public static float calcularMediaHarmonica(float numeroUm, float numeroDois, float numeroTres) {
    return (3 / (1/numeroUm + 1/numeroDois + 1/numeroTres));
  }
  public static float calcularMediaGeometrica (float numeroUm, float numeroDois, float numeroTres) {
    return (float) Math.cbrt(numeroUm * numeroDois * numeroTres);
  }
}
