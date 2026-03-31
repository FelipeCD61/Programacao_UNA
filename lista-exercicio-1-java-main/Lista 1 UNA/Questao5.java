import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Número de horas que o funcionário trabalhou no mês:");
         double horas = sc.nextDouble();
        System.out.println("Valor recebido por hora de trabalho:");
         double valorhora = sc.nextDouble();
        System.out.println("Valor do salário família:");
         double family = sc.nextDouble();
        System.out.println("Número de filhos com idade menor que 14 anos:");
         double filhos = sc.nextDouble();

        //Aqui coloquei uma linha divisória//
        System.out.println("------------------------------------------------");

         double valorbruto = (horas * valorhora) + filhos * family;
        System.out.printf("O salário bruto a ser recebido por um funcionário em um mês é de: R$%.2f", valorbruto);

     sc.close();
    }
}
