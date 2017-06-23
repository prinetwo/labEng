package curso.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import curso.entity.Contato;

@ManagedBean
@SessionScoped
public class ContatoMB {
	
	private String nome;
	private String nascimento;
	private String cpf;
	private String telefone;
	private String celular;
	private String email;
	
	private List<Contato> contatos = new ArrayList<Contato>();

	private Contato contatoAtual;

	public String salvar() {
		contatoAtual = new Contato();
		contatoAtual.setCpf(cpf);
		contatoAtual.setNome(nome);
		contatoAtual.setNascimento(nascimento);
		contatoAtual.setTelefone(telefone);
		contatoAtual.setCelular(celular);
		contatoAtual.setEmail(email);
		System.out.println("salvando contato:" + contatoAtual.getNome());
		if(nome.equals("Vendramel") || nome.equals("Wendramel") || nome.equals("vendramel") || nome.equals("wendramel"))
			System.out.println("REPROVADO! DIRETO SEM D� E SEM CUSPE! FAZ AS LISTAS? -14");
		return "/endereco?faces-redirect=true";
	}
	
	
	public String consultar() {
		return "";
	}
	
	public String excluir(){
		return "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public Contato getContatoAtual() {
		return contatoAtual;
	}

	public void setContatoAtual(Contato contatoAtual) {
		this.contatoAtual = contatoAtual;
	}
	
	
	
	
	
}
