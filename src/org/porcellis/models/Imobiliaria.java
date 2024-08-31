package org.porcellis.models;

public class Imobiliaria implements Portfolio {
	private String razaoSocial;
	private String cnpj;
	private double previsaoFaturamento;

	public Imobiliaria(String razaoSocial, String cnpj) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.previsaoFaturamento = 0;
	}

	@Override
	public double getITBI() {
		return previsaoFaturamento * 0.02;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public double getPrevisaoFaturamento() {
		return previsaoFaturamento;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setPrevisaoFaturamento(double previsaoFaturamento) {
		this.previsaoFaturamento = previsaoFaturamento;
	}

	public String toString() {
		return "Razão Social: " + razaoSocial + "\nCNPJ: " + cnpj + "\nPrevisão de Faturamento: " + previsaoFaturamento;
	}
}
