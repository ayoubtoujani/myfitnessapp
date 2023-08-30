package tn.ayoub.MyFitnessApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import tn.ayoub.MyFitnessApp.Entities.User;

@Repository
public interface IUserRepository  extends JpaRepository <User, Long>{
	
	@Query(value="select * from User u where u.firstname like :cle%" , nativeQuery = true )
	List <User> findUsersByfirstname(@Param("cle") String  ch) ; 
	
	@Query(value="select id_user from userrole where idrole=2 " , nativeQuery = true )
	List<Long> findUserByIdRole() ; 
	
	@Query(value="select id_user from userrole where idrole=1? " , nativeQuery = true )
	List<Long> findUserByIdRoleDynamique(Long idr) ; 
	
	@Query(value="select * from user u , userrole ur where u.id_user=ur.id_user and  idrole=1? " , nativeQuery = true )
	List<User> findAllUsersByIdRole(Long idr) ; 
	
	/*@Query(value="select u.iduser, u.adresse,u.confirmpassword ,u.email,  u.firstname, u.lastname, u.password, u.username from user u, user_role ur where u.iduser=ur.iduser and ur.id_role=?1", nativeQuery = true)
	List<User> listUserByIdRole(Long idRole);*/

}
