package curso.dao;

import java.util.List;

import curso.entity.Usuario;

public interface UsuarioDAO {
	void adicionar(Usuario u);
	List<Usuario> pesquisarPorUsuario(String cpf);
}
