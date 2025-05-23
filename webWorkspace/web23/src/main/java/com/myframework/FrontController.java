package com.myframework;

import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	Logger logger = Logger.getLogger(this.getClass().getCanonicalName());

	java.util.Map<String, Controller> handlerMapping = new java.util.HashMap<>();
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		Enumeration<String> enu = config.getInitParameterNames();
		
		System.out.println("��ü ����");
//		java.util.Map<String, String> map = new java.util.HashMap<>();
//		map.put("/index", "com.my.controller.IndexController");
//		map.put("/main", "com.my.controller.MainController");
//		map.put("/bbs/list", "com.my.controller.ListController");
//		map.put("/bbs/insert", "com.my.controller.InsertController");

//		Set<Entry<String, String>> set = map.entrySet();
//		Iterator<Entry<String, String>> ite = set.iterator();
		while (enu.hasMoreElements()) {
			String url = enu.nextElement();
			String val = config.getInitParameter(url);
			try {
				Class clz = Class.forName(val);
				handlerMapping.put(url, (Controller) clz.newInstance());
//				controller = (Controller) clz.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}

	}

	protected void doDo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		logger.info(req.getRequestURL().toString());
		logger.info(req.getContextPath());
		String url = req.getRequestURI();
//		url = url.replace(req.getContextPath(), "");
		url = url.substring(req.getContextPath().length());

//		String info = map.get(url);

//		if (url.equals("/index")) {
////			controller = new IndexController();
//			info = "com.my.controller.IndexController";
//		} else if (url.equals("/main")) {
////			controller = new MainController();
//			info = "com.my.controller.MainController";
//		} else if (url.equals("/bbs/list")) {
////			controller = new ListController();
//			info = "com.my.controller.ListController";
//		} else if (url.equals("/bbs/insert")) {
////			controller = new InsertController();
//			info = "com.my.controller.InsertController";
//		}

		Controller controller = handlerMapping.get(url);
		if (controller == null) {
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
			return;
		}

		String result = controller.execute(req, resp);
		if (result.startsWith("redirect:")) {
//			result = result.replace("redirect:", "");
			resp.sendRedirect(result.substring("redirect:".length()));
		} else {
			String prefix = "/WEB-INF/views/";
			String suffix = ".jsp";
			String viewName = prefix + result + suffix;
			req.getRequestDispatcher(viewName).forward(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doDo(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doDo(req, resp);
	}
}
