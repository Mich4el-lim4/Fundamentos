
public class Administrador extends Funcionario implements Autenticavel{

	private int senha;
	
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
	
	@Override
	public double bonus() {
		return 50;
	}
}
