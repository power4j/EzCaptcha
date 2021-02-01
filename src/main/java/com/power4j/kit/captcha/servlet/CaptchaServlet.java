package com.power4j.kit.captcha.servlet;

import com.power4j.kit.captcha.utils.CaptchaUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 验证码servlet Created by 王帆 on 2018-07-27 上午 10:08.
 */
public class CaptchaServlet extends HttpServlet {

	private static final long serialVersionUID = -90304944339413093L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CaptchaUtil.out(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
