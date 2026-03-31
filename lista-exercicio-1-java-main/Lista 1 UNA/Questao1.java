import java.util.Scanner;
public class Questao1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    System.out.printf("Digite o primeiro número:");
     double n1 = sc.nextDouble();
    System.out.printf("Digite o segundo número:");
     double n2 = sc.nextDouble();
     //Aqui coloquei uma linha divisória//
    System.out.println("----------------------------------");

    double media = (n1 + n2)/2;

    System.out.println("A média aritmética de " + n1 + " e " + n2 + " é: " + media);
        
    sc.close();
  }
}