
public class Fluxo {

	public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaException ex) {//handling the error
        	String msg = ex.getMessage();
        	System.out.println("Aqui deu pepino 'Exception:'" + msg);
        	ex.printStackTrace();
        }
        	System.out.println("Fim do main");
    }

    private static void metodo1() {
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw new MinhaException("deu errado");
        
        //System.out.println("Fim do metodo2");
    }
}
