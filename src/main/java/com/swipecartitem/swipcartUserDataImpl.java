package com.swipecartitem;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface swipcartUserDataImpl extends JpaRepository<user, Long>{

	@Query("FROM USER_TB WHERE EMAIL_ID = ?1 AND PASSWORD = ?2")
	List<user> findByemailId(@PathParam("emailid") String emailid,@PathParam("password") String password);
}
