package curso.entity;

import javax.persistence.Entity;

@Entity
public class Faturamento {

	private String formaPagamento;
	private String dataVencimento;
	private String canalDeVendas;
	private String responsavel;
	private String produto;
	
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
