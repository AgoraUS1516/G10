package repositories;

import java.util.Collection;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Encuesta;
import domain.Propuesta;

@Repository
public interface EncuestaRepository extends JpaRepository<Encuesta, Integer> {
	
	

}
