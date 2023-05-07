package baytebank2Employee;

public class VideoEditor extends Funcionario{

	private int percentage;

	@Override
	public void setPercentageBonus(int percentage) {
		this.percentage = percentage;
		
	}

	@Override
	public double getPercentageBonus() {
		return percentage;
	}

}
