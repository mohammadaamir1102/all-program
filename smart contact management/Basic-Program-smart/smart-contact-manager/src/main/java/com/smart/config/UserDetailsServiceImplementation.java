package com.smart.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.smart.entities.User;
import com.smart.repo.UserRepository;

public class UserDetailsServiceImplementation implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		//fetching userEmail from the database
		
		User user = userRepository.findByUserEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found");

		}
		CustomeUserDetails customeUserDetails = new CustomeUserDetails(user);
		return customeUserDetails;
	}

}
