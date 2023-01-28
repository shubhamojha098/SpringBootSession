package springboot.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class SessionController {
	
	
	@GetMapping("/home")
	public String getSession(Model model,HttpSession httpSession) {
				List<String> msg=(List<String>)httpSession.getAttribute("msg");
				if (msg==null)
						{
								System.out.println(msg+"Welcome");
								msg=new ArrayList<>();
						}
				model.addAttribute("msg", msg);
				return "homepage";
	}
	
	
	@PostMapping("/persistsession")
	public String persistSessionData(@RequestParam("msg") String name,HttpServletRequest request) {
		List<String> message=(List<String>) request.getSession().getAttribute("msg");
		if (message==null) {
			message=new ArrayList<String>();
			request.getSession().setAttribute("mg", message);
		}else {
			message.add(name);
			request.getSession().setAttribute("msg", message);
		}
		return "redirect:/home";
	}
	
	
	@GetMapping("/destroy")
	public String destroySessionData(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/home";
	}
	
}
