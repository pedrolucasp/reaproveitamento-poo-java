package org.porcellis.views;

import org.porcellis.models.Imovel;

public class ImovelView {
	public void mostrarDetalhesImovel(Imovel imovel) {
		System.out.println(imovel.toString());
	}

	public void mostrarITBI(Imovel imovel, double itbi) {
		System.out.println(
			"O ITBI do imóvel " + imovel.getEndereco().getLogradouro() + " é: " + imovel.getITBI()
		);
	}
}
