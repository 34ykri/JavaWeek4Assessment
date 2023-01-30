package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmotionToMusic;

/**
 * Servlet implementation class getMusicServlet
 */
@WebServlet("/getMusicServlet")
public class getMusicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMusicServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String emotion = request.getParameter("userEmotion");
		EmotionToMusic etm = new EmotionToMusic(emotion);
		request.setAttribute("userMusic", etm);
		getServletContext().getRequestDispatcher("/musicResult.jsp").forward(request, response);	
		}	

}
