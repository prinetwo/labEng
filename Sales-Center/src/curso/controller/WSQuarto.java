package curso.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import curso.dao.HotelDAO;
import curso.dao.HotelDAOImpl;
import curso.entity.Quarto;

/**
 * Servlet implementation class WSQuarto
 */
@WebServlet("/WSQuarto")
public class WSQuarto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WSQuarto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String numero = request.getParameter("NUMERO");
		HotelDAO hDao = new HotelDAOImpl();
		List<Quarto> quartos = hDao.pesquisarPorNumero(numero);
//		for (Quarto q : quartos) { 
//			out.println(q.getId() + "," + q.getNumero() + "," + q.getTipo() + "," + 
//							q.getDescricao() + "," + q.getPreco() + "," + q.getArea());
//		}
		Gson gson = new Gson();
		String textoJson = gson.toJson(quartos);
		out.println( textoJson );
		
	}

}
