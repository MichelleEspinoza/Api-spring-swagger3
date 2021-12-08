package com.example.springbootswagger2ejemplo.services;

import java.util.List;


import com.example.springbootswagger2ejemplo.model.User;
//Interfaz con métodos que se pueden aplicar.
public interface IUserService {
public abstract void getAll(); 
	
	public abstract List<User> listUser();

	public abstract List<User> search(String role);

	public abstract String add(User p);
	
	public abstract String delete (int id);
	
	public abstract String edit (User p);
}
