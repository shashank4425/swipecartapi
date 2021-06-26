package com.swipecartitem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import javassist.NotFoundException;

@org.springframework.stereotype.Service
public class SwipecartServices {
	
	@Autowired
	SwipecartdataImpl swipecartdataImpl;
	@Autowired
	swipcartUserDataImpl userdataImpl;

	
	public void AddToCart(CartItem cartitem) {
		swipecartdataImpl.save(cartitem);
	}

	public List<CartItem> getSwipecrtitems() {
		return swipecartdataImpl.findAll();
	}

	public void RemoveItem(int id) {
		// TODO Auto-generated method stub
		swipecartdataImpl.deleteById(id);
	}

	
	public List<user> UserAuthLogin(String EMAIL_ID,String PASSWORD) throws NotFoundException {
		List<user> users=userdataImpl.findByemailId(EMAIL_ID, PASSWORD);
		if(users == null) {
			 throw new NotFoundException("not found emailid");
		}
		return users;
	}
	

}
