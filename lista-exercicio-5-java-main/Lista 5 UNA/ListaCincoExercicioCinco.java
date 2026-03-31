import java.util.Scanner;
public class ListaCincoExercicioCinco {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();
    
    gerador(numero);

    scanner.close();
  }

  public static void gerador(int numero){
    for (int contador = 1; contador <= numero; contador++) {
      for (int contadorVerificar = 1; contadorVerificar <= contador; contadorVerificar++){
      System.out.printf(contador + " ");
      }
    System.out.println();  
    }
  }       
}
