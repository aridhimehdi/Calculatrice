package calcu_Pkg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculatrice
 */
@WebServlet("/calculatrice")
public class calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculatrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op1 = request.getParameter("op1");
		String op2 = request.getParameter("op2");
		String operation = request.getParameter("operation");
		String page ="";
		if(op1.equals("")||op2.equals("")||(!op1.matches("[0-9]*"))||(!op2.matches("[0-9]*"))||(operation ==null)) {
			page = "error.jsp";
		}else {
			page="reponse.jsp";
		}
		RequestDispatcher dispInf = request.getRequestDispatcher(page);
		dispInf.forward(request, response);
		
		
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
