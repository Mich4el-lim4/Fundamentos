import java.util.Locale;
import java.util.Scanner;

public class InteiroStringDoubleCharEndConversion {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int y;
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);
		
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Voce digitou: " + z);
		
		double f;
		f = sc.nextDouble();
		System.out.printf("Voce digitou: %.2f%n", f);
		
		char g;
		g = sc.next().charAt(0);
		System.out.println("Voce digitou: " + g);
		
		String d;
		int r;
		double s;
		d = sc.next();
		r = sc.nextInt();
		s = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(d);
		System.out.println(r);
		System.out.println(s);

		sc.close();
	}

}
