package tn.ayoub.MyFitnessApp.Entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Gym implements Serializable {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Long idGym ;

	private String gymName; 
	private double gymPrice ;
	private  String locationGym ;
	
	
}
