package org.porcellis.controllers;

import org.porcellis.models.Imovel;
import org.porcellis.views.ImovelView;

public class ImovelController {
	private Imovel imovel;
	private ImovelView imovelView;

	public ImovelController(Imovel imovel, ImovelView imovelView) {
		this.imovel = imovel;
		this.imovelView = imovelView;
	}

	public void mostrarDetalhesImovel() {
		imovelView.mostrarDetalhesImovel(imovel);
	}
}
