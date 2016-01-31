package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Opcion;
import domain.Pregunta;
import domain.Propuesta;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Integer> {
	
	@Query("select p from Pregunta p where p.encuesta.id=?1")
	Collection<Pregunta> getPreguntaByEncuestaId(Integer id);
	
}
