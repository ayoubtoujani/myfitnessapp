package tn.ayoub.MyFitnessApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.ayoub.MyFitnessApp.Entities.Filee;

public interface IFileRepository extends JpaRepository<Filee, Long> {

}
