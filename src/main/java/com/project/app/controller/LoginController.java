package com.project.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	private final static String LoginViewName = "login";
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return LoginViewName;
	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model) {
		model.addAttribute("error", "true");
		return LoginViewName;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model) {
		return LoginViewName;
	}
}
