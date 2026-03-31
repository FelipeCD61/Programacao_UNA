import java.util.Scanner;
public class Questao2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o valor do produto:");
    double valor = sc.nextDouble();

    //Aqui coloquei uma linha divisória//
    System.out.println("-------------------------------------------");
    
    System.out.printf("O novo valor do produto é:" + valor * 1.1);  

    sc.close();
  }
}