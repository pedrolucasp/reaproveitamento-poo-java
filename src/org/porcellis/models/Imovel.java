package org.porcellis.models;

import org.porcellis.models.Endereco;
import org.porcellis.models.Portfolio;

public class Imovel implements Portfolio {
	private Endereco endereco;
	private double precoCotacao;
	private double precoVenda;
	private double areaUtil;

	public Imovel(Endereco endereco, double areaUtil, double precoCotacao, double precoVenda) {
		this.endereco = endereco;
		this.precoCotacao = precoCotacao;
		this.precoVenda = precoVenda;
		this.areaUtil = areaUtil;
	}

	@Override
	public double getITBI() {
		return precoVenda * 0.02;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public double getPrecoCotacao() {
		return precoCotacao;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setPrecoCotacao(double preco) {
		this.precoCotacao = preco;
	}

	public String toString() {
		return "Endereço: " + endereco + "\nPreço: " + precoCotacao;
	}
}
