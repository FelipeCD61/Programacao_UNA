import java.util.Scanner;
public class ListaTresExercicioDois {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    String senha;

    System.out.print("\nDigite seu nome de usuário: ");
    String name = sc.next();
 
    while(true) {
      System.out.print("Digite sua senha: ");
      senha = sc.next();
      if (!senha.equals(name)) {
        break;
      }
      System.out.println("\nErro! A senha não pode ser igual ao seu nome de usuário.");
    }
    sc.close();
  }
}