package tn.ayoub.MyFitnessApp.Services;

import org.springframework.web.multipart.MultipartFile;

import tn.ayoub.MyFitnessApp.Entities.Filee;

public interface IserviceFile {
	
	public Filee uploadFile (MultipartFile file); 

}
