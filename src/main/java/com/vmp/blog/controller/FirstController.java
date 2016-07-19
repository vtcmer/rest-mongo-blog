package com.vmp.blog.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vmp.blog.model.Employee;
import com.vmp.blog.model.User;
import com.vmp.blog.repository.UserRepository;

@RestController
public class FirstController {
	
	
	/**
	 * Añadido comentario para prueba de commit
	 */
	private static final Logger logger = LoggerFactory.getLogger(FirstController.class);
	
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/api/emp/dummy", method = RequestMethod.GET)
	public @ResponseBody Employee getDummyEmployee() {
		
		logger.error("This is Error message", new Exception("Testing"));
		
		logger.info("Start getDummyEmployee");
		
		final User user = userRepository.getUser("victor");
		
		Employee emp = new Employee();
		emp.setId(user.getId());
		emp.setName(user.getEmail());
		emp.setCreatedDate(new Date());
		return emp;
	}
	
	
	@RequestMapping(value = "/api/emp/dummy/test", method = RequestMethod.GET)
	public @ResponseBody Employee getDummyEmployeeTest() {
		
		logger.error("This is Error message", new Exception("Testing"));
		
		logger.info("Start getDummyEmployee");
		
		//final User user = userRepository.getUser("victor");
		
		Employee emp = new Employee();
		emp.setId("vtcmer");
		emp.setName("vtcmer@gmail.com");
		emp.setCreatedDate(new Date());
		return emp;
	}

}
