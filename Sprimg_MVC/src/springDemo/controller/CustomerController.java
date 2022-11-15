package springDemo.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springDemo.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// add an initbinder to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for our validation

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {
		// @Valid: Perform validation rules on Customer object
		// Results of validation placed in the BindingResult
		// if there is an error get back to the customer-form
		// else go the the validation
		System.out.println("Last Name: |" + theCustomer.getLastName() + "|");
		System.out.println("Binding result: " + theBindingResult);
		System.out.println("\n\n\n\n");
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}

	}

}
