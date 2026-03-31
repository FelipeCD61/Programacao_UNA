import java.util.Scanner;
public class provaA1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Entrada
    System.out.print("Digite o ano a ser verificado: ");
    int ano = scanner.nextInt();

    //Processamento e Saída
    if (ano % 4 == 0 ) {
      if (ano % 100 == 0 && ano % 400 != 0 )
      System.out.printf("\nO ano " + ano + " não é bissexto");
      else
      System.out.printf("\nO ano " + ano + " é bissexto");
    } else {
      System.out.printf("\nO ano " + ano + " não é bissexto");
    }
        
    scanner.close();
  }
}