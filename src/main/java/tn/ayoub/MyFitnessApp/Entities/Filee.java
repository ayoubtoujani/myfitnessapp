package tn.ayoub.MyFitnessApp.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Filee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idfile; 
	private String filetitle;
	private String filetype; 
	@Column(length = 4200000)
	private byte[] filesize ; 

}
