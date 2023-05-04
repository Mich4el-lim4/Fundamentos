package baytebank3composition;

public class Main {

	public static void main(String[] args) {
		
		Cliente clienteUm = new Cliente();
		
		clienteUm.nome = "Michael";
		clienteUm.cpf = "123.342.543-01";
		clienteUm.profession = "Programador";
		
		Conta contaUm = new Conta();
		
		contaUm.agencia = 132;
		contaUm.numero = 12;
		contaUm.deposita(1000);
		contaUm.titular = clienteUm;
		
		System.out.println(contaUm.titular.nome);
		System.out.println(clienteUm.nome);

	}

}
