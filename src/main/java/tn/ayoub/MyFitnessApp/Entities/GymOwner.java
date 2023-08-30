package tn.ayoub.MyFitnessApp.Entities;

import java.io.Serializable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;


//@Entity
@Data
//@DiscriminatorValue("1")
public class GymOwner implements Serializable{
	
	private String nationalité ; 

}
