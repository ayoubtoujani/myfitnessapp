package tn.ayoub.MyFitnessApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.ayoub.MyFitnessApp.Entities.Role;
import tn.ayoub.MyFitnessApp.Services.RoleServImpl;

@RestController
public class RoleController {
	
	
	@Autowired
	RoleServImpl roleserv ; 
	
	
	@GetMapping("/addrole")
	public Role addRole(@RequestBody Role role ) {	
		
		return roleserv.addRole(role); 
}
	

}
