
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;

	public double bonus() {
		return super.getSalario();
	}
	
	@Override
	public boolean authenticate(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
