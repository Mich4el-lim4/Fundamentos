package baytebank2Employee;

public class Cliente implements Autenticavel{
	
	private CheckPassword toCheck;
	
	public Cliente() {
		this.toCheck = new CheckPassword();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.toCheck.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.toCheck.setSenha(senha);
		
	}

}
