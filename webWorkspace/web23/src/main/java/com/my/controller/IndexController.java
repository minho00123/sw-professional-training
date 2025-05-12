package com.my.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.Controller;

public class IndexController implements Controller {

	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		return "index";
	}
}
