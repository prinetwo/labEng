package curso.dao;

import java.util.List;

import curso.entity.Contato;


public interface ContatoDAO {
	
	void adicionar(Contato q);
	List<Contato> pesquisarPorCpf(String cpf);

}
