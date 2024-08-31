package org.porcellis;

import org.porcellis.models.Casa;
import org.porcellis.models.Endereco;

import org.porcellis.controllers.ImovelController;
import org.porcellis.views.ImovelView;

public class Main {
	public static void main(String[] args) {
		System.out.println("Olá!");

		Endereco enderecoCasa = new Endereco(
			"Rua",
			"Rua dos Bobos",
			"Laranjeiras",
			"Pelotas",
			"RS",
			"96001-970"
		);

		Casa casa = new Casa(enderecoCasa, 100.0, 100000.0, 120000.0, 200.0);

		Endereco enderecoApartamento = new Endereco(
			"Avenida",
			"Avenida dos Bobos",
			"Centro",
			"Porto Alegre",
			"RS",
			"90001-970"
		);

		Apartamento apartamento = new Apartamento(
			enderecoApartamento,
			100.0,
			100000.0,
			120000.0,
			200.0,
			10.0
		);

		ImovelView imovelView = new ImovelView();

		// XXX: Não seria melhor usar um for loop para iterar sobre os imóveis?
		ImovelController imovelController = new ImovelController(casa, imovelView);
		imovelController.mostrarDetalhesImovel();

		imovelController = new ImovelController(apartamento, imovelView);
		imovelController.mostrarDetalhesImovel();

		System.out.println("Tchau!");
	}
}
