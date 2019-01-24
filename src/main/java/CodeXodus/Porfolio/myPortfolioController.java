package CodeXodus.Porfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class myPortfolioController {
	
	
	@Autowired
	private myPortfolioRepository portfolioRepository;
	
	
	
	
	@GetMapping("index")
	public ModelAndView index(myPortfolio portfolio) {
		ModelAndView mv = new ModelAndView("portfolio/index");
		mv.addObject("portfolio", portfolioRepository.findAll());
		return mv;
	}
	
	
	

	@GetMapping("skills")
	public ModelAndView skills(myPortfolio portfolio) {
		ModelAndView mv = new ModelAndView("portfolio/skills");
		return mv;
	}
	
	//Shows the contact form for new customer to fillin in
	@GetMapping("contact")
	public ModelAndView newContactForm(myPortfolio portfolio) {
		ModelAndView mv = new ModelAndView("portfolio/contact");
		return mv;
	}
	
	
	//handles submission and saving of contacts
	@PostMapping("/contact")
	public ModelAndView newContactSubmission(myPortfolio portfolio) {
		ModelAndView mv = new ModelAndView("portfolio/result");
	    myPortfolio newSubmission = portfolioRepository.save(new myPortfolio(portfolio.getFirstName(),
	    		                                                          portfolio.getLastName(),
	    		                                                          portfolio.getPhoneNumber(),
	    		                                                          portfolio.getEmail(),
	    		                                                          portfolio.getYourMessage()));
		mv.addObject("newSubmission", newSubmission);
		return mv;
	} 

}
