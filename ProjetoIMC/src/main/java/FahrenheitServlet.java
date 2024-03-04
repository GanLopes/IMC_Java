

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FahrenheitServlet
 */
public class FahrenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FahrenheitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Double celsius = Double.parseDouble(request.getParameter("celsius"));
		Double fahrenheit = (celsius * 1.8) + 32;
		
		PrintWriter saida = response.getWriter();
		
		saida.print("<html lang=\"pt-br\"><head><meta charset=\"UTF-8\"><title> Conversor - Celsius para Fahrenheit</title></head><body>"
				+ "O valor convertido para fahrenheit é " + fahrenheit +" </body></html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Double fahrenheit = Double.parseDouble(request.getParameter("fahrenheit"));
		Double celsius = (fahrenheit - 32)/1.8;
		
		PrintWriter saida = response.getWriter();
		
		saida.print("<html lang=\"pt-br\"><head><meta charset=\"UTF-8\"><title> Conversor - Fahrenheit para Celsius</title></head><body>"
				+ "O valor convertido para celsius  é " + celsius +" </body></html>");
		
	}

}
