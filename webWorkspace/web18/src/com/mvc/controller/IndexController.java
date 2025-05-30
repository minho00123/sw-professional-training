package com.mvc.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController extends HttpServlet {
	// 주체가 누군지에 따라 다르게 설정 가능
//	Logger logger = Logger.getGlobal(); // root 관리자
//	Logger logger = Logger.getAnonymousLogger(); // 아무나
	Logger logger = Logger.getLogger("com.mvc.controller.IndexController"); // 클래스가 찍는 로거

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.setLevel(Level.WARNING);
		logger.log(Level.INFO, "call indexController...");
		RequestDispatcher rd = req.getRequestDispatcher("main.jsp");
		rd.forward(req, resp);
	}
}
