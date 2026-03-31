import java.util.Scanner;
public class ListaTresExercicioCinco {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

    System.out.println("O programa irá imprimar números ímpares entre 1 e 50:\n");    
  
    for (int num = 1; num <= 50; num++) {
      if (num % 2 == 1) {
        System.out.printf(num + " | "); //Coloquei "|" para oraganização
      }
    }

    sc.close();
  }
}