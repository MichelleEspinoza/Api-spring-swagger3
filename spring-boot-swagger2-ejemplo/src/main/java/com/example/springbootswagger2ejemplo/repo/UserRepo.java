package com.example.springbootswagger2ejemplo.repo;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.springbootswagger2ejemplo.model.User;

import org.springframework.stereotype.Repository;

/*Repository es un package que contiene las interfaces que extienden de JPA para que estas clases se conecten a la
 *  base de datos. Estas gestionan información ya sea de:
 *  buscar, borrar, actualizar o crear un registro en la BD.*/
@Repository
public class UserRepo {
	
	//Lista de users
	private List<User> list = new ArrayList<User>();
	
    /*Método que llena el list con campos de prueba; des-comentar del controlador el método: getAll() */
	public void getAll() {
		list = new ArrayList<User>(); { 
		list.add(new User(1,"User1", "ADMIN", "user1@test.com"));
		list.add(new User(2,"User2", "SUPERVISOR", "user2@test.com"));
		list.add(new User(3,"User3", "USER", "user3@test.com"));
		list.add(new User(4,"User4", "USER", "user4@test.com"));
		}
	}
	
    /*Devuelve lista de users*/
	public List<User> listUser() {
		return list;
	}
    
	/*Buscar por nombre*/
	public List<User> search(String role) {
		return list.stream().filter(x -> x.getRole().startsWith(role)).collect(Collectors.toList());
	}

	/*Agregar user a el list de users*/
	public String add(User p) {
		User obj = new User();
		obj.setId(p.getId());
		obj.setName(p.getName());
		obj.setRole(p.getRole());
		obj.setEmail(p.getEmail());
		list.add(obj);
		return null;
	}
	
	/*Elimina user del list de users*/
	public String delete(Integer id) {
		list.removeIf(x -> x.getId() == (id));
		return null;
	}
	
	/*Edita user del list de user dependiendo del ID*/
	public String edit(User person) {
		int idx = 0;
		int id = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == (person.getId())) {
				id = person.getId();
				idx = i;
				break;
			}
		}
        //guardando cambios del user editado.....
		User p = new User();
		p.setId(id);
		p.setName(person.getName());
		p.setEmail(person.getEmail());
		p.setRole(person.getRole());
		list.set(idx, p);

		return null;
	}
}
