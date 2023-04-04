
public class TestaContaComExceptionChecked {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.deposita();
		} catch(MinhaException excption) {
			System.out.println("tratamento");
		}
	}

}
