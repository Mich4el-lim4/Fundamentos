package baytebank2Employee;

public class Administrador extends Funcionario implements Autenticavel{

	private int percentage;
	private CheckPassword toCheck;
	
	public Administrador() {
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

	@Override
	public void setPercentageBonus(int percentage) {
		this.percentage = percentage;
		
	}

	@Override
	public double getPercentageBonus() {
		return percentage;
	}

}
