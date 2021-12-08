package com.example.springbootswagger2ejemplo.services.impl;


import java.util.List;

import com.example.springbootswagger2ejemplo.model.User;
import com.example.springbootswagger2ejemplo.repo.UserRepo;
import com.example.springbootswagger2ejemplo.services.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*@Service:realiza algún servicio, como ejecutar lógica de negocios, realizar cálculos y llamar a API externas.
 *  (beans con métodos de llamada en la capa del repository)*/
@Service
public class UserService implements IUserService{
	
/*@Autowired: sirve para inyectar un Bean usando la autodetección de Spring */	
	@Autowired
	private UserRepo userRepo;

	@Override
	public void getAll() {
		userRepo.getAll();
	}

	@Override
	public List<User> listUser() {
		return userRepo.listUser();
	}

	@Override
	public List<User> search(String role) {
		return userRepo.search(role);
	}

	@Override
	public String add(User p) {
		return userRepo.add(p);
	}

	@Override
	public String delete(int id) {
		return userRepo.delete(id);
	}

	@Override
	public String edit(User p) {
		return userRepo.edit(p);
	}
}
