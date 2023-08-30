package tn.ayoub.MyFitnessApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import tn.ayoub.MyFitnessApp.Entities.Filee;
import tn.ayoub.MyFitnessApp.Entities.Role;
import tn.ayoub.MyFitnessApp.Entities.User;
import tn.ayoub.MyFitnessApp.Repository.IRoleRepository;
import tn.ayoub.MyFitnessApp.Repository.IUserRepository;
@Service
public class UserServImpl implements IserviceUser {
	
	
	@Autowired
	IUserRepository userRep ; 
	@Autowired
	IRoleRepository roleRep ; 

		@Override
		public User addUser(User user) {
			
			
			// TODO Auto-generated method stub
			return userRep.save(user);
		}

		@Override
		public List<User> addListUsers (List<User> listUser) {
			
			return userRep.saveAll(listUser);
		}

		@Override
		public String addUserWTCP(User user) {
			// TODO Auto-generated method stub
			 String text="";
			if (user.getPassword().equals(user.getConfirmPassword()))
			{
			userRep.save(user);
			
				text="User added successfuly"; 
			}
			else
				{
			text="Warning ! confirm password should be equal to password !"	;	
				}
			return text;
		}

		@Override
		public User modifierUser(User user, Long idUser) {
			
			
		// TODO Auto-generated method stub
		   User usr=userRep.findById(idUser).get() ;
		   
		   usr.setFirstname(user.getFirstname()) ;
		   usr.setLastname(user.getLastname());
			return userRep.save(usr);
		}

		@Override
		public void deleteUser(Long idUser) {
			// TODO Auto-generated method stub
			
			 userRep.deleteById(idUser);
			
		}

		@Override
		public List<User> findUsersByfirstname(String ch) {
			// TODO Auto-generated method stub
			return userRep.findUsersByfirstname(ch);
		}

		@Override
		public User addUserRole(Long idUser, Long idrole) {
			// TODO Auto-generated method stub
			
			Role role= roleRep.findById(idrole).get(); 
			User user= userRep.findById(idUser).get(); 
			user.ajoutRole(role);
			return userRep.save(user);
		}

		@Override
		public List<Long> findUsersByIdRole() {
			// TODO Auto-generated method stub
			return userRep.findUserByIdRole();
		}

		@Override
		public List<Long> findUsersByIdRoleDynamique(Long idrole) {
			// TODO Auto-generated method stub
			return userRep.findUserByIdRoleDynamique(idrole);
		}

		@Override
		public List<User> findAllUsersByIdRole(Long idRole) {
			// TODO Auto-generated method stub
			return userRep.findAllUsersByIdRole(idRole);
		}

		@Override
		public User addUserFile(MultipartFile file, Long idUser) {
			// TODO Auto-generated method stub
			return null;
		}

		/*@Override
		
		public User addUserFile(MultipartFile file, Long idUser) {
			// TODO Auto-generated method stub
			User user = userRep.findById(idUser).get(); 
		   Filee fl=fileSer ;
			return null ;
		}
*/
	
		
		
	}
