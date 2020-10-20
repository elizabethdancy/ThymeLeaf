package ca.sheridancollege;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController 
{
	@GetMapping("/index")
	public String index(Model model)
	{
		model.addAttribute("serverDate", "today");
		return "index";
	}
	
	@PostMapping("/formPost")
	
	public String toWorking(@RequestParam String firstName,
			@RequestParam String lastName)
	{
		Student student= new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		System.out.println(student);
		return "working";
	}

}
