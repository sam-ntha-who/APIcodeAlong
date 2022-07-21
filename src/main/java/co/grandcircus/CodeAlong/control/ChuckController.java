package co.grandcircus.CodeAlong.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.CodeAlong.service.ChuckApiService;



@Controller
public class ChuckController {

	@Autowired
	private ChuckApiService chuckService;
	
	@RequestMapping("/")
	public String chuckJokes(Model model) {

		model.addAttribute("jokes", chuckService.getRandomJokes(13));
		return "index";
	}
}
