package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	// Fake User List

	List<User> list = List.of(
			new User(1311L, "Aayush Jain", "7758864901"),
			new User(1312L, "Aakash Jain", "8346568388"),
			new User(1314L, "Mayur Jain", "34324324323")
			
			);

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
