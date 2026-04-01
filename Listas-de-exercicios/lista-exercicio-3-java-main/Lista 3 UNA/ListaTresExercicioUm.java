import java.util.Scanner;
public class ListaTresExercicioUm {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int numero;

    while (true) {
      System.out.print("\nDigite uma nota entra 0 e 10: ");
      numero = sc.nextInt();     
      if (numero >= 0 && numero <= 10) {
        System.out.println("Digito válido.");
        break;
      }
      System.out.println("Digito inválido. Digite novamente.");
    }   
    
    sc.close();
  }
}
