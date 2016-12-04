package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Endereco;
import service.ConsultaCEPService;


@WebServlet("/consultaCEP")
public class ConsultaCEP extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
  
    public ConsultaCEP() {}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cep = request.getParameter("cep");
		
		ConsultaCEPService ccs = new ConsultaCEPService();
		Endereco endereco = null;
		
		try {
			endereco = ccs.consulaEnderecoPorCEP(cep);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
//		response.setContentType("text/plain");
        response.getWriter().write("atualizaEndereco("
        		+ "'" + endereco.getLogradouro() + "', "
        				+ "'" + endereco.getBairro() + "', "
        						+ "'" + endereco.getCidade() + "', "
        								+ "'" + endereco.getEstado() + "'"
        				+ ")");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
