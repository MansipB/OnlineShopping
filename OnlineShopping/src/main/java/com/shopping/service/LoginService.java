package com.shopping.service;

import com.shopping.entity.User;

public interface LoginService {

	public User addUser(User user);

	public User removeUser(User user);

	public User validateUser(User user);

	public User logOut(User user);

}
