
public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Marcos");
		gerente.setSalario(5000);
		
		EditorVideo editor = new EditorVideo();
		editor.setNome("Carol");
		editor.setSalario(2500);
		
		Designer designer = new Designer();
		designer.setNome("Elanine");
		designer.setSalario(2500);
		
		ControleBonus controle = new ControleBonus();
		controle.registra(gerente);
		controle.registra(editor);
		controle.registra(designer);
		

	}

}
