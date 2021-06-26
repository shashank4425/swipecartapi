package com.swipecartitem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import javassist.NotFoundException;

@org.springframework.stereotype.Service
public class UserAuthService {

	@Autowired
	swipcartUserDataImpl userdataImpl;

	public void addUser(user add_user) {
		userdataImpl.save(add_user);
		
	}

	public void RemoveUser(Long id) {
		// TODO Auto-generated method stub
		userdataImpl.deleteById(id);
	}
	public List<user> getUsers() {
		
		return userdataImpl.findAll();
	}

}
