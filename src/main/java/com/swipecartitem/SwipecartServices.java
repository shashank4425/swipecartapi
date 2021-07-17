package com.swipecartitem;

import java.util.List;
import java.util.Optional;

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
}
