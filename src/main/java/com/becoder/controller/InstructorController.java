//package com.becoder.controller;
//
//import java.util.List;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.becoder.dao.UserDao;
//import com.becoder.entity.Recipe;
//import com.becoder.entity.User;
//import com.becoder.entity.indian;
//import com.becoder.entity.request;
//@Controller
//@RequestMapping("/user/")
//public class UserController {
//
//	@Autowired
//	private UserDao userDao;
//
//	
//	 
//	 @RequestMapping("/view_beverages")
//		public String view_beverages(HttpSession session, Model m) {
//			
//			List<Recipe> recipe = userDao.getRecipe();
//			m.addAttribute("list",recipe);
//			return "view_beverages";
//		}
//	 @RequestMapping("/view_indian")
//		public String view_indian(HttpSession session, Model m) {
//			
//			List<indian> indian = userDao.getindian();
//			m.addAttribute("list",indian);
//			return "view_indian";
//		}
//
//	 @RequestMapping("/logout")
//		public String logout(HttpSession session) {
//
//			session.removeAttribute("userObj");
//			session.setAttribute("msg", "Logout Successful");
//			return "home";
//		}
//	 
//	 
//	 
//	 @RequestMapping(path = "/saveRequest", method = RequestMethod.POST)
//		public String saveRequest(@ModelAttribute request n, HttpSession session) {
//			
//			
//			userDao.saveRequest(n);
//			session.setAttribute("msg", "Request Added sucessfully");
//
//			return "redirect:/user/addRequest";
//		}
//	
//
//	 
//
//	
//	 @RequestMapping(value="/addRequest")
//	    public String addRequest() {
//	        // Handle beverages logic
//		 
//	        return "addRequest"; // Return the view name
//	    }
//	
//	 
//
//	}





//
//package com.becoder.controller;
//
//import java.util.List;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.becoder.dao.UserDao;
//import com.becoder.entity.Instructor;
//import com.becoder.entity.User;
//import com.becoder.entity.Request;
//
//@Controller
//@RequestMapping("/user/")
//public class UserController {
//
//    @Autowired
//    private UserDao userDao;
//
//    @RequestMapping("/view_instructors")
//    public String viewInstructors(HttpSession session, Model model) {
//        List<Instructor> instructors = userDao.getInstructors();
//        model.addAttribute("list", instructors);
//        return "view_instructors";
//    }
//
//    @RequestMapping("/logout")
//    public String logout(HttpSession session) {
//        session.removeAttribute("userObj");
//        session.setAttribute("msg", "Logout Successful");
//        return "home";
//    }
//
//    @RequestMapping(path = "/saveRequest", method = RequestMethod.POST)
//    public String saveRequest(@ModelAttribute Request request, HttpSession session) {
//        userDao.saveRequest(request);
//        session.setAttribute("msg", "Request Added successfully");
//        return "redirect:/user/addRequest";
//    }
//
//    @RequestMapping(value = "/addRequest")
//    public String addRequest() {
//        return "addRequest"; // Return the view name
//    }
//
//}
//






package com.becoder.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.becoder.dao.InstructorDao;
import com.becoder.dao.UserDao;
import com.becoder.entity.Instructor;
import com.becoder.entity.Recipe;
import com.becoder.entity.Course;
import com.becoder.entity.Student;
import com.becoder.entity.indian;





@Controller
@RequestMapping("/user/")
public class InstructorController {

    @Autowired
    private InstructorDao instructorDao;
    
    private UserDao userDao;
    
    private static final String FIXED_EMAIL = "fixed@example.com";
    private static final String FIXED_PASSWORD = "password123";
    
    @RequestMapping("/view_instructors")
    public String viewInstructors(HttpSession session, Model model) {
        List<Instructor> instructors = instructorDao.getInstructors();
        model.addAttribute("list", instructors);
        return "view_instructors";
    }

//    @RequestMapping("/logout")
//    public String logout(HttpSession session) {
//        session.removeAttribute("instructorObj");
//        session.setAttribute("msg", "Logout Successful");
//        return "home";
//    }
//    
    
    @RequestMapping(path = "/loginWriter", method = RequestMethod.GET)
    public String showRegisterForm(Model model) {
        model.addAttribute("instructor", new Instructor());
        return "loginWriter";
    }

    @RequestMapping(path = "/loginWriter", method = RequestMethod.POST)
    public String registerInstructor(@ModelAttribute Instructor instructor, HttpSession session) {
        instructorDao.saveInstructor(instructor);
        session.setAttribute("msg", "Instructor Registered Successfully");
        return "redirect:/loginUserWriter";
    }
    
 

    
    
//
//    @RequestMapping(path = "/loginUserWriter", method = RequestMethod.POST)
//    public String loginUserwriter(@RequestParam("email") String email, @RequestParam("password") String password,
//                            HttpSession session) {
//
//        // Check if the provided email and password match the fixed combination
//        if (email.equals(FIXED_EMAIL) && password.equals(FIXED_PASSWORD)) {
//            // If matched, create a dummy User object and set it in session
//            User fixedUser = new User();
//            fixedUser.setEmail(email);
//            fixedUser.setPassword(password);
//            session.setAttribute("userObj", fixedUser);
//            return "WriterProfile"; // Redirect to profile page or wherever you want
//        } else {
//            // If not matched, show login failed message
//            session.setAttribute("msg", "Login Failed. Please use the correct email and password.");
//            return "redirect:/loginWriter";
//        }
//    }
    
    @RequestMapping(path = "/loginUserWriter", method = RequestMethod.POST)
    public String loginUserWriter(@RequestParam("email") String email, @RequestParam("password") String password,
                            HttpSession session) {

        // Check if the provided email and password match the fixed combination
        if (email.equals(FIXED_EMAIL) && password.equals(FIXED_PASSWORD)) {
            // If matched, create a dummy Instructor object and set it in session
            Instructor instructor = new Instructor();
            instructor.setEmail(email);
            instructor.setPassword(password);
            // Set other instructor details as needed
            instructor.setName("Dummy Name"); // You might fetch this from the database later
            // Call the service method to save the instructor
            instructorDao.saveInstructor(instructor);
            session.setAttribute("instructorObj", instructor);
            return "WriterProfile"; // Redirect to profile page or wherever you want
        } else {
            // If not matched, show login failed message
            session.setAttribute("msg", "Login Failed. Please use the correct email and password.");
            return "redirect:/loginWriter"; // Redirect to the writer login page
        }
    }	
    
    
	 
	 @RequestMapping("/view_beverages")
		public String view_beverages(HttpSession session, Model m) {
			
			List<Recipe> recipe = userDao.getRecipe();
			m.addAttribute("list",recipe);
			return "view_beverages";
		}
	 @RequestMapping("/view_indian")
		public String view_indian(HttpSession session, Model m) {
			
			List<indian> indian = userDao.getindian();
			m.addAttribute("list",indian);
			return "view_indian";
		}

	 @RequestMapping("/logout")
		public String logout(HttpSession session) {

			session.removeAttribute("userObj");
			session.setAttribute("msg", "Logout Successful");
			return "home";
		}
	 











    @RequestMapping(path = "/saveRequest", method = RequestMethod.POST)
    public String saveRequest(@ModelAttribute Course request, HttpSession session) {
        // Logic to save request
        session.setAttribute("msg", "Request Added successfully");
        return "redirect:/user/addRequest";
    }

    @RequestMapping(value = "/addRequest")
    public String addRequest() {
        return "addRequest"; // Return the view name
    }


}
