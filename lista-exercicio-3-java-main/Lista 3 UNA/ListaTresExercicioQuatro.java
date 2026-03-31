import java.util.Scanner;
public class ListaTresExercicioQuatro {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    double n1, n2, n3 ,n4 ,n5, soma, media;
    String wish;

    while (true) {
      System.out.print("\nDigite o 1° número: ");
      n1 = sc.nextDouble();
      System.out.print("Digite o 2° número: ");
      n2 = sc.nextDouble();   
      System.out.print("Digite o 3° número: ");
      n3 = sc.nextDouble();   
      System.out.print("Digite o 4° número: ");
      n4 = sc.nextDouble();   
      System.out.print("Digite o 5° número: ");
      n5 = sc.nextDouble();

      soma = n1 + n2 + n3 + n4 + n5;
      media = soma/5;

      System.out.printf("\nA soma dos números é " + soma + " e a média deles é %.2f.\n", media);

      System.out.println("\nSe quiser continuar, digite qualquer letra e para sair do loop, digite 'q'.");
      wish = sc.next(); 

      if (wish.equals("q")) { 
      System.out.println("\nVocê saiu da programação.");
      break;
      }
      //Aqui coloquei uma linha divisória
      System.out.println("------------------------------------------");
    }
    sc.close();        
  }
}