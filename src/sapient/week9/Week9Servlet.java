package sapient.week9;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Week9Servlet
 */
@WebServlet("/Week9Servlet")
public class Week9Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Week9Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String currentRoute = request.getServletPath();
		
		if(currentRoute.equals("/getEmps")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("employees.jsp");
			dispatcher.forward(request,response);
		}
		else if(currentRoute.equals("/getCustomer")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("customers.jsp");
			dispatcher.forward(request,response);
		}
		else if(currentRoute.equals("/getProducts")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("products.jsp");
			dispatcher.forward(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
