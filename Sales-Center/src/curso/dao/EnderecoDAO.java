package curso.dao;

import java.util.List;

import curso.entity.Endereco;

public interface EnderecoDAO {
	void adicionar(Endereco q);
	List<Endereco> pesquisarPorCep(String cep);

}
