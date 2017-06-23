package curso.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import curso.entity.Contato;
import curso.entity.Credito;
import curso.entity.Endereco;
import curso.entity.Faturamento;

@ManagedBean
@SessionScoped
public class CreditoMB {
	
	private String plano;
	private int quantidade;
	private String responsavel;
	private Credito credito;
	private String nome;
	
	public String salvar() {
		credito = new Credito();
		credito.setPlano(plano);
		credito.setQuantidade(quantidade);
		credito.setResponsavel(responsavel);
		credito.setNome(nome);
		System.out.println("salvando análise de crédito");
		return "/contatoConta?faces-redirect=true";
	}
	
	public String consultar() {
		return "";
	}
	
	public String excluir(){
		return "";
	}
	
	
	public String getPlano() {
		return plano;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	
	
}
