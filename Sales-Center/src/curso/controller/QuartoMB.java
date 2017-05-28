package curso.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import curso.dao.HotelDAO;
import curso.dao.HotelDAOImpl;
import curso.entity.Quarto;

@ManagedBean
@SessionScoped
public class QuartoMB {
	
	private List<Quarto> quartos = new ArrayList<Quarto>();
	
	private Quarto quartoAtual = new Quarto();
	
	private HotelDAO hotelDAO = new HotelDAOImpl();
	
	public String salvar() {
		System.out.println("salvando quarto numero : " + quartoAtual.getNumero());
		hotelDAO.adicionar(quartoAtual);
		quartoAtual = new Quarto();
		return "quarto";
	}
	
	public String pesquisar() { 
		quartos = hotelDAO.pesquisarPorNumero( quartoAtual.getNumero() );
		return "quarto";
	}
	
	public Quarto getQuartoAtual() {
		return quartoAtual;
	}
	public void setQuartoAtual(Quarto quartoAtual) {
		this.quartoAtual = quartoAtual;
	}

	public List<Quarto> getQuartos() {
		return quartos;
	}
	public void setQuartos(List<Quarto> quartos) {
		this.quartos = quartos;
	}

}
