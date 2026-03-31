import java.util.Scanner;
public class ListaCincoExercicioDois {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o valor do produto: R$");
    float valor = scanner.nextFloat();

    System.out.printf("\nO novo valor do produto é: R$%.2f", acrescimoValor(valor));

    scanner.close();
  }

  public static float acrescimoValor (float valor) {
  return valor * 1.1f;
  }
}