package com.tn.esprit.book.services;

import java.util.List;

import javax.ejb.Local;

import com.tn.esprit.book.persistence.Customer;
import com.tn.esprit.book.persistence.User;
@Local
public interface UserServiceLocal {
	void createUser(User user);
	void saveCustomer(Customer customer);
	List<User> findAllUsers();
	User authenticate(String login, String password);
	boolean loginExists(String login);
	User findUserByLogin(String login);
}
