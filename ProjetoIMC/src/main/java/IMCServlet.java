
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IMCServlet
 */
public class IMCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public IMCServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Double peso = Double.parseDouble(request.getParameter("peso"));
		Double altura = Double.parseDouble(request.getParameter("altura"));
		Double IMC = peso / (Math.pow(altura, 2));
		String biotipo = "";

		if (IMC < 18.5) {
			biotipo = "Magreza";
		} else if (IMC >= 18.5 && IMC < 25) {
			biotipo = "Peso normal";
		} else if (IMC >= 25 && IMC < 30) {
			biotipo = "Sobrepeso";
		} else if (IMC >= 30 && IMC < 35) {
			biotipo = "Obesidade G1";
		} else if (IMC >= 35 && IMC < 40) {
			biotipo = "Obesidade G2";
		} else {
			biotipo = "Obesidade G3";
		}

		PrintWriter saida = response.getWriter();

		saida.print(
				"<html lang=\"pt-br\"><head><meta charset=\"UTF-8\"><title>Resultado IMC</title></head><body>O valor calculado do IMC é "
						+ IMC + " e o biotipo classificado é " + biotipo + "</body></html>");

	}

}
