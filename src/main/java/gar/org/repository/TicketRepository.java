package gar.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gar.org.entites.Ticket;

@RepositoryRestResource
public interface TicketRepository extends JpaRepository<Ticket, Long>{
	
	List<Ticket> findByOrderByTidDesc();
	

}
