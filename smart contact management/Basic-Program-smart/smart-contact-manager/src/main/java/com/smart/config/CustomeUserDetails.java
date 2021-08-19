package com.smart.config;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.smart.entities.User;

public class CustomeUserDetails implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user;

	public CustomeUserDetails(User user) {
		super();
		this.user = user;
	}

	// getAuthorities is use for authorized the authority of User like Role
	// here SimpleGrantedAuthority is a class for providing the authorities
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(user.getRole());

		return List.of(simpleGrantedAuthority);
	}

	@Override
	public String getPassword() {

		// this password of user Entity class
		return user.getUserPassword();
	}

	@Override
	public String getUsername() {
		// this email of user Entity class
		// and all return we have to make as true
		return user.getUserEmail();
	}

	@Override
	public boolean isAccountNonExpired() {

		return true;
	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {

		return true;
	}

}
