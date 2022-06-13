package com.micro.app.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.micro.app.entity.User;
import com.micro.app.repositories.UserDAO;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserDAO userDao;
   @Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
	System.out.println("this bean is called....!!!");
	   User user = userDao.findByUsername(userId);
		
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), new BCryptPasswordEncoder().encode(user.getPassword()), getAuthority());
	}

	private List getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

	public List findAll() {
		List list = new ArrayList<>();
		userDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
}
