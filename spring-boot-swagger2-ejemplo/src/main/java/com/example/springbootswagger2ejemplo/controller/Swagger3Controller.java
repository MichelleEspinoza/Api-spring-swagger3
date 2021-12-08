package com.example.springbootswagger2ejemplo.controller;

import com.example.springbootswagger2ejemplo.model.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.springbootswagger2ejemplo.services.IUserService;

/*@RestController: combinación de @Controller y @ResponseBody.*/
@RestController

/*I n f o r m a c i ó n  de métodos de este controlador o API*/
@Tag(name = "M.E", description = "Api de prueba con user")

//ruta raíz
@RequestMapping("/api")

public class Swagger3Controller {
	
	//Variable para el servicio a usar
	@Autowired
	private IUserService userService;
	
	/*V I S U A L I Z A R  a los user del list*/
		//Descripción del método
	@Operation(summary = "Listar Users",
            description = "Para llenar el list con campos de prueba; des-comentar del controlador el método: getAll()")
	@ApiResponse(responseCode = "200", description = "Successful")

	@RequestMapping(value = "/getUsers", method = RequestMethod.GET, produces = "application/json")
	public List<User> getUsers() {  
		//userService.getAll();
		return userService.listUser();
	}
	
	/*B U S C A R  user en la lista por role*/
	@Operation(summary = "Buscar Users",
            description = "Buscar Users por Rol")
	@GetMapping("/search/{role}")
	List<User> getUsersByRole(@PathVariable String role) {
		return userService.search(role);
	}

	
	/*A G R E G A R user a la lista*/
	@Operation(summary = "Crear User",
            description = "Creación de User")
	@PostMapping(path = { "/add" }) 
	public String add(Model model,User p) {
		userService.add(p);
		return "redirect:/getUsers";
	}
	
	/*E D I T A R  user de la lista*/
	@Operation(summary = "Editar User",
            description = "Edición de User")
	@PutMapping(path = "/edit")
	public String edit(Model model,User p) {
		userService.edit(p);
		return "redirect:/";
	}
	
	/*E L I M I N A R   un user de la lista*/
	@Operation(summary = "Eliminar User",
            description = "Eliminación de User")
	@DeleteMapping(path = "/delete/{id}") 
	public String delete(Model model, @PathVariable(name = "id") int id) {
		userService.delete(id);
		return "redirect:/";
	}
	
	/* ******Mas respuestas para metodos que se pueden personalizar******** */
	/*@ApiResponse(responseCode = "500", description = "Server error") 
	 * @ApiResponse(responseCode = "400", description = "Invalid Name ")
    @ApiResponse(responseCode = "404", description = "User not found") */

}