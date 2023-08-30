package tn.ayoub.MyFitnessApp.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
/*@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator", discriminatorType = DiscriminatorType.INTEGER)*/
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser ; 
	private String firstname ;
	private String lastname;
	private String email ;
	private String password ;
	private String confirmPassword ;
	
	
	
	private Filee file ; 
	
	
	
	
	public User(Long idUser, String firstname, String lastname, String email, String password, String confirmPassword,
			Filee file, List<Role> listeRole) {
		super();
		this.idUser = idUser;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.file = file;
		this.listeRole = listeRole;
	}
	public Filee getFile() {
		return file;
	}
	public void setFile(Filee file) {
		this.file = file;
	}
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "userrole" , joinColumns = @JoinColumn(name="idUser"), inverseJoinColumns = @JoinColumn(name="idrole")) 
	
	private List<Role> listeRole= new ArrayList<>() ; 
	
	public List<Role> getListeRole() {
		return listeRole;
	}
	public void setListeRole(List<Role> listeRole) {
		this.listeRole = listeRole;
	}
	
	public void ajoutRole(Role r)
	{
		this.listeRole.add(r); 
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", file=" + file + ", listeRole="
				+ listeRole + "]";
	}
	
	
	

}
