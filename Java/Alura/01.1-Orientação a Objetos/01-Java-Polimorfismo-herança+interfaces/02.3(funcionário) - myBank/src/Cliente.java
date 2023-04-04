
public class Cliente implements Autenticavel {
	
	private String nome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
