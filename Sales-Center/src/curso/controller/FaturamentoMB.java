package curso.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import curso.entity.Contato;
import curso.entity.Endereco;
import curso.entity.Faturamento;

@ManagedBean
@SessionScoped
public class FaturamentoMB {
	
	private String formaPagamento;
	private String dataVencimento;
	private String canalDeVendas;
	private String responsavel;
	private String produto;
	private Faturamento faturamento;
	
	public String salvar() {
		faturamento = new Faturamento();
		faturamento.setCanalDeVendas(canalDeVendas);
		faturamento.setDataVencimento(dataVencimento);
		faturamento.setFormaPagamento(formaPagamento);
		faturamento.setProduto(produto);
		faturamento.setResponsavel(responsavel);
		
		System.out.println("salvando perfil de faturamento");
		return "/analiseCredito?faces-redirect=true";
	}
	
	
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getCanalDeVendas() {
		return canalDeVendas;
	}
	public void setCanalDeVendas(String canalDeVendas) {
		this.canalDeVendas = canalDeVendas;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}


	
	
}
