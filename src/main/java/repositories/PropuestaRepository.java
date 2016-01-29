package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Propuesta;

@Repository
public interface PropuestaRepository extends JpaRepository<Propuesta, Integer> {
	
	
	@Query("select p from Propuesta p where p.referendumRecuento.id=?1")
	Collection<Propuesta> getPropuestaByReferendumRecuentoId(Integer id);

}
