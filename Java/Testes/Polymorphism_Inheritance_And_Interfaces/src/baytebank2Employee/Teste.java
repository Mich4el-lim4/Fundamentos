package baytebank2Employee;

public class Teste {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		Funcionario editor = new VideoEditor();
		Administrador administrador = new Administrador();
		
		BonosControl control = new BonosControl();
		SistemaInterno sistemaInterno = new SistemaInterno();
		
		editor.setNome("Eduardo ricardo");
		editor.setCpf("124.342.123-43");
		editor.setSalario(2500);
		editor.setPercentageBonus(10);
		
		administrador.setNome("Monark angelo");
		administrador.setCpf("198.534.490-43");
		administrador.setSalario(1000);
		administrador.setSenha(1111);
		
		sistemaInterno.autentica(administrador);
		
		gerente.setNome("Paulo ricardo");
		gerente.setCpf("124.534.123-43");
		gerente.setSalario(1000);
		gerente.setSenha(1111);
		gerente.setPercentageBonus(20);
		
		sistemaInterno.autentica(gerente);
		
		control.control(editor);
		control.control(gerente);
		
	}

}
