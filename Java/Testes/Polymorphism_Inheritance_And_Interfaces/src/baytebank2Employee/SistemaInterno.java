package baytebank2Employee;

public class SistemaInterno {
	
	private int senha = 1111;
	
	public void autentica(Autenticavel funcionario) {
		boolean autenticou = funcionario.autentica(this.senha);
		if(autenticou) {
			System.out.println("Validado");
		} else {
			System.out.println("Invalido");
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
