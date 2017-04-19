package com.wh.lib.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wh.lib.domain.admin;
import com.wh.lib.service.adminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Resource
	private adminService adminService;

	@RequestMapping("/userlogin")
	public String toIndex(HttpServletRequest request,HttpServletResponse response, Model model) {
		String adminName = request.getParameter("name");
		String adminPass = request.getParameter("pass");
		admin admin = this.adminService.getadminbyName(adminName);

		String admin_check = admin.getAdPass();

		if (adminPass != null && adminPass.equals(admin_check)) {

			model.addAttribute("admin", admin);
			try {
				response.sendRedirect("context.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return "Username or Password is error!!";
	}

}
