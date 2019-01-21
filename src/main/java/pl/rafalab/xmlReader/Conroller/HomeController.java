package pl.rafalab.xmlReader.Conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("/")
	@ResponseBody
	public String getHome(){

		return "siema from xml reader, Michał jest paker";
	}
}
