package tn.ayoub.MyFitnessApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tn.ayoub.MyFitnessApp.Entities.User;
import tn.ayoub.MyFitnessApp.Services.UserServImpl;

@RestController
public class UserController {

	
	@Autowired
	UserServImpl userserv ; 

	@PostMapping(value="/addUser")
	public User addUser(@RequestBody User user) {
		
		return userserv.addUser(user); 
	}
	
	@PostMapping(value="/addlistUser")
	public List<User> addlistUsers(@RequestBody List<User> listUser) {
		
		return userserv.addListUsers(listUser); 
	}
	
	@PostMapping(value="/addUserWTCP")
	public String addUserWTCP (@RequestBody User user )
	{
		return userserv.addUserWTCP(user); 
	}
	
	@PutMapping(value="/modifierUser/{idu}") 
	
	public User modifUser(@RequestBody User user, @PathVariable("idu") Long idUser)
	{
		
		
		return userserv.modifierUser(user, idUser) ; 
	}
	
	@DeleteMapping(value="/deleteUser/{idu}")
	public void deleteUser( @PathVariable("idu") Long idUser)
	{
		
		userserv.deleteUser(idUser); 
	}

		@GetMapping("/findUsersByfirstname/{ch}")
		public List<User> findUsersByfirstname(@PathVariable("ch") String  chaine){
			
			return userserv.findUsersByfirstname(chaine) ; 
		}
		
		@PostMapping(value="/addUserRole/{idU}/{idR}")
		public User addUserRole(@PathVariable("idU") Long  idUser, @PathVariable("idR") Long idrole) {
			
			return userserv.addUserRole(idUser, idrole); 
		}
		
		@GetMapping("/getUsersByIdRoleDynamique/{idr}")
		public List<Long> findUsersByIdRoleDynamique(@PathVariable("idr") Long idr ){
			
			return userserv.findUsersByIdRoleDynamique(idr); 
		}
		@GetMapping("/getAllUsersByIdRole/{idr}")
          public List<User> findAllUsersByIdRole( @PathVariable(name="idr") Long idRole)
          {
			return userserv.findAllUsersByIdRole(idRole); 
			
          }
		
		@PostMapping(value="/addUserFile/{idu}")
		public User addUserFile (@Param("file") MultipartFile file , @PathVariable("idu") Long idUser)
		{
			return null;
			
		}
}
