package sanea.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import sanea.model.Usuario;

import java.io.IOException;

/**
 * Servlet implementation class loginUsuario
 */
@WebServlet("/loginUsuario")
public class loginUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		Usuario usuario = new Usuario();
		
		usuario.setEmail(request.getParameter("email"));
		usuario.setSenha(request.getParameter("senha"));
		
		String UserID = usuario.logar();
		
		
		
		HttpSession session = request.getSession();
		session.setAttribute("userId", UserID); // Armazena o ID do usuário
		session.setMaxInactiveInterval(1800);  // Define tempo de expiração: 30 minutos
		
		System.out.println("ID do USUARIO LOGADO: " + UserID);
		
	}

}
