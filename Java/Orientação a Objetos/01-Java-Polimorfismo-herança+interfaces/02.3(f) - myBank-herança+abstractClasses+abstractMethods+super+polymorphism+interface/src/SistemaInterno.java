
public class SistemaInterno {
	
	private int senha = 2222;
	private boolean autenticou;
	
	public void nome(Funcionario diretoria) {
		if(autenticou) {
			System.out.println(diretoria.getNome());
			System.out.println();
		} 
	}
	
	public boolean authenticate(Autenticavel diretoriaEcliente) {
		autenticou = diretoriaEcliente.authenticate(this.senha);
		
		if(autenticou) {
			System.out.print("Logado com sucesso ");
			return true;
		} else {
			System.out.println("Senha errada");
			System.out.println();
			return false;
		}
	}
}
