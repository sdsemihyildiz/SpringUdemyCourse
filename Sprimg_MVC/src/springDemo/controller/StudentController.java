package springDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springDemo.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		// create a new student object

		// add student object to the model
		theModel.addAttribute("student", new Student());

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		// log the input data
		System.out.println("The student: " + theStudent.getFirstName() + " " + theStudent.getLastName() + " from "
				+ theStudent.getCountry());
		System.out.println("Student's favorite language: " + theStudent.getFavoriteLanguage());
		return "student-confirmation";
	}

}
