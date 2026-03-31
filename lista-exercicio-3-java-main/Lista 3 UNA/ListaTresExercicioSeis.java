import java.util.Scanner;
public class ListaTresExercicioSeis {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

    System.out.print("Digite o número inteiro: ");
    int numero1 = sc.nextInt();
    System.out.print("Digite outro número inteiro: ");
    int numero2 = sc.nextInt();
    System.out.println("Os números que estão no intervalo entre eles são: \n");

    while (numero1 > numero2) {
      System.out.printf((numero2 + 1) + " | ");
      numero2 ++;
      if (numero2 + 1 == numero1) 
        break;
    }
    while (numero2 > numero1) {
      System.out.printf((numero1 + 1) + " | ");
      numero1 ++;
      if (numero1 + 1 == numero2) 
        break;
    }
    
    sc.close();
  }
}