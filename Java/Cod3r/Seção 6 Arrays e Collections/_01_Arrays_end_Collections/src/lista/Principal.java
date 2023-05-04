package lista;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Diego"));
		lista.add(new Usuario("Marcia"));
		lista.add(new Usuario("Guilherme"));
		
		System.out.println(lista.get(3));
		
		for(Usuario u : lista) {
			System.out.println(u);
		}

	}

}
