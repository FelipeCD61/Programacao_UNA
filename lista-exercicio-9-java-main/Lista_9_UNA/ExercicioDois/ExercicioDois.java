import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        FileWriter arq = new FileWriter("C:\\Users\\Usuario\\Downloads\\Lista_9_UNA\\ExercicioDois\\itens_supermercado.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        String[] nomes = new String[10];
        double[] valor = new double[10];

        System.out.println("Digite o nome e o valor de cada item do supermercado:");

        gravarArq.println("Dados dos itens do supermercado: ");

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite o nome do " + (i + 1) + "° item: ");
            nomes[i] = scanner.nextLine();
        
            System.out.println("Digite o valor do " + (i + 1) + "° item: ");
            valor[i] = scanner.nextDouble();
    
            scanner.nextLine(); // Limpar o buffer do teclado
            System.out.println();
            
            gravarArq.print("Item: " + nomes[i]);
            gravarArq.printf("\tValor: %.2f", valor[i]);
            gravarArq.println();
        }
        System.out.println("Itens salvos.");

        gravarArq.close();
        scanner.close();

        } catch (Exception e) {
            System.out.println("Deu algo errado.");
        } finally {
            System.out.println("Programa concluído.");
        }
    }
}
