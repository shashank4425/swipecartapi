package com.swipecartitem;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface swipcartUserDataImpl extends JpaRepository<user, Long>{

	@Query("SELECT * FROM USER_TB user WHERE user.EMAIL_ID =:EMAIL_ID")
	List<user> findByemailId(@PathParam("emailid") String emailid);
}
