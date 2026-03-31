import java.util.Scanner;
public class ListaTresExercicioTres {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    String nome, sexo, estado;
    double idade, salario;
    int caracter;
    
    while(true) {
      System.out.print("\nDigite seu nome: ");
      nome = sc.next();
      caracter = nome.length();
      if (caracter >= 3) {
        System.out.println("Nome válido.");
        break;
      }
      System.out.println("Erro! Seu nome tem menos de 3 caracteres. Digite novamente.");
    }
    //Aqui coloquei uma linha divisória
    System.out.println("-------------------------------------------------");
    
    while(true) {
      System.out.print("\nDigite sua idade: ");
      idade = sc.nextDouble();
      if (idade >= 0 && idade <= 150) {
        System.out.println("Idade válida.");
        break;
      }
      System.out.println("Idade inválida! Digite novamente.");
    }
    //Aqui coloquei uma linha divisória
    System.out.println("-------------------------------------------------");

    while(true) {
      System.out.print("\nDigite seu salário: R$");
      salario = sc.nextDouble();
      if (salario > 0) {
        System.out.println("Salário válido. ");
        break;
      }
      System.out.println("Salário inválido! Digite novamente.");
    }
    //Aqui coloquei uma linha divisória
    System.out.println("-------------------------------------------------");

    while(true) {
      System.out.print("\nDigite seu gênero('m' para masculino e 'f' para femino): ");
      sexo = sc.next();
      if (sexo.equals("f")) {
        System.out.println("Gênero válido. ");
        break;
      } else if (sexo.equals("m")) {
        System.out.println("Gênero válido. ");
        break;
      } else {
        System.out.println("Digito inválido! Digite novamente uma das opções. ");
      }
    }

    while(true) {
      System.out.println("\nDigite seu estado civil: \ns -  solteiro(a) \nc - casado(a) \nv - viúvo(a) \nd - divorciado(a)\n-------------------------------------------------"); //Aqui coloquei uma linha divisória
      estado = sc.next();
            
      if (estado.equals("s")) {
        System.out.println("Estado civil válido. ");
        break;
      } else if (estado.equals("c")) {
        System.out.println("Estado civil válido. ");
        break;
      } else if (estado.equals("v")) {
        System.out.println("Estado civil válido. ");
        break;
      } else if (estado.equals("d")) {
        System.out.println("Estado civil válido. ");
        break;
      } else {
        System.out.println("Digito inválido! Digite novamente uma das opções. ");
      }
    }   

    sc.close();
  }
}
