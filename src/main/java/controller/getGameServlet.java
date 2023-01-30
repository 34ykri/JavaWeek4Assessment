package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GenreToGame;


/**
 * Servlet implementation class getGameServlet
 */
@WebServlet("/getGameServlet")
public class getGameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getGameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String genre = request.getParameter("userGenre");
		GenreToGame gtg = new GenreToGame(genre);
		request.setAttribute("userGame", gtg);
		getServletContext().getRequestDispatcher("/gameResult.jsp").forward(request, response);	}

}
