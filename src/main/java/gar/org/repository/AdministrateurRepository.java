package gar.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gar.org.entites.Administrateur;

@RepositoryRestResource
public interface AdministrateurRepository extends JpaRepository<Administrateur, Long>{
	
	
	Administrateur findByAsernameAndPasswordAndAcode(String username, String password, String code);

}
