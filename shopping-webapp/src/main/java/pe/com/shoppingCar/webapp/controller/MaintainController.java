package pe.com.peruInka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MaintainController {

	@RequestMapping(value = "maintain/customer", method = RequestMethod.GET)
	public String customer(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "customer");
		return "maintain/customer";
	}

	@RequestMapping(value = "maintain/enterprice", method = RequestMethod.GET)
	public String enterprice(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "enterprice");
		return "maintain/enterprice";
	}

	@RequestMapping(value = "maintain/product", method = RequestMethod.GET)
	public String product(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "product");
		return "maintain/product";
	}

	@RequestMapping(value = "maintain/user", method = RequestMethod.GET)
	public String user(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "maintain");
		request.getSession().setAttribute("menuHeaderChild", "user");
		return "maintain/user";
	}

}
