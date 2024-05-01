//package com.becoder.controller;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.becoder.entity.User;
//
//import com.becoder.dao.UserDao;
//
//
//@Controller
//public class HomeController {
//	
//	
//	@Autowired
//	private UserDao userDao;
//
//
//    private static final String FIXED_EMAIL = "fixed@example.com";
//    private static final String FIXED_PASSWORD = "password123";
//	 
//	@RequestMapping("/home")
//	public String home() {
//        // Handle home logic
//    	
//        return "home"; // Return the view name
//    }
//
//    @RequestMapping("/login")
//    public String login() {
//        // Handle login logic
//        return "login"; // Return the view name
//    }
//
//    @RequestMapping("/register")
//    public String register() {
//        // Handle register logic
//        return "register"; // Return the view name
//    }
//    
//
//	@RequestMapping(path = "/registerUser", method = RequestMethod.POST)
//	public String registerUser(@ModelAttribute User user, HttpSession session) {
//
//		 System.out.println(user);
//
//	userDao.saveUser(user);
//	session.setAttribute("msg", "Register Sucessfully");
//
//		return "redirect:/register";
//	}
//
//	@RequestMapping(path = "/loginUser", method = RequestMethod.POST)
//	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password,
//			HttpSession session) {
//
//		User user = userDao.login(email, password);
//
//		if (user != null) {
//			session.setAttribute("userObj", user);
//			return "profile";
//		} else {
//			session.setAttribute("msg", "Invalid Email or Password . Please re-enter");
//			return "redirect:/login";
//		}
//
//	}
//	
//	
//	 @RequestMapping("/loginWriter")
//	    public String loginwriter() {
//	        // Handle login logic
//	        return "loginWriter"; // Return the view name
//	    }
//
//	    // Other existing methods remain unchanged
//
//	    @RequestMapping(path = "/loginUserWriter", method = RequestMethod.POST)
//	    public String loginUserwriter(@RequestParam("email") String email, @RequestParam("password") String password,
//	                            HttpSession session) {
//
//	        // Check if the provided email and password match the fixed combination
//	        if (email.equals(FIXED_EMAIL) && password.equals(FIXED_PASSWORD)) {
//	            // If matched, create a dummy User object and set it in session
//	            User fixedUser = new User();
//	            fixedUser.setEmail(email);
//	            fixedUser.setPassword(password);
//	            session.setAttribute("userObj", fixedUser);
//	            return "WriterProfile"; // Redirect to profile page or wherever you want
//	        } else {
//	            // If not matched, show login failed message
//	            session.setAttribute("msg", "Login Failed. Please use the correct email and password.");
//	            return "redirect:/loginWriter";
//	        }
//	    }
//	    @RequestMapping("/deleteAccount")
//	    public String deleteAccount(HttpSession session) {
//	        User user = (User) session.getAttribute("userObj");
//	        if (user != null) {
//	            userDao.deleteUser(user.getId()); // Assuming userDao has a method to delete user by ID
//	            session.invalidate(); // Invalidate the session after deletion
//	        }
//	        return "redirect:/login"; // Redirect to login page after deletion
//	    }
//
//
//}


//
//package com.becoder.controller;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.becoder.entity.User;
//import com.becoder.dao.UserDao;
//
//@Controller
//public class HomeController {
//
//    @Autowired
//    private UserDao userDao;
//
//    private static final String FIXED_EMAIL = "fixed@example.com";
//    private static final String FIXED_PASSWORD = "password123";
//
//    @RequestMapping("/home")
//    public String home() {
//        // Handle home logic
//        return "home"; // Return the view name
//    }
//
//    @RequestMapping("/login")
//    public String login() {
//        // Handle login logic
//        return "login"; // Return the view name
//    }
//
//    @RequestMapping("/register")
//    public String register() {
//        // Handle register logic
//        return "register"; // Return the view name
//    }
//
//    @RequestMapping(path = "/registerUser", method = RequestMethod.POST)
//    public String registerUser(@ModelAttribute User user, HttpSession session) {
//        userDao.saveUser(user);
//        session.setAttribute("msg", "Register Sucessfully");
//        return "redirect:/register";
//    }
//
//    @RequestMapping(path = "/loginUser", method = RequestMethod.POST)
//    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password,
//            HttpSession session) {
//        User user = userDao.login(email, password);
//        if (user != null) {
//            session.setAttribute("userObj", user);
//            return "profile";
//        } else {
//            session.setAttribute("msg", "Invalid Email or Password. Please re-enter");
//            return "redirect:/login";
//        }
//    }
//
//    @RequestMapping("/loginStudent")
//    public String loginStudent() {
//        // Handle login logic
//        return "loginStudent"; // Return the view name
//    }
//
//    @RequestMapping(path = "/loginUserStudent", method = RequestMethod.POST)
//    public String loginUserStudent(@RequestParam("email") String email, @RequestParam("password") String password,
//            HttpSession session) {
//        // Check if the provided email and password match the fixed combination
//        if (email.equals(FIXED_EMAIL) && password.equals(FIXED_PASSWORD)) {
//            // If matched, create a dummy User object and set it in session
//            User fixedUser = new User();
//            fixedUser.setEmail(email);
//            fixedUser.setPassword(password);
//            session.setAttribute("userObj", fixedUser);
//            return "StudentProfile"; // Redirect to profile page or wherever you want
//        } else {
//            // If not matched, show login failed message
//            session.setAttribute("msg", "Login Failed. Please use the correct email and password.");
//            return "redirect:/loginStudent";
//        }
//    }
//
//    @RequestMapping("/deleteAccount")
//    public String deleteAccount(HttpSession session) {
//        User user = (User) session.getAttribute("userObj");
//        if (user != null) {
//            userDao.deleteUser(user.getId()); // Assuming userDao has a method to delete user by ID
//            session.invalidate(); // Invalidate the session after deletion
//        }
//        return "redirect:/login"; // Redirect to login page after deletion
//    }
//}
//
//
//





package com.becoder.controller;

import java.util.List;
import java.util.Date;
	

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.becoder.entity.Course;
import com.becoder.entity.Instructor;
import com.becoder.entity.Recipe;
import com.becoder.entity.Student;
import com.becoder.entity.User;
import com.becoder.config.DatabaseConfig;
import com.becoder.dao.CourseDao;
import com.becoder.dao.InstructorDao;
import com.becoder.dao.StudentDao;
import com.becoder.dao.UserDao;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DatabaseConfig.class)





@Controller
public class StudentController {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private UserDao UserDao;
    
    @Autowired
    private InstructorDao instructorDao;
    
    @Autowired
    private CourseDao courseDao;
    
    
    


    private static final String FIXED_EMAIL = "fixed@example.com";
    private static final String FIXED_PASSWORD = "password123";
    
    
	 @RequestMapping("/view_beverages")
		public String view_beverages(HttpSession session, Model m) {
			
			List<Recipe> recipe = UserDao.getRecipe();
			m.addAttribute("list",recipe);
			return "view_beverages";
		}
//	 @RequestMapping("/view_indian")
//		public String view_indian(HttpSession session, Model m) {
//			
//			List<indian> indian = userDao.getindian();
//			m.addAttribute("list",indian);
//			return "view_indian";
//		}
	 
	 

    @RequestMapping("/home")
    public String home() {
        // Handle home logic
        return "home"; // Return the view name
    }

//    @RequestMapping("/login")
//    public String login() {
//        // Handle login logic
//        return "login"; // Return the view name
//    }

    @RequestMapping("/register")
    public String register() {
        // Handle register logic
        return "register"; // Return the view name
    }
    
    @RequestMapping("/editBeverages")
    public String editBeverages() {
        // Handle register logic
        return "editBeverages"; // Return the view name
    }
    
    

    @RequestMapping(path = "/registerUser", method = RequestMethod.POST)
    public String registerStudent(@ModelAttribute Student student, HttpSession session) {
    	
        studentDao.saveStudent(student);
        session.setAttribute("msg", "Register Successfully");
        return "redirect:/register";
    }

    @RequestMapping(path = "/loginUser", method = RequestMethod.POST)
    public String loginStudent(@RequestParam("email") String email, @RequestParam("password") String password,
            HttpSession session) {
        Student student = studentDao.login(email, password);
        if (student != null) {
            session.setAttribute("studentObj", student);
            return "profile";
        } else {
            session.setAttribute("msg", "Invalid Email or Password. Please re-enter");
            return "redirect:/login";
        }
    }
    
	 @RequestMapping("/loginWriter")
	    public String loginwriter() {
	        // Handle login logic
	        return "loginWriter"; // Return the view name
	    }
	 
	 
//	 @RequestMapping(path = "/loginUserWriter", method = RequestMethod.POST)
//	 public String loginUserwriter(@RequestParam("email") String email, @RequestParam("password") String password,
//	                               HttpSession session) {
//
//	     // Check if the provided email and password match any user in the database
//	     Student student = studentDao.findByEmailAndPassword(email, password);
//
//	     if (student != null) {
//	         // If a user is found, set the user object in the session
//	         session.setAttribute("userObj", student);
//	         
//	         // Retrieve the courses_taken column based on the student's email
////	         List<Course> coursesTaken = studentDao.getCoursesTakenByEmail(email);
////	         session.setAttribute("coursesTaken", coursesTaken);
//	         
//	         return "WriterProfile"; // Redirect to profile page or wherever you want
//	     } else {
//	         // If no user is found, show login failed message
//	         session.setAttribute("msg", "Login Failed. Please use the correct email and password.");
//	         return "redirect:/loginWriter";
//	     }
//	 }
	 
//	    public LoginController(StudentDao studentDao) {
//	        this.studentDao = studentDao;
//	    }
//	    
//	    @RequestMapping(path = "/loginUserWriter", method = RequestMethod.POST)
//	    public String loginUserWriter(@RequestParam("email") String email, @RequestParam("password") String password,
//	                                  HttpSession session, Model model) {
//
//	        // Check if the provided email and password match any user in the database
//	        Student student = studentDao.findByEmailAndPassword(email, password);
//
//	        if (student != null) {
//	            // If a user is found, set the user object in the session
//	            session.setAttribute("userObj", student);
//
//	            // Retrieve courses_taken for the logged-in student
//	            String coursesTaken = student.getCoursesTaken();
//
//	            // Add coursesTaken attribute to the model to display in the view
//	            model.addAttribute("coursesTaken", coursesTaken);
//
//	            return "WriterProfile"; // Redirect to profile page or wherever you want
//	        } else {
//	            // If no user is found, show login failed message
//	            model.addAttribute("msg", "Login Failed. Please use the correct email and password.");
//	            return "redirect:/loginWriter";
//	        }
//	    }
	    
	    

	 
	 
//	 @RequestMapping(path = "/loginUserWriter", method = RequestMethod.POST)
//	 public String loginUserwriter(@RequestParam("email") String email, @RequestParam("password") String password,
//	                         HttpSession session) {
//
//	     // Check if the provided email and password match any user in the database
//	     Student student = studentDao.findByEmailAndPassword(email, password);
//
//	     if (student != null) {
//	         // If a user is found, set the user object in the session
//	         session.setAttribute("userObj", student);
//	         return "WriterProfile"; // Redirect to profile page or wherever you want
//	     } else {
//	         // If no user is found, show login failed message
//	         session.setAttribute("msg", "Login Failed. Please use the correct email and password.");
//	         return "redirect:/loginWriter";
//	     }
//	 }
	 
	 @RequestMapping(path = "/loginUserWriter", method = RequestMethod.POST)
	 public String loginUserwriter(@RequestParam("email") String email, @RequestParam("password") String password,
	                          HttpSession session) {

	      // Check if the provided email and password match any user in the database
	      Student student = studentDao.findByEmailAndPassword(email, password);

	      if (student != null) {
	          // If a user is found, set the user object in the session
	          session.setAttribute("userObj", student);
	          // Pass the email as a parameter when redirecting to WriterProfile
	          return "redirect:/WriterProfile?email=" + email;
	      } else {
	          // If no user is found, show login failed message
	          session.setAttribute("msg", "Login Failed. Please use the correct email and password.");
	          return "redirect:/loginWriter";
	      }
	 }

	 
	 
	 
	 
	    @RequestMapping("/WriterProfile")
	    public String writerProfile(@RequestParam("email") String email, Model model) {
	        // Use the email to fetch the corresponding student object from the database
	        Student student = studentDao.findByEmail(email);

	        if (student != null) {
	            // If the student is found, extract the courses_taken attribute
	            String coursesTaken = student.getCoursesTaken();
	            
	            // Pass the courses_taken attribute to the view
	            model.addAttribute("coursesTaken", coursesTaken);
	            
	            return "WriterProfile"; // Return the view name
	        } else {
	            // If the student is not found, handle the error accordingly
	            model.addAttribute("error", "Student not found.");
	            return "redirect:/loginWriter";
	        }
	    }
	 
	 


//	 
//	 @RequestMapping("/WriterProfile")
//	 public String writerProfile(HttpSession session, Model model) {
//	     // Retrieve the logged-in student's email and password from the session
//	     String email = ((Student) session.getAttribute("userObj")).getEmail();
//	     String password = ((Student) session.getAttribute("userObj")).getPassword();
//	     
//	     // Use the email and password to fetch the corresponding student object from the database
//	     Student student = studentDao.findByEmailAndPassword(email, password);
//
//	     if (student != null) {
//	         // If the student is found, extract the courses_taken attribute
//	         String coursesTaken = student.getCoursesTaken();
//	         
//	         // Pass the courses_taken attribute to the view
//	         model.addAttribute("coursesTaken", coursesTaken);
//	         
//	         return "WriterProfile"; // Return the view name
//	     } else {
//	         // If the student is not found, handle the error accordingly
//	         session.setAttribute("error", "Student not found.");
//	         return "redirect:/loginWriter";
//	     }
//	 }

	 



	 
	 
//
//	    @RequestMapping(path = "/loginUserWriter", method = RequestMethod.POST)
//	    public String loginUserwriter(@RequestParam("email") String email, @RequestParam("password") String password,
//	                            HttpSession session) {
//
//	        // Check if the provided email and password match the fixed combination
//	        if (email.equals(FIXED_EMAIL) && password.equals(FIXED_PASSWORD)) {
//	            // If matched, create a dummy User object and set it in session
//	            User fixedUser = new User();
//	            fixedUser.setEmail(email);
//	            fixedUser.setPassword(password);
//	            session.setAttribute("userObj", fixedUser);
//	            return "WriterProfile"; // Redirect to profile page or wherever you want
//	        } else {
//	            // If not matched, show login failed message
//	            session.setAttribute("msg", "Login Failed. Please use the correct email and password.");
//	            return "redirect:/loginWriter";
//	        }
//	    }

	 
//	 
//	 @RequestMapping(path = "/loginUserWriter", method = RequestMethod.POST)
//	 public String loginUserWriter(@RequestParam("email") String email, @RequestParam("password") String password,
//	                         HttpSession session) {
//
//	     // Query the database to find the student with the provided email
//	     Student student = studentDao.findByEmail(email);
//
//	     // Check if the student exists and the provided password matches
//	     if (student != null && student.getPassword().equals(password)) {
//	         // If matched, set the student object in session
//	         session.setAttribute("studentObj", student);
//	         return "WriterProfile"; // Redirect to student dashboard or wherever you want
//	     } else {
//	         // If not matched, show login failed message
//	         session.setAttribute("msg", "Login Failed. Please use the correct email and password.");
//	         return "redirect:/loginWriter"; // Redirect back to the student login page
//	     }
//	 }
//
//    
    

    @RequestMapping("/deleteAccount")
    public String deleteAccount(HttpSession session) {
        Student student = (Student) session.getAttribute("studentObj");
        if (student != null) {
            studentDao.deleteStudent(student.getId()); // Assuming studentDao has a method to delete student by ID
            session.invalidate(); // Invalidate the session after deletion
        }
        return "redirect:/login"; // Redirect to login page after deletion
    }
    
//    
//    @PostMapping("/enrollCourse")
//    public String enrollCourse(@RequestParam("email") String email,
//                               @RequestParam("password") String password,
//                               @RequestParam("courseTitle") String courseTitle,
//                               RedirectAttributes redirectAttributes) {
//        // Check if student with provided email and password exists in the database
//        Student student = studentDao.findByEmailAndPassword(email, password);
//
//        if (student != null) {
//            // Update the student's courses_taken column with the new course title
//            String coursesTaken = student.getCoursesTaken();
//            if (coursesTaken == null || coursesTaken.isEmpty()) {
//                coursesTaken = courseTitle;
//            } else {
//                coursesTaken += ", " + courseTitle;
//            }
//            student.setCoursesTaken(coursesTaken);
//            studentDao.update(student);
//
//            // Redirect back to course list page with success message
//            redirectAttributes.addFlashAttribute("msg", "Course enrolled successfully");
//        } else {
//            // Redirect back to course list page with error message
//            redirectAttributes.addFlashAttribute("error", "Invalid email or password");
//        }
//
//        return "redirect:/courseList";
//    
//
//    
//    
//}
    
    @RequestMapping(path = "/loginWriter", method = RequestMethod.GET)
    public String showRegisterForm(Model model) {
        model.addAttribute("instructor", new Instructor());
        return "loginWriter";
    }

 
    //Instructor registration
    @RequestMapping("/login")
    public String registerInt() {
        // Handle register logic
        return "login"; // Return the view name
    }

    @RequestMapping(path = "/registerInt", method = RequestMethod.POST)
    public String registerInt(@ModelAttribute Instructor instructor, HttpSession session) {
    
        instructorDao.saveInstructor(instructor);
        session.setAttribute("msg", "Register Successfully");
        return "login";
    }
 
    // instructor Login
    
	 @RequestMapping("/loginInt")
	    public String loginInt() {
	        // Handle login logic
	        return "Intregister"; // Return the view name
	    }
	 
	 
	 @RequestMapping(path = "/loginInt", method = RequestMethod.POST)
	 public String loginInstructor(@RequestParam("email") String email, @RequestParam("password") String password, @RequestParam("name") String name, HttpSession session)
	                         {

	     // Check if the provided email and password match any user in the database
	     Instructor instructor = instructorDao.findByEmailAndPassword(email, password);

	     if (instructor!= null) {
	         // If a user is found, set the user object in the session
	         session.setAttribute("userObj", instructor);
	         session.setAttribute("instructorName", name);
	         
//	         //Fetch the courses taught by the instructor
//	         List<Course> instructorCourses = courseDao.findCoursesByInstructor(instructor);
//
//	          //Set the list of courses in the session
//	         session.setAttribute("instructorCourses", instructorCourses);
	         return "saveCourse"; // Redirect to profile page or wherever you want
	     } else {
	         // If no user is found, show login failed message
	         session.setAttribute("msg", "Login Failed. Please use the correct email and password.");
	         return "redirect:/Intregister";
	     }
	 }
	 
//	    @RequestMapping(path = "/saveCourse", method = RequestMethod.POST)
//	    public String saveCourse(@ModelAttribute Course course, HttpSession session) {
//	        CourseDao.saveCourse(course);
//	        session.setAttribute("msg", "Course Added successfully");
//	        return "redirect:/course/addCourse";
//	    }

	    @RequestMapping("/saveCourse")
	    public String save() {
	        // Handle register logic
	        return "saveCourse"; // Return the view name
	    }

	    @RequestMapping(path = "/saveCourse", method = RequestMethod.POST)
	    public String SaveCourse(@ModelAttribute Course course, HttpSession session) {
	    	
	    	String instructorName = (String) session.getAttribute("instructorName");
	    	
	        // Set the current date to the course before saving
	        course.setCreatedAt(new Date());
	    	

	        // Set instructor's name for the course
	        course.setInstructor(instructorName);
	    	
	        courseDao.saveCourse(course);
	        session.setAttribute("msg", "Uploaded successfully");
	        return "saveCourse";
	    }

    
    
	 
	 
	 
	 @PostMapping("/enrollCourse")
	 public String enrollCourse(@RequestParam("email") String email,
	                            @RequestParam("password") String password,
	                            @RequestParam("courseTitle") String courseTitle,
	                            RedirectAttributes redirectAttributes) {
	     // Check if student with provided email and password exists in the database
	     Student student = studentDao.findByEmailAndPassword(email, password);

	     if (student != null) {
	         // Update the student's courses_taken column with the new course title
	         String coursesTaken = student.getCoursesTaken();
	         if (coursesTaken == null || coursesTaken.isEmpty()) {
	             coursesTaken = courseTitle;
	         } else {
	             coursesTaken += ", " + courseTitle;
	         }
	         student.setCoursesTaken(coursesTaken);
	         
	         // Persist the changes to the database
	         studentDao.updateCoursesTaken(student);

	         // Redirect back to course list page with success message
	         redirectAttributes.addFlashAttribute("msg", "Course enrolled successfully");
	     } else {
	         // Redirect back to course list page with error message
	         redirectAttributes.addFlashAttribute("error", "Invalid email or password");
	     }

	     return "view_beverages";  
	 }

	 

    
    
}


















