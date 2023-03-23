
public class EditorVideo extends Funcionario{
	
	private double adicional = 100;
	
	public double bonus() {
		return super.bonus() + adicional;
	}

	public double getAdicional() {
		return adicional;
	}

}
