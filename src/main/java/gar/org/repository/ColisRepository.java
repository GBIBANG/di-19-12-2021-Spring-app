package gar.org.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gar.org.entites.Colis;

@RepositoryRestResource
public interface ColisRepository extends JpaRepository<Colis,Long>{

}
