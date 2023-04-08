import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o numero entre -1 e 10: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
