package curso.entity;

import javax.persistence.Entity;

@Entity
public class Endereco {
	private String cep;
	private String rua;
	private String numero;
	private String complemento1;
	private String complemento2;
	private String cidade;
	private String estado;
	private String bairro;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento1() {
		return complemento1;
	}
	public void setComplemento1(String complemento1) {
		this.complemento1 = complemento1;
	}
	public String getComplemento2() {
		return complemento2;
	}
	public void setComplemento2(String complemento2) {
		this.complemento2 = complemento2;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
}
