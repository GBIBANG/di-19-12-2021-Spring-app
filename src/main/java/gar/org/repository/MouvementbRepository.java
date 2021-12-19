

package gar.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import gar.org.entites.Mouvementb;

@RepositoryRestResource
public interface MouvementbRepository extends JpaRepository<Mouvementb, Long>{
	
	public Mouvementb findByMbmouv(String mv);

}
