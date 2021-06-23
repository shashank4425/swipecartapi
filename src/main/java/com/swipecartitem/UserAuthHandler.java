package com.swipecartitem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javassist.NotFoundException;

@RestController
public class UserAuthHandler {

	@Autowired
	UserAuthService userAuthservice;
	
	List<user> user_List=new ArrayList<user>();
	
	@RequestMapping(value="/Swipecart/api-user-auth_token", produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<Object> UserAuthorisation(HttpSession session,HttpServletResponse res) throws NotFoundException{
		HashMap<String, Object> hm=new HashMap<String, Object>();
		  hm.put("sessionId", session.getAttribute("userId"));
		return new ResponseEntity<Object>(hm,HttpStatus.OK);
	}
	@PostMapping(value="/Swipecart/api-register_auth", produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<Object> VerifyUser(@RequestBody user add_user, HttpSession session, HttpServletResponse res){
		HashMap<String, Object> hm=new HashMap<String, Object>();
		List<Object> lists=new ArrayList<Object>();
		   		
			userAuthservice.addUser(add_user);
			session.setAttribute("userId",add_user.getId());
			System.out.println(session.getAttribute("userId"));
			
		return new ResponseEntity<Object>(hm,HttpStatus.OK);
	}
	@PostMapping(value="/Swipecart/api-user_loginauth", produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<Object> loginUser(@RequestBody user user,HttpSession session,HttpServletResponse res) throws NotFoundException{
		HashMap<String, Object> hm=new HashMap<String, Object>();
		List<user> users=new ArrayList<user>();
		List<Object> lists=new ArrayList<Object>();
				System.out.println(user);
		users=userAuthservice.UserAuthLogin(user.getEmailid(), user.getPassword());
	   if(users.size()>0) {
		    hm.put("resCode","0");
		    hm.put("resSatus",res.getStatus());
		    session.setAttribute("userId",users.get(0).id);
		    System.out.println(session.getAttribute("userId"));
	   }
	   else {
		   hm.put("resCode","1");
		   hm.put("resStatus",res.SC_NOT_FOUND);
		   hm.put("errMess", "Sorry! We can't recognize you. Try again");
	   }
		return new ResponseEntity<Object>(hm,HttpStatus.OK);
	}
	
	 @DeleteMapping(value="/Swipecart/api/RemoveUser/{id}", produces = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	 public ResponseEntity<Object> RemoveItem(@PathVariable Long id,HttpStatus status){
		 HashMap<String, String> hm=new HashMap<String, String>();
		 userAuthservice.RemoveUser(id);
		 hm.put("Message", "User deleted successfully");
		 return new ResponseEntity<Object>(hm,status.OK);
		 
	 }
	 
	 @GetMapping(value="/Swipecart/api/getUsers", produces = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	 public ResponseEntity<Object> GetUsers(HttpStatus status){
		 HashMap<String, String> hm=new HashMap<String, String>();
		 user_List=userAuthservice.getUsers();
		 return new ResponseEntity<Object>(user_List,status.OK);
		 
	 }
}
