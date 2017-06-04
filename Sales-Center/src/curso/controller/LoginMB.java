package curso.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import curso.entity.Usuario;

@ManagedBean
@SessionScoped
public class LoginMB {

	private String txtUsuario;
	private String txtSenha;
	private Usuario usuarioAtual;
	
	public String logar() {
		String pagina = "login";
		
		if ("admin".equals(txtUsuario) && "123456".equals(txtSenha)) {
			pagina = "/index?faces-redirect=true";
			usuarioAtual = new Usuario();
			usuarioAtual.setEmail("wanderjunior@live.com");
			usuarioAtual.setNome("Wander Junior");
			usuarioAtual.setSenha(txtSenha);
			usuarioAtual.setUsuario(txtUsuario);
			usuarioAtual.setPerfil("admin");
			System.out.println("Login "+usuarioAtual.getNome());
		}
		
		return pagina;
	}
	
	public String sair() {
		usuarioAtual = null;
		return "login?faces-redirect=true";
	}
	
	public String getTxtUsuario() {
		return txtUsuario;
	}
	public void setTxtUsuario(String txtUsuario) {
		this.txtUsuario = txtUsuario;
	}
	
	public String getTxtSenha() {
		return txtSenha;
	}
	public void setTxtSenha(String txtSenha) {
		this.txtSenha = txtSenha;
	}

	public Usuario getUsuarioAtual() {
		return usuarioAtual;
	}
	public void setUsuarioAtual(Usuario usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}
}
