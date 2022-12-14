package kr.co.softcampus.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.softcampus.model.Test02Service;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("*.mvc")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		System.out.println("HomeController");
		String url = request.getRequestURI();
//		System.out.println(url);
		String viewName = null;
		
		if(url.contains("main.mvc")) {
//			System.out.println("main.mvc 요청");
			viewName = "main.jsp";
			
		} else if(url.contains("test1.mvc")) {
//			System.out.println("test1.mvc 요청");
			String str01 = request.getParameter("data01");
			String str02 = request.getParameter("data02");
			
			int data01 = Integer.parseInt(str01);
			int data02 = Integer.parseInt(str02);
			int result = data01 + data02;
			
			request.setAttribute("result", result);
			
			viewName = "test1.jsp";
			
		} else if(url.contains("test2.mvc")) {
//			System.out.println("test2.mvc 요청");
			int result = Test02Service.minus(request);
			
			request.setAttribute("result", result);
			
			viewName = "test2.jsp";
		}
		
		RequestDispatcher dis = request.getRequestDispatcher(viewName);
		dis.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
