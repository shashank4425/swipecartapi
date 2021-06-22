package com.swipecartitem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import javassist.NotFoundException;

@org.springframework.stereotype.Service
public class UserAuthService {

	@Autowired
	swipcartUserDataImpl userdataImpl;

	public List<user> UserAuthLogin(String emailid) throws NotFoundException {
		List<user> users=userdataImpl.findByemailId(emailid);
		if(users == null) {
			 throw new NotFoundException("not found emailid");
		}
		return users;
	}
	public void addUser(user add_user) {
		userdataImpl.save(add_user);
		
	}

	public void RemoveUser(Long id) {
		// TODO Auto-generated method stub
		userdataImpl.deleteById(id);
	}
	
	
	  
}
