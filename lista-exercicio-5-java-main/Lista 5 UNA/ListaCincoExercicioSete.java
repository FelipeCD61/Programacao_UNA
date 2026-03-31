import java.util.Scanner;
public class ListaCincoExercicioSete {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número a ser analisado: ");
    float numero = scanner.nextFloat();
    System.out.println("P = positivo | N = Negativo ou zero");

    retorno(numero);

    scanner.close();
  }
  
  public static void retorno(float numero) {
    
    if (numero > 0) {
      System.out.print("\nP");
    } else {
      System.out.print("\nN");
    } 
  }
}