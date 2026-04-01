import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        FileWriter arq = new FileWriter("C:\\Users\\Usuario\\Downloads\\Lista_9_UNA\\ExercicioUm\\alunos_universidade.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        String[] nomes = new String[5];
        double[] notasFinais = new double[5];

        System.out.println("Digite o nome e a nota final de cada aluno(a):");

        gravarArq.println("Dados dos alunos: ");

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o nome do " + (i + 1) + "° aluno: ");
            nomes[i] = scanner.nextLine();
        
            System.out.println("Digite a nota final do " + (i + 1) + "° aluno: ");
            notasFinais[i] = scanner.nextDouble();
    
            scanner.nextLine(); // Limpar o buffer do teclado
            System.out.println();
            
            gravarArq.print("Aluno: " + nomes[i]);
            gravarArq.print("\tNota Final: " + notasFinais[i]);
            gravarArq.println();
        }
        System.out.println("Dados salvos.");

        gravarArq.close();
        scanner.close();
        
        } catch (Exception e) {
            System.out.println("Deu algo errado.");
        } finally {
            System.out.println("Programa concluído.");
        }
    }
}
