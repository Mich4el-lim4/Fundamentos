
public class Gerente extends Funcionario {
	private int senha;
	
	public boolean authenticate(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double bonus() {
		return super.getSalario();
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
