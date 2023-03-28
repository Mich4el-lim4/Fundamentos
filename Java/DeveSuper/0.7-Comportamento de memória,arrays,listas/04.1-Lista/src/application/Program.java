package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2, "Marcos");
		
		for(String nomeNaLista : list) {
			System.out.println(nomeNaLista);
		}
		
		System.out.println(list.size());
		
		list.remove("Anna");
		list.remove(1);
		
	}

}
