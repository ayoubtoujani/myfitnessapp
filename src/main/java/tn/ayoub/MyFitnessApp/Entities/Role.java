package tn.ayoub.MyFitnessApp.Entities;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;




@Entity
public class Role implements Serializable {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idrole;
	public Role(Long idrole, RoleName namerole, List<User> listeUser) {
		super();
		this.idrole = idrole;
		this.namerole = namerole;
		this.listeUser = listeUser;
	}


	@Override
	public String toString() {
		return "Role [idrole=" + idrole + ", namerole=" + namerole + ", listeUser=" + listeUser + "]";
	}


	public Long getIdrole() {
		return idrole;
	}


	public void setIdrole(Long idrole) {
		this.idrole = idrole;
	}


	public RoleName getNamerole() {
		return namerole;
	}


	public void setNamerole(RoleName namerole) {
		this.namerole = namerole;
	}


	public List<User> getListeUser() {
		return listeUser;
	}


	public void setListeUser(List<User> listeUser) {
		this.listeUser = listeUser;
	}


	@Enumerated(EnumType.STRING)
	private RoleName namerole ; 
	
	@ManyToMany(mappedBy = "listeRole") 
	private List<User> listeUser= new ArrayList<>() ;
	

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	

}
