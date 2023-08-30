package tn.ayoub.MyFitnessApp.Entities;

import java.io.Serializable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

//@Entity
//@DiscriminatorValue("2")
@Data
public class Coach implements Serializable{
	
	private String spécialitéCoach ;
	private double NbAnExp ;
	

}
