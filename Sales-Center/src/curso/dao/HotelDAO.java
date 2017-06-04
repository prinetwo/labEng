package curso.dao;

import java.util.List;

import curso.entity.Contato;


public interface HotelDAO {
	
	void adicionar(Contato q);
	List<Contato> pesquisarPorCPF(String cpf);

}
