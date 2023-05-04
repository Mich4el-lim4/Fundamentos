package baytebank6encapsulationReferences;

public class Main {

	public static void main(String[] args) {

		Conta conta = new Conta();
		
		conta.setAgencia(132);
		conta.setNumero(12);
		conta.deposita(1000);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Michael");
		conta.setTitular(cliente);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfession("Programador");
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setCpf("000.324.112-93");
		System.out.println(conta.getTitular().getCpf());

	}

}
