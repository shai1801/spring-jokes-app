package springframework.guru.springjokesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springframework.guru.springjokesapp.service.GetJokeService;

@Controller
public class JokesController {
	
	private GetJokeService getJokeService;

	@Autowired
	public JokesController(GetJokeService getJokeService) {
		super();
		this.getJokeService = getJokeService;
	}
	
	@RequestMapping({"","/"})
	public String showJokes(Model model) {
		
		model.addAttribute("joke", getJokeService.getJokes());
		return "chucknorris";
	}
	
	
}
