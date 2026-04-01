import java.util.Scanner;
public class Questao4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor do capital a ser aplicado:");
     double C = sc.nextDouble();
    System.out.println("Digite o prazo de aplicação em meses:");
     double n = sc.nextDouble();
    System.out.println("Digite a taxa de juros mensal(20% = 20):");
     double i = sc.nextDouble();

    //Aqui eu parti a operação e finalizei no final do programa//
    double I = (i / 100 + 1);
    double m = Math.pow(I,n);
    double M = (C * m);

    //Aqui coloquei uma divisória//
    System.out.println("-------------------------------------");
    System.out.printf("O montante a ser recebido é de: R$ %.2f", M);

    sc.close();
  }
}
