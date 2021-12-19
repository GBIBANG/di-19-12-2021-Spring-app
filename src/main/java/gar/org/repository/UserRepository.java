
package gar.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gar.org.entites.Utilisateur;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<Utilisateur, Long>{
	
	public Utilisateur findByUsername(String username);

}
