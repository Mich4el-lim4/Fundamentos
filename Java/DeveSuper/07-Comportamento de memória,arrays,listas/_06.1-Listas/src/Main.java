import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");
        lista.add(2, "Marco");

        System.out.println(lista.size());

        for (String x : lista) {
            System.out.println(x);
        }

        System.out.println("-----------------");
        //lista.remove(1);
        lista.removeIf(x -> x.charAt(0) == 'M');//function (lambda)

        for (String x : lista) {
            System.out.println(x);
        }
        System.out.println("-----------------");

        System.out.println("Index of Bob: " + lista.indexOf("Bob"));
        System.out.println("Index of Marco: " + lista.indexOf("Marco"));

        System.out.println("-----------------");

    }
}