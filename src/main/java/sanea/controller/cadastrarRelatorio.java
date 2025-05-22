package sanea.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import sanea.model.Reclamacoes;
import sanea.model.Usuario;

import java.io.IOException;

/**
 * Servlet implementation class cadastrarRelatorio
 */
@WebServlet("/cadastrarRelatorio")
public class cadastrarRelatorio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cadastrarRelatorio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		
System.out.println("REQUISICAO CHAMADA");
		
		Reclamacoes relatorio = new Reclamacoes();
		
		
		HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("userId") != null) {
            String UserId = (String) session.getAttribute("userId");
             relatorio.setIdUsuario(Integer.parseInt(UserId));
             
		relatorio.setDescricao(request.getParameter("descricao"));
		relatorio.setIdTipoProblema(1);
		String problema = request.getParameter("tipo_de_problema");
		
		switch (problema) {
		}
		}
		
		
		usuario.setTelefone(request.getParameter("telefone"));
		usuario.setCpf(request.getParameter("cpf"));
		usuario.setSenha(request.getParameter("senha"));
		
		System.out.println(usuario.getNome());
		System.out.println(usuario.getEmail());
		System.out.println(usuario.getTelefone());
		System.out.println(usuario.getCpf());
		System.out.println(usuario.getSenha());
		relatorio.cadastrar();
	}

}
