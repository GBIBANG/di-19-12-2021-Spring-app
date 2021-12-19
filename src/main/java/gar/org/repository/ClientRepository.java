package gar.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gar.org.entites.Client;


@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long>{
	
	public Client findByClcode(String code);

}
