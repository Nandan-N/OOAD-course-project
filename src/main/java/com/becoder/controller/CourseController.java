//package com.becoder.controller;
//
//
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
//import com.becoder.entity.Recipe;
//import com.becoder.entity.User;
//import com.becoder.entity.indian;
//import com.becoder.entity.request;
//import com.becoder.dao.UserDao;
//
//
//@Controller
//
//@RequestMapping("/writer/")
//public class WriterController {
//
//	@Autowired
//	private UserDao userDao;
//	
//	 @RequestMapping(value="/beverages")
//	    public String beverages() {
//	        // Handle beverages logic
//		 
//	        return "beverages"; // Return the view name
//	    }
//	 
//	 @RequestMapping(path = "/saveRecipe", method = RequestMethod.POST)
//		public String saveRecipe(@ModelAttribute Recipe n, HttpSession session) {
//			
//			
//			userDao.saveRecipe(n);
//			session.setAttribute("msg", "Recipe Added sucessfully");
//
//			return "redirect:/writer/beverages";
//		}
//	 @RequestMapping(path = "/saveIndian", method = RequestMethod.POST)
//		public String saveIndian(@ModelAttribute indian n, HttpSession session) {
//			
//			
//			userDao.saveIndian(n);
//			session.setAttribute("msg", "Recipe Added sucessfully");
//
//			return "redirect:/writer/indian";
//		}
//
//		@RequestMapping("/editBeverages")
//		public String editBeverages(@RequestParam("id") int id, Model m) {
//			Recipe n = userDao.getRecipeById(id);
//			m.addAttribute("recipe", n);
//			return "editBeverages";
//		}
//
//		@RequestMapping(path = "/updateBeverages", method = RequestMethod.POST)
//		public String updateBeverages(@ModelAttribute Recipe n, HttpSession session) {
//			
//			
//			userDao.updateBeverages(n);
//			session.setAttribute("msg", "Recipe update sucessfully");
//			return "redirect:/writer/beverages_w";
//		}
//	 
//	 @RequestMapping("/deleteBeverages")
//		public String deleteBeverages(@RequestParam("id") int id, HttpSession session) {
//			userDao.deleteBeverages(id);
//			session.setAttribute("msg", "Recipe Deleted Sucessfully");
//			return "redirect:/writer/beverages_w";
//		}
//	 
//	 @RequestMapping("/beverages_w")
//		public String beverages_w(HttpSession session, Model m) {
//			
//			List<Recipe> recipe = userDao.getRecipe();
//			m.addAttribute("list",recipe);
//			return "beverages_w";
//		}
//	 
//	 
//	 
//	
//	 @RequestMapping("/deleteRequest")
//		public String deleteRequest(@RequestParam("id") int id, HttpSession session) {
//			userDao.deleteRequest(id);
//			session.setAttribute("msg", "Request Deleted Sucessfully");
//			return "redirect:/writer/viewRequest";
//		}
//	 
//	 
//	 @RequestMapping("/viewRequest")
//		public String viewRequest(HttpSession session, Model m) {
//			
//			List<request> request = userDao.getRequest();
//			m.addAttribute("list",request);
//			return "viewRequest";
//		}
//	 
//	 
//	 
//	 @RequestMapping(value="/indian")
//	    public String indian() {
//	        // Handle beverages logic
//		 
//	        return "indian"; // Return the view name
//	    }
//	 
//}



//
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
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.becoder.entity.Course;
//import com.becoder.entity.Indian;
//import com.becoder.entity.Request;
//import com.becoder.dao.UserDao;
//
//@Controller
//@RequestMapping("/course/")
//public class CourseController {
//
//    @Autowired
//    private UserDao userDao;
//
//    @RequestMapping(value = "/modules")
//    public String modules() {
//        return "modules"; // Return the view name
//    }
//
//    @RequestMapping(path = "/saveCourse", method = RequestMethod.POST)
//    public String saveCourse(@ModelAttribute Course course, HttpSession session) {
//        userDao.saveCourse(course);
//        session.setAttribute("msg", "Course Added successfully");
//        return "redirect:/course/modules";
//    }
//
////    @RequestMapping(path = "/saveIndian", method = RequestMethod.POST)
////    public String saveIndian(@ModelAttribute Indian indian, HttpSession session) {
////        userDao.saveIndian(indian);
////        session.setAttribute("msg", "Indian Added successfully");
////        return "redirect:/course/indian";
////    }
//
//    @RequestMapping("/editModules")
//    public String editModules(@RequestParam("id") int id, Model model) {
//        Course course = userDao.getCourseById(id);
//        model.addAttribute("course", course);
//        return "editModules";
//    }
//
//    @RequestMapping(path = "/updateModules", method = RequestMethod.POST)
//    public String updateModules(@ModelAttribute Course course, HttpSession session) {
//        userDao.updateCourse(course);
//        session.setAttribute("msg", "Course updated successfully");
//        return "redirect:/course/modules";
//    }
//
//    @RequestMapping("/deleteModules")
//    public String deleteModules(@RequestParam("id") int id, HttpSession session) {
//        userDao.deleteCourse(id);
//        session.setAttribute("msg", "Course Deleted Successfully");
//        return "redirect:/course/modules";
//    }
//
//    @RequestMapping("/modules_w")
//    public String modules_w(HttpSession session, Model model) {
//        List<Course> courses = userDao.getCourses();
//        model.addAttribute("list", courses);
//        return "modules_w";
//    }
//
////    @RequestMapping("/deleteRequest")
////    public String deleteRequest(@RequestParam("id") int id, HttpSession session) {
////        userDao.deleteRequest(id);
////        session.setAttribute("msg", "Request Deleted Successfully");
////        return "redirect:/course/viewRequest";
////    }
////
////    @RequestMapping("/viewRequest")
////    public String viewRequest(HttpSession session, Model model) {
////        List<Request> requests = userDao.getRequests();
////        model.addAttribute("list", requests);
////        return "viewRequest";
////    }
////
////    @RequestMapping(value = "/indian")
////    public String indian() {
////        return "indian"; // Return the view name
////    }
//}





package com.becoder.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.springframework.transaction.annotation.Transactional;

import com.becoder.dao.CourseDao;
import com.becoder.dao.StudentDao;
import com.becoder.dao.UserDao;
import com.becoder.entity.Course;
import com.becoder.entity.Recipe;
import com.becoder.entity.Student;
import com.becoder.entity.request;

@Controller
@RequestMapping("/writer/")
public class CourseController {

    @Autowired
    private CourseDao CourseDao;
    
    private static final String FIXED_EMAIL = "fixed@example.com";
    private static final String FIXED_PASSWORD = "password123";
    
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private StudentDao studentDao;

    @RequestMapping("/viewCourses")
    public String viewCourses(HttpSession session, Model model) {
        List<Course> courses = CourseDao.getCourses();
        model.addAttribute("list", courses);
        return "view_courses";  
    }

    @RequestMapping(path = "/saveCourse", method = RequestMethod.POST)
    public String saveCourse(@ModelAttribute Course course, HttpSession session) {
        CourseDao.saveCourse(course);
        session.setAttribute("msg", "Course Added successfully");
        return "redirect:/course/addCourse";
    }

//    @RequestMapping(value = "/addCourse")
//    public String addCourse() {
//        return "editBeverages"; // Return the view name
//    }

    @RequestMapping("/editCourse")
    public String editCourse(@RequestParam("id") int id, Model model) {
        Course course = CourseDao.getCourseById(id);
        model.addAttribute("course", course);
        return "edit_course";
    }

    @RequestMapping(path = "/updateCourse", method = RequestMethod.POST)
    public String updateCourse(@ModelAttribute Course course, HttpSession session) {
        CourseDao.updateCourse(course);
        session.setAttribute("msg", "Course Updated successfully");
        return "redirect:/course/viewCourses";
    }

    @RequestMapping("/deleteCourse")
    public String deleteCourse(@RequestParam("id") int id, HttpSession session) {
        CourseDao.deleteCourse(id);
        session.setAttribute("msg", "Course Deleted Successfully");
        return "redirect:/course/viewCourses";
    }
    
	 @RequestMapping(value="/beverages")
	    public String beverages() {
	        // Handle beverages logic
		 
	        return "beverages"; // Return the view name
	    }
	 
	 @RequestMapping(path = "/saveRecipe", method = RequestMethod.POST)
		public String saveRecipe(@ModelAttribute Recipe n, HttpSession session) {
			
			
			userDao.saveRecipe(n);
			session.setAttribute("msg", "Recipe Added sucessfully");

			return "redirect:/writer/beverages";
		}
	 
//	 @RequestMapping(path = "/saveIndian", method = RequestMethod.POST)
//		public String saveIndian(@ModelAttribute indian n, HttpSession session) {
//			
//			
//			userDao.saveIndian(n);
//			session.setAttribute("msg", "Recipe Added sucessfully");
//
//			return "redirect:/writer/indian";
//		}
	 
	 


		

		@RequestMapping(path = "/updateBeverages", method = RequestMethod.POST)
		public String updateBeverages(@ModelAttribute Recipe n, HttpSession session) {
			
			
			userDao.updateBeverages(n);
			session.setAttribute("msg", "Recipe update sucessfully");
			return "redirect:/writer/beverages_w";
		}
		
		 @RequestMapping("/deleteBeverages")
			public String deleteBeverages(@RequestParam("id") int id, HttpSession session) {
				userDao.deleteBeverages(id);
				session.setAttribute("msg", "Recipe Deleted Sucessfully");
				return "redirect:/writer/beverages_w";
			}
		 
		 
		 @RequestMapping("/beverages_w")
			public String beverages_w(HttpSession session, Model m) {
				
				List<Course> courses = CourseDao.getCourses();
				m.addAttribute("list",courses);
				return "beverages_w";
			}
		 
		 
		 
		 @RequestMapping("/deleteRequest")
			public String deleteRequest(@RequestParam("id") int id, HttpSession session) {
				userDao.deleteRequest(id);
				session.setAttribute("msg", "Request Deleted Sucessfully");
				return "redirect:/writer/viewRequest";
			}
		 
		 
		 
		 @RequestMapping("/viewRequest")
			public String viewRequest(HttpSession session, Model m) {
				
				List<request> request = userDao.getRequest();
				m.addAttribute("list",request);
				return "viewRequest";
			}
		 
		 
		 
		 
		 @RequestMapping(value="/indian")
		    public String indian() {
		        // Handle beverages logic
			 
		        return "indian"; // Return the view name
		    }
		 
		 
		    @RequestMapping("/view_courses")
		    public String view_courses() {
		        // Handle register logic
		        return "view_courses"; // Return the view name
		    }
		 
		    @RequestMapping("/editBeverages")
		    public String editBeverages() {
		        // Handle register logic
		        return "editBeverages"; // Return the view name
		    }
		    
		 
		 
//		 @GetMapping("/editBeverages")
//		 public String editBeverages(@RequestParam("title") String courseTitle, Model model) {
//		     model.addAttribute("courseTitle", courseTitle);
//		     return "editBeverages"; // Name of your enrollment form JSP
//		 }
//		 
//		 @Transactional
//		 @PostMapping("/enrollCourse")
//		 public String enrollCourse(@RequestParam("email") String email,
//		                            @RequestParam("password") String password,
//		                            @RequestParam("title") String courseTitle,
//		                            RedirectAttributes redirectAttributes) {
//		     // Check if student with provided email and password exists in the database
//		     Student student = studentDao.findByEmailAndPassword(email, password);
//
//		     if (student != null) {
//		         // Update the student's courses_taken column with the new course title
//		         String coursesTaken = student.getCoursesTaken();
//		         if (coursesTaken == null || coursesTaken.isEmpty()) {
//		             coursesTaken = courseTitle;
//		         } else {
//		             coursesTaken += ", " + courseTitle;
//		         }
//		         student.setCoursesTaken(coursesTaken);
//
//		         // Persist the changes to the database
//		         studentDao.updateCoursesTaken(student);
//
//		         // Redirect back to course list page with success message
//		         redirectAttributes.addFlashAttribute("msg", "Course enrolled successfully");
//		     } else {
//		         // Redirect back to course list page with error message
//		         redirectAttributes.addFlashAttribute("error", "Invalid email or password");
//		     }
//
//		     return "redirect:/view_courses"; // Redirect to view_beverages page
//		 }

		 
		 


		 
		 
		 
		 


		 
		 
		 
		 
		 @PostMapping("/enrollCourse")
		 public String enrollCourse(@RequestParam("email") String email,
		                            @RequestParam("password") String password,
		                            @RequestParam("title") String courseTitle,
		                            RedirectAttributes redirectAttributes,
		                            Model model) {
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
		         
		         // Pass the updated student object to the view
		         model.addAttribute("student", student);

		         // Redirect back to course list page with success message
		         redirectAttributes.addFlashAttribute("msg", "Course enrolled successfully");
		     } else {
		         // Redirect back to course list page with error message
		         redirectAttributes.addFlashAttribute("error", "Invalid email or password");
		     }

		     return "view_beverages";  
		 }

		 
		 
//		 
//		    @PostMapping("/enrollCourse")
//		    public String enrollCourse(@RequestParam("email") String email,
//		                               @RequestParam("password") String password,
//		                               @RequestParam("courseTitle") String courseTitle,
//		                               RedirectAttributes redirectAttributes) {
//		        // Check if student with provided email and password exists in the database
//		        Student student = studentDao.findByEmailAndPassword(email, password);
//
//		        if (student != null) {
//		            // Update the student's courses_taken column with the new course title
//		            String coursesTaken = student.getCoursesTaken();
//		            if (coursesTaken == null || coursesTaken.isEmpty()) {
//		                coursesTaken = courseTitle;
//		            } else {
//		                coursesTaken += ", " + courseTitle;
//		            }
//		            student.setCoursesTaken(coursesTaken);
//		            studentDao.update(student);
//
//		            // Redirect back to course list page with success message
//		            redirectAttributes.addFlashAttribute("msg", "Course enrolled successfully");
//		        } else {
//		            // Redirect back to course list page with error message
//		            redirectAttributes.addFlashAttribute("error", "Invalid email or password");
//		        }
//
//		        return "view_beverages"; 
		 
		 

		

//		    @PostMapping("/buyCourse")
//		    @ResponseBody
//		    public ResponseEntity<String> buyCourse(@RequestParam("courseId") Long courseId, Principal principal) {
//		        String loggedInUsername = principal.getName(); // Get currently logged-in username
//		        Student student = StudentDao.findByUsername(loggedInUsername); // Retrieve student information
//		        Course course = CourseDao.findById(courseId); // Retrieve course information
//		        if (student != null && course != null) {
//		            // Add course title to the courses_taken column for the student
//		            student.addCourse(course.getTitle());
//		            studentService.save(student); // Save the updated student information
//		            return ResponseEntity.ok("Course bought successfully.");
//		        } else {
//		            return ResponseEntity.badRequest().body("Failed to buy course.");
//		        }
//		    }
//		}
//		 
//		 

}




