package com.swipecartitem;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwipecartHandler {

	@Autowired
	SwipecartServices swipecartservice;
	
	List<CartItem> cartitem=new ArrayList<CartItem>();
	 @PostMapping(value="/Swipecart/api/AddtoCart", produces = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	 public ResponseEntity<Object> getCartList(@RequestBody CartItem cartitem, HttpServletResponse res, HttpStatus status){
		 swipecartservice.AddToCart(cartitem);
		 return new ResponseEntity<Object>(cartitem,HttpStatus.OK);
		 
	 }
	 
	 
	 @GetMapping(value="/Swipecart/api/GETSwipecartitems", produces = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	 public ResponseEntity<Object> getCartItems(HttpStatus status, HttpServletResponse res){
	
		cartitem= swipecartservice.getSwipecrtitems();
		System.out.println(cartitem);
		 return new ResponseEntity<Object>(cartitem, HttpStatus.OK);
		 
	 }
	 
	 @DeleteMapping(value="/Swipecart/api/RemoveSwipecartitem/{id}", produces = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	 public ResponseEntity<Object> RemoveItem(@PathVariable int id,HttpStatus status){
		 HashMap<String, String> hm=new HashMap<String, String>();
		 swipecartservice.RemoveItem(id);
		 hm.put("Message", "Item deleted successfully");
//		 cartitem= swipecartservice.getSwipecrtitems();
		 return new ResponseEntity<Object>(hm,status.OK);
		 
	 }
}
