package curso.dao;

import java.util.List;

import curso.entity.Quarto;

public interface HotelDAO {
	
	void adicionar(Quarto q);
	List<Quarto> pesquisarPorNumero(String numero);

}
