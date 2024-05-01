package com.becoder.config;
////
////import javax.servlet.http.HttpServletRequest;
////import javax.servlet.http.HttpServletResponse;
////
////import org.springframework.web.servlet.HandlerInterceptor;
////
////import com.becoder.entity.User;
////
////public class AuthHandler implements HandlerInterceptor {
////
////	@Override
////	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
////			throws Exception {
////
////		User user = (User) request.getSession().getAttribute("userObj");
////		if (user != null) {
////			return true;
////		} else {
////			// response.sendRedirect("/login");
////			response.getWriter().print("<h1>Please Login</h1>");
////			return false;
////		}
////
////	}
////
////}
//
////
////import org.springframework.web.servlet.HandlerInterceptor;
////
////import jakarta.servlet.http.HttpServletRequest;
////import jakarta.servlet.http.HttpServletResponse;
////
////public class AuthHandler implements HandlerInterceptor {
////
////    @Override
////    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
////
////        // Check if either a student or instructor is logged in
////        User student = (Student) request.getSession().getAttribute("studentObj");
////        User instructor = (Instructor) request.getSession().getAttribute("instructorObj");
////
////        if (student != null || instructor != null) {
////            return true; // Allow access if either a student or instructor is logged in
////        } else {
////            // If neither a student nor an instructor is logged in, prompt the user to log in
////            response.getWriter().print("<h1>Please Login</h1>");
////            return false;
////        }
////    }
////}
////	
////	
////	
////	
////	
////	
//   import org.springframework.web.servlet.HandlerInterceptor;
////	
////	import javax.servlet.http.HttpServletRequest;
////	import javax.servlet.http.HttpServletResponse;
////	
////	public class AuthHandler implements HandlerInterceptor {
////	
////	    @Override
////	    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
////	
////	        // Check if either a student or instructor is logged in
////	        User student = (Student) request.getSession().getAttribute("studentObj");
////	        User instructor = (Instructor) request.getSession().getAttribute("instructorObj");
////	
////	        if (student != null || instructor != null) {
////	            return true; // Allow access if either a student or instructor is logged in
////	        } else {
////	            // If neither a student nor an instructor is logged in, prompt the user to log in
////	            response.getWriter().print("<h1>Please Login</h1>");
////	            return false;
////	        }
////	    }
////	}
//
////
////
////
////
////
////import org.springframework.web.servlet.HandlerInterceptor;
////
////import jakarta.servlet.http.HttpServletRequest;
////import jakarta.servlet.http.HttpServletResponse;
////
////import com.becoder.entity.Student;
////import com.becoder.entity.Instructor;
////
////public class AuthHandler implements HandlerInterceptor {
////
////    @Override
////    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
////
////        // Check if either a student or instructor is logged in
////        Student student = (Student) request.getSession().getAttribute("studentObj");
////        Instructor instructor = (Instructor) request.getSession().getAttribute("instructorObj");
////
////        if (student != null || instructor != null) {
////            return true; // Allow access if either a student or instructor is logged in
////        } else {
////            // If neither a student nor an instructor is logged in, prompt the user to log in
////            response.getWriter().print("<h1>Please Login</h1>");
////            return false;
////        }
////    }
////}
//
//
//
//
//
//
////
////
////
////
////
////import org.springframework.web.servlet.HandlerInterceptor;
////import org.springframework.web.servlet.ModelAndView;
////
////import jakarta.servlet.http.HttpServletRequest;
////import jakarta.servlet.http.HttpServletResponse;
////
////import com.becoder.entity.Student;
////import com.becoder.entity.Instructor;
////
////public class AuthHandler implements HandlerInterceptor {
////
////    @Override
////    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
////
////        // Check if either a student or instructor is logged in
////        Student student = (Student) request.getSession().getAttribute("studentObj");
////        Instructor instructor = (Instructor) request.getSession().getAttribute("instructorObj");
////
////        if (student != null || instructor != null) {
////            return true; // Allow access if either a student or instructor is logged in
////        } else {
////            // If neither a student nor an instructor is logged in, prompt the user to log in
////            response.getWriter().print("<h1>Please Login</h1>");
////            return false;
////        }
////    }
////}
//
//   
//   
//   
//   
//   import org.springframework.web.servlet.HandlerInterceptor;
//   import org.springframework.web.servlet.ModelAndView;
//
//   import javax.servlet.http.HttpServletRequest;
//   import javax.servlet.http.HttpServletResponse;
//
//   import com.becoder.entity.Student;
//   import com.becoder.entity.Instructor;
//
//   public class AuthHandler implements HandlerInterceptor {
//
//       @Override
//       public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//           // Check if either a student or instructor is logged in
//           Student student = (Student) request.getSession().getAttribute("studentObj");
//           Instructor instructor = (Instructor) request.getSession().getAttribute("instructorObj");
//
//           if (student != null || instructor != null) {
//               return true; // Allow access if either a student or instructor is logged in
//           } else {
//               // If neither a student nor an instructor is logged in, prompt the user to log in
//               response.getWriter().print("<h1>Please Login</h1>");
//               return false;
//           }
//       }
//
//       // Implementations of other methods (if needed) can be added here
//   }

   
   
   
   
   
   
   
   
  
   import javax.servlet.http.HttpServletRequest;
   import javax.servlet.http.HttpServletResponse;

   import org.springframework.web.servlet.HandlerInterceptor;

   import com.becoder.entity.User;

   public class AuthHandler implements HandlerInterceptor {

   	@Override
   	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
   			throws Exception {

   		User user = (User) request.getSession().getAttribute("userObj");
   		if (user != null) {
   			return true;
   		} else {
   			// response.sendRedirect("/login");
   			response.getWriter().print("<h1>Please Login</h1>");
   			return false;
   		}

   	}

   }

