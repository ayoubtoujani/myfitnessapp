package tn.ayoub.MyFitnessApp.Services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import tn.ayoub.MyFitnessApp.Entities.User;

public interface IserviceUser {

	
	public  User addUser(User user);
	public  List<User> addListUsers(List<User> listUser);
    public String addUserWTCP(User user) ;
    public  User modifierUser(User user, Long idUser);
    public void deleteUser(Long idUser);
    
    public List<User> findUsersByfirstname(String firstname) ; 
    public User addUserRole(Long idUser, Long idrole); 
    public List<Long> findUsersByIdRole(); 
    public List<Long> findUsersByIdRoleDynamique(Long idrole); 
    public List<User> findAllUsersByIdRole(Long idRole) ; 
    
    public  User addUserFile (MultipartFile file , Long idUser); 
}
