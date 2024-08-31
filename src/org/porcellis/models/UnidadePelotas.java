package org.porcellis.models;

public class UnidadePelotas extends Imobiliaria {
	private double taxaComissao;

	public UnidadePelotas(String razaoSocial, String cnpj, double taxaComissao) {
		super(razaoSocial, cnpj);

		this.taxaComissao = taxaComissao;
	}

	public double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}

	public String toString() {
		return super.toString() + "\nTaxa de Comissão: " + taxaComissao;
	}
}
