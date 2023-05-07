package baytebank1Employee;

public class Teste {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		Funcionario editor = new VideoEditor();
		BonosControl control = new BonosControl();
		
		editor.setNome("Eduardo ricardo");
		editor.setCpf("124.342.123-43");
		editor.setSalario(2500);
		
		gerente.setNome("Paulo ricardo");
		gerente.setCpf("124.534.123-43");
		gerente.setSalario(1000);
		gerente.setSenha(2222);
		
		control.control(editor);
		control.control(gerente);
		
		System.out.println(gerente.getBonus());
		System.out.println(editor.getBonus());

	}

}
