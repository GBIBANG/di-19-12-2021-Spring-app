package gar.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gar.org.entites.Mois;

@RepositoryRestResource
public interface MoisRepository extends JpaRepository<Mois, Long>{

}
