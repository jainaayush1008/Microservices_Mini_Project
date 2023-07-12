package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	// Fake List Of Contacts

	List<Contact> list = List.of(
			new Contact(1L,"AJ@gmail.com", "AJ",1311L),
			new Contact(2L,"Amol@gmail.com", "Amol",1311L),
			new Contact(3L,"John@gmail.com", "John",1312L),
			new Contact(4L,"Rohan@gmail.com", "Rohan",1314L)
	);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
