
package gar.org.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gar.org.entites.Gare;

@RepositoryRestResource
public interface GareRepository extends JpaRepository<Gare, Long>{
	
	public Gare findByGnom(String garenom);
	public Gare findByGnbre(int nbre);

}
