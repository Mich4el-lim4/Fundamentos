package baytebank2Employee;

public class Designer extends Funcionario {

	private int percentageBonus;
	
	@Override
	public void setPercentageBonus(int percentage) {
		this.percentageBonus = percentage;
		
	}

	@Override
	public double getPercentageBonus() {
		return percentageBonus;
	}

}
