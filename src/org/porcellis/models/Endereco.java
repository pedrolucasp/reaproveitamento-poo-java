package org.porcellis.models;

public class Endereco {
	// XXX: Não devia ser um enum?
	private String tipoLogradouro;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String complemento;

	public Endereco(String tipoLogradouro, String logradouro, String bairro,
			String cidade, String estado, String cep) {
		this.tipoLogradouro = tipoLogradouro;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.complemento = "";
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getCep() {
		return cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String toString() {
		return "Logradouro: " + logradouro + "\nBairro: " + bairro + "\nCidade: " + cidade + "\nEstado: " + estado + "\nCEP: " + cep;
	}
}
