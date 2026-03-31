import java.util.Scanner;
public class ListaCincoExercicioSeis {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int numeroUm = scanner.nextInt();
    System.out.print("Digite o segundo número: ");
    int numeroDois = scanner.nextInt();
    System.out.print("Digite o terceiro número: ");
    int numeroTres = scanner.nextInt();

    int soma = calcularSoma(numeroUm, numeroDois, numeroTres);

    System.out.printf("\nA soma desses números é igual a: " + soma);
    
    scanner.close();
  }

  public static int calcularSoma(int numeroUm, int numeroDois, int numeroTres) {
    return numeroUm + numeroDois + numeroTres;
  }
}