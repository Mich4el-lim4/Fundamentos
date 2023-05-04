package baytebank7buildersStatic;

public class Main {

	public static void main(String[] args) {

		Conta conta = new Conta(132, -312);
		Conta conta2 = new Conta(132, 312);
		Conta conta3 = new Conta(132, 12);
		
		
		conta.deposita(1000);
		conta3.deposita(2394);
		conta2.deposita(100);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Michael");
		conta.setTitular(cliente);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfession("Programador");
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setCpf("000.324.112-93");
		System.out.println(conta.getTitular().getCpf());
		
		System.out.println("Quantidade de contas abertas " + Conta.getTotal());

	}

}
