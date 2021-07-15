package com.swipecartitem;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javassist.NotFoundException;

@RestController
public class SwipecartHandler {

	@Autowired
	SwipecartServices swipecartservice;
	
	boolean sessionStatus=false;
	
	List<CartItem> cartitem=new ArrayList<CartItem>();
	 @PostMapping(value="/Swipecart/api/AddtoCart", produces = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	 public ResponseEntity<Object> getCartList(@RequestBody CartItem cartitem, HttpServletResponse res, HttpStatus status){
		 swipecartservice.AddToCart(cartitem);
		 return new ResponseEntity<Object>(cartitem,HttpStatus.OK);
		 
	 }
	 
	 
	 @GetMapping(value="/Swipecart/api/GETSwipecartitems", produces = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	 public ResponseEntity<Object> getCartItems(@PathVariable int Id,HttpStatus status, HttpServletResponse res){
		 HashMap<String, Object> hm=new HashMap<String, Object>();
		 cartitem=swipecartservice.getSwipecrtitems();
		 return new ResponseEntity<Object>(cartitem, HttpStatus.OK);
		 
	 }
	 @PostMapping(value="/Swipecart/api-user_loginauth", produces = MediaType.APPLICATION_JSON)
		public ResponseEntity<Object> loginUser(@RequestBody user user,HttpSession session,HttpServletResponse res) throws NotFoundException{
			HashMap<String, Object> hm=new HashMap<String, Object>();
			List<user> users=new ArrayList<user>();
			List<Object> lists=new ArrayList<Object>();
			users=swipecartservice.UserAuthLogin(user.getEmailid(), user.getPassword());
	
		   if(users.size()>0) {
			   session.setAttribute("sessionId",users.get(0).getId());
			   sessionStatus=true;			   
			    hm.put("resCode","0");
			    hm.put("log_userId", users.get(0).getId());
			    hm.put("resSatus",res.getStatus());
			    hm.put("sessionStatus", sessionStatus);
		   }
		   else {
			   hm.put("resCode","1");
			   hm.put("resStatus",res.SC_NOT_FOUND);
			   hm.put("errMess", "Sorry! We can't recognize you. Try again");
		   }
			return new ResponseEntity<Object>(hm,HttpStatus.OK);
		}
	 
	 @DeleteMapping(value="/Swipecart/api/RemoveSwipecartitem/{id}", produces = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	 public ResponseEntity<Object> RemoveItem(@PathVariable int id,HttpStatus status){
		 HashMap<String, String> hm=new HashMap<String, String>();
		 swipecartservice.RemoveItem(id);
		 hm.put("Message", "Item deleted successfully");
		 return new ResponseEntity<Object>(hm,status.OK);
		 
	 }
}
