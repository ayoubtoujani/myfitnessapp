package tn.ayoub.MyFitnessApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import tn.ayoub.MyFitnessApp.Entities.Role;
@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {

	

}
