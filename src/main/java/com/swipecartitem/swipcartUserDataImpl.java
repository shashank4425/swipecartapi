package com.swipecartitem;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface swipcartUserDataImpl extends JpaRepository<user, Long>{

	@Query("FROM USER_TB WHERE emailId = ?1 AND password = ?2")
	List<user> findByemailId(@PathParam("emailId") String emailId,@PathParam("password") String password);
}
