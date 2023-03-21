
public class Designer extends Funcionario{
	
	private double adicional = 200;
	
	public double bonus() {
		return super.bonus() + adicional;
	}

	public double getAdicional() {
		return adicional;
	}

}
