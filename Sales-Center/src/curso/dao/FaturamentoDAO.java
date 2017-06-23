package curso.dao;

import java.util.List;

import curso.entity.Faturamento;

public interface FaturamentoDAO {
	void adicionar(Faturamento c);
	List<Faturamento> pesquisarPorProduto(String faturamento);
}
