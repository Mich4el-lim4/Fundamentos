package baytebank2Employee;

public class Gerente extends Funcionario implements Autenticavel{
	
	private int percentageBonus;
	private CheckPassword toCheck;
	
	public Gerente() {
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
		this.percentageBonus = percentage;
		
	}

	@Override
	public double getPercentageBonus() {
		return percentageBonus;
	}
}
