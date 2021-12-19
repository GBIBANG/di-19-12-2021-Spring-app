package gar.org.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gar.org.entites.Codebar;
import gar.org.entites.Ticket;

@RepositoryRestResource
public interface CodebarRepository extends JpaRepository<Codebar, Long>{
	
	public Codebar findByCodebar(String codebar);
	
	List<Codebar> findByOrderByCidDesc();

}
