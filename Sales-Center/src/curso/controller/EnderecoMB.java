package curso.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import curso.entity.Contato;
import curso.entity.Endereco;

@ManagedBean
@SessionScoped
public class EnderecoMB {
	
	private String cep;
	private String rua;
	private String numero;
	private String complemento1;
	private String complemento2;
	private String cidade;
	private String estado;
	private String bairro;

	private Endereco enderecoAtual;

	public String salvar() {
		enderecoAtual = new Endereco();
		enderecoAtual.setBairro(bairro);
		enderecoAtual.setCep(cep);
		enderecoAtual.setCidade(cidade);
		enderecoAtual.setComplemento1(complemento1);
		enderecoAtual.setComplemento2(complemento2);
		enderecoAtual.setEstado(estado);
		enderecoAtual.setNumero(numero);
		enderecoAtual.setRua(rua);
		System.out.println("salvando endereco:" + enderecoAtual.getRua());
		if(numero.equals("0"))
			System.out.println("RUA DOS BOBOS NÚMERO ZERO... (8)");
		return "/perfilFaturamento?faces-redirect=true";
	}

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

	public Endereco getEnderecoAtual() {
		return enderecoAtual;
	}

	public void setEnderecoAtual(Endereco enderecoAtual) {
		this.enderecoAtual = enderecoAtual;
	}

	
	
}
