package pe.com.peruInka.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.com.peruInka.service.services.PeruInkaService;
import pe.com.shoppingCar.core.domain.Person;
import pe.com.shoppingCar.core.domain.StatusPerson;
import pe.com.shoppingCar.core.domain.TypeDocument;

@Controller
public class DashboardController {

	@Autowired
	private PeruInkaService peruInkaService;

	@RequestMapping(value = "homeAjax/searchPerson", method = RequestMethod.GET)
	public @ResponseBody List<Person> searchStudent(@RequestParam String name) {
		
		System.out.println("name>>> "+name);
		
		return peruInkaService.findPersonByName(name);
	}

	@RequestMapping(value = "home/dashboard", method = RequestMethod.GET)
	public String homeDashboard(Model model, HttpServletRequest request) {
		model.addAttribute("listPerson", peruInkaService.findAllPerson());

		request.getSession().setAttribute("menuHeader", "home");
		request.getSession().setAttribute("menuHeaderChild", "");

		System.out.println("home/dashboard");

		return "home/dashboard";
	}

	@RequestMapping(value = "home/deletePerson", method = RequestMethod.GET)
	public String deletePerson(Model model, HttpServletRequest request, @RequestParam("id_") Long id) {
		System.out.println("home/deletePerson");
		peruInkaService.deletePerson(id);
		return "redirect:dashboard";
	}

	@RequestMapping(value = "home/frmPerson", method = RequestMethod.GET)
	public String newPerson(Model model, HttpServletRequest request) {
		model.addAttribute("person", new pe.com.shoppingCar.core.domain.Person());
		model.addAttribute("opc", "new");

		// model.addAttribute("typeDocument",peruInkaService.findTypeDocument());

		return "home/frmPerson";
	}

	@ModelAttribute("typeDocument")
	public List<TypeDocument> typeDocumentList() {
		return peruInkaService.findTypeDocument();
	}

	@ModelAttribute("statusPerson")
	public List<StatusPerson> statusPersonList() {
		return peruInkaService.findStatusPerson();
	}

	@RequestMapping(value = "home/savePerson", method = RequestMethod.POST)
	public String savePerson(Model model, HttpServletRequest request,
			@ModelAttribute("person") pe.com.shoppingCar.core.domain.Person person) {
		// String id = request.getParameter("id");
		// String name = request.getParameter("name");
		// String lastNameP = request.getParameter("lastNameP");
		String opc = request.getParameter("opc");
		if (opc.equals("new")) {
			peruInkaService.savePerson(person);
		} else {
			// peruInkaService.updatePerson(person);
		}

		return "redirect:dashboard";
	}

	@RequestMapping(value = "home/editPerson", method = RequestMethod.GET)
	public String editPerson(Model model, HttpServletRequest request, @RequestParam("id_") Long id) {
		model.addAttribute("person", peruInkaService.searchPerson(id));
		model.addAttribute("opc", "update");
		return "home/frmPerson";
	}

	
	@RequestMapping(value = "homeAjax/editPerson", method = RequestMethod.POST)
	public String homeAjaxEditPerson(Model model, HttpServletRequest request, @RequestParam("id") Long id) {
		model.addAttribute("person", peruInkaService.searchPerson(id));

		System.out.println("hola mundo");
		
		return "home/frmPersonAjax";
	}
	
	
	// @RequestMapping(value = "/home/searchJsonById/{id}", method =
	// RequestMethod.GET, headers = "Accept=application/json")
	// public @ResponseBody String searchJsonById(@PathVariable("id") Long id) {
	//
	//
	// Person person = new Person();
	// person.setName("Juan");
	//// list.add(person);
	//
	// return "Return value::: " + id;
	// }
	//
	// @RequestMapping(value = "/home/searchXMLById/{id}", method =
	// RequestMethod.GET, headers = "Accept=application/xml")
	// public @ResponseBody String searchXMLById(@PathVariable("id") Long id) {
	//
	// return "Return value::: " + id;
	// }

}
