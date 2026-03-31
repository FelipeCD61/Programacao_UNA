import java.util.Scanner;
public class ListaCincoExercicioNove {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número com no mínimo dois algarismos (Exemplo: 21): ");
    int numero = scanner.nextInt();

    System.out.printf("\nO reverso desse número é ");
    reverso(numero);

    scanner.close();
  }
  
  public static void reverso(int numero) {

    while (numero >= 0) {
      int algarismo = numero % 10;
      numero /= 10;
      System.out.printf("" + algarismo);

      if (numero == 0)
        break;
    }
  }
}