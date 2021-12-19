package gar.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gar.org.entites.Mouvement;

@RepositoryRestResource
public interface MouvementRepository extends JpaRepository<Mouvement, Long>{
	
	public Mouvement findByMcodebarAndMvar(String code, int var);

}
