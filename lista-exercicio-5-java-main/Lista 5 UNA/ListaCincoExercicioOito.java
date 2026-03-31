import java.util.Scanner;
public class ListaCincoExercicioOito {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a porcentagem do imposto sobre as vendas (20 = 20%): ");
    float taxaImposto = scanner.nextFloat();
    System.out.print("Digite o valor das vendas: R$");
    float custo = scanner.nextFloat();
    
    System.out.printf("\nO novo valor das vendas é: R$%.2f", somaImposto(taxaImposto, custo));

    scanner.close();
  }
  public static float somaImposto(float taxaImposto, float custo) {
    return ((taxaImposto/100) + 1)* custo;
  }
}