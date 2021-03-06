package com.pt.pires.controllers.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for unauthorized access to resources
 * @author André
 *
 */
@Controller
@Scope("session")
public class AccessDeniedController {
	
	@RequestMapping(value = "/accessDenied",method = RequestMethod.GET)
	public String accessDenied(Model model) {
		return "/normal/errors/accessDenied";
	}
	
}
