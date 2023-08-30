package tn.ayoub.MyFitnessApp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.ayoub.MyFitnessApp.Entities.Role;
import tn.ayoub.MyFitnessApp.Repository.IRoleRepository;


@Service
public class RoleServImpl implements IserviceRole{

	
	@Autowired
	IRoleRepository roleRep ; 
	@Override
	public Role addRole(Role role) {
		// TODO Auto-generated method stub
		return roleRep.save(role);
	}
	
	

}
