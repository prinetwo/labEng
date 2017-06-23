package curso.dao;

import java.util.List;

import curso.entity.Credito;

public interface CreditoDAO {
	void adicionar(Credito c);
	List<Credito> pesquisarPorNome(String nome);

}
