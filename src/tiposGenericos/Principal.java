package tiposGenericos;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Cesta<Fruta> frutas = new Cesta<>();
		frutas.adiciona(new Fruta("Maca"));
		frutas.adiciona(new Fruta("Banana"));
		frutas.adiciona(new Fruta("Mamao"));
		frutas.adiciona(new Fruta("Pera"));
		frutas.adiciona(new Fruta("Jaca"));
		frutas.adiciona(new FrutaVermelha("Morango"));
		
		List<FrutaVermelha> vermelhas = new ArrayList<>(); 
		vermelhas.add(new FrutaVermelha("Amora"));
		vermelhas.add(new FrutaVermelha("Cereja"));
		
		frutas.adicionaTodos(vermelhas);
		
		while(frutas.temItems()) {
			System.out.println(frutas.retira());
		}
	}

}
