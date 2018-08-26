package pl.techstyle.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pl.techstyle.Service.MainService;

@Controller
public class MainController {
	
	@Autowired
	MainService service;
	
	@GetMapping("/")
	public ModelAndView getMainPage() {
		ModelAndView m= new ModelAndView();
		m.addObject("persons",service.getAll());
		m.setViewName("index");
		return m;
	}
	
	@DeleteMapping("/person")
	public ModelAndView deletePerson(@RequestParam(value="id") int id) {
		ModelAndView m= new ModelAndView();
		service.deletePerson(id);
		m.addObject("persons",service.getAll());
		m.setViewName("index");
		return m;
	}
}
