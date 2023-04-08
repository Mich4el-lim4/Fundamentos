import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vector size: ");
        int size = sc.nextInt();
        double[] vector = new double[size];

        double totalSum = 0.0;
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = sc.nextDouble();
            totalSum += vector[i];
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Value in position %d: %.2f\n", i + 1, vector[i]);
        }
        System.out.println("Total sum: " + totalSum);
        System.out.println("Average: " + totalSum / size);

        sc.close();
    }
}