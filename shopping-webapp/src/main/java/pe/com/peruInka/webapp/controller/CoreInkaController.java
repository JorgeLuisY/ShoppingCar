package pe.com.peruInka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.core.domain.Ticket;
import pe.com.peruInka.service.services.PeruInkaService;

@Controller
public class CoreInkaController {

	@Autowired
	private PeruInkaService peruInkaService;

	@RequestMapping(value = "core/ticket", method = RequestMethod.GET)
	public String coreticket(Model model, HttpServletRequest request) {

		request.getSession().setAttribute("menuHeader", "ticket");
		request.getSession().setAttribute("menuHeaderChild", "");

		model.addAttribute("listTicket", peruInkaService.findTicketAll());

		return "core/ticket";
	}

	@RequestMapping(value = "core/frmTicket", method = RequestMethod.GET)
	public String coreFrmTicket(Model model, HttpServletRequest request) {
		model.addAttribute("ticket", new Ticket());
		return "core/frmTicket";
	}

	@RequestMapping(value = "core/editTicket", method = RequestMethod.GET)
	public String coreEditTicket(Model model, HttpServletRequest request, @RequestParam("id") Long id) {
		model.addAttribute("ticket", peruInkaService.findTicketById(id));
		return "core/frmTicket";
	}

	@RequestMapping(value = "core/deleteTicket", method = RequestMethod.GET)
	public String coreDeleteTicket(Model model, HttpServletRequest request, @RequestParam("id") Long id) {
		peruInkaService.deleteTicket(id);
		return "redirect:ticket";
	}

	@RequestMapping(value = "core/saveTicket", method = RequestMethod.POST)
	public String coreSaveTicket(Model model, HttpServletRequest request,
			@ModelAttribute("Ticket") Ticket ticket) {
		
		
		
		peruInkaService.saveTicket(ticket);
		return "redirect:ticket";
	}

}
