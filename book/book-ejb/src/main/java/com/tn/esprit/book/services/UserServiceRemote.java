package com.tn.esprit.book.services;

import java.util.List;

import javax.ejb.Remote;

import com.tn.esprit.book.persistence.Customer;
import com.tn.esprit.book.persistence.User;


@Remote
public interface UserServiceRemote {
	void createUser(User user);
	void saveCustomer(Customer customer);
	List<User> findAllUsers();
	User authenticate(String login, String password);
	User findUserByLogin(String login);
}
