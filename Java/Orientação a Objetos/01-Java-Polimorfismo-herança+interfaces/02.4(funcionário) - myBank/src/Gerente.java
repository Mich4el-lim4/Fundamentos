
public class Gerente extends Funcionario implements Autenticavel {
	
private Validation autenticador;
	
	public Gerente() {
		this.autenticador = new Validation();
	}

	public double bonus() {
		return super.getSalario();
	}
	
	@Override
	public boolean authenticate(int senha) {
		boolean autenticou = this.autenticador.authenticate(senha);
		return autenticou;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
}
