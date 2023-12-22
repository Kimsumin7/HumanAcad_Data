package com.human.ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.command.DeletePrint;
import com.human.command.IDBPring;
import com.human.command.InsertPrint;
import com.human.command.selectPrint;
import com.human.command.updatePrint;

/**
 * Servlet implementation class SAll
 */
@WebServlet("*.do")
public class SAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * http://localhost:8081/05frontcontroller/select.do
	 * select.do
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String viewPage = "home.jsp";
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String command = uri.substring(conPath.length());
		
		IDBPring i=null;
		if(command.equals("/insert.do")){
			System.out.println("insert.do");
			viewPage = "home.jsp";
			
			i=new InsertPrint();
			i.execute(request, response);
			
			
		}else if(command.equals("/update.do")){
			System.out.println("update.do");
			i=new updatePrint();
			i.execute(request, response);
			
		}else if(command.equals("/select.do")){
			System.out.println("select.do");
			i=new selectPrint();
			i.execute(request, response);
			
		}else if(command.equals("/delete.do")){
			System.out.println("delete.do");
			i=new DeletePrint();
			i.execute(request, response);
			
		}else{
		viewPage = "home.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
