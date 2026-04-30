package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sp.beans.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Mycontroller {
//	@RequestMapping(value="/helloPage",method=RequestMethod.GET)
	@GetMapping("/helloPage")
public ModelAndView openHelloPage() {
	System.out.println("OpenHelloPage !");
	ModelAndView mav = new ModelAndView();
	mav.setViewName("hello");
	return mav;
}
	@GetMapping("/about")
	public String openaboutus() {
		return "about";
	}
	@GetMapping("/myform")
	public String openmyform() {
		return "myform";
	}
	
//	@PostMapping("/submitform")
//	public String handelMyForm(HttpServletRequest req) {
//		String myname = req.getParameter("name1");
//		String myemail = req.getParameter("email1");
//		String myphone = req.getParameter("phone1");
//		System.out.println("Name:"+myname+"\n"+"Email:"+myemail+"\n"+"Phone no:"+myphone);
//		
//		return "profile";
//	}
	
//	
//	@PostMapping("/submitform")
//	public String handelMyForm(
//			
//			@RequestParam("name1") String myname,
//			@RequestParam("email1") String myemail,
//			@RequestParam("phone1") String myphone,
//			Model model
//			
//			
//			) {
////	String myname = req.getParameter("name1");
////	String myemail = req.getParameter("email1");
////		String myphone = req.getParameter("phone1");
//		model.addAttribute("model_name", myname);
//		model.addAttribute("model_email", myemail);
//		model.addAttribute("model_phone", myphone);
//		System.out.println("Name:"+myname+"\n"+"Email:"+myemail+"\n"+"Phone no:"+myphone);
//		
//		return "profile";
//	}
	

//	@PostMapping("/submitform")
//	public String handelMyForm(
//			
//			@RequestParam("name1") String myname,
//			@RequestParam("email1") String myemail,
//			@RequestParam("phone1") String myphone,
//			Model model
//			
//			
//			) {
//		User user = new User();
//		user.setEmail(myemail);
//		user.setName(myname);
//		user.setPhoneno(myphone);
////	String myname = req.getParameter("name1");
////	String myemail = req.getParameter("email1");
////		String myphone = req.getParameter("phone1");
////		model.addAttribute("model_name", myname);
////		model.addAttribute("model_email", myemail);
////		model.addAttribute("model_phone", myphone);
//		model.addAttribute("model_user", user);
//
//		System.out.println("Name:"+myname+"\n"+"Email:"+myemail+"\n"+"Phone no:"+myphone);
//		
//		return "profile";
//	}
	
	
	@PostMapping("/submitform")
	public String handelMyForm(@ModelAttribute User user) {
//		User user = new User();
//		user.setEmail(myemail);
//		user.setName(myname);
//		user.setPhoneno(myphone);
		System.out.println("Name:"+user.getName()+"\n"+"Email:"+user.getEmail()+"\n"+"Phone no:"+user.getPhoneno());
//	String myname = req.getParameter("name1");
//	String myemail = req.getParameter("email1");
//		String myphone = req.getParameter("phone1");
//		model.addAttribute("model_name", myname);
//		model.addAttribute("model_email", myemail);
//		model.addAttribute("model_phone", myphone);
//		model.addAttribute("model_user", user);

		
		return "profile";
	}
	
	
}
