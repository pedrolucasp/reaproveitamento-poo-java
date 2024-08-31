package org.porcellis.models;

public class Apartamento extends Imovel {
	private String nomeCondominio;

	public Apartamento(Endereco endereco, double areaUtil, double precoCotacao, double
			precoVenda, String nomeCondominio) {
		super(endereco, areaUtil, precoCotacao, precoVenda);

		this.nomeCondominio = nomeCondominio;
	}

	public String getNomeCondominio() {
		return nomeCondominio;
	}

	public void setNomeCondominio(String nomeCondominio) {
		this.nomeCondominio = nomeCondominio;
	}

	public String toString() {
		return super.toString() + "\nNome do Condomínio: " + nomeCondominio;
	}
}
