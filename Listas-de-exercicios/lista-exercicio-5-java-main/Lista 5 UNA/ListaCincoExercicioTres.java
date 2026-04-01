import java.util.Scanner;
public class ListaCincoExercicioTres {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

    System.out.print("Escreva uma temperatura em graus Fahrenhenit(F°): ");
      int fahrenhenit = scanner.nextInt();

    System.out.printf("\nEssa temperatura em graus centígrados é: %.2f°C", conversorTemp(fahrenhenit));

    scanner.close();
  }

  public static float conversorTemp(int fahrenhenit) {
    return (fahrenhenit - 32) / 1.8f;
  }
}