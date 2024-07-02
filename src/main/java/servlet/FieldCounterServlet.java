package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FieldCounterServlet")
public class FieldCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Integer count;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// 訪問回数を初期化
		count = 0;
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// 訪問回数を増加
		count++;
	}

}
