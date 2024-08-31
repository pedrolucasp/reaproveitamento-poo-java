package org.porcellis.models;

public class Casa extends Imovel {
	private double tamanhoDoTerreno;

	public Casa(Endereco endereco, double areaUtil, double precoCotacao, double
			precoVenda, double tamanhoDoTerreno) {
		super(endereco, areaUtil, precoCotacao, precoVenda);

		this.tamanhoDoTerreno = tamanhoDoTerreno;
	}

	public double getTamanhoDoTerreno() {
		return tamanhoDoTerreno;
	}

	public void setTamanhoDoTerreno(double tamanhoDoTerreno) {
		this.tamanhoDoTerreno = tamanhoDoTerreno;
	}

	public String toString() {
		return super.toString() + "\nTamanho do Terreno: " + tamanhoDoTerreno;
	}
}
