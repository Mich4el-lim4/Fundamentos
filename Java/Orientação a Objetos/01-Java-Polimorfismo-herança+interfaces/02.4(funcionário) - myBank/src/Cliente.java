
public class Cliente implements Autenticavel {
	
	private String nome;
	private Validation autenticador;
	
	public Cliente() {
		this.autenticador = new Validation();
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
