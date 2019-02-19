package pl.rafalab.xmlReader.Conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HomeController {

	@GetMapping("/")
	@ResponseBody
	public String getHome(){
		Date date = new Date();
		return "Server is working - "+date.toString();
	}
}
